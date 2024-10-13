//for的练习01
import  java.util.Scanner;
public class ForExercise {

	//编写一个main方法
	public static void main(String[] args){
		//打印1~100之间所有是9的倍数的整数，统计个数 及 总和·[化繁为简，先死后活]
		
		/*
		技巧:
		1·化繁为简:即将复杂的需求,拆解成简单的需求,逐步完成
		2.先死后活：先考虑固定的值，然后转成可以灵活变化的值
		*/


		//思路分析
		//打印1~100之间所有是9的倍数的整数，统计个数 及 总和
		// (1) 完成 输出 1-100的值
		//（2）在输出的过程中，进行过滤，只输出9的倍数
		// (3)统计个数 定义一个变量 int count = 0; 当 条件满足时 count++;

		int count = 0;
		int sum = 0;
		for ( int i = 1 ; i <= 100 ; i++ ){
			if ( i % 9 == 0 ){
				System.out.println ( "i=" + i );
				count++;
				sum += i;
			}
		}
		System.out.println ("count=" + count );
		System.out.println ("sum=" + sum );
	}
}
		
