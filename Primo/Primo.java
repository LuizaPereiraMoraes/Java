package bosch.Primo;

import java.util.ArrayList;

public class Primo {
    ArrayList<Integer> numeros = new ArrayList<>();
    ArrayList<Integer> numerosPrimos = new ArrayList<>();
    ArrayList<Integer> numerosNaoPrimos = new ArrayList<>();
    int numero;

    boolean verificarPrimos(int numero) {
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                numeros.add(i);
            }
            }
            if (numeros.size() == 2) {
                return true;
            } else {
                return false;
            }
    }

    void listarPrimos(){
        for (int i = 1; i <= this.numero ; i++) {
            numeros.clear();
            if(verificarPrimos(i)){
                numerosPrimos.add(i);
            }
            else {
                numerosNaoPrimos.add(i);
            }

        }
    }
}
