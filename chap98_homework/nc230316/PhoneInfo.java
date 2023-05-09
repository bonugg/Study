package chap98_homework.nc230316;

public class PhoneInfo {
	String[] name = new String[100];
	String[] phoneNum = new String[100];
	
	int index = 0;
	
	public void insertPhoneInfo(String name, String number) {
		//이름과 번호를 배열에 저장
		this.name[index] = name;
		this.phoneNum[index] = number;
		index++;
	}

	//모든 PhoneInfo 출력
	public void printAllPhoneInfo() {
		for(int i = 0; i < name.length; i++) {
			if(name[i] != null) {
				System.out.print("이름 : " + name[i] + ", 번호 : " + phoneNum[i] + "\n");
			}
		}
	}
	
	//번호에 해당하는 이름과 번호 출력
	public void printPhoneInfo(int index) {
		if(name[index - 1] != null) {
			System.out.print("이름 : " + name[index - 1] + ", 번호 : " + phoneNum[index - 1] + "\n");
		} else {
			System.out.println("해당 번호로 저장된 정보가 없습니다.");
		}
	}
}
