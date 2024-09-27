//浮点数使用陷阱:2.7 和 8.1/3比较
public class compar2point7and8point1chu3 
{
	public static void main(String[] args)
	{
		double num1 = 2.7 ;
		double num2 = 8.1 / 3;
		System.out.println(num1);
		System.out.println(num2);
			// 接近2.7的一个小数,而不是2.7
			// 得到一个重要的使用点：当我们对运算结果是小数的进行相等判断是，要小心
			// 应该是以两个数的差值的绝对值，在某个精度范围类判断
		//错误写法
		if ( num1 == num2 );
		{
			System.out.println("相等");
		}
		//正确的写法
		if(Math.abs(num1 - num2) < 0.000001 );
		{
			System.out.println("差值非常小，到我的规定精度， 认为相等..");
		}
	}
}