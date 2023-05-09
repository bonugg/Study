package chap98_homework.nc230320;

import java.util.Scanner;

import chap98_homework.nc230320.games.GamesClass;
import chap98_homework.nc230320.games.Lotto;
import chap98_homework.nc230320.games.NumBaseball;
import chap98_homework.nc230320.games.RockScissPaper;


public class GameLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//부모클래스인 GamesClass 선언
		GamesClass gc = null;
		
		Scanner sc = new Scanner(System.in);
		
		boolean isExit = false;
		boolean inCorrect = false;
		
		while(true) {
			System.out.println("게임을 선택하세요.");
			System.out.println("1. 가위바위보");
			System.out.println("2. 야구게임");
			System.out.println("3. 로또게임");
			System.out.println("4. 종료");
			
			int gameSelector = sc.nextInt();
			
			switch(gameSelector) {
				case 1:
					gc = new RockScissPaper();
					break;
				case 2:
					gc = new NumBaseball();
					break;
				case 3: 
					gc = new Lotto();
					break;
				case 4:
					isExit = true;
					break;
				default:
					inCorrect = true;
					break;
			}
			
			if(isExit) {
				sc.close();
				break;
			}
			
			if(inCorrect) {
				continue;
			}
			
			gc.start();
		}
		
		
		
		
		
		
		
		
		
	}

}
