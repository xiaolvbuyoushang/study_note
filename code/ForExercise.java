//for����ϰ01
import  java.util.Scanner;
public class ForExercise {

	//��дһ��main����
	public static void main(String[] args){
		//��ӡ1~100֮��������9�ı�����������ͳ�Ƹ��� �� �ܺ͡�[����Ϊ���������]
		
		/*
		����:
		1������Ϊ��:�������ӵ�����,���ɼ򵥵�����,�����
		2.�������ȿ��ǹ̶���ֵ��Ȼ��ת�ɿ������仯��ֵ
		*/


		//˼·����
		//��ӡ1~100֮��������9�ı�����������ͳ�Ƹ��� �� �ܺ�
		// (1) ��� ��� 1-100��ֵ
		//��2��������Ĺ����У����й��ˣ�ֻ���9�ı���
		// (3)ͳ�Ƹ��� ����һ������ int count = 0; �� ��������ʱ count++;

		int count = 0;
		int sum = 0;
		for ( int i = 1 ; i <= 100 ; i++ ){
			if ( i % 9 == 0 ){
				System.out.println ( "i=" + i );
				count++;
				sum += i;
			}
		}
		System.out.println ("count=" + count );
		System.out.println ("sum=" + sum );
	}
}
		
