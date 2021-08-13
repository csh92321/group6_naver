package group6_naver;

import java.util.Scanner;
import naver_shopping_csh.Shopping;

public class Group6_Naver_Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Shopping csh = new Shopping();
		
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
				break;
			case 5 :
				csh.display();
				break;
			case 6 :
				break;
			}
	}
	}
}
