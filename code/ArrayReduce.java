//��������
import java.util.Scanner;
public class ArrayReduce{ 
	public static void main(String[] args) {

		/*
		Ҫ��ʵ�ֶ�̬�ĸ��������Ԫ��Ч����ʵ�ֶ��������ݡ�ArrayAdd.java��
		1.ԭʼ����ʹ�þ�̬����int[] arr = {1,2,3}
		2.���ӵ�Ԫ��4�� ֱ�ӷ����������� arr = {1,2,3,4}
		3.�û�����ͨ�����·����������Ƿ�������,��ӳɹ����Ƿ����?y/n��
		
		˼·����
		1.�����ʼ���� int[] arr = {1,2,3}//�±�0-2
		2. ����һ���µ����� int[] arrNew = new int[arr.length+1];
		3. ���� arr ���飬���ν�arr��Ԫ�ؿ����� arrNew����
		4�� �� 4 ���� arrNew[arrNew.length - 1] = 4;��4����arrNew���һ��Ԫ��
		5. �� arr ָ�� arrNew ; arr = arrNew; ��ô ԭ��arr����ͱ�����
		6. ����һ�� Scanner���Խ����û�����
		7. ��Ϊ�û�ʲôʱ���˳�����ȷ������ʦʹ��(do-while + break������
		*/

		Scanner myScanner = new Scanner(System.in);
		int arr[] = {1,2,3,5,6,7,8,9,10};
		do{
			
			int[] arrNew = new int[arr.length-1];
			//���û��Ƿ����
			System.out.println("�û��Ƿ�ɾ�����һ��Ԫ�� y/n");
			char key = myScanner.next().charAt(0);
			if(key == 'n'){
				break;
			}
			if(arr.length == 1){
				System.out.println("��ʣ���һ���޷�ɾ��");
				break;
			}
			for(int i = 0; i < arr.length -1; i++){
				arrNew[i] = arr[i];
			}
			System.out.println("����ɾ��������Ԫ��");
			
			//��ReduceNum����arrNew���һ��Ԫ��
			// arrNew[arrNew.length - 1] = addNum;
			arr = arrNew;
			
			System.out.println("====arrɾ����Ԫ�����====");
			for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + "\t");
			}	
		}while(true);
		System.out.println("���˳�");
	}
}