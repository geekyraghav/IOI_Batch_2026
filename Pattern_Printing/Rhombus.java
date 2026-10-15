package PatternPrinting;

import java.util.Scanner;

public class Rhombus {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){ // Spaces
                System.out.print("  ");
            }
            for(int j=1;j<=n;j++){ // Stars
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
