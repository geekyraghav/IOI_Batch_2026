package PatternPrinting;

import java.util.Scanner;

public class OddStarTriangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){ // rows
            for(int j=1;j<=2*i-1;j++){ // cols
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
