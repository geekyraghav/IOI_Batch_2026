package PatternPrinting;

import java.util.Scanner;

public class BinaryTriangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                if((i+j)%2 == 0) System.out.print(1 +" ");
//                else System.out.print(0 +" ");
//            }
//            System.out.println();
//        }
        for(int i=1;i<=n;i++){
            int k = (i%2 == 0) ? 0 : 1;
            for(int j=1;j<=i;j++){
                System.out.print(k +" ");
                k = 1 - k; // flip
            }
            System.out.println();
        }
    }
}
