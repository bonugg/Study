package chap98_homework.nc230329.homework._07_basic;

public class Account {
//    6. 잔액을 속성으로 가지고 입금, 출금, 잔액 조회를 메소드로 갖는 계좌 클래스를 생성하세요.
    public int money;

    public void inputMoney(int money){
        this.money = money;
    }
    public void outputMoney(int money){
        this.money -= money;
        if(this.money < 0) {
            System.out.println("출금할 수 없습니다.");
            this.money += money;
        }
    }

    public void moneyInfo(){
        System.out.println(money);
    }
}
