import java.util.Scanner;

public class Exam11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("A �Է� >> ");
		int A = sc.nextInt();
		System.out.println("B �Է� >> ");
		int B = sc.nextInt();
		if(A==0&&B==0) {
			break;
		}else {
			System.out.println("��� >> "+(A-B));
		}
		}
	}

}
