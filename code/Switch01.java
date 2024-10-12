//switch分支的练习
import  java.util.Scanner;
public class Switch01 {
	
	//编写一个main方法
	public static void main(String[] args) {
		/*
		案例: Switch01.java
			请编写一个程序，该程序可以接收一个字符，比如：a,b,c,d,e,f,g
			a表示星期一，b表示星期二 ...
			根据用户的输入显示相应的信息·要求使用 switch 语句完成
		思路分析
			1. 接收一个字符 ，创建Scanner对象
			2. 使用switch 来完成匹配，并输出对应信	息
		*/
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入一个字符(a-g)");
		char c1 = myScanner.next().charAt(0); 
		//charAt对字符串强制转为字符(取第一个字符)


		//在java中，只要是有值返回，就是一个表达式
		switch (c1) {
			case 'a' :
				System.out.println("今天是星期一");
				break;
			case 'b' :
				System.out.println("今天是星期二");	
				break;
			case 'c' :
				System.out.println("今天是星期三");	
				break;
			case 'd' :
				System.out.println("今天是星期四");	
				break;
			case 'e' :
				System.out.println("今天是星期四");
				break;
			case 'f' :
				System.out.println("今天是星期四");	
				break;
			case 'g' :
				System.out.println("今天是星期四");	
				break;
			default :			
				System.out.println("字符不匹配");
		}
		System.out.println("退出了switch ,继续执行程序");
	}
}