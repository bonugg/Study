package chap98_homework.nc230329.homework._07_basic;

public class Method {
//    3. 두 문자열을 전달받아 합쳐진 새로운 문자열을 리턴하는 메소드를 구현하세요.
    public String strplus(String str1, String str2){
        return str1 + str2;
    }

//    4. 정수 한 개와 실수 한 개를 전달받아 소수점 두자리까지만 가지는 곱의 결과를 리턴하는 메소드를 구현하세요.
    public double multipleIntDouble(int num1, double num2){
        return Math.round((num1 * num2) * 100) / 100;
    }
}
