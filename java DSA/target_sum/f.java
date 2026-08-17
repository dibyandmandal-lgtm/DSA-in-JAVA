import java.util.Scanner;

public class f {
    static int[] makefrequecy(int[] arr){
        int n =arr.length;
        int[] freq = new int[100005];
        for(int i=0;i<n;i++){
            freq[arr[i]]++;
        }
        return freq;
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the no of elements :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the elements :");
            arr[i] = sc.nextInt();
        }
        int[] freq = makefrequecy(arr);
        System.out.print("Enter the q no:");
        int q = sc.nextInt();
        while(q>0){
            int x =sc.nextInt();
            if(freq[x]>0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            q--;
        }


    }
}
