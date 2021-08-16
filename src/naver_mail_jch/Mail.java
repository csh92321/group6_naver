package naver_mail_jch;

import java.util.HashMap;
import java.util.Scanner;

public class Mail {
	
	//받는 사람 이메일 작성
	//메일 제목 작성
	//메일 내용 작성
	//메일 보내기

	Scanner scanner=new Scanner(System.in);
	
	public void email() {
		
		
		//받는 사람 이메일 작성
		System.out.println("받는 사람 이메일 :");
		String email = scanner.nextLine();
		
	}
	
	public void write() {
		//메일 제목 작성
		System.out.println("제목 입력 : ");
		String title = scanner.nextLine();
		
		//메일 내용 작성
		System.out.println("내용 입력 : ");
		String content = scanner.nextLine();
		System.out.println(content);
	}
	
	public void send() {
		
		System.out.println("메일을 보냈습니다.");
		System.out.println("-------------");

	}
}