import java.util.Scanner;

class A {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        int n = Input.nextInt();
        long[] arr= new long[n];

        long sum=0;
        for (int i = 0; i < n; i++) {
              arr[i] =  Input.nextInt();
              sum +=arr[i];
        }

        System.out.println(Math.abs(sum));

       Input.close();
    }
}
