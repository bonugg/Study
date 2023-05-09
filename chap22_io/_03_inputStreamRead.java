package chap22_io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class _03_inputStreamRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InputStream is = 
					new FileInputStream(
							"D:/bitcamp/JavaLec" +
									"/JavaProgramming/src/" +
									"chap22_io/ex01.txt");
			
			while(true) {
				int data = is.read();
				
				//더 이상 읽을 데이터가 없을 때는 -1 리턴
				if(data == -1) {
					break;
				}
				
				System.out.println(data);
			}
			
			is.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
