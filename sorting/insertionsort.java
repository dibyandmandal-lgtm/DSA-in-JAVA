import java.util.Scanner;
public class insertionsort {
    static int [] insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();   
        
        System.out.print("Enter the elements of the array: ");
        int [] arr = new int[n];
        for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
        }
        System.out.print("Original Array : \n");
        for (int j = 0; j < n; j++) {
                System.out.print(arr[j] + " ");
        }
        System.out.println();
        System.out.print("Sorted Array :"+ java.util.Arrays.toString(insertionSort(arr)));
    }
}
