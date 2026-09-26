package Loops;
import java.util.Scanner;
public class AP {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

//        // 2,5,8,11...
//        for(int i=2;i<=3*n-1;i+=3){
//            System.out.print(i+" ");
//        }

        // 3,7,11,15
        int a = 3, d = 4;
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            a += d;
        }
    }
}
