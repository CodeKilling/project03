package nmrnkd;

import java.util.Scanner;

import project03.MenuName;

public class Nmrnkd_Menu implements MenuName{
	
	Scanner input = new Scanner(System.in);
	int num=0; boolean bool = true;

	public void display()
	{	
		while(bool)
		{
			System.out.println("1.점심. 2.저녁. 3.나가기.");
			num = input.nextInt();
			
			switch(num){
			
			case 1 : lunch();break; 
			case 2 : dinner();break;
			case 3 : exit();break;
			}
		}
	}//1.점심. 2.저녁. 3.나가기.
	public void lunch()
	{
		System.out.println("늦잠 자서 수업 켜놓고 그래놀라에 우유 말아 먹었어여ㅜㅜ");
	}//점심메뉴 출력문.
	public void dinner()
	{
		System.out.println("고기 샐러드?랑 미소 된장국 먹었어여ㅎㅎ\n"
				+ "얼마전에 "
				+ "https://youtu.be/JhDfZAj4OSc\n"
				+ "이 영상 보고 너무 먹고 싶어서 만들어봤는데\n"
				+ "....!!!!!\n"
				+ "존맛탱~~");
	}
	public void exit()
	{
		bool = false;
	}//저녁메뉴 출력문.
	
	public static void main(String[] args) {
		Nmrnkd_Menu n = new Nmrnkd_Menu();
		n.display();
	}
}
 
/* Main에 추가할 것
	import nmrnkd.Nmrnkd_Menu;
	Nmrnkd n = new Nmrnkd();
	n.display();
*/