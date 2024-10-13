//嵌套循环的练习
import  java.util.Scanner;
public class MulForExercise01 {

	//编写一个main方法
	public static void main(String[] args){
	
		// 1. 统计3个班成绩情况，每个班有5名同学，求出各个班的平均分和所有班级的平均分[学生的成绩从键盘输入]。
		// 2. 统计三个班及格人数，每个班有5名同学。

		/*思路分析
		
		化繁为间
		(1)先计算一个班, 5个学生的成绩,使用for	循环
		1.1 创建 Scanner 对象然后，接收用户输入
		1.2得到该班级的平均分,定义一个doubel sum把该班级5个学生的成绩累积

		(1)统计3个班（每个班5个学生）平均分
		(3)所有班级的平均分
		3.1 定义一个变量, double totalScore累积所有学生的成绩
		3.2 当多重循环结束后, totalScore / (3 * 5)
		(4)统计三个班及格人数
		4.1 定义变量 int passNum = 0； 当有一个学生成绩>=60, passNum++
		

		*/

		Scanner myScanner = new Scanner(System.in);
		double totalScore = 0;
		int passNum = 0; 
		for ( int i = 1 ; i <= 3 ; i++ ){

			double sum = 0;
			for (int j = 1; j <= 5; j++ ){
				System.out.println("请数第" + i + "个班的第" + j + "个学生的成绩");
				double score = myScanner.nextDouble();
				//当有一个学生成绩>=60, passNum++
				if ( score >= 60 ){
					passNum++;
				}
				sum += score;
				System.out.println("成绩为" + score);
			}
			System.out.println("sum=" + sum + "平均分=" + ( sum / 5 ));
			totalScore += sum;
		}
		System.out.println("三个班总分=" + totalScore + "平均分=" + totalScore / 15);
		System.out.println("及格人数" + passNum);
	}
}