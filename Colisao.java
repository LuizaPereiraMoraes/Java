package bosch;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Colisao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double Sa, Sb, Va, Vb, finalA, finalB, tempo;
        while (true) {
            while (true) {
                System.out.println("Digite a posição do trem A: ");
                try {
                    Sa = input.nextDouble();
                    if (Sa < 0 || Sa > 10000) {
                        System.out.println("O número deve ser maior ou igual a zero e menor que 10000!");
                        continue;
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Você digitou um caractere inválido. Por favor, digite novamente: ");
                }
            }
            while (true) {
                System.out.println("Digite a posição do trem B: ");
                try {
                    Sb = input.nextDouble();
                    if (Sb < 0 || Sb > 10000) {
                        System.out.println("O número deve ser maior ou igual a zero e menor que 10000!");
                        continue;
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Você digitou um caractere inválido. Por favor, digite novamente: ");
                }
            }
            while (true) {
                System.out.println("Digite a velocidade em km/h do trem A: ");
                try {
                    Va = input.nextDouble();
                    if (Va < 0 || Va > 300) {
                        System.out.println("A velocidade do trem A sempre será positiva e menor que 300 km/h.\n" + "Por favor, digite novamente:");
                        continue;
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Você digitou um caractere inválido. Por favor, digite novamente: ");
                }
            }
            while (true) {
                System.out.println("Digite a velocidade em Km/h do trem B: ");
                try {
                    Vb = input.nextInt();
                    if (Vb > 0 || Vb > 300) {
                        System.out.println("A velocidade do trem B sempre será negativa e menor que 300 km/h.\n" + "Por favor, digite novamente:");
                        continue;
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Você digitou um caractere inválido. Por favor, digite novamente: ");
                }
            }
            input.nextLine();

            tempo = ((Sa - Sb) / (Vb - Va));
            finalA = (Sa + (Va * tempo));
            finalB = (Sb + (Vb * tempo));

            if (finalA == finalB) {
                System.out.printf("A colisão dos trens contecerá no KM %.0f e ocorrerá após %.0f segundos", finalA, (tempo * 3600));
            } else {
                System.out.println("Os trens não irão colidir");
            }
            System.out.println("\nFIM DO PROGRAMA");
            String resposta;
        while (true) {
            System.out.println("\nDeseja executar novamente?[S]/[N]");
            resposta = input.next().toUpperCase();
                if (!((resposta.equals("S")) || (resposta.equals("N")))){
                    System.out.println("Opção inválida!");
                    continue;
                } break;
            }
            if (resposta.equals("N")){
                break;
            }
        }
    }
}