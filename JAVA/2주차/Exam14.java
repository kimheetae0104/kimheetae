import java.util.ArrayList;
import java.util.Scanner;

public class Exam14 {
	public static void main(String[] args) {
		int array[][] = new int[5][5];
		char ch = 'A';
		for (int i = 0; i <= 4; i++) {// �� 0~4
			if (i <= 2) {// ����2�����̸�
				for (int j = i; j <= 4 - i; j++) {// ��
					array[i][j] = ch++;
				}
			} else {// ���� 2�ʰ��̸�
				for (int j = 4 - i; j <= i; j++) {// ��
					array[i][j] = ch++;
				}
			}
		}
		// ��¹�
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= 4; j++) {
				System.out.printf("%c", array[i][j]);
			}
			System.out.println();
		}
		
	}

}
