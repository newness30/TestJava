package exam02;

import java.util.Scanner;

//Scanner Ŭ���� : �Է��� �ޱ� ���� Ŭ�����̴�. 
public class ScannerEx {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//System.out.print("�����Է� : ");
		//int num=sc.nextInt(); //Ű����κ��� �������� �Է�
		//syso + Ctrl +space 
		//(" " �� ������ ���� ������ �Ϸ���  + �� ���´�
		//���� : "   " �ִ� �� ����, ���ڿ� ������ ����  + 
		//���� (Ctrl +s )-> ���� ( Ctrl + f11)
		//System.out.println("������ : " + (num*num));
		
		System.out.println();
		//next()
		//nextLine()
		System.out.println("���ڿ� �Է� ����");
//		String str;  //���� ���� 
//		str= sc.next();  //�ʱⰪ �Է¹ޱ�
		
		
		//next() : ������ �������� ������ �Է� : �ܾ� �Է�
		//nextLine() : �����Է�
		System.out.print("���ڿ� �Է�: ");
		String str = sc.next();//Ű����κ��� ���ڿ��� �Է¹޾Ƽ� str�������־��. 
		System.out.println("�Է¹��� ���ڿ� : " + str);
		
		
		
		sc.close(); // ��ĳ�� Ŭ����(�ڿ�) ����
	}

}










