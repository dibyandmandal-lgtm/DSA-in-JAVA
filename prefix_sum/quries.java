package prefix_sum;
import java.util.*;
public class quries {
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter the number :");
            int n = sc.nextInt();
            int [] arr = new int[n];
            for (int i=0;i<n;i++) {
                arr[i] = sc.nextInt();
                
            }
            int[] prefix = new int[n + 1];
            for (int i = 0; i < n; i++) {
                prefix[i + 1] = prefix[i] + arr[i];
            }
            System.out.print("enter the quries:");
            int q = sc.nextInt();
            while(q-->0){
                System.out.print("Enter the range:");
                int l = sc.nextInt();
                int r = sc.nextInt();

                int ans = prefix[r] - prefix[l-1];
                System.out.print("Sum : " + ans);

            }
            }
    }
    
}
