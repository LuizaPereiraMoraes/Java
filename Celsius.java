package bosch;

import java.util.Scanner;

public class Celsius {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double temperatura, fahrenheit;
        System.out.println("Digite a temperatura em Celsius: ");
        temperatura=entrada.nextDouble();
        fahrenheit=(temperatura*1.8)+32;
        System.out.println("A teperatura em Fahrenheit é: " +fahrenheit);
        entrada.close();
    }

}
