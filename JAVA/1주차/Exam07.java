import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, max = 0, min=0,i=2;
		System.out.println("�μ� �Է� : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		for(;i <= num1 && i<=num2;) {
			if(num1%i == 0 && num2%i==0)
				min = i;
			i++;
		}
		
		
		
		max = num1*num2/min; // �ּ� ����� ���ϴ� ��
		System.out.println("�ּ� ����� : "+max);
		System.out.println("�ִ� ����� : "+min);
	}

}
