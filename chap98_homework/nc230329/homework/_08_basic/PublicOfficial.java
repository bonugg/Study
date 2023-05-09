package chap98_homework.nc230329.homework._08_basic;

public class PublicOfficial implements Employee{
    @Override
    public void goToWork() {
        System.out.println("공무원이 출근합니다.");
    }

    @Override
    public void leaveWork() {
        System.out.println("공무원이 퇴근합니다.");
    }

    @Override
    public void work() {
        System.out.println("공무원이 일합니다.");
    }
}
