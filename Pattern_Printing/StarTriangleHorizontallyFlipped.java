package PatternPrinting;

import java.util.Scanner;

public class StarTriangleHorizontallyFlipped {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){ // rows
            for(int j=1;j<=n+1-i;j++){ // cols
                System.out.print(j+" ");
            }
            System.out.println();
        }

//        for(int i=1;i<=n;i++){ // rows
//            for(int j=n;j>=i;j--){ // cols
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
    }
}
