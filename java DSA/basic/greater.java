import java.util.*;
public class greater {
    public static void sol(int n1,int n2){
        if(n1>n2){
            System.out.println(n1+" is greater than "+n2);
        }
        else if(n2>n1){
            System.out.println(n2+" is greater than "+n1);
        }
        else{
            System.out.println("Both numbers are equal");
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the number2: ");
        int n2 = sc.nextInt();
        sol(n1, n2);
    }
}
