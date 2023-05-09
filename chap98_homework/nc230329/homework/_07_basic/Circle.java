package chap98_homework.nc230329.homework._07_basic;

public class Circle {
//    5. 반지름을 속성으로 갖는 원클래스를 만들고 사용자가 입력한 반지름이 생성자를 통해 속성에 저장되며
//    원의 넓이와 둘레를 구해서 리턴하는 메소드를 각각 구현하세요.
//    넓이 : 2 * 3.14 * 반지름 ^ 2, 둘레 : 4 * 3.14 * 반지름
    public int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    public double circleArea(int radius){
        return 2 * 3.14 * radius * radius;
    }

    public double circleRound(int radius){
        return 4 * 3.14 * radius;
    }



}
