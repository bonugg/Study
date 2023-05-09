package chap98_homework.nc230329.homework._08_basic;

public class Cashier extends Work{

    public Cashier(int worktime, int timepay) {
        super(worktime, timepay);
    }

    @Override
    public void workTimePay(int worktime, int timepay){
        System.out.println("캐셔는 일한 시간동안 계산해서 "+worktime * timepay + "를 받는다.");
    }
}
