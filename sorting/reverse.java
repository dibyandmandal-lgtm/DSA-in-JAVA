package sorting;
import java.util.Scanner;
public class reverse {
    public static void reverse(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements of array :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        reverse(arr);
        System.out.print("reversed array :");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
