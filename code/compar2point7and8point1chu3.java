//������ʹ������:2.7 �� 8.1/3�Ƚ�
public class compar2point7and8point1chu3 
{
	public static void main(String[] args)
	{
		double num1 = 2.7 ;
		double num2 = 8.1 / 3;
		System.out.println(num1);
		System.out.println(num2);
			// �ӽ�2.7��һ��С��,������2.7
			// �õ�һ����Ҫ��ʹ�õ㣺�����Ƕ���������С���Ľ�������ж��ǣ�ҪС��
			// Ӧ�������������Ĳ�ֵ�ľ���ֵ����ĳ�����ȷ�Χ���ж�
		//����д��
		if ( num1 == num2 );
		{
			System.out.println("���");
		}
		//��ȷ��д��
		if(Math.abs(num1 - num2) < 0.000001 );
		{
			System.out.println("��ֵ�ǳ�С�����ҵĹ涨���ȣ� ��Ϊ���..");
		}
	}
}