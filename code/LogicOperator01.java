/**
 *演示逻辑运算符的使用
*/
public class LogicOperator01 {
	
	//编写一个main方法
	public static void main(String[] args) {
		//&& 和 & 案例演示
		int age = 50;
		if(age > 20 && age < 90) {
			System.out.println("ok100");
		}
		//&&短路与使用
		if(age > 20 & age < 90) {
			System.out.println("ok200");
		}
		int a = 4;
		int b = 9;
		//对于&&短路与而已,如果第一个条件为false ,后面的条件不再判断
		if(a < 1 && ++b < 50) {
			System.out.println("ok300");
		}
		System.out.println("a=" + a + " b=" + b );

		///&逻辑与使用
		int c = 4;
		int d = 9;
		//对干&逻辑与而言，如果第一个条件为false，后面的条件仍然会判断
		if(c < 1 & ++d < 50) {
			System.out.println("ok300");
		}
		System.out.println("c=" + c + " d=" + d );
	}
}