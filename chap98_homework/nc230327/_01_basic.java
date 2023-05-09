package chap98_homework.nc230327;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class _01_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 정수형 데이터를 저장할 수 있는 ArrayList를 생성하고 
//		사용자가 입력한 5개의 정수를 저장하고 출력하세요.
		Scanner sc = new Scanner(System.in);
		List<Integer> intList = 
					new ArrayList<Integer>();
		
		for(int i = 0 ; i < 5; i++) {
			System.out.print("정수를 입력하세요.");
			intList.add(sc.nextInt());
		}
		
		System.out.println(intList);
		System.out.println("------------------------");
		
//	     2. 정수형 데이터를 저장할 수 있는 LinkedList를 생성하고 사용자가 입력한 5개의 정수를 저장하고
//	    index가 3, 4번 요소를 값은 100, 200으로 변경하고 출력하세요.
		intList = new LinkedList<Integer>();
		
		for(int i = 0 ; i < 5; i++) {
			System.out.print("정수를 입력하세요.");
			intList.add(sc.nextInt());
		}
		
		intList.set(3, 100);
		intList.set(4, 200);

		System.out.println(intList);
		System.out.println("------------------------");
		
//	    3. Map<String, Integer>을 하나 생성하여 key는 알파벳(대소문자 구분) 
//		value는 해당 알파벳의 유니코드 값을 Integer형태로 저장하세요.
		Map<String, Integer> alphaMap = 
				new HashMap<String, Integer>();
		
		for(int i = 'A'; i <= 'Z'; i++) {
			alphaMap.put(
					String.valueOf((char)i), i);
		}
		
		for(int i = 'a'; i <= 'z'; i++) {
			alphaMap.put(
					String.valueOf((char)i), i);
		}
		
		System.out.println(alphaMap);
		
		sc.close();
	}

}
