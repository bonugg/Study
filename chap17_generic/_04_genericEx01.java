package chap17_generic;

import java.util.ArrayList;
import java.util.List;

import chap17_generic.clazz.Test;

public class _04_genericEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList = 
					new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++) {
			intList.add(i + 1);
		}
		
		Test test = new Test();
		
		System.out.println(test.
					<Integer>getEven(intList));
		
		System.out.println(test.
							 getEven(intList));
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
