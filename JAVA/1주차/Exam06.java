
public class Exam06 {

	public static void main(String[] args) {
//		(77*1) + (76*2) + (75*3)+��+(1*77)�� ����Ͽ�
//		����� ����Ͻÿ�.
		int sum = 0;
		for (int i = 77, j=1; i>=1; i--, j++) {
			sum += (i*j);
			//System.out.println("("+i+"*"+j+")");
		}
		System.out.println(sum);
	}

}
