package sorting;
import java.util.Scanner;

public class selection_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int a =arr.length;

        for (int i = 0; i < a - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        System.out.print("Sorted array: ");
        for (int i = 0; i < a; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
