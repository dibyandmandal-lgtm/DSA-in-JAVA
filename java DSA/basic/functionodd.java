import java.util.*;
public class functionodd {
    public static int sol(int n){
        for(int i=0;i<=n;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
        return 0;
    }
    public static void main(String [] args){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sol(n);


    }
}
