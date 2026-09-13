package BasicsOfJava;
import java.util.Scanner;
public class AreaOfACircle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double area = 3.141592 * radius * radius;
        System.out.print("Area is: ");
        System.out.println(area);
    }
}
