// [4,6,3,5,8,2] target = 7 ans =2
import java.util.*;

public class sum {

    public static int findsum(int[] arr, int target) {
        int n = arr.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    ans++;
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

        int target = 7;

        System.out.println("Number of pairs = " + findsum(arr, target));
    }
}