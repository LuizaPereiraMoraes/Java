package bosch;

import java.util.Scanner;

public class Par_Impar {
    public static void main(String[] args) {
        //Identificar números impares e pares
        Scanner entrada = new Scanner(System.in);
        int num;
        System.out.println("Digite um número: ");
        num = entrada.nextInt();

        if ((num % 2) == 0) {
            System.out.println("O seu número é par");
        } else {
            System.out.println("O seu número é ímpar");
        }
    }
}
