package PatternPrinting;

import java.util.Scanner;

public class StarTriangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){ // rows
            for(int j=1;j<=i;j++){ // cols
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
