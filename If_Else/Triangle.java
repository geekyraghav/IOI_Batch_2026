package If_Else;

import java.util.Scanner;

public class Triangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("1ST NUMBER: ");
        int a = sc.nextInt();
        System.out.print("2ST NUMBER: ");
        int b = sc.nextInt();
        System.out.print("3ST NUMBER: ");
        int c = sc.nextInt();

        if(a+b>c && a+c>b && b+c>a) System.out.println("Valid Triangle");
        else System.out.print("Not a Triangle");
    }
}
