import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        for(int i=2; i<=100; i++){

            boolean prime = true;

            for(int n=2; n<i; n++){

                if(i%n == 0){

                    prime = false;
                }
                }
            if (prime){
                System.out.print(i+" ");
            }
        }


    }
}