package chap98_homework.nc230329.homework._08_basic;

public class Developer implements Employee{
    @Override
    public void goToWork() {
        System.out.println("개발자가 출근합니다.");
    }

    @Override
    public void leaveWork() {
        System.out.println("개발자가 퇴근합니다.");
    }

    @Override
    public void work() {
        System.out.println("개발자가 일합니다.");
    }
}
