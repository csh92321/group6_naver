package group6_naver_cafe;

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
