package naver_blog_csy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Blog {

	/*
	 # 구현 기능
	  - 글 쓰기 ( 제목 지정 - 내용 작성)
	  - 글 수정 (제목 선택 / 제목 찾고 수정)
	  - 글 삭제 ( 제목 선택 / 제목 찾고 삭제)
	  - 선택글 내용보기
	  - 글 목록보기
	  
	 # 필요 리스트
	  - 제목과 내용 매핑
	 */
	
	Scanner sc = new Scanner(System.in);
	
	HashMap post = new HashMap();

	public int input() {
		System.out.print(">>> ");
		int input = sc.nextInt();
		return input;
	}
	
	public void write() {
		System.out.println("제목 입력 : ");
		String title = sc.nextLine();
		//sc.nextLine();
		System.out.println("내용 입력 : ");
		String content = sc.nextLine();
		post.put(title, content);
		System.out.println(title);
	}
	
	public void edit() {
		int choice;
		System.out.println("1.제목 수정");
		System.out.println("2.내용 수정");
		System.out.print(">>> ");
		choice = sc.nextInt();
		
		if (choice==1) {
			System.out.print("제목 입력 : ");
			String title = sc.nextLine();
			if (post.containsKey(title)) {
				System.out.print("수정 제목 입력 : ");
				String newTitle = sc.nextLine();
				//key값 변경 코드 필요	
				System.out.println("제목이 수정되었습니다");
			} else {
				System.out.println(title+"이 제목인 글이 존재하지 않습니다.");
			}
		} else if (choice == 2) {
			System.out.print("제목 입력 : ");
			String title = sc.nextLine();
			if (post.containsKey(title)) {
				System.out.print("수정 내용 입력 : ");
				String content = sc.nextLine();
				post.replace(title, content);
				System.out.println("내용이 수정되었습니다");
			} else {
				System.out.println(title+"이 제목인 글이 존재하지 않습니다.");
			}
		} else {
			System.out.println("잘못된 번호 선택입니다");
		}
	}
	
	public void delete() {
		System.out.print("삭제할 제목 입력 : ");
		String title = sc.nextLine();
		if (post.containsKey(title)) {
			post.remove(title);
		} else {
			System.out.println("존재하지 않는 제목입니다");
		}
	}
	
	public void viewContent() {
		sc.nextLine();
		System.out.print("제목 입력 : ");
		String title = sc.nextLine();
		if (post.containsKey(title)) {
			System.out.println("제목 : " + title);
			System.out.println("내용 : " + post.get(title));
		}
	}
	
	public void viewList() {
		if (post.size()==0) {
			System.out.println("작성된 글이 없습니다");
		} else {
			Iterator it = post.keySet().iterator();
			while (it.hasNext()) {
				String key = (String)it.next();
				System.out.println("제목 : " + key);
				System.out.println("내용 : " + post.get(key));
				System.out.println("-----------------------------------------");
			}
		}
	}
	
	
}