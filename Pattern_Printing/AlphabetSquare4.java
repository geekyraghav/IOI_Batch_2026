package PatternPrinting;

import java.util.Scanner;

public class AlphabetSquare4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){ // rows
            for(int j=1;j<=n;j++){ // cols
                if(i%2 == 1) System.out.print((char)(i+96)+" ");
                else System.out.print((char)(i+64)+" ");
            }
            System.out.println();
        }
    }
}
