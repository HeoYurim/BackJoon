import java.util.Scanner;

public class Q9498 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		
		scan.close();
		
		if(90 <= A) {
			System.out.println("A");
		}
		else if(80 <= A) {
			System.out.println("B");
		}
		else if(70 <= A) {
			System.out.println("C");
		}
		else if(60 <= A) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}

	}

}
