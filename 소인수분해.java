package ȥ�ڰ����ϱ�;

import java.util.Scanner;

public class ���μ����� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���μ����� �� ���� �Է��ϼ��� : ");
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
