package chap17_generic;

import java.util.ArrayList;
import java.util.List;

public class _02_genericMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArr = 
				{"java", "javascript", "html"};
		
		Integer[] intArr = {1, 2, 3, 4, 5};
		
		String result1 = _02_genericMethod.
						<String>getLastEle(strArr);
						
		
		Integer result2 = _02_genericMethod.
						<Integer>getLastEle(intArr);
		
		System.out.println("strArr의 마지막 요소는 "
				+ result1);
		
		System.out.println("strArr의 마지막 요소는 "
				+ result2);
		
		List<Integer> iList = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++) {
			iList.add(i);
		}
		
		System.out.println(_02_genericMethod.
				<Integer>getLastEle(iList));
	}
	
	public static <T> T getLastEle(T[] tArr) {
		return tArr[tArr.length - 1];
	}
	
	public static <T> T getLastEle(List<T> tList) {
		return tList.get(tList.size() - 1);
	}
}
