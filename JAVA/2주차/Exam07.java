 import java.util.Scanner;



public class Exam07 {

    public static void main(String[] args) {

        //10진수를 2진수로 변경

        Scanner sc = new Scanner(System.in);

        

        System.out.print("숫자를 입력 하세요 : ");

        int num = sc.nextInt();

        int num2 = num;

        

        //10진수를 2진수로 바꿀때 몇번의 나눗셈이 사용되는지 확인

        int i=0;

        while(num2>0) {

            num2/=2;

            //System.out.print(num2%2+"\t");

            i++;

        }

        //확인된 2진수의 개수를 통해 각 2진수를 배열에 넣는다.

        int[] arr = new int[i];

        int j=0;

        num2 = num;

        while(num2>0) {

            arr[j] = num2%2;

            num2/=2;

            //System.out.print(num3%2+"\t");

            j++;

        }

        

        System.out.print("10진수 "+num+"의 2진수는 ");

        for(i=arr.length; i>0; i--) {

            System.out.print(arr[i-1]);

        }

        System.out.println(" 입니다.");



        /* 방법2

        int n;

        n=sc.nextInt();

        

        int[] b = new int[32];

        int k=0;

        while(n!=1) {

            b[k++] = n%2;

            n=n/2;

        }

        b[k]=n;

        for(int l=k; l>=0; --l) {

            System.out.println(b[l]);

        }

        */



        /* 방법3

        int num3 = num;

        int cnt = 0;

        while(true) {

            if(num3!=0) {

                num3/=2;

                cnt++;

            } else {

                break;

            }

        }



        int[] result = new int[cnt];

        num3 = num;

        for(i=0; i<result.length; i++) {

            result[i] = num3%2;

            num3/=2;

        }

        

        System.out.print("10진수 "+num+"의 2진수는 ");

        for(i=result.length; i>0; i--) {

            System.out.print(result[i-1]);

        }

        System.out.println(" 입니다.");

        */

        

        //System.out.print("10진수 "+num+"의 2진수는 "+Integer.toBinaryString(num));

    }

}