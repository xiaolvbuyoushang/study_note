//for����ϰ02
import  java.util.Scanner;
public class ForExercise02 {

	//��дһ��main����
	public static void main(String[] args){
	
		/*
		�������ı��ʽ���
		0+5=5
		1+4=5
		2+3=5
		3+2=5
		4+1=5
		5+0=5

		//����Ϊ��
		//(1�� ����� 0 - 5
		//��2�� �����+�� 5-i
		//�������
		//(1�� 5 �滻�ɱ��� n

		*/
		int n = 520;
		for ( int i = 0 ; i <= n ; i++ )
			System.out.println( i + " + " + (n-i) + " = " + n );
	}
}