package chap98_homework.nc230329.homework;

import java.util.Scanner;

public class _01_basic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//      1. 사용자가 입력한 이름, 나이, 성별을 출력하세요.
/*      System.out.print("이름 : ");
        String name = sc.next();
        System.out.print("나이 : ");
        int old = sc.nextInt();
        System.out.print("성별 : ");
        String mw = sc.next();
        System.out.println("이름 : "+name+", 나이 : "+old+", 성별 : "+mw);*/



//      2. 사용자가 입력한 두 개의 정수와 문자(char) 연산자를 받아 두 정수로 해당 연산을 진행한 결과를 출력하세요.
/*      int result = 0;
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        char x = sc.next().charAt(0);
        if( x == '+'){
            result = num1 + num2;
        } else if (x == '-') {
            result = num1 - num2;
        }else if (x == '*') {
            result = num1 * num2;
        }else if (x == '/') {
            result = num1 / num2;
        }else
            System.out.println("연산자를 입력하세요.");
        System.out.println(result);*/



//      3. 반지름이 20인 원의 넓이와 둘레를 출력하세요.(넓이 : 2 * 3.14 * 반지름 ^ 2, 둘레 : 4 * 3.14 * 반지름)
//      단, 원주율 3.14는 상수로 선언하세요.
/*      final double pi = 3.14;
        int a = 20;
        System.out.println("넓이 : "+ 2*pi*(a*a));
        System.out.println("둘레 : "+ 4*pi*a);*/



//      5. 사용자가 입력한 세 정수의 최소 값, 중간 값, 최대 값을 출력하세요.
/*      int sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("정수 : ");
            int num = sc.nextInt();
            sum += num;
        }
        System.out.println(sum);

        int[] num = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("정수 : ");
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < num.length-1; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] > num[j]) {
                    int tmp = num[i];
                    num[i] = num[j];
                    num[j] = tmp;
                }
            }
        }
        System.out.println("최소값: " + num[0]);
        System.out.println("중간값: " + num[1]);
        System.out.println("최대값: " + num[2]);*/



//      6. 사용자가 입력한 정수의 구구단을 출력하세요.
/*      int choice = sc.nextInt();
        for (int i = 1; i <= 9; i++) {
            System.out.println(choice + " * " + i +" = "+choice * i);
        }*/



//      7. 사용자가 입력한 정수로 해당 정수의 팩토리얼을 계산하여 출력하세요.(재귀메소드 없이, while이나 for 반복문을 사용)
  /*    int result = 1;
        int choice = sc.nextInt();
        for (int i = choice; i > 0; i--) {
            result *= i;
        }
        System.out.println(result);*/



//      8. 사용자가 입력한 10개의 정수 중 소수의 개수를 출력하세요.(소수는 1이랑 본인 말고는 나눠떨어지는 값이 없는 수입니다.)
//      사용자가 입력할 수 있는 값은 2 ~ 30로 제한
/*      int[] num = new int[10];
        int cnt_ = 0;
        for(int i = 0; i < 10; i++) {
            int cnt = 0;
            while (true){
                int a = sc.nextInt();
                if(a > 1 && a <31){
                    num[i] = a;
                    break;
                }else
                    System.out.println("2~30사이의 숫자를 입력해주세요.");
                    continue;
            }

            for(int j = 1; j <= num[i]; j++) {
                if(num[i]%j == 0) {
                    cnt++;
                }
            }
            if(cnt == 2) {
                cnt_++;
            }
        }
        System.out.println(cnt_);*/
    }
}
