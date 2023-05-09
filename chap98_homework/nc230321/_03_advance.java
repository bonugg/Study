package chap98_homework.nc230321;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import chap98_homework.nc230321.employee.ContractEmployee;
import chap98_homework.nc230321.employee.Employee;
import chap98_homework.nc230321.employee.RegularEmployee;
import chap98_homework.nc230321.employee.TempEmployee;

public class _03_advance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] ep = new Employee[100];
		List<Employee> epList = new ArrayList<Employee>();
		Scanner sc = new Scanner(System.in);
		
		int eno = 0;
		String name = "";
		int pay = 0;
		int bonus = 0;
		int hireYear = 0;
		int workDay = 0;
		try {
			while(true) {
				System.out.println("*** 메뉴 선택 ***");
				System.out.println("1. 정규직 저장");
				System.out.println("2. 임시직 저장");
				System.out.println("3. 계약직 저장");
				System.out.println("4. 전체 정보 출력");
				System.out.println("5. 월급 계산 출력");
				System.out.println("6. 프로그램 종료");
				
				int input = sc.nextInt();
				
				switch(input) {
					case 1 : 
						System.out.print("사번을 입력하세요.");
						eno = sc.nextInt();
						sc.nextLine();
						System.out.print("이름을 입력하세요.");
						name = sc.next();
						sc.nextLine();
						System.out.println("급여를 입력하세요.");
						pay = sc.nextInt();
						System.out.println("보너스를 입력하세요.");
						bonus = sc.nextInt();
						ep[eno] = new RegularEmployee(eno, name, pay,0, bonus);
						ep[eno].showEmployeeInfo();
						System.out.println("----------------");
						break;
					case 2 : 
						System.out.print("사번을 입력하세요.");
						eno = sc.nextInt();
						sc.nextLine();
						System.out.print("이름을 입력하세요.");
						name = sc.next();
						sc.nextLine();
						System.out.println("급여를 입력하세요.");
						pay = sc.nextInt();
						System.out.println("근무년수를 입력하세요.");
						hireYear = sc.nextInt();
						ep[eno] = new TempEmployee(eno, name, pay,1, hireYear);
						ep[eno].showEmployeeInfo();
						System.out.println("----------------");
						break;
					case 3 : 
						System.out.print("사번을 입력하세요.");
						eno = sc.nextInt();
						sc.nextLine();
						System.out.print("이름을 입력하세요.");
						name = sc.next();
						sc.nextLine();
						System.out.println("급여를 입력하세요.");
						pay = sc.nextInt();
						System.out.println("근무일수를 입력하세요.");
						workDay = sc.nextInt();
						ep[eno] = new ContractEmployee(eno, name, pay,2, workDay);
						ep[eno].showEmployeeInfo();
						System.out.println("----------------");
						break;
					case 4 : 
						for(int i = 0; i < ep.length; i++) {
							if(ep[i] != null) {
								ep[i].showEmployeeInfo();
								System.out.println("----------------");
							}
						}
						break;
					case 5 : 
						System.out.print("검색할 사원의 사번을 입력하세요.");
						eno = sc.nextInt();
						ep[eno].showEmployeeInfo();
						System.out.println("----------------");
						break;
					case 6 : 
						System.out.println("프로그램을 종료합니다.");
						sc.close();
						System.exit(0);
					default : 
						System.out.println("잘못 입력하셨습니다.");
						continue;
				}
			}
		} catch(Exception e) {
			
		}
		
	}

}
