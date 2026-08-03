import java.util.Scanner;

public class circle {
    public static double sol(int r){
        double area =2*3.14*r;
        System.out.println("circumference of circle is: "+area);
        return area;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        int r =sc.nextInt();
        sol(r);
    }
}
