package 혼자공부하기;

import java.util.Scanner;

public class 소인수분해 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("소인수분해 할 수를 입력하세요 : ");
		int num = sc.nextInt();

		System.out.print(num+" = ");
		for (int i = 2; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i);
				num = num / i;
				if (num == 1) {
				} else {
					System.out.print("*");
				}
			}

		}

	}

}
