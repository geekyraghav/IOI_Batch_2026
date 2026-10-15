package PatternPrinting;

import java.util.Scanner;

public class NumberSpiral {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for(int i=1;i<=2*n-1;i++){
            for(int j=1;j<=2*n-1;j++){
                int a = (i > n) ? 2*n-i : i;
                int b = (j > n) ? 2*n-j : j;
                System.out.print(Math.min(a,b) +" ");
            }
            System.out.println();
        }
    }
}
