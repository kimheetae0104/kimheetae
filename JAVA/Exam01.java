import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("n ют╥б : ");
		int n = sc.nextInt();
		for (int i = 0, j = 1; i < n; i++) {

			j += i;

			System.out.print(j + "\t");

		}

	}

}