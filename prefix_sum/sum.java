package prefix_sum;
import java.util.*;

public class sum {
    static int[] prefixsumarray(int[] arr){
        int n = arr.length;
        for(int i=1;i<n;i++){
            arr[i]+=arr[i-1];
        }
        return arr;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); 
            System.out.print("enter the number :");
            int n = sc.nextInt();
            int [] arr = new int[n];
            for (int i=0;i<n;i++) {
                arr[i] = sc.nextInt();
                
            }
            int[] prefixSum = prefixsumarray(arr);
            System.out.print("sum array");
            for(int i=0;i<n;i++){
                System.out.print(prefixSum[i] + " ");
            }
    }
}

