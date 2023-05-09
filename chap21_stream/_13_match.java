package chap21_stream;

import java.util.ArrayList;
import java.util.List;

public class _13_match {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            intList.add(i);
        }
        
        //1. 모든 요소가 3의 배수인지
        System.out.println(intList.stream()
                .allMatch(num -> num % 3 ==0));
        boolean result1 = intList.stream()
                .allMatch(num -> num % 3 ==0);
        System.out.println(result1);
        
        //2. 2의 배수가 하나라도 있는지
        System.out.println(intList.stream()
                .anyMatch(num -> num % 2 ==0));
        boolean result2 = intList.stream()
                .anyMatch(num -> num % 2 ==0);
        System.out.println(result2);

        //3. 모든 요소가 11의 배수가 아닌지
        System.out.println(intList.stream()
                .noneMatch(num -> num % 11 ==0));
        boolean result3 = intList.stream()
                .noneMatch(num -> num % 11 ==0);
        System.out.println(result3);
    }
}
