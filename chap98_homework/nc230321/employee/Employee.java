package chap98_homework.nc230321.employee;

public abstract class Employee {
	private int eno;
	private String name;
	private int pay;
	private int type; //1.정규직, 2.계약직, 3.임시직
	
	public Employee(int eno, String name, int pay, int type) {
		this.eno = eno;
		this.name = name;
		this.pay = pay;
		this.type = type;
	}
	
	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}
	
	public abstract double getMonthPay();
	
	public void showEmployeeInfo() {
		System.out.println("사번 : " + this.eno);
		System.out.println("이름 : " + this.name);
		System.out.println("급여 : " + this.pay);
	}
}
