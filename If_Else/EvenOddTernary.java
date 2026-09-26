package If_Else;

import java.util.Scanner;

public class EvenOddTernary {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        // condition ? sach : jhoot
        System.out.println((n%2 == 0) ? "Even" : "Odd");
    }
}
