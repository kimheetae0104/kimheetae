import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���� �Է� >> ");
		int num = sc.nextInt();
		System.out.print("�ι�° ���� �Է� >> ");
		int num1 = sc.nextInt();
		//���� �ڸ� ���ϱ� ��ü
		int frist = (num1%10)*num;
		System.out.println(frist);
//		�����ڸ� ���ϱ� ��ü
		int second = (num1%100-num1%10)*num;
		System.out.println(second);
		//���� �ڸ� ���ϱ� ��ü
		int third = (num1-(num1%100-num1%10)-(num1%10))*num;
		System.out.println(third);
		System.out.println(frist+second+third);
		
	
	}

}
