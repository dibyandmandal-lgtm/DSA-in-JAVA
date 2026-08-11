package sorting;

import java.util.Scanner;
public class seconndlargest{
     public static int findmax(int[] arr){
        int mx = Integer.MIN_VALUE;
        int n =arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>mx){
                mx = arr[i];
            }
        }
        return mx;
    }
    
     public static int findsecondlargest(int[] arr){
        int mx = findmax(arr);
        int secondmax = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i] != mx && arr[i] > secondmax){
                secondmax = arr[i];
            }
        }
        return secondmax;
    }
    
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the number of elements :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("enter the elements :"+i);
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(findmax(arr));
        System.out.println( "Second largest element is: " + findsecondlargest(arr));
}
}
