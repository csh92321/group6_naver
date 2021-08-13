package naver_shopping_csh;

import java.util.*;
import java.util.Map.Entry;

public class Shopping {
	
	Scanner input = new Scanner(System.in);
	HashMap map = new HashMap();
	HashMap map1 = new HashMap();
	int select;
	String sel;
	int sum=0;
	
	public void cart() {
		System.out.print("제품 이름 : ");
		String name = input.next();
		System.out.print("가격 : ");
		int cost = input.nextInt();
		map.put(name, cost);
	}
	
	public void pay() {
		Iterator<String> keys = map.keySet().iterator();
        while( keys.hasNext() ){
            String key = keys.next();
            System.out.println(key + " : " + map.get(key));
            map1.put(key, map.get(key));
            sum = sum + (int)map.get(key);}
        if (sum==0) {
        	System.out.println("장바구니가 비어있습니다.");
        }else {
        System.out.println("총 : "+sum);
        System.out.println("결제 하시겠습니까?(yes/no)");
        sel = input.next();
        if (sel.equals("yes")) {
        	System.out.println("결제가 완료되었습니다.");
        	sum = 0;
        	map.clear();
        } else {
        	System.out.println("결제가 취소되었습니다.");
        	sum = 0;
        }
	}
	}
	
	public void check( ) {
		
		Iterator<String> keys = map1.keySet().iterator();
		System.out.println("결제 내역");
		while ( keys.hasNext()) {
			String key = keys.next();
			System.out.println(key + " : " + map1.get(key));
			sum = sum + (int)map1.get(key);
			}
		if (sum==0) {
			System.out.println("결제 내역이 없습니다.");
		}else {
		System.out.println("총 결제액 : "+sum);
		sum = 0;
		}
	}
		
		
		
	
	public void display() {
		System.out.println("쇼핑 시작!");
		while(true) {
			System.out.println("1.장바구니 담기\n2.결제하기\n"
					+ "3.최근의 결제 내역 확인\n4.쇼핑 종료");
			int select = input.nextInt();
			switch(select) {
			case 1 :
				cart();
				break;
			case 2 :
				pay();
				break;
			case 3 :
				check();
				break;
			case 4 :
				System.out.println("쇼핑을 종료합니다.");
				return;
			}
		}
	}

}
