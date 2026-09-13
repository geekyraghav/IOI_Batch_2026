package BasicsOfJava;
import java.util.Scanner;
public class Input {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int x = sc.nextInt();
        System.out.println(x*x);
    }
}
