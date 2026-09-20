package If_Else;

import java.util.Scanner;

public class AbsoluteValue {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        if(n < 0) System.out.println(-n);
        else System.out.println(n);
    }
}
