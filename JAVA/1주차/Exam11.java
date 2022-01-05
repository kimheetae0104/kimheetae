import java.util.Scanner;

public class Exam11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("A 입력 >> ");
		int A = sc.nextInt();
		System.out.println("B 입력 >> ");
		int B = sc.nextInt();
		if(A==0&&B==0) {
			break;
		}else {
			System.out.println("결과 >> "+(A-B));
		}
		}
	}

}
