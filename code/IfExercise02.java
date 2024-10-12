//单分支和双分支的练习03
import  java.util.Scanner;
public class IfExercise02 {
	
	//编写一个main方法
	public static void main(String[] args) {


		//【课后自己练】定义两个变量int，判断二者的和，
		//是否能被3又能被5整除，打印提示信息

		//思路分析
		//1.定义两个变量int num1, num2
		//2.定义一个变量 int sum = num1 + num2;
		//3. sum %3, 5后等于0说明可以整除
		//4.使用if - else来提示对应信息
		//走代码
		int num1 =10;
		int num2 =1;
		int sum = num1 + num2;
		if (sum % 3 ==0 && sum % 5 == 0) {
			System.out.println("和可以被3且可以被5整除");
		}else{
			System.out.println("和不能被3和5同时整除");
		}

	}
}
