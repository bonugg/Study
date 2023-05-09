package chap17_generic.clazz;

import java.util.ArrayList;
import java.util.List;

public class Test {
	//Number상속 받는 T
	//리턴타입 List<T> getEven(List<T> list)
	public  <T extends Number> List<T>
	getEven(List<T> list) {
		List<T> returnList = 
						new ArrayList<T>();
		
		for(T t : list) {
			if(t.intValue() % 2 == 0) {
				returnList.add(t);
			}
		}
		
		return returnList;
	}
}
