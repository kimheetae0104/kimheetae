public class Exam06 {

	public static void main(String[] args) {

		// 1���� ������ �־����� ��

		// �� �� ���� �Ÿ��� ª�� ������ ���

		// �� ���� ������ �Ÿ��� ��� �ٸ���.

		int[] point = { 4, 13, 17, 1, 8, 3, 20 };

		int min = point[0];

		int sum = 0;

		boolean first = true;

		int a = 0;

		int b = 0;

		for (int i = 0; i < (point.length - 1); i++) {

			for (int j = (i + 1); j < point.length; j++) {

				// ū���� ������ ������ ���

				if (point[i] > point[j]) {

					sum = point[i] - point[j];

					first = true;

				} else {

					sum = point[j] - point[i];

					first = false;

				}

				if (min > sum) {

					min = sum;

					// ��½� ���� ���ں��� ����ϱ� if��

					if (first == true) {

						a = point[j];

						b = point[i];

					} else {

						a = point[i];

						b = point[j];

					}

				}

			}

		}

		System.out.println("result = [" + a + ", " + b + "]");

	}

}