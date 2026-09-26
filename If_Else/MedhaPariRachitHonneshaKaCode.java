package If_Else;

import java.util.Scanner;

public class MedhaPariRachitHonneshaKaCode {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if(n%15 == 0 && n%3 == 0) System.out.println("Medha");
        else if(n%3 == 0) System.out.println("Pari");
        else if(n%5 == 0) System.out.println("Rachit");
        else System.out.println("Honnesha");
        sc.close();
    }
}
