//switch����ϰ0
import  java.util.Scanner;
public class Switch02 {

	//��дһ��main����
	public static void main(String[] args){
		
		//
		//��ѧ���ɼ�����60�ֵģ����"�ϸ�"������60�ֵģ�
		//���"���ϸ�"����ע������ĳɼ����ܴ���100������ʾ �ɼ�/60
		//˼·����
		//1. ����⣬����ʹ�� ��֧����ɣ� ����Ҫ��ʹ��switch
		//2.����������Ҫ����һ��ת�������˼· ��
		// ����ɼ���[60,10.]����int)(�ɼ�/60�� = 1
		// ����ɼ���[0,60���� ��int)���ɼ�/60�� = 0


		//����һ��Scanner ����
		Scanner myScanner = new Scanner (System.in);
		System.out.println("��������ĳɼ�");
		//�Ӽ��̻�ȡ�ɼ�
		int score = myScanner.nextInt();
		if ( 0 <= score && score <= 100 ){
			//�ѳɼ�תΪ0/1
			
			switch ( score / 60 ){
			case 1 :
				System.out.println("����");
				break;
			case 0 :
				System.out.println("������");
				break;
			}
		}else{
			System.out.println("�ɼ�Ӧ���ǽ���0-100֮���������,����������");
		}

		
	}
}
