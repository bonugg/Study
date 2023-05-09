package chap15_usefulClass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _13_regex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern = "010.*-[0-9]{4}.*-[0-9]{4}";
		String test = "010-1111-2222";
		
		Pattern pt = Pattern.compile(pattern);
		Matcher m = pt.matcher(test);
		
		if(m.matches()) {
			System.out.println("전화번호 양식이 맞았습니다.");
		} else {
			System.out.println("다시 입력하세요.");
		}
	}

}
