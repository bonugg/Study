package chap98_homework.nc230329.homework._07_basic;

public class Add {
//    7. Add라는 클래스를 만들고 정수형 매개변수 2개를 받아서 합을 리턴하는 add 메소드를 구현하세요.
//    그리고 오버로딩을 통해 정수형 매개변수 세개를 받아서 각각의 제곱의 합을 리턴하는 add메소드도 구현하세요.
    public int add(int num1, int num2){
        return num1 + num2;
    }

    public int add(int num1, int num2,int num3){
        return (num1 * num1) + (num2 * num2) + (num3 * num3);
    }

}
