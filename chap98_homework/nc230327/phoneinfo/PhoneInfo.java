package chap98_homework.nc230327.phoneinfo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PhoneInfo {
	Map<String, String> phoneInfoMap =
					new HashMap<String, String>();
	
	public void insertPhoneInfo(String name, 
								String number) {
		this.phoneInfoMap.put(name, number);
	}

	//모든 PhoneInfo 출력
	public void printAllPhoneInfo() {
		Set<Entry<String, String>> entrySet
					= phoneInfoMap.entrySet();
		
		Iterator<Entry<String, String>> it = 
						entrySet.iterator();
		
		while(it.hasNext()) {
			Entry<String, String> ent = 
									it.next();
			
			System.out.println(ent.getKey() 
					+ " : " + ent.getValue());
		}
	}
	
	public boolean printPhoneInfo(String name) {
		Set<Entry<String, String>> entrySet
					= phoneInfoMap.entrySet();
		
		Iterator<Entry<String, String>> it = 
					entrySet.iterator();
		
		while(it.hasNext()) {
			Entry<String, String> ent = 
									it.next();
			
			if(ent.getKey().equals(name)) {
				System.out.println(ent.getKey() 
					+ " : " + ent.getValue());
				return true;
			}
		}
		
		return false;
	}
}
