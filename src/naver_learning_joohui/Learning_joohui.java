package naver_learning_joohui;

import java.util.Scanner;

public class Learning_joohui {
	
	Scanner input = new Scanner(System.in);
	
	public void learning() {
		System.out.println("안녕하세요 지식인 입니다.");
		System.out.println("원하시는 질문을 선택 해 주세요");
		int num, mo1, mo2, mo3;
		
		
		System.out.println("===유형 선택===");
		while(true) {
			System.out.println("1. 컴퓨터");
			System.out.println("2. 동물");
			System.out.println("3. 음식");
			System.out.println("4. 종료");
			System.out.println(">>>");
			num = input.nextInt();
			
			switch(num) {
			case 1:
				System.out.println("1.가격 2.부품 3.크기 ");
				num = input.nextInt();
				System.out.println(num + "번 선택 : 해당 정보로 이동합니다.");
				if(num == 1) {
					System.out.println("100만원입니다.");		
				}else if(num == 2) {
					System.out.println("CPU, 메인보드, 메모리, SSD, HDD,그래픽카드 등이 있다");
				}else if(num == 3) {
					System.out.println("13인치, 15인치, 17인치 등이 있다.");
				}else
					System.out.println("등록되지 않은 정보입니다.");
				break;
				
			case 2:
				System.out.println("1.고양이 2.기린 3.코끼리");
				num = input.nextInt();
				System.out.println(num + "번 선택 : 해당 정보로 이동합니다.");
				if(num == 1) {
					System.out.println("포유류 식육목 고양잇과의 대표적인 동물이다.");		
				}else if(num == 2) {
					System.out.println("기린과의 포유동물로서 기린속에 속하는 동물의 총칭이다.");
				}else if(num == 3) {
					System.out.println("포유류 아프로테리아상목 장비목 코끼리과에 속하는 생물이다");
				}else
					System.out.println("등록되지 않은 정보입니다.");
				break;
				
			case 3:
				System.out.println("1.떡볶이 2.김밥 3.삼겹살구이");
				num = input.nextInt();
				System.out.println(num + "번 선택 : 해당 정보로 이동합니다.");
				if(num == 1) {
					System.out.println("떡과 부재료를 양념에 볶거나 끓여서 먹는 한식");		
				}else if(num == 2) {
					System.out.println("분식의 일종으로, 밥을 김으로 감싸 둥글게 만 뒤 잘라낸 음식");
				}else if(num == 3) {
					System.out.println("돼지고기 삼겹살을 구워서 만드는 한국의 구이 요리");
				}else
					System.out.println("등록되지 않은 정보입니다.");
				break;
				
				default:
					System.out.println("잘 못 입력했어요");
			case 4:
				return;
				
			}
		}
	}

}
