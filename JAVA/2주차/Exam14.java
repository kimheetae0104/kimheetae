import java.util.ArrayList;
import java.util.Scanner;

public class Exam14 {
	public static void main(String[] args) {
		int array[][] = new int[5][5];
		char ch = 'A';
		for (int i = 0; i <= 4; i++) {// 행 0~4
			if (i <= 2) {// 행이2이하이면
				for (int j = i; j <= 4 - i; j++) {// 열
					array[i][j] = ch++;
				}
			} else {// 행이 2초과이면
				for (int j = 4 - i; j <= i; j++) {// 열
					array[i][j] = ch++;
				}
			}
		}
		// 출력문
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= 4; j++) {
				System.out.printf("%c", array[i][j]);
			}
			System.out.println();
		}
		
	}

}
