import java.util.Scanner;

public class Question5_1 {

	public static void main(String[] args) {
		int[] array = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.print("java Á¡¼ö : ");
		int java = sc.nextInt();
		System.out.print("web Á¡¼ö : ");
		int web = sc.nextInt();
		System.out.print("and Á¡¼ö : ");
		int and = sc.nextInt();
		
		int sum = java+web+and;
		int avg = sum/3;
		
		array[0]=java;
		array[1]=web;
		array[2]=and;
		array[3]=sum;
		array[4]=avg;
		
		System.out.println("java\tweb\tand\tsum\tavg");
		System.out.println(array[0]+"\t"+array[1]+"\t"+array[2]+"\t"+array[3]+"\t"+array[4]);
		
	}

}
