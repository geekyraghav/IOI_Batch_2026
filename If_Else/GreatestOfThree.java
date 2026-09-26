package If_Else;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GreatestOfThree {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd Number: ");
        int c = sc.nextInt();

        if(a>=b && a>=c) System.out.println(a+" is greatest");
        else if(b>=c) System.out.println(b+" is greatest");
        else System.out.println(c+" is greatest");

//        if(a > b){
//            if(a > c) System.out.println(a+" is greatest");
//            else // c >= a > b
//                System.out.println(c+" is greatest");
//        }
//        else{ // b >= a
//            if(b > c) System.out.println(b+" is greatest");
//            else System.out.println(c+" is greatest");
//        }

//        int greatest = (a>=b && a>=c) ? a : ((b >= c) ? b : c);
        int greatest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println(greatest);

    }
}
