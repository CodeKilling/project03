package project03;

import java.util.Scanner;
import nmrnkd.Nmrnkd_Menu;
import Kimhs.hs_class;
import psy.PsyMenu;
import jieun.TestJieun;


public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MenuName menu = null;
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
			case 2:
				menu = new Nmrnkd_Menu();
				menu.display(); 
				break;
			case 3:
				menu = new hs_class();
				menu.display();
				break;
			case 4:
				menu = new TestJieun();
				menu.display();
				break;
			case 5:
				menu = new PsyMenu();
				menu.display();
				break;
			case 6: sc.close(); System.exit(0);
			default: break;
			}
		}
	}

}
