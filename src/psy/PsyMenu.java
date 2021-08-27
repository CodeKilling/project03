package psy;

import java.util.Scanner;

public class PsyMenu implements project03.MenuName{

	boolean flag = true;
	
	@Override
	public void display() {
		Scanner sc = new Scanner(System.in);
		int input = 0;
	
		while(flag) {
			System.out.println("1.점심");
			System.out.println("2.저녁");
			System.out.println("3.나가기");
			
			input = sc.nextInt();
			
			switch(input) {
			case 1: this.lunch(); break;
			case 2: this.dinner(); break;
			case 3: this.exit(); break;
			default: System.out.println("only 1~3"); break;
			}
		}
		
	}

	@Override
	public void lunch() {
		System.out.println("점심은 굶었습니다. 늦잠자서...");
	}

	@Override
	public void dinner() {
		System.out.println("저녁은 간단한 집밥 이였습니다.");
	}
	
	private void exit() {
		this.flag = false;
	}
	
}
