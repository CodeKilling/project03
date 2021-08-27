package jieun;

import java.util.Scanner;

import project03.MenuName;

public class TestJieun implements MenuName{
	@Override
	public void display() {
		Scanner sc = new Scanner(System.in);
		boolean bool = true;
		while(bool) {
			System.out.println("1.점심  2.저녁  3.나가기");
			int num = sc.nextInt();
			switch(num) {
			case 1 : lunch(); break;
			case 2 : dinner(); break;
			case 3 : bool = false; break;
			default : System.out.println("1~3 중 입력"); break;
			}
		}
	}

	public void lunch() {
		System.out.println("돈까스!");
	}

	public void dinner() {
		System.out.println("김치전!");
	}
}
