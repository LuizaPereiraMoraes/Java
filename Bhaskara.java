package bosch;

import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b, c;
        double delta, x1, x2;
        System.out.println("Digite o valor de 'A' da sua equação: ");
        a= entrada.nextInt();
        System.out.println("Digite o valor de 'B' da sua equação: ");
        b= entrada.nextInt();
        System.out.println("Digite o valor de 'C' da sua equação: ");
        c= entrada.nextInt();
        delta=(b*b)-4*a*c;
        System.out.println("O valor de delta é: "+delta);

        if (delta >=0) {
            System.out.println("Existem duas raízes reais");
            x1 = (-(b)+Math.sqrt(delta))/2*a;
            x2 = (-(b)-Math.sqrt(delta))/2*a;
            System.out.println("O valor de x1 é: "+x1);
            System.out.println("O valor de x2 é: "+x2);
        }else {
            System.out.println("O delta não tem raíz!");
        }

        entrada.close();
    }
}
