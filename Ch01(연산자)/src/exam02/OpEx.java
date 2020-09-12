package exam02;
//데이터타입(8개) : 기본타입(primitive type)
//정수 : byte, short, int,  long
//실수 : float, double
//문자 : char
//논리 : boolean (true / false )

//문자열 : String  str= "java";

//연산자 연습
public class OpEx {

	public static void main(String[] args) {
		//증감연산자
		int x=10,y=20;
		System.out.println("++x : " + ++x);
		System.out.println("--y : " + --y);
		System.out.println("=====================");
		//shift 연산자  <<(2를 곱한다) , >> (2로 나눈다)
		int a=8, b=2;
		System.out.println(  "8<<2 : " + (a<<b)  );
		System.out.println(  "8>>2 : " + (a>>b)  );
		System.out.println("=====================");
		//비교연산자(> , < , ==) , 논리연산자 ( && , ||, !)
		int i=10;
		boolean result = false;
		result = (i>5);
		System.out.println(result);
		result = (i>5) && (i<20);
		System.out.println(!result);
		System.out.println("=====================");
		//비트연산자( &, | , ^)
		int n1= 8, n2=5;
		System.out.println(n1&n2);
		System.out.println(n1|n2);
		System.out.println(n1^n2);
		
	}

}
