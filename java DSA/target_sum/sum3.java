import java.util.*;
public class sum3 {
    public static int threesumcount(int[] arr,int target){
        int n =arr.length;
        int ans =0;
        for(int i=0;i<n;i++)
            {
            for(int j =i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the " + n + " elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = 12;

        System.out.println("Number of triplets = " + threesumcount(arr, target));
    }
}
