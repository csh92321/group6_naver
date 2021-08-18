package Group6_Naver_Main;

import java.util.Scanner;

import group6_naver_cafe_hjm.Cafe_;
import naver_blog_csy.Login_blog;
import naver_learning_joohui.Learning_joohui;
import naver_mail_jch.Mail;
import naver_shopping_csh.Shopping;

public class Group6_Naver_Main {
	public static void main(String[] args) {
		
		Cafe_ hjm = new Cafe_();
		Learning_joohui learn = new Learning_joohui();
		Login_blog blog = new Login_blog();
		Shopping csh = new Shopping();
		Mail mail=new Mail();
		
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
				blog.login_blog_display();
				break;
			case 3 :
				hjm.print();
				break;
			case 4 :
				learn.learning();
				break;
			case 5 :
				csh.display();
				break;
			case 6 :
				return;
			}
	}
	}
}
