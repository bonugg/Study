package chap98_homework.nc230328.clazz;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Group {
	private Map<String, String> memberMap = 
				new HashMap<String, String>();
	
	public Group() {
		
	}
	
	public Group(Map<String, String> map) {
		this.memberMap = map;
	}

	public Map<String, String> getMemberMap() {
		return memberMap;
	}

	public void setMemberMap(Map<String, String> memberMap) {
		this.memberMap = memberMap;
	}
	
	public Entry<String, String> getCaptin() {
		Entry<String, String> returnEnt = null;
		
		for(Entry<String, String> ent : 
						this.memberMap.entrySet()) {
			if(ent.getValue().equals("조장")) {
				returnEnt = ent;
			}
		}
		
		return returnEnt;
	}

//	@Override
//	public String toString() {
//		return "Group [memberMap=" + memberMap + "]";
//	}
}
