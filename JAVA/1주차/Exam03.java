import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		// �����̶� 2���� 29���� �ִ� ���� ���Ѵ�.
//		4�� ����̸鼭 100�� ����� �ƴ� ���� �����̴�.
//		400�� ����� �� �����̴�.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�⵵ �Է� >> ");
		int year = sc.nextInt();
		if (year % 4 == 0 && year % 100 != 0) {
			System.out.println(year + "����");
		}else if(year % 400 == 0) {
			System.out.println(year + " ����");
		}else {
			System.out.println("���� �ƴ�");
		}
	}

}
