package javaCurso;
import java.util.Scanner;
public class facaEquanto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.printf("%d%n%d%n%d%n", a, b, c);
		if (a > b && a > c) {
			System.out.printf("Higher = %d%n", c);
		} else if (b > c) {
			System.out.printf("Higher = %d%n", b);
		} else {
			System.out.printf("Higher = %d%n", c);
		}
		
		
		
		sc.close();
	}

}
