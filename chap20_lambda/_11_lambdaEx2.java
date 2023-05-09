package chap20_lambda;

import chap20_lambda.clazz.UserCharString;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _11_lambdaEx2 {
    public static void main(String[] args) {
        List<UserCharString> customList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1)+"번째 문자열을 입력하세요 : ");
            customList.add(new UserCharString(sc.next()));
        }

        System.out.print("찾을 문자를 입력하세요 : ");
        char findch = sc.next().charAt(0);

        for (int i = 0; i < 10; i++) {
            int num = i;
            customList.get(i).changeStr(findch, (ch , str)->{
                if(str.contains(String.valueOf(ch))){
                    return str;
                }else
                    return "";
            });
        }
        System.out.println(customList.toString());
    }
}
