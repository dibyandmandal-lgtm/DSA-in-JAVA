import java.util.*;
public class power {
    public static int sol(int n,int p){
        int ans = 1;
        for(int i=1;i<=p;i++){
            ans=ans*n;
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.print("Enter the power: ");
        int p = sc.nextInt();
        System.out.println("The result is: "+sol(n, p));
    }
}
