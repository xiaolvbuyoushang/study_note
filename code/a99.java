public class a99 { 
	public static void main(String[] args) {
		for (int j =1 ; j <= 9; j++){
			for ( int i = 1 ; i <= j ; i ++){
				System.out.printf("%dx%d=%-2d", i, j, i * j);
			}
			System.out.println("");
		}	
	}
}