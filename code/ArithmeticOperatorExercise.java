public class ArithmeticOperatorExercise {
	//编写一个main方法
	public static  void  main (String[] args) {

		//1.需求：
		//假如还有59天放假，问：合x×个星期零××天
		//2.思路分析
		//(1) 使用int 变量 days 保存 天数
		//(2) 一个星期是7天 星期数weeks: days / 7 零xx天leftDays days % 7
		//（3）输出
		int days = 59;
		int weeks = days / 7;
		int leftdays = days % 7;
		System.out.print(days + "天 合" + weeks + "周 零" + leftdays + "天"); 
	}
}