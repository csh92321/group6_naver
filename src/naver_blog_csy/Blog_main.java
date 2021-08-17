package naver_blog_csy;


public class Blog_main {

	//	 # 구현 기능
//	  - 글 쓰기 ( 제목 지정 - 내용 작성)
//	  - 글 수정 (제목 선택 / 제목 찾고 수정)
//	  - 글 삭제 ( 제목 선택 / 제목 찾고 삭제)
//	  - 선택글 내용보기
//	  - 글 목록보기

	public void blog_main() {
		
		Blog blog = new Blog();
		
		while(true) {
			System.out.println("Welcome BLOG");
			System.out.println("-------------");
			System.out.println("1. 작성하기");
			System.out.println("2. 수정하기");
			System.out.println("3. 삭제하기");
			System.out.println("4. 내용보기");
			System.out.println("5. 전체보기");
			System.out.println("6. 메인이동");
			int choice = blog.input();
			
			switch (choice) {
			case 1 :
				blog.write();
				break;
			case 2 :
				blog.edit();
				break;
			case 3 :
				blog.delete();
				break;
			case 4 :
				blog.viewContent();
				break;
			case 5 :
				blog.viewList();
				break;
			case 6 :
				return;
			}
			
		}
	}
}

