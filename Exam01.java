import java.util.Scanner;

public class Exam01 {
	//정수를 입력받아 1의자리에서 반올림 한 결과를 출력하시오.
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("반올림 전값 : ");
		int num = sc.nextInt();
		if (num % 10 < 5) {
			System.out.println(num / 10 * 10);
		}else{
			System.out.println((num / 10 * 10) + 10);
		}

	}

}
