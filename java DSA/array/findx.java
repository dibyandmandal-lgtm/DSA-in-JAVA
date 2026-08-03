package array;

import java.util.Scanner;

    public class findx {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the number of elements in the array: ");
            int n = sc.nextInt();

            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                arr[i] = sc.nextInt();
            }

            System.out.print("Enter the element to search: ");
            int x = sc.nextInt();

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == x) {
                    System.out.println("Element found at index: " + i);
                    sc.close();
                    return;
                }
            }

            System.out.println("Element not found in the array.");
            sc.close();
        }
    }

