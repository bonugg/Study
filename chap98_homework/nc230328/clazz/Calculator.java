package chap98_homework.nc230328.clazz;

//3.  T 배열을 받아서 합, 차, 곱셈, 나눗셈을 연산해주는 Calculator 제네릭 클래스를 구현하세요.
//각 메소드는 double로 리턴하고 add, sub, mul, div로 메소드명을 갖습니다.
//(Math.round()로 소수점 두자리까지만 표출)
public class Calculator<T extends Number> {	
	private T t1;
	private T t2;
	
	public Calculator(T t1, T t2) {
		this.t1 = t1;
		this.t2 = t2;
	}
	
	public T getT1() {
		return t1;
	}
	public void setT1(T t1) {
		this.t1 = t1;
	}
	public T getT2() {
		return t2;
	}
	public void setT2(T t2) {
		this.t2 = t2;
	}
	
	public double add() {
		return Math.round((t1.doubleValue() + t2.doubleValue()) * 100) / (double)100;
	}
	
	public double sub() {
		return Math.round((t1.doubleValue() - t2.doubleValue()) * 100) / (double)100;
	}
	
	public double mul() {
		return Math.round((t1.doubleValue() * t2.doubleValue()) * 100) / (double)100;
	}
	
	public double div() {
		return Math.round((t1.doubleValue() / t2.doubleValue()) * 100) / (double)100;
	}
}
