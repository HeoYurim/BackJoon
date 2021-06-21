import java.util.Scanner;

public class Q2739 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int j = scan.nextInt();
		
		scan.close();
		
		for(int i = 1; i < 10; i++) {
			
			System.out.println(j + " * " + i + " = " + i*j);
			
		}
	}
}
