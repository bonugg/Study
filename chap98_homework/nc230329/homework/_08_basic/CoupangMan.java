package chap98_homework.nc230329.homework._08_basic;

public class CoupangMan extends Work{
    public CoupangMan(int worktime, int timepay) {
        super(worktime, timepay);
    }

    @Override
    public void workTimePay(int worktime, int timepay) {
        System.out.println("쿠팡맨은 일한 시간동안 배송해서 "+worktime * timepay + "를 받는다.");
    }
}
