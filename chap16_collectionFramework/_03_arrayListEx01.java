package chap16_collectionFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import chap98_homework.nc230321.employee.ContractEmployee;
import chap98_homework.nc230321.employee.Employee;
import chap98_homework.nc230321.employee.RegularEmployee;
import chap98_homework.nc230321.employee.TempEmployee;

public class _03_arrayListEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<Employee> 생성
		//사용자가 1. 정규직, 2.계약직, 3.임시직
		//각각 직원의 정보를 입력
		//그 정보를 ArrayList에 저장
		//출력
		
		Scanner sc = new Scanner(System.in);
		
		List<Employee> epList = 
				new ArrayList<Employee>();
		
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
						epList.add(new RegularEmployee(eno, name, pay, 1, bonus));
						epList.get(epList.size() - 1).showEmployeeInfo();
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
						epList.add(new TempEmployee(eno, name, pay, 2, hireYear));
						epList.get(epList.size() - 1).showEmployeeInfo();
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
						epList.add(new ContractEmployee(eno, name, pay, 3, workDay));
						epList.get(epList.size() - 1).showEmployeeInfo();
						System.out.println("----------------");
						break;
					case 4 : 
//						for(int i = 0; i < epList.size(); i++) {
//							epList.get(i).showEmployeeInfo();
//							System.out.println("----------------");
//						}
						
						for(Employee ep : epList) {
							ep.showEmployeeInfo();
							System.out.println("----------------");
						}
						break;
					case 5 : 
						System.out.print("검색할 사원의 사번을 입력하세요.");
						eno = sc.nextInt();
//						for(int i = 0; i < epList.size(); i++) {
//							if(epList.get(i).getEno() == eno) {
//								epList.get(i).showEmployeeInfo();
//							}
//						}
						
						for(Employee ep : epList) {
							if(ep.getEno() == eno) {
								ep.showEmployeeInfo();
							}
						}
						
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
