import java.util.Random;

public class Exam04 {

	public static void main(String[] args) {

		// �ߺ����� ���ڸ� �̴� �ζ� ���α׷�

		Random rand = new Random();

		int[] arr = new int[6];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = rand.nextInt(45) + 1;

			// �ߺ����� - �ߺ��� �߻��ϸ� �ߺ��� �߻��� i ���� - ���Ѽ� �ٽû���

			for (int j = 0; j < i; j++) {

				if (arr[i] == arr[j]) {

					i--;

				}

			}

		}

		for (int i : arr) {

			System.out.println(" ����� ���� : " + i);

		}

	}

}