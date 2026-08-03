import java.util.Scanner;

public class Functiong {

    public static void sol(int n) {
        if (n >= 18) {
            System.out.println("Eligible for vote");
        } else {
            System.out.println("Not eligible for vote");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sol(n);

        sc.close();
    }
}