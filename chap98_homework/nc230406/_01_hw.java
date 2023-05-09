package chap98_homework.nc230406;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _01_hw {
    public static void main(String[] args) {
//        1. 사용자가 입력한 문자열 10개를 저장한 문자열 리스트를 이용하여 문자열의 길이가 5이상인 문자열만 출력하세요.
        List<String> strList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("문자열 입력 : ");
            strList.add(sc.next());
        }

        strList.stream().filter(num -> num.length() >=5).forEach(list -> System.out.print(list+ " "));
    }
}
