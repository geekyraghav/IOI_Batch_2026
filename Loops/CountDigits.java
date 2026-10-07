package Loops;

import java.util.Scanner;

public class CountDigits {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        int count = 0;
        while(n != 0){
            n /= 10;
            count++;
        }
        System.out.println(count);
    }
}
