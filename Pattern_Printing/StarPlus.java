package PatternPrinting;

import java.util.Scanner;

public class StarPlus {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int mid = n/2 + 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==mid || j==mid) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
