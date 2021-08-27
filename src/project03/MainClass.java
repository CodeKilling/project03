package project03;

import java.util.Scanner;

import jieun.TestJieun;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MenuName je = null;
		int input = 0;
		
		while(true) {
			System.out.println("1.박상진");
			System.out.println("2.김여진");
			System.out.println("3.김형석");
			System.out.println("4.문지은");
			System.out.println("5.박선영");
			
			input = sc.nextInt();
			
			switch (input) {
			case 1: break;
			case 2: break;
			case 3: break;
			case 4:
				je = new TestJieun();
				je.display();
				break;
			case 5: break;
			
			case 6: sc.close(); System.exit(0);
			
			default: break;
			}
		}
	}

}
