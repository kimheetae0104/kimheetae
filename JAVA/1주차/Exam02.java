import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// 거스름돈을 입력 받아 내어줘야 하는 지폐의 개수를 출력하는 프로그램
		// 최대 단위는 10000원, 최소단위는 100원
		int[] array = { 10000, 5000, 1000, 500, 100 };
		Scanner sc = new Scanner(System.in);
		System.out.print("현재금액 : ");
		int num = sc.nextInt();

		System.out.println("잔돈변환");
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]+"원 "+num/array[i]+"개");
			num%=array[i];
		}
	
	
	}

}
