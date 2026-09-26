package If_Else;
import java.util.Scanner;
public class MarksOutOf100 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        if(marks > 90) System.out.println("A");
        else if(marks > 75) System.out.println("B");
        else if(marks > 50) System.out.println("C");
        else if(marks >= 33) System.out.println("D");
        else System.out.println("FAIL");
    }
}
