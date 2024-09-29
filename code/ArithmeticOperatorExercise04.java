public class ArithmeticOperatorExercise04 {
	//编写一个main方法
	public static  void  main (String[] args) {

		//需求:
		//定义一个变量保存华氏温度,华氏温度转换摄氏温度的公式为
		//：5/9*（华氏温度-100），请求出华氏温度对应的摄氏温度
		//
		//2思路分析
		//(1) 先定义一个double hua变量保存 华氏温度
		//    考虑数学公式和java语言的特性
		//(2) 根据给出的公式，进行计算即可5/9*(华氏温度-100)1
		//(3) 将得到的结果保存到double sheshi
		double hwui = 234.6;
		double ueui = 5.0 /  9 * (hwui - 100 );
		//需要保留5这个数字的精度,否则变成0
		System.out.print("华氏温度" + hwui + "对应的摄氏温度=" + ueui);
	}
}