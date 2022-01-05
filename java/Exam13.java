public class Exam13 {

	public static void main(String[] args) {

		// 1 2 3 4 5

		// 6 7 8 9 10

		// 11 12 13 14 15

		// 16 17 18 19 20

		// 21 22 23 24 25

		// 2차원배열을 왼쪽으로 90도 회전하여 출력

		int[][] arr = new int[5][5];

		int num1 = 5;

		int num2 = 1;

		for (int i = 0, k = 1; i < 5; i++, k++) {

			num2 = num1 * k;

			for (int j = 0; j < 5; j++) {

				arr[j][i] = num2--;

			}

			System.out.println();

		}

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {

				System.out.print(arr[i][j] + "\t");

			}

			System.out.println();

		}

	}

}
