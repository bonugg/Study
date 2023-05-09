package chap98_homework.nc230405;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _05_hw {
    public static void main(String[] args) {
        //5. 사용자가 입력한 문자열 10개를 저장하는 List<String> strList를 만들고 스트림을 이용해서
        //    문자열에 영문자가 포함된 문자열만 뽑아서 스트림을 만들고 출려하세요.
        Scanner sc = new Scanner(System.in);
        List<String> strList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            strList.add(sc.next());
        }
        strList.stream().forEach(str ->{
            int cnt = 0;
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                    cnt++;
                }
            }
            if(cnt != 0) {
                System.out.println(str);
            }
        });
    }
}
