import java.util.*;
public class twosum {
    public static int findsum(int[] arr,int target){
        int n = arr.length;
       for(int i=0;i<n;i++){
        for( int j=i+1;j<n;j++){
            if(arr[i]+arr[j]==target){
                System.out.println("the pairs are :"+arr[i]+" "+arr[j]);
            }
        }
       }
       return 0;
    }
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("enter the elements :"+i);
            arr[i] = sc.nextInt();
        }
        System.out.print("enter the target elemnets :");
        int target = sc.nextInt();
        System.out.println(findsum(arr,target));

        
    }
}
