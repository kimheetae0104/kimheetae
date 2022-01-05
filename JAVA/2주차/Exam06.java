public class Exam06 {

	public static void main(String[] args) {

		// 1차원 점들이 주어졌을 때

		// 그 중 가장 거리가 짧은 점들을 출력

		// 단 점들 사이의 거리는 모두 다르다.

		int[] point = { 4, 13, 17, 1, 8, 3, 20 };

		int min = point[0];

		int sum = 0;

		boolean first = true;

		int a = 0;

		int b = 0;

		for (int i = 0; i < (point.length - 1); i++) {

			for (int j = (i + 1); j < point.length; j++) {

				// 큰수를 앞으로 보내서 계산

				if (point[i] > point[j]) {

					sum = point[i] - point[j];

					first = true;

				} else {

					sum = point[j] - point[i];

					first = false;

				}

				if (min > sum) {

					min = sum;

					// 출력시 작은 숫자부터 출력하기 if문

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