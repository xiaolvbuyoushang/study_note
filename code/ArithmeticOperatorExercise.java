public class ArithmeticOperatorExercise {
	//��дһ��main����
	public static  void  main (String[] args) {

		//1.����
		//���绹��59��ż٣��ʣ���x���������������
		//2.˼·����
		//(1) ʹ��int ���� days ���� ����
		//(2) һ��������7�� ������weeks: days / 7 ��xx��leftDays days % 7
		//��3�����
		int days = 59;
		int weeks = days / 7;
		int leftdays = days % 7;
		System.out.print(days + "�� ��" + weeks + "�� ��" + leftdays + "��"); 
	}
}