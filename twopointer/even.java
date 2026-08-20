package twopointer;
import java.util.Scanner;
public class even {
    
    static int[] swapingpointer(int[] arr){
        int n =arr.length;
        int left =0,right=n-1;
        while(left<right){
            if(arr[left]%2==1 && arr[right]%2==0){
               int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                left++;
                right--;
            }
            else if(arr[left]%2==0){
                left++;
            }
            else if(arr[right]%2==1){
                right--;
            }
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of elements :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();

        }
        System.out.print("Original Array :");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
        swapingpointer(arr);
        System.out.println();
        System.out.print("Swapped Array :");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
