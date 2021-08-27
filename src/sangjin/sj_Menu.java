package sangjin;

import java.util.Scanner;

import project03.MenuName;

public class sj_Menu implements MenuName {
public void display() {
	Scanner sc = new Scanner(System.in);
	boolean bool = true;
	int num=0;
	while(bool) {
		System.out.println("1.점심 2.저녁 3.나가기");
		num =sc.nextInt();
		switch(num) {
		case 1: lunch(); break;
		case 2: dinner(); break;
		case 3: bool = false; break;
		}
	}
}
public void lunch() {
	System.out.println("점심 나가서 먹을 것 같다.");
}
public void dinner() {
	System.out.println("저녁도 나가서 먹을 것 같다.");
}
}

