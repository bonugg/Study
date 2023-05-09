package chap98_homework.nc230405;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class _04_hw {
    //4. 사용자가 입력한 영문자 10개를 저장하는 List<Character> charList를 만들고 스트림을 이용해서
    //    영문자가 소문자면 대문자로 대문자면 소문자로 바꾼 스트림을 만들어서 출력하세요.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Character> charList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            charList.add(sc.next().charAt(0));
        }

        charList.stream().forEach(ch ->{
            if(ch >= 'a' && ch <= 'z'){
                ch = ch.toString().toUpperCase().charAt(0);
            } else if (ch >= 'A' && ch <= 'Z') {
                ch = ch.toString().toLowerCase().charAt(0);
            }
            System.out.print(ch + " ");
        });

    }
}
