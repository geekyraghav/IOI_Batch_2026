package Loops;

import java.util.Scanner;

public class CompositeNumber {
    static void main() {
        // 60 - 1,2,3,4,5,6,10,12,15,20,30,60
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        boolean flag = false; // false means n is prime
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i == 0) {
                flag = true;
                break;
            }
        }
        if(n==1) System.out.println("Neither prime nor composite");
        else if(flag==false) System.out.println("Prime");
        else System.out.println("Composite");
    }
}
