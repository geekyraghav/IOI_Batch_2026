package Loops;

import java.util.Scanner;

public class Power {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int a = sc.nextInt();
        System.out.print("Enter exponent: ");
        int b = sc.nextInt();

        int power = 1;
        for(int i=1;i<=b;i++){
            power *= a;
        }
        System.out.println(power);
//        System.out.println(Math.pow(a,b));
    }
}
