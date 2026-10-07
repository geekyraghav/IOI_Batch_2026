package Loops;

public class ContinueStatement {
    static void main() {
        for(int i=1;i<=100;i++){

            System.out.print(i+" ");
            if(i % 3 == 0) continue;
        }
    }
}
