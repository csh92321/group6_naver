package naver_mail_jch;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

public class Mail {
	
	Scanner sc=new Scanner(System.in);
	
	class MailWrite {
	    static String[] mail = { "메일" }; //메일이라 입력하면 네이버메일로 이동
	    static String[] site = { "https://mail.naver.com/" };
	    Scanner sc;
	
	
	    void mail(String word) {
	        for (int i=0; i<mail.length; i++) {
	            if (mail[i].equals(word)) {
	                return;
	            }
	        }
	    }
	    
	    void program() {	
	        System.out.println("네이버 메일");
	        
	        while(true) {
	            System.out.print("'메일'을 입력하세요: ");
	            String mail = sc.next();
	            
	            if (mail.equals("메일 쓰기")) {
	                System.out.println("https://mail.naver.com/#%7B%22fClass%22%3A%22write%22%2C%22oParameter%22%3A%7B%22orderType%22%3A%22new%22%2C%22sMailList%22%3A%22%22%7D%7D");
	                break;
	            
	            }
	        }//while
	    }//run()
	}//classs


	public class Quiz01 {

		public static void main(String[] args) {

			  Mail mail = new Mail();
		        

		}
	}
	}