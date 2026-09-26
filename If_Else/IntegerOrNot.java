package If_Else;
import java.util.Scanner;
public class IntegerOrNot {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        if(n == (int)n) System.out.println("Integer");
        else System.out.println("Not an Integer");
    }
}
