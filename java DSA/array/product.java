import java.util.Scanner;
public class product {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int product = 1;
        int sum = 0;
        while(n>0){
            int digits = n%10;
            product = product*digits;
            sum=sum+digits;
            n = n/10;
        }
        int d = product-sum;
        System.out.print("this is my final answer" + d);

    }
}
