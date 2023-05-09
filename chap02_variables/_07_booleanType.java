package chap02_variables;

public class _07_booleanType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id = "bitNaver5";
		boolean idValidation = false;
		
		
		if(id.length() >=5 && id.length() < 20) {
			idValidation = true;
		}
		//idValidation == true => idValidation
		//idValidation == false => !idValdation
		if(idValidation) {
			System.out.println("사용할 수 있는 "
					+ "아이디입니다.");
		} else {
			System.out.println("아이디는 5자이상 "
					+ "20자미만으로 만들어주세요.");
		}
	}

}
