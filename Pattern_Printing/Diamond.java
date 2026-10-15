package PatternPrinting;

import java.util.Scanner;

public class Diamond {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
//        // Upper Pyramid
//        int nsp = n-1, nst = 1;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=nsp;j++){ // spaces
//                System.out.print("  ");
//            }
//            for(int j=1;j<=nst;j++){ // stars
//                System.out.print("* ");
//            }
//            nsp--;
//            nst += 2;
//            System.out.println();
//        }
//        // Lower Pyramid
//        nsp = 1;
//        nst = 2*n-3;
//        for(int i=1;i<=n-1;i++){
//            for(int j=1;j<=nsp;j++){ // spaces
//                System.out.print("  ");
//            }
//            for(int j=1;j<=nst;j++){ // stars
//                System.out.print("* ");
//            }
//            nsp++;
//            nst -= 2;
//            System.out.println();
//        }

        // Diamond
        int nsp = n-1, nst = 1;
        for(int i=1;i<=2*n-1;i++){ // lines
            for(int j=1;j<=nsp;j++){ // spaces
                System.out.print("  ");
            }
            for(int j=1;j<=nst;j++){ // stars
                System.out.print("* ");
            }
            if(i < n){
                nsp--;
                nst += 2;
            }
            else{
                nsp++;
                nst -= 2;
            }
            System.out.println();
        }
    }
}
