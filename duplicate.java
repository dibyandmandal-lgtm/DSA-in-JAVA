package sorting;
import java.util.Scanner;
public class duplicate {
    public static int findelements(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j =i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
        
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of elements :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("enter the elements :"+i);
            arr[i] = sc.nextInt();
        }
        System.out.print("the duplicate elements is :"  + findelements(arr));
    }
        
}
