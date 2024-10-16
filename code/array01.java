public class array01 { 
	public static void main(String[] args) {
		double[] hens =  {3,5,1,3.4,2,50};


		//遍历数组得到数组的所有元素的和， 使用for
		//老韩解读
		//1.我们可以通过 hens[下标]来访问数组的元素
		// 下标是从 0 开始编号的比如第一个元素就是 hens[0]
		// 第2个元素就是 hens[1] ，依次类推
		//2. 通过for就可以循环的访问 数组的元素/值
		//3. 使用一个变量 totalWeight 将各个元素累积

		double totalWeight = 0;
		for (int i=0; i < 6; i++)
		{
			System.out.print(""i++) {
			System.out.println("总体重=" + totalWeight +
				"平均体重="+ (totalWeight / 6));
		}
	}
}