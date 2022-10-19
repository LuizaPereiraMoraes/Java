package bosch;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        // FizzBuzz
        Scanner entrada = new Scanner(System.in);
        int num;
        System.out.println("Digite um número: ");
        num = entrada.nextInt();

        if(num % 2 == 0 && num % 5 ==0){
            System.out.println("FizzBuzz");
        } else if (num % 2 == 0){
            System.out.println("Fizz");
        } else if (num % 5 == 0) {
            System.out.println("Buzz");
        }
    }
}
