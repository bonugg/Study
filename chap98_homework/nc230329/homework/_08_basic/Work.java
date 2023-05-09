package chap98_homework.nc230329.homework._08_basic;

public class Work {
//2. 일한 시간, 시간당 급여를 속성으로 갖는 알바라는 클래스를 만들고 일한다(일한 시간동안 일해서 일한 시간 * 시간당 급여를 받는다. 라고 출력하는)를 메소드로 만드세요.
//   알바를 상속받는 캐셔와 쿠팡맨 클래스를 만들고 일한다 메소드를 오버라이딩하여 캐셔는 "캐셔는 일한 시간동안 계산해서 일한 시간 * 시간당 급여를 받는다."
//   쿠팡맨은  "쿠팡맨은 일한 시간동안 배송해서 일한 시간 * 시간당 급여를 받는다."라고 출력하도록 구현하세요. 일한 시간과 시간당 급여는 생성자에서 초기화합니다.
    public int worktime;
    public int timepay;

    public Work(int worktime, int timepay){
        this.worktime = worktime;
        this.timepay = timepay;
    }

    public void workTimePay(int worktime, int timepay){
        System.out.println(worktime * timepay + "를 받는다.");
    }
}