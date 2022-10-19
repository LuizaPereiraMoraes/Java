package bosch;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double base, altura, area;
        System.out.println("Digite a base do seu triângulo: ");
        base=entrada.nextInt();
        System.out.println("Diqite a altura do seu triângulo: ");
        altura= entrada.nextInt();
        area=(base*altura)/2;
        System.out.println("A área do seu triângulo é: "+area);
        entrada.close();
    }
}
