package PatternPrinting;

import java.util.Scanner;

public class NumberSquare {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){ // rows
            for(int j=1;j<=n;j++){ // cols
                System.out.print((char)(i+64)+" ");
            }
            System.out.println();
        }
    }
}
