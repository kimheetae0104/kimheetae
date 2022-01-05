import java.util.Random;

public class Exam04 {

	public static void main(String[] args) {

		// 중복없이 숫자를 뽑는 로또 프로그램

		Random rand = new Random();

		int[] arr = new int[6];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = rand.nextInt(45) + 1;

			// 중복제거 - 중복이 발생하면 중복이 발생된 i 값을 - 시켜서 다시생성

			for (int j = 0; j < i; j++) {

				if (arr[i] == arr[j]) {

					i--;

				}

			}

		}

		for (int i : arr) {

			System.out.println(" 행운의 숫자 : " + i);

		}

	}

}