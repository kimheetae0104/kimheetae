import java.util.Scanner;

public class Exam01 {
	//������ �Է¹޾� 1���ڸ����� �ݿø� �� ����� ����Ͻÿ�.
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�ݿø� ���� : ");
		int num = sc.nextInt();
		if (num % 10 < 5) {
			System.out.println(num / 10 * 10);
		}else{
			System.out.println((num / 10 * 10) + 10);
		}

	}

}
