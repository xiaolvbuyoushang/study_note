public class array02 { 
	public static void main(String[] args) {

		//请求出一个数组int[]的最大值 [4,-1,9, 10,23}，并得到对应的下标
		//老韩思路分析
		//1. 定义一个int数组 int[] arr = {4,-1,9, 10,23};
		//2. 假定 max = arr[0] 是最大值 ，maxIndex=0;
		//3. 从下标 1 开始遍历arr， 如果max <当前元素，说明max 不是真正的
		//  最大值，我们就 max=当前元素；maxIndex=当前元素下标
		//4. 当我们遍历这个数组arr后 ， max就是真正的最大值，maxIndex最大值这
		//  对应的下标

		int[] arr = {4,-1,9,10,23};
		int max = arr[0];
		int maxIndex = 0;
		for (int i = 1; i < arr.length; i++){

			if(max < arr[i] ) {
				max = arr[i];
				maxIndex = i;
			}
		}
		System.out.println("max=" + max + " maxIndex=" + maxIndex);
	}
}