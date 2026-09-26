package Loops;

public class ForLoop {
    static void main() {
        for(int i=4;i<=13;i+=2){
            System.out.println("Rachit is a baddie");
        }

        // 100 Iterations
        for(int i=1;i<=100;i++){
            if(i%2 == 1) System.out.print(i+" ");
        }

        // 50 Iterations
        for(int i=1;i<=100;i+=2){
            System.out.print(i+" ");
        }

        // 50 Iterations
        for(int i=1;i<=50;i++){
            System.out.print(2*i-1+" ");
        }
    }
}
