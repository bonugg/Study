package chap06_class.car;

public class Car {
	//제조사(company), 모델(model), 색상(color), 가격(price)
	//public
	public String company;
	public String model;
	public String color;
	public String[] option;
	public int price;
	
	//기본 생성자
	//매개변수가 없다.
	public Car() {
		//String은 null로 초기화되기 때문에
		//데이터에 null이 존재하면 예외가 발생할 확률이
		//높아지므로 ""(빈 문자열)로 초기화해준다.
		company = "";
		model = "";
		color = "";
		System.out.println("기본 생성자 호출");
	}
	
	//매개변수가 있는 생성자
	public Car(String c) {
		//해당 변수 초기화 진행
		company = c;
		System.out.println("매개변수 하나인 생성자 호출");
	}
	
	public Car(String c, String m) {
		company = c;
		model = m;
		System.out.println("매개변수 두 개인 생성자 호출");
	}
	
	//매개변수명은 어떤 멤버변수를 초기화할지 명확하게 하기위해
	//멤버변수명과 일치시킨다.
	public Car(String company, String model
			, String color) {
		//생성되는 객체 자체를 가르키는 this 키워드 사용해서
		//멤버변수를 지칭하도록 한다.
		this.company = company;
		this.model = model;
		this.color = color;
		System.out.println("매개변수 세 개인 생성자 호출");
	}
	
	public Car(String company, String model,
			String color, int price) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.price = price;
		System.out.println("매개변수 네 개인 생성자 호출");
	}
	//void carInfo() -> 입력한 자동차 정보를 출력
	//제조사: 현대
	//모델: 제네시스
	//색상: 검정
	//가격: 5000
	public void carInfo() {
		System.out.println("제조사: " + company);
		System.out.println("모델: " + model);
		System.out.println("색상: " + color);
		System.out.println("가격: " + price);
	}

	@Override
	public String toString() {
		return "Car [company=" + company + ", model=" + model + ", color=" + color + ", price=" + price + "]";
	}
}
