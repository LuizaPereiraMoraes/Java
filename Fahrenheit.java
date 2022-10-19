package bosch;

import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double temperatura, celsius;
        System.out.println("Digite a temperatura em Fahrenheit: ");
        temperatura=entrada.nextDouble();
        celsius=(temperatura-32)/1.8;
        System.out.println("A teperatura em Celsius é: " +celsius);
        entrada.close();
    }
}
