package PatternPrinting;

import java.util.Scanner;

public class OddNumberTriangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(2*j-1 +" ");
            }
            System.out.println();
        }
    }
}
