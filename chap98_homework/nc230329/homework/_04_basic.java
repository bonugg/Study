package chap98_homework.nc230329.homework;

import java.util.Scanner;

public class _04_basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//      1. 사용자가 입력한 두 정수 중에서 큰 정수를 출력하세요.
/*      int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1 > num2){
            System.out.println(num1);
        }else
            System.out.println(num2);*/



//      2. 사용자가 입력한 정수가 양수면 "양수" 음수면 "음수"라고 출력하세요.
/*      int num = sc.nextInt();
        if(num>0){
            System.out.println("양수");
        }else
            System.out.println("음수");*/



//      3. 사용자가 입력한 문자열이 "Java"인 경우 "좋아하는 언어입니다."를 출력하고, "Python"인 경우
//      "공부중인 언어입니다."를 출력하고, 그렇지 않은 경우 "다른 언어를 공부해보세
//      요."를 출력하세요.(switch~case~default 사용)
/*      String str = sc.next();

        switch (str){
            case "Java" :
                System.out.println("좋아하는 언어입니다.");
                break;
            case "Python" :
                System.out.println("공부중인 언어입니다.");
                break;
            default:
                System.out.println("다른 언어를 공부해보세요.");
        }*/



//      4. 사용자가 입력한 숫자가 3의 배수면 "3의 배수입니다."라고 출력하고 3의 배수가 아니면 "3의 배수가
//      아닙니다."를 출력하세요.(switch~case~default 사용)
/*      int num = sc.nextInt();
        num = (num%3==0) ? 1 : 2;
        switch (num){
            case 1:
                System.out.println("3의 배수입니다.");
                break;
            default:
                System.out.println("3의 배수가 아닙니다.");
                break;
        }*/



//      5. 사용자가 입력한 숫자가 홀수인 경우 "홀수입니다."를 출력하고, 짝수인 경우 "짝수입니다."를
//      출력하는 프로그램을 작성하세요.
/*      int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println("짝수입니다.");
        }else
            System.out.println("홀수입니다.");*/



//        6. 사용자가 입력한 5개의 정수중 가장 큰 수를 출력하세요.
/*        int[] num = new int[5];
        for (int i = 0; i < 5; i++) {
            num[i] = sc.nextInt();
        }
        int max = num[0];

        if(max < num[1]){
            max = num[1];
        }if (max < num[2]) {
            max = num[2];
        }if (max < num[3]) {
            max = num[3];
        }if(max < num[4]) {
            max = num[4];
        }
        System.out.println(max);*/



//      7. 사용자가 입력한 문자열이 "Yes"인 경우 "예"를 출력하고, "No"인 경우 "아니오"를 출력하고,
//      그 외의 경우에는 "잘못 입력하셨습니다."를 출력하세요.
/*      String str = sc.next();
        if(str.equals("Yes"))
            System.out.println("예");
        else if (str.equals("No"))
            System.out.println("아니오");
        else
            System.out.println("잘못입력하셨습니다.");*/



//      8. 사용자가 입력한 두 정수를 비교하여 같으면 "두 수가 같습니다." 첫 번째 수가 더 크면 "첫 번째 수가
//      더 큽니다." 두 번째 수가 더 크면 "두 번째 수가 더 큽니다."를 출력하세요.
/*        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if( num1 == num2){
            System.out.println("두 수가 같습니다.");
        } else if (num1 > num2)
            System.out.println("첫 번째 수가 더 큽니다.");
        else
            System.out.println("두 번째 수가 더 큽니다.");*/



//      9. 사용자가 입력한 세 정수가 모두 짝수인 경우 "모두 짝수입니다." 모두 홀수인 경우 "모두 홀수입니다."
//      그 외의 경우 "짝수 : xxx개, 홀수 : xxx개 입니다."를 출력하세요.
/*      int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if (num1 % 2 == 0 && num2 % 2 == 0 && num3 % 2 == 0) {
            System.out.println("모두 짝수입니다.");
        } else if (num1 % 2 == 1 && num2 % 2 == 1 && num3 % 2 == 1) {
            System.out.println("모두 홀수입니다.");
        } else if (num1 % 2 == 0 && num2 % 2 == 1 && num3 % 2 == 1) {
            System.out.println("짝수 1개 홀수 2개");
        } else if (num1 % 2 == 1 && num2 % 2 == 0 && num3 % 2 == 1) {
            System.out.println("짝수 1개 홀수 2개");
        } else if (num1 % 2 == 1 && num2 % 2 == 1 && num3 % 2 == 0) {
            System.out.println("짝수 1개 홀수 2개");
        } else if (num1 % 2 == 0 && num2 % 2 == 0 && num3 % 2 == 1) {
            System.out.println("짝수 2개 홀수 1개");
        } else if (num1 % 2 == 0 && num2 % 2 == 1 && num3 % 2 == 0) {
            System.out.println("짝수 2개 홀수 1개");
        } else if (num1 % 2 == 1 && num2 % 2 == 0 && num3 % 2 == 0) {
            System.out.println("짝수 2개 홀수 1개");
        }*/
    }
}
