//Ƕ��ѭ������ϰ
import  java.util.Scanner;
public class MulForExercise01 {

	//��дһ��main����
	public static void main(String[] args){
	
		// 1. ͳ��3����ɼ������ÿ������5��ͬѧ������������ƽ���ֺ����а༶��ƽ����[ѧ���ĳɼ��Ӽ�������]��
		// 2. ͳ�������༰��������ÿ������5��ͬѧ��

		/*˼·����
		
		����Ϊ��
		(1)�ȼ���һ����, 5��ѧ���ĳɼ�,ʹ��for	ѭ��
		1.1 ���� Scanner ����Ȼ�󣬽����û�����
		1.2�õ��ð༶��ƽ����,����һ��doubel sum�Ѹð༶5��ѧ���ĳɼ��ۻ�

		(1)ͳ��3���ࣨÿ����5��ѧ����ƽ����
		(3)���а༶��ƽ����
		3.1 ����һ������, double totalScore�ۻ�����ѧ���ĳɼ�
		3.2 ������ѭ��������, totalScore / (3 * 5)
		(4)ͳ�������༰������
		4.1 ������� int passNum = 0�� ����һ��ѧ���ɼ�>=60, passNum++
		

		*/

		Scanner myScanner = new Scanner(System.in);
		double totalScore = 0;
		int passNum = 0; 
		for ( int i = 1 ; i <= 3 ; i++ ){

			double sum = 0;
			for (int j = 1; j <= 5; j++ ){
				System.out.println("������" + i + "����ĵ�" + j + "��ѧ���ĳɼ�");
				double score = myScanner.nextDouble();
				//����һ��ѧ���ɼ�>=60, passNum++
				if ( score >= 60 ){
					passNum++;
				}
				sum += score;
				System.out.println("�ɼ�Ϊ" + score);
			}
			System.out.println("sum=" + sum + "ƽ����=" + ( sum / 5 ));
			totalScore += sum;
		}
		System.out.println("�������ܷ�=" + totalScore + "ƽ����=" + totalScore / 15);
		System.out.println("��������" + passNum);
	}
}