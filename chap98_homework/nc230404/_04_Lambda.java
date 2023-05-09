package chap98_homework.nc230404;


import chap98_homework.nc230404.clazz.*;

public class _04_Lambda {
    public static void main(String[] args) {
        action(arr -> {
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]%2==0){
                    System.out.println(arr[i]);
                }
            }
        });
        System.out.println("--------------------------------");

        action2((a, b) -> {
            StringBuilder str = a.append(b).reverse();
            return str;
        });
        System.out.println("--------------------------------");

        appendSb(StringBuilder::append);
        reverseSb(StringBuilder::reverse);
        System.out.println("--------------------------------");

        IntArrUtils iar = new IntArrUtils();
        action3(iar::getMax);
        action3(iar::getMid);
        action3(iar::getMin);
        System.out.println("--------------------------------");
    }

    //1. 매개변수로 받아온 정수배열에서 짝수만 찾아서 출력하는 printEvenNum을 람다식으로 구현하세요.
    public static void action(EvenNum en) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        en.printEvenNum(arr);
    }

    //2. 두 개의 StringBuilder 값을 매개변수로 받아 두 개의 값을
    // 합친 후 역순으로 바꿔서 리턴하는 combineStrBuilder를 람다식으로 구현하세요.
    public static void action2(CombineStr cbs) {
        StringBuilder str = cbs.combineStrBuilder(new StringBuilder("안녕"), new StringBuilder("하세요"));
        System.out.println(str);
    }

//    3. 2번 문제에서 두 개를 합치는 메소드 appendSb와 역순으로 변경하는 메소드 reverseSb를
//    각각 선언하고 StringBuilder의 메소드를 참조하여 각각 구현하세요.
    public static void appendSb(Append apd) {
        StringBuilder str = apd.combineStrBuilder(new StringBuilder("비트"), new StringBuilder("캠프"));
        System.out.println(str);
    }

    public static void reverseSb(Reverse rvs) {
        StringBuilder str = rvs.combineStrBuilder(new StringBuilder("네이버클라우드"));
        System.out.println(str);
    }

//    4. 매개변수로 받아온 정수 배열에서 최대값, 최소값, 중간값을 구하는 메소드 getMax, getMin, getMid를
//    갖는 클래스 IntArrUtils를 구현하고
//    maxOrMinOrMid라는 메소드를 갖는 함수형 인터페이스 MaxMinMid를 만들고 람다식으로 IntArrUtils의 메소드를
//    참조하여 구현하세요.
    public static void action3(MaxMinMid mmm){
        int[] arr = {4,1,2,6,9,10,5,7,8,3};
        System.out.println(mmm.maxOrMinOrMid(arr));
    }
}

