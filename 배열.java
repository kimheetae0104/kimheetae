package ȥ�ڰ����ϱ�;

import java.util.Random;

public class �迭 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] array = new int[8];
		int max = 0;
		int min = 0;
		System.out.println("�迭�� �ִ� ��� �� : ");
		for (int i = 0; i < array.length; i++) {
			array[i] = r.nextInt(100) + 1;
			if (i == 0) {
				max = array[i];
				min = array[i];
			}
			if (min > array[i])
				min = array[i];
			if (max < array[i])
				max = array[i];
			System.out.println(array[i] + "\t");
		}
		System.out.println();
		System.out.println("���� ū �� : " + max);
		System.out.println("���� ���� �� : " + min);

	}

}
