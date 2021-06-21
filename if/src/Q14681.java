import java.util.Scanner;

public class Q14681 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int X = scan.nextInt();
		int Y = scan.nextInt();
		scan.close();
		
		if(X > 0) {
			
			if (Y > 0) {
				System.out.println("1");
			}
			else
				System.out.println("4");
		}
		
		else if(X < 0) {
			
			if (Y > 0) {
				System.out.println("2");
			}
			else
				System.out.println("3");
		}
	}
}
