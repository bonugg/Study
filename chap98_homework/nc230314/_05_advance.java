package chap98_homework.nc230314;

public class _05_advance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "dBEfIZ";
		String prStr = "";
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			char convertCh = ch >= 'A' && ch <= 'Z' 
					?
					(ch + 33) > 'z' ? 
							(char)(('a' - 1) + ((ch + 33) - 'z')) :
							(char)(ch + 33)	
					:
					(ch - 33) < 'A' ? 
							(char)(('Z' + 1) - ('A' - (ch - 33))) :
							(char)(ch - 33);

			prStr = convertCh + prStr;
		}
		
		System.out.println(prStr);
	}

}
