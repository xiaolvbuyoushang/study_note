//演示转义字符的使用
public class ChangeChar {
	//编写一个main方法
	public static void main(String[] args){
		// \t:一个制表位，实现对齐的功能
		System.out.println("北京\t天津\t上海");
		// \n ：换行符
		System.out.println("jack\nsmith\nmary");
		// \\ :一个\ 
		System.out.println("C:\\Windows\\System32\\cmd.exe");
		//两个\\:使用\\\\
		System.out.println("C:\\\\Windows\\\\System32\\\\cmd.exe");
		// \" :一个"
		System.out.println("老韩说：\"要好好学习java，有前途\"");
		// \' :一个'
		System.out.println("老韩说：\'要好好学习java，有前途\'");
		// 北京平教育	
		System.out.println("韩顺平教育\r北京"); 
		//韩顺平教育
		//北京
		System.out.println("韩顺平教育\r\n北京"); 
	}
}