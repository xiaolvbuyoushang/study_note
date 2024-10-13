//switch的练习0
import  java.util.Scanner;
public class Switch02 {

	//编写一个main方法
	public static void main(String[] args){
		
		//
		//对学生成绩大于60分的，输出"合格"。低于60分的，
		//输出"不合格"。（注：输入的成绩不能大于100），提示 成绩/60
		//思路分析
		//1. 这道题，可以使用 分支来完成， 但是要求使用switch
		//2.这里我们需要进行一个转换，编程思路 ：
		// 如果成绩在[60,10.]，（int)(成绩/60） = 1
		// 如果成绩在[0,60）， （int)（成绩/60） = 0


		//定义一个Scanner 对象
		Scanner myScanner = new Scanner (System.in);
		System.out.println("请输入你的成绩");
		//从键盘获取成绩
		int score = myScanner.nextInt();
		if ( 0 <= score && score <= 100 ){
			//把成绩转为0/1
			
			switch ( score / 60 ){
			case 1 :
				System.out.println("及格");
				break;
			case 0 :
				System.out.println("不及格");
				break;
			}
		}else{
			System.out.println("成绩应该是介于0-100之间的正整数,请重新输入");
		}

		
	}
}
