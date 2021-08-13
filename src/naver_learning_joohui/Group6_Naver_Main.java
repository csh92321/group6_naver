package naver_learning_joohui;

import java.util.Scanner;
import naver_shopping_csh.Shopping;

<<<<<<< HEAD:src/naver_learning_joohui/Group6_Naver_Main.java
=======
import naver_blog_csy.Blog_main;
import naver_mail_jch.Mail;

import group6_naver_cafe_hjm.Cafe_;

>>>>>>> e9a47283458dc9916fd962c9500d87cb2adc4011:src/group6_naver/MainClass.java
public class Group6_Naver_Main {
	public static void main(String[] args) {
		Cafe_ hjm = new Cafe_();
		Learning_joohui learn = new Learning_joohui();
		
		
		Blog_main blog = new Blog_main();
		
		Scanner input = new Scanner(System.in);
<<<<<<< HEAD:src/naver_learning_joohui/Group6_Naver_Main.java
		Shopping csh = new Shopping();
=======
		
		Mail mail=new Mail();
		
>>>>>>> e9a47283458dc9916fd962c9500d87cb2adc4011:src/group6_naver/MainClass.java
		
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
				blog.blog_main();
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
				break;
			}
	}
	}
}
