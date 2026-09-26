package Loops;

public class OddDivisibleBy3 {
    static void main() {
        // 100 Iterations
        for(int i=1;i<=100;i++){
            if(i%2 == 1 && i%3 == 0) System.out.print(i+" ");
        }

        // 50 Iterations
        for(int i=1;i<=100;i+=2){
            if(i%3 == 0) System.out.print(i+" ");
        }

        // 33 Iterations
        for(int i=3;i<=100;i+=3){
            if(i%2 == 1) System.out.print(i+" ");
        }

        // 17 Iterations
        for(int i=3;i<=99;i+=6){
            System.out.print(i+" ");
        }
    }
}
