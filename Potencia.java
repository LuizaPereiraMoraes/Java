package bosch;

import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double quadrado, cubo, num;
        System.out.println("Digite um número: ");
        num=entrada.nextDouble();
        quadrado= Math.pow(num,2);
        cubo= Math.pow(num,3);
        System.out.println("O quadrado de "+num+" é: "+quadrado);
        System.out.println("O cubo de "+num+" é: "+cubo);
        entrada.close();
    }
}
