package bosch.Primo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Primo primo = new Primo();
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número: ");
        primo.numero = entrada.nextInt();

        if (primo.verificarPrimos(primo.numero)){
            System.out.printf("O número %d é primo", primo.numero);
        }
        else {
            System.out.printf("O número %d não é primo", primo.numero);

        }

        primo.listarPrimos();
        System.out.printf("\nNumeros primos até %d = %S", primo.numero, primo.numerosPrimos);
        System.out.printf("\nNumeros não primos até %d = %S", primo.numero, primo.numerosNaoPrimos);



    }
}
