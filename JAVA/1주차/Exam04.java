import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자 입력 >> ");
		int num = sc.nextInt();
		System.out.print("두번째 숫자 입력 >> ");
		int num1 = sc.nextInt();
		//일의 자리 곲하기 전체
		int frist = (num1%10)*num;
		System.out.println(frist);
//		십의자리 곲하기 전체
		int second = (num1%100-num1%10)*num;
		System.out.println(second);
		//백의 자리 곱하기 전체
		int third = (num1-(num1%100-num1%10)-(num1%10))*num;
		System.out.println(third);
		System.out.println(frist+second+third);
		
	
	}

}
