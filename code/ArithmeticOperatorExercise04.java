public class ArithmeticOperatorExercise04 {
	//��дһ��main����
	public static  void  main (String[] args) {

		//����:
		//����һ���������滪���¶�,�����¶�ת�������¶ȵĹ�ʽΪ
		//��5/9*�������¶�-100��������������¶ȶ�Ӧ�������¶�
		//
		//2˼·����
		//(1) �ȶ���һ��double hua�������� �����¶�
		//    ������ѧ��ʽ��java���Ե�����
		//(2) ���ݸ����Ĺ�ʽ�����м��㼴��5/9*(�����¶�-100)1
		//(3) ���õ��Ľ�����浽double sheshi
		double hwui = 234.6;
		double ueui = 5.0 /  9 * (hwui - 100 );
		//��Ҫ����5������ֵľ���,������0
		System.out.print("�����¶�" + hwui + "��Ӧ�������¶�=" + ueui);
	}
}