package Loops;

import java.util.Scanner;

public class SumOfDigits {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        int product = 1;
        while(n != 0){
            if(n%10 != 0) product *= n%10;
            n /= 10;
        }
        System.out.println(product);
    }
}
