package PatternPrinting;

import java.util.Scanner;

public class OneFourthSpiral {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(Math.min(i,j) +" ");
            }
            System.out.println();
        }
    }
}
