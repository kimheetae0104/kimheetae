import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// �Ž������� �Է� �޾� ������� �ϴ� ������ ������ ����ϴ� ���α׷�
		// �ִ� ������ 10000��, �ּҴ����� 100��
		int[] array = { 10000, 5000, 1000, 500, 100 };
		Scanner sc = new Scanner(System.in);
		System.out.print("����ݾ� : ");
		int num = sc.nextInt();

		System.out.println("�ܵ���ȯ");
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]+"�� "+num/array[i]+"��");
			num%=array[i];
		}
	
	
	}

}
