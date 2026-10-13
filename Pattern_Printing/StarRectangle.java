package PatternPrinting;

import java.util.Scanner;

public class StarRectangle {
    static void main() {
//        for(int i=0;i<=4;i+=2){
//            for (int j=3;j<=9;j++){
//                System.out.println("Good Morning Ankit");
//            }
//        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows & cols: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
