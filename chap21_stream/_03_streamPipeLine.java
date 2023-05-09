package chap21_stream;

import chap21_stream.clazz.HyundaiCar;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _03_streamPipeLine {
    static int sum = 0;
    public static void main(String[] args) {
        List<HyundaiCar> hCarList = new ArrayList<>();

        hCarList.add(new HyundaiCar("아반떼", 3000));
        hCarList.add(new HyundaiCar("아반떼", 2500));
        hCarList.add(new HyundaiCar("아반떼", 2000));
        hCarList.add(new HyundaiCar("제네시스", 5000));
        hCarList.add(new HyundaiCar("그렌저", 4000));

        //방법 1.
        //1. 현대자 리스트에서 스트림얻기
        Stream<HyundaiCar> hCarStream = hCarList.stream();

        //2. 조건에 맞는 현대차 필터링(중간처리)
        //모델명이 아반뗴인 요소들만 새로 스트림으로 구성
        Stream<HyundaiCar> avanteStream = hCarStream.filter(hCar -> hCar.getModel().equals("아반떼"));
        
        //3. 스트림 타입변환(중간처리)
        //모델이 아반뗴인 요소들의 가격만 모아서 새로운 스트림 구성
        IntStream priceStream = avanteStream.mapToInt(avante -> avante.getPrice());

        //4. 가격들의 총합(최종처리)
        int totalPrice  = priceStream.sum();
        System.out.println("아반떼 가격의 총합 : "+ totalPrice);

        //방법 2. 체이닝 기법
        int totalPrice2 = hCarList.stream().filter(hCar -> hCar.getModel().equals("아반떼"))
                .mapToInt(hCar -> hCar.getPrice()).sum();
        System.out.println(totalPrice2);
    }
}
