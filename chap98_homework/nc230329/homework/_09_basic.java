package chap98_homework.nc230329.homework;

import java.util.*;
import java.util.Map;
import java.util.Map.Entry;

public class _09_basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        1. Map을 이용하여 영어 단어와 뜻을 저장하고 사용자가 입력한 단어의 뜻을 출력하세요.
        Map<String, String> map1 = new HashMap<>();
        map1.put("친구", "friend");
        System.out.println(map1.get("친구"));


//        2. Map을 이용해서 음식 이름과 가격을 저장하고 사용자가 입력한 음식의 이름과 수량으로
//        최종 금액을 출력하세요.
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("사탕", 500);
        System.out.print("키를 입력하세요 : ");
        String str = sc.next();
        if(map2.containsKey(str)){
            System.out.print("수량을 입력하세요 : ");
            int num = sc.nextInt();
            int sum = map2.get(str) * num;
            System.out.println("최종 금액은 "+sum+" 입니다.");
        }


//        3. Map을 이용해서 학생의 이름과 점수를 저장하고 점수가 90점 이상인 학생의 이름을 모두 출력하세요.
//        4. 3번에서 사용한 Map에서 점수가 가장 높은 학생의 이름과 점수를 출력하세요.
        Map<String, Integer> map3 = new HashMap<>();

        while (true) {
            System.out.print("학생 이름을 입력하세요 : ");
            String name = sc.next();
            System.out.print("학생 점수를 입력하세요 : ");
            int score = sc.nextInt();
            map3.put(name, score);

            System.out.print("학생 입력 종료(1) 계속(아무 키 입력) ");
            String choice = sc.next();
            if (choice.equals("1")) {
                Entry<String, Integer> max = null;
                for (Entry<String, Integer> i : map3.entrySet()) {
                    if (max == null || i.getValue() > max.getValue()) {
                        max = i;
                    }
                }
                System.out.println("이름 : "+max.getKey()+" 점수 : "+max.getValue());

                for (Entry<String, Integer> i : map3.entrySet()) {
                    if (i.getValue() >= 90) {
                        System.out.println("90점 이상 : "+i.getKey());
                    }
                }
                break;
            }
        }

    }
}
