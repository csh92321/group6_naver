package group6_naver_cafe_hjm;

import java.util.Scanner;

public class Cafe_ {
	private String id=null;
	private String pw=null;

	public void signup(String id,String pw) {
		Scanner scan = new Scanner(System.in);
		if(id ==null) {
			id = scan.next();
			pw = scan.next();
			setId(id);
			setPw(pw);
			System.out.println("가입 완료");
		}else {
			System.out.println("중복 아이디");
		}
	}
		
	public void login(String id, String pw) {
		Scanner scan = new Scanner(System.in);
			id = scan.next();
			pw = scan.next();
			if(getId().equals(id)&&getPw().equals(pw)) {
				System.out.println("로그인 성공! ");
				
			}else {
				System.out.println("로그인 실패");
			}
	
	}
	public void print() {
		Scanner scan = new Scanner(System.in);
		while(true) {
		System.out.println("==== Naver Cafe ====");
		System.out.println("1.로그인 2.회원가입 3.글 등록 4.글 조회");
		System.out.print(">>>");
		int choice = scan.nextInt();
		switch (choice) {
		
		case 1: 
			login();
		
		
		
		
		}
		
		}
	}

		
		
		
		

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}
	
	
	
	
	
}
