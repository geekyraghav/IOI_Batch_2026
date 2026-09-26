package If_Else;

import java.util.Scanner;

public class Coordinates {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x & y coordinates: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        if(x==0 && y==0) System.out.println("Origin");
        else if(x==0) System.out.println("Y Axis");
        else if(y==0) System.out.println("X Axis");
        else if(x>0 && y>0) System.out.println("I Quadrant");
        else if(x<0 && y>0) System.out.println("II Quadrant");
        else if(x<0 && y<0) System.out.println("III Quadrant");
        else System.out.println("IV Quadrant");
        sc.close();
    }
}
