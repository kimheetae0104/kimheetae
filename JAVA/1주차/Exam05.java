
public class Exam05 {

	public static void main(String[] args) {
		// 1-2+3-4+��+99-100 �� ����Ͽ�
		// ���� ����Ͻÿ�.
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			if (i % 2 == 0) {
				System.out.print(-i+" ");
				sum -= i;
			} else {
				System.out.print(i+" "); 
				sum += i;
			}
			
		}
		System.out.println("\n"+"��� : " + sum);
	}

}
