package twopointer;
import java.util.Scanner;
public class nondecreasingoreder {
    static void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static int[] sortsquare(int[] arr){
        int n= arr.length;
        int left =0,right=n-1,k=0;
        int[] ans =new int[n];
        while(left<=right){
            if(Math.abs(arr[left])> Math.abs(arr[right])){
                ans[k++] = arr[left] * arr[left];
                left++;
            }
            else{
                ans[k++]=arr[right]*arr[right];
                right--;
            }
            reverse(ans,0,n-1);
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the no of elements :");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] ans = sortsquare(arr);
        System.out.println();
        System.out.print("Sorted Square Array :");
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }

        

    }

}
