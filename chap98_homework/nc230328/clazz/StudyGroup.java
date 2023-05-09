package chap98_homework.nc230328.clazz;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

public class StudyGroup<T> {
	List<T> tList = new ArrayList<T>();

	public List<T> gettList() {
		return tList;
	}

	public void settList(List<T> tList) {
		this.tList = tList;
	}
	
	public List<Entry<String, String>> getCaptins() {
		List<Entry<String, String>> entList = 
			new ArrayList<Entry<String, String>>();
		
		for(T t : this.tList) {
			Group g = (Group)t;
			entList.add(g.getCaptin());
		}

		return entList;
	}
}
