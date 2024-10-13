//do-while的练习
import  java.util.Scanner;
public class DoWhileExercise {

	//编写一个main方法
	public static void main(String[] args){

		//如果李三不还钱，则老韩将一直使出五连鞭，直到李三说还钱为
		//[System.out.println("老韩问：还钱吗?y/n")]do...while
		//化繁为简
		//（1)不停的问还钱吗？
		//（2)使用char answer 接收回答，定义一个Scanner对象
		// (3)在do-while 的while 判断如果是 y 就不在循环

		Scanner myScanner = new Scanner(System.in);
		char answer = ' ';
		do {
			System.out.println("还钱吗?");
			answer = myScanner.next().charAt(0);
			System.out.println("他的回答是" + answer);
		}while(answer != 'y' );
		System.out.println("还钱了");
	}
}