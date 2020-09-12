package exam02;

import java.util.Scanner;

//Scanner 클래스 : 입력을 받기 위한 클래스이다. 
public class ScannerEx {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//System.out.print("정수입력 : ");
		//int num=sc.nextInt(); //키보드로부터 정수형을 입력
		//syso + Ctrl +space 
		//(" " 와 변수를 같이 나오게 하려면  + 를 적는다
		//이유 : "   " 있는 것 문자, 문자와 문자의 연결  + 
		//저장 (Ctrl +s )-> 실행 ( Ctrl + f11)
		//System.out.println("제곱값 : " + (num*num));
		
		System.out.println();
		//next()
		//nextLine()
		System.out.println("문자열 입력 연습");
//		String str;  //변수 선언 
//		str= sc.next();  //초기값 입력받기
		
		
		//next() : 공백을 기준으로 공백전 입력 : 단어 입력
		//nextLine() : 문장입력
		System.out.print("문자열 입력: ");
		String str = sc.next();//키보드로부터 문자열을 입력받아서 str변수에넣어라. 
		System.out.println("입력받은 문자열 : " + str);
		
		
		
		sc.close(); // 스캐너 클래스(자원) 종료
	}

}










