package Loops;

import java.util.Scanner;

public class Factors {
    static void main() {
        // 60 - 1,2,3,4,5,6,10,12,15,20,30,60
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            if(n%i == 0) System.out.println(i);
        }

    }
}
