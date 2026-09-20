package BasicsOfJava;

import java.util.Scanner;

public class SimpleInterest {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount : ");
        double P = sc.nextDouble();
        System.out.print("Enter the rate of interest : ");
        double R = sc.nextDouble();
        System.out.print("Enter the time period (in years) : ");
        double T = sc.nextDouble();
        double SI = P*R*T/100;
        System.out.println("the simple interest is " + SI);
    }


}
