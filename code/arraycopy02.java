public class arraycopy02 { 
	public static void main(String[] args) {

		int arr[] = {11,22,33,44,55,66};
		//1. �ȴ���һ���µ����� arr2 ,��С arr.length
		//2.������� arr����ÿ��Ԫ�ؿ����� arr2��Ԫ���У�˳�򿽱�)
		//3. ��������һ��ѭ������ j->0->5
		int arr2[] = new int[arr.length];
		for (int i = arr.length-1, j =0; i >=0; i--,j++){
			arr2[j] = arr[i];
		}
		arr = arr2;
		//4. ��forѭ�������� arr2����һ����������� {66��55, 44,33�� 22�� 11}
		//5. �� arr ָ�� arr2���ݿռ䣬��ʱ arrԭ�������ݿռ��û�б�������
		// �ᱻ��������������
		for(int i = 0; i < arr.length; i++) {
		//6. ��� arr ����
			System.out.print(arr[i] + "\t");
		}
	}
}