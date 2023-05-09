package chap21_stream;

import chap21_stream.clazz.CreditCard;
import chap21_stream.clazz.HyundaiCar;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class _04_popeLineEx {
    public static void main(String[] args) {
        List<CreditCard> cardList = new ArrayList<>();

        cardList.add(new CreditCard("카카오", "라이언카드", 1000));
        cardList.add(new CreditCard("삼성카드", "탭탭카드", 2000));
        cardList.add(new CreditCard("신한카드", "드림카드", 3000));
        cardList.add(new CreditCard("삼성카드", "ID카드", 5000));
        cardList.add(new CreditCard("현대카드", "더블랙", 100000));
        cardList.add(new CreditCard("아멕스", "블랙카드", 300000));

        cardList.stream().filter(num -> num.getLimitMoney() >= 5000).forEach(str1 -> {
            System.out.println("카드회사 : "+ str1.getCompany() + " | 카드명 : "+str1.getCardName());
        });

        //map() : 새로운 스트림을 만들어서 리턴
        cardList.stream()
                .map(num -> {
                    num.setCompany("삼성카드");
                    num.setLimitMoney(num.getLimitMoney() + 3000);
                    return num;
        }).forEach(card -> System.out.println(card.toString()));

        List<Integer> intList = new ArrayList<>();

        for (int i = 1; i <= 30; i++) {
            intList.add(i);
        }

        int sum = intList.stream().reduce((result, num) -> result + num).get();
        System.out.println(sum);
    }
}
