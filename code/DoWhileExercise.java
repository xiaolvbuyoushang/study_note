//do-while����ϰ
import  java.util.Scanner;
public class DoWhileExercise {

	//��дһ��main����
	public static void main(String[] args){

		//�����������Ǯ�����Ϻ���һֱʹ�������ޣ�ֱ������˵��ǮΪ
		//[System.out.println("�Ϻ��ʣ���Ǯ��?y/n")]do...while
		//����Ϊ��
		//��1)��ͣ���ʻ�Ǯ��
		//��2)ʹ��char answer ���ջش𣬶���һ��Scanner����
		// (3)��do-while ��while �ж������ y �Ͳ���ѭ��

		Scanner myScanner = new Scanner(System.in);
		char answer = ' ';
		do {
			System.out.println("��Ǯ��?");
			answer = myScanner.next().charAt(0);
			System.out.println("���Ļش���" + answer);
		}while(answer != 'y' );
		System.out.println("��Ǯ��");
	}
}