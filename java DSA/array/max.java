import java.util.Scanner;
public class max {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the array :");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n;i++){

            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();

        }
        int max = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }

        }
        System.out.print("it is the max number :"+max);
            sc.close();
    }
}
