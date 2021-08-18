package naver_mail_jch;


import java.util.Scanner;

public class Mail {
	
	//로그인
	//받는 사람 이메일 작성
	//메일 제목 작성
	//메일 내용 작성
	//메일 보내기

	Scanner scanner=new Scanner(System.in);
	
	String id, pw;
	
	//로그인
	public void login(String id, String pw) {
		
		if (this.id != null && this.pw != null) {
			if (this.id.equals(id) && this.pw.equals(pw)) {
				System.out.println("로그인 하셨습니다.");
				
			} else {
				System.out.println("ID 혹은 패스워드를 다시 확인하세요.");
			}
		}
	}
	
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
		System.out.println("입력 완료");
	}
	
	public void send() {
		
		System.out.println("메일을 보냈습니다.");
		System.out.println("-------------");

	}
}
//