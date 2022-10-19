package bosch;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double peso, altura, imc;
        System.out.println("Digite o seu peso: ");
        peso=entrada.nextDouble();
        System.out.println("Digite a sua altura: ");
        altura=entrada.nextDouble();
        imc=peso/(altura*altura);
        System.out.println("O seu IMC é: " +imc);
        entrada.close();
    }
}
