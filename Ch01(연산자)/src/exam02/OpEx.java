package exam02;
//������Ÿ��(8��) : �⺻Ÿ��(primitive type)
//���� : byte, short, int,  long
//�Ǽ� : float, double
//���� : char
//�� : boolean (true / false )

//���ڿ� : String  str= "java";

//������ ����
public class OpEx {

	public static void main(String[] args) {
		//����������
		int x=10,y=20;
		System.out.println("++x : " + ++x);
		System.out.println("--y : " + --y);
		System.out.println("=====================");
		//shift ������  <<(2�� ���Ѵ�) , >> (2�� ������)
		int a=8, b=2;
		System.out.println(  "8<<2 : " + (a<<b)  );
		System.out.println(  "8>>2 : " + (a>>b)  );
		System.out.println("=====================");
		//�񱳿�����(> , < , ==) , �������� ( && , ||, !)
		int i=10;
		boolean result = false;
		result = (i>5);
		System.out.println(result);
		result = (i>5) && (i<20);
		System.out.println(!result);
		System.out.println("=====================");
		//��Ʈ������( &, | , ^)
		int n1= 8, n2=5;
		System.out.println(n1&n2);
		System.out.println(n1|n2);
		System.out.println(n1^n2);
		
	}

}
