package naver_learning_joohui;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		
		Learning_joohui learn = new Learning_joohui();
		
		Scanner input = new Scanner(System.in);
		System.out.println("--- 네이버 ---");
		
		while (true) {
			System.out.println("1.메일");
			System.out.println("2.블로그");
			System.out.println("3.카페");
			System.out.println("4.지식iN");
			System.out.println("5.쇼핑");
			System.out.println("6.홈페이지 끄기");
			System.out.print(">>>> ");
			int select = input.nextInt();
			switch (select) {
			case 1 :
				break;
			case 2 :
				break;
			case 3 :
				break;
			case 4 :
				learn.learning();
				break;
			case 5 :
				break;
			case 6 :
				break;
			}
	}
	}
}
