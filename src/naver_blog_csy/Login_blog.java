package naver_blog_csy;

import java.util.Scanner;

public class Login_blog {
	
	private String id=null,pass=null; 
	
		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getPass() {
			return pass;
		}

		public void setPass(String pass) {
			this.pass = pass;
		}

		public String inputId() {
			String str;
			Scanner sc = new Scanner(System.in);
			System.out.print("id 입력 : ");
			str = sc.next();
			return str;
		}
		
		public String inputPass() {
			String str;
			Scanner sc = new Scanner(System.in);
			System.out.print("password 입력 : ");
			str = sc.next();
			return str;
		}
		
		public void login() {
			
			Blog_main blog = new Blog_main();
			
			if(getId()==null) {
				System.out.println("로그인 정보가 존재하지 않습니다");
			} else {
				System.out.println(getId());
				System.out.println(getPass());
				String id, pass;
				id = inputId();
				pass = inputPass();
				if (id.equals(getId()) && pass.equals(getPass())) {
					System.out.println("로그인 성공");
					blog.blog_main();
				} else {
					if (!id.equals(getId())) {
						System.out.println("로그인 실패 : 아이디가 같지 않습니다");
					} else if(!pass.equals(getPass())) {
						System.out.println("로그인 실패 : 비밀번호가 같지 않습니다");
				}
			}
		}
	}
		
		public void joinMember() {
			String id,pass;
			id = inputId();
			pass = inputPass();
			setId(id);
			setPass(pass);
			System.out.println(getId());
			System.out.println(getPass());
		}

		public void login_blog_display() {
			
			Scanner sc = new Scanner(System.in);
			
			while (true) {
				System.out.println("1.로그인 2.회원가입 3.로그아웃");
				System.out.print(">> ");
				int choice = sc.nextInt();
				
				switch (choice) {
				case 1 :
					login();
					break;
				case 2 :
					joinMember();
					break;
				case 3 :
					return;
				} 
			}
		}
}

