package chap21_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class _12_peek {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            intList.add(i);
        }

        //peek 최종 처리 없이 잘못 작성
//        intList.stream()
//                .filter(num -> num % 3 ==0)
//                .peek(num -> System.out.println(num));

        //peek 최종 처리가 있을 때
        intList.stream()
                .filter(num -> num % 3 ==0)
                .peek(num -> System.out.print(num+" "))
                .mapToInt(num -> num)
                .sum();

        System.out.println("");
        //peek은 stream을 리턴
        Stream<Integer> newIntStrean = intList.stream()
                .peek(num -> Stream.of(num));
        newIntStrean.forEach(num -> System.out.print(num+" "));
    }
}
