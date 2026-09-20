package BasicsOfJava;

import java.util.Scanner;

public class CharDataType {
    static void main() {
        Scanner sc = new Scanner(System.in);
        // ! @ # $ % ^ & * ( ) - _ = + { } [ ] | \ : ; " ' < , . > ? / ~ `
        // char x = '\0'; // null character
        char ch = 'z';
        int ascii = (int)ch; // explicit typecasting
        System.out.println(ascii);

        char vansh = 'V';
        int k = vansh; // implicit typecasting
        System.out.println(k);

        int praveen = 121;
        // System.out.println(char(praveen)); // mistake
        System.out.println((char)praveen);

        char c = sc.next().charAt(0);
    }
}
