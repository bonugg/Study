package chap11_interface.multiinherit;

//MultiflexStadium이 Stadium과 ConcertHall의 형태를
//가지고 있기 때문에 SeoulMultiflexStadium도 Stadium,
//ConcertHall의 형태를 가지게 된다. Stadium타입의 변수나
//ConcertHall 타입의 변수로도 사용가능하다.
public class SeoulMultiflexStadium 
				implements MultiflexStadium {

	@Override
	public void getSportsSchedule(int month) {
		// TODO Auto-generated method stub
		System.out.println(month + "월에 예정된 경기는 "
							+ "수원 대 서울입니다.");
	}

	@Override
	public int getSportsTicketPrice(int people) {
		// TODO Auto-generated method stub
		return people * 7000;
	}

	@Override
	public void getSupportersItem(int people) {
		// TODO Auto-generated method stub
		System.out.println(people + "명의 아이템 구매 가격은 "
				+ (people * 15000) + "원입니다.");
	}

	@Override
	public void printSchedule(int month) {
		// TODO Auto-generated method stub
		System.out.println(month + "월에 예정된 콘서트는 "
				+ "싸이 콘서트입니다.");
	}

	@Override
	public int getTicketPrice(int people) {
		// TODO Auto-generated method stub
		return people * 96000;
	}

	@Override
	public void getRemainSeat() {
		// TODO Auto-generated method stub
		System.out.println("남아있는 총 좌석은 1000자리입니다.");
	}

	@Override
	public void playSportsAndConcert() {
		// TODO Auto-generated method stub
		System.out.println("수원 대 서울 경기에서 싸이콘서트도 동시에"
				+ " 진행될 예정입니다.");
	}
}
