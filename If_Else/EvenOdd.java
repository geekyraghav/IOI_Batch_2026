package If_Else;

import java.util.Scanner;

public class EvenOdd {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        if(n%2 == 0) System.out.println("Even");
        else System.out.println("Odd");
    }
}
