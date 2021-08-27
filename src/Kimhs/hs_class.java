package Kimhs;

import java.util.Scanner;

import project03.MenuName;

public class hs_class implements MenuName{
	boolean bool = true;
	int num;
	Scanner input = new Scanner(System.in);
	@Override
	public void display() {
		while(bool) {
			System.out.println("1.점심 2.저녁 3.나가기");
			num = input.nextInt();
			if(num == 1) {
				lunch();
			}else if(num == 2) {
				dinner();
			}else if(num == 3) {
				System.out.println("안녕히 계세요 여러분~");
				this.bool = false;
			}else {
				System.out.println("1~3 사이에 정수만 입력하세요.");
			}
		}
		
	}

	@Override
	public void lunch() {
		System.out.println("오늘의 점심 : 육쌈냉면");
		System.out.println("별점 : ★★★");
		
	}

	@Override
	public void dinner() {
		System.out.println("오늘의 저녁 : 볶음밥");
		System.out.println("별점 : ★★★★★");
	}
	
	

}
