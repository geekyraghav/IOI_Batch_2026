package If_Else;

import java.util.Scanner;

public class FourDigitNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        if(n > 999 && n <= 9999) System.out.println("4 Digit Number");
        else System.out.println("Not a 4 Digit Number");
    }
}
