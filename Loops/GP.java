package Loops;

import java.util.Scanner;

public class GP {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        // 2,4,8,16,32...
        int a = 2, r = 2;
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            a *= r;
        }
    }
}
