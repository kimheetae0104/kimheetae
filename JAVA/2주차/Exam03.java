import java.util.Random;

public class Exam03 {

	public static void main(String[] args) {

		// 8ĭ ũ���� �迭�� �����ϰ� �������� �ʱ�ȭ

		// ���� ū���� ���� ���� ���� ���

		Random r = new Random();

		int[] arr = new int[8];

		int max = 0;

		int min = 0;

		System.out.print("�迭�� �ִ� ��� �� : ");

		for (int i = 0; i < arr.length; i++) {

			arr[i] = r.nextInt(100) + 1;

			if (i == 0) {

				max = arr[i];

				min = arr[i];

			}

			if (max > arr[i])
				max = arr[i];

			if (min < arr[i])
				min = arr[i];

			System.out.print(arr[i] + "\t");

		}

		System.out.println();

		System.out.println("���� ū �� " + max);

		System.out.println("���� ���� �� " + min);

	}

}