package group6_naver_cafe_hjm;

import java.util.ArrayList;
import java.util.Scanner;

public class Cafe_ {
	private String id;
	private String pw;
	boolean flag = false;
	boolean flag2 = false;
	ArrayList<String> arr = new ArrayList<String>();

	public void idcheck(String id) {

		if (flag2 == true) {
			if (getId().equals(id)) {
				System.out.println("중복 아이디");
			} else {
				System.out.println("사용 가능 아이디");
			}
		}
	}

	public void login(String id, String pw) {
		if (this.id != null && this.pw != null) {
			if (this.id.equals(id) && this.pw.equals(pw)) {
				System.out.println("로그인 성공! ");
				flag = true;
			} else {
				System.out.println("로그인 실패");
			}
		} else {
			System.out.println("없는 아이디");
			System.out.println("회원가입 하세요");
		}
	}

	public void signup(String id, String pw) {
		if (this.id == null) {
			setId(id);
			setPw(pw);
			System.out.println("가입 완료");
			flag2 = true;
		}

	}

	public void register() {
		if (flag == true) {
			Scanner scan = new Scanner(System.in);
			System.out.print("등록할 글 작성 :");
			String re = scan.next();
			arr.add(re);
			System.out.println("=====작성 완료=====");
		} else {
			System.out.println("잘못된 접근 입니다");
			System.out.println("로그인 하세요");
		}

	}

	public void inquiry() {
		if (flag == true) {

			for (int i = 0; i < arr.size(); i++) {
				System.out.println(getId() + "님의 글: " + arr.get(i));
			}
		} else {
			System.out.println("잘못된 접근 입니다");
			System.out.println("로그인 하세요");
		}
	}

	public void print() {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("==== Naver Cafe ====");
			System.out.println("0.아이디 중복 체크 1.로그인 2.회원가입");
			System.out.println("3.글 등록 4.글 조회 5. 메뉴로 돌아가기");

			System.out.print(">>>");
			int choice = scan.nextInt();
			switch (choice) {

			case 0:
				System.out.print("사용할 id 입력 :");
				String id03 = scan.next();
				idcheck(id03);
				break;
			case 1:
				cls();
				System.out.println("==== 로그인 ====");
				System.out.print("id 입력 :");
				String id = scan.next();
				System.out.print("pw 입력 :");
				String pw = scan.next();
				login(id, pw);
				break;

			case 2:
				cls();
				System.out.println("==== 회원가입 ====");
				System.out.print("id 입력 :");
				String id02 = scan.next();
				System.out.print("pw 입력 :");
				String pw02 = scan.next();
				idcheck(id02);

				signup(id02, pw02);
				break;
			case 3:
				cls();
				System.out.println("==== 글 등록 ====");

				register();
				break;
			case 4:
				System.out.println("==== 글 조회 ====");
				inquiry();
				break;

			case 5:
				return;
			}

		}
	}
	public void cls ()
	{
		for(int i =0; i<15; i++) {
			System.out.println();
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
