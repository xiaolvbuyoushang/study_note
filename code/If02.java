/**
 *if�Ŀ�������
*/
import java.util.Scanner;
public class If02 {
	
	//��дһ��main����
	public static void main(String[] args) {
		//��дһ�����򣬿��������˵����䣬�����ͬ־���������18�꣬
		//�����"���������18��Ҫ��
		//�Լ�����Ϊ�����������"���������"������䲻����ηŹ����ˡ�"


		//˼·����
		//1. ������������䣬Ӧ�ö���һ��Scanner ����
		//2. �����䱣�浽һ������ int age
		//3. ʹ�� if-else �жϣ������Ӧ��Ϣ

		//����һ��Scanner ����
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("����������:");
		int age = myScanner.nextInt();
		if(age > 18){
			System.out.println("����������18,Ҫ���Լ�����Ϊ����,�������.");
		}else{
			System.out.println("�������С��18,��ηŹ�����");
		}
		System.out.println("�������...");
	}
}