import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {

		// ���� n �Է¹޾� n*n �迭�� ���ڸ� �����ϰ� ���

		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է� : ");

		int num = sc.nextInt();

		int[][] arr = new int[num][num];

		int a = 1;

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				if (i % 2 == 0) {

					arr[i][j] = a;

				} else {

					arr[i][(arr[i].length - 1) - j] = a;

				}

				a++;

			}

		}

		for (int i = 0; i < num; i++) {

			for (int j = 0; j < num; j++) {

				System.out.print(arr[i][j] + "\t");

			}

			System.out.println();

		}
		sc.close();
	}

}