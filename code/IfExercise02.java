//����֧��˫��֧����ϰ03
import  java.util.Scanner;
public class IfExercise02 {
	
	//��дһ��main����
	public static void main(String[] args) {


		//���κ��Լ�����������������int���ж϶��ߵĺͣ�
		//�Ƿ��ܱ�3���ܱ�5��������ӡ��ʾ��Ϣ

		//˼·����
		//1.������������int num1, num2
		//2.����һ������ int sum = num1 + num2;
		//3. sum %3, 5�����0˵����������
		//4.ʹ��if - else����ʾ��Ӧ��Ϣ
		//�ߴ���
		int num1 =10;
		int num2 =1;
		int sum = num1 + num2;
		if (sum % 3 ==0 && sum % 5 == 0) {
			System.out.println("�Ϳ��Ա�3�ҿ��Ա�5����");
		}else{
			System.out.println("�Ͳ��ܱ�3��5ͬʱ����");
		}

	}
}
