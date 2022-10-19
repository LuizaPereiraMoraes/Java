package bosch;

public class Tabuada_1 {
    public static void main(String[] args) {
        int num = 0, contador = 0;
        while (contador < 10){
            contador ++;
            while (num <= 10){
                System.out.println(contador+" X "+num+ " = "+ contador*num);
                num ++;
            }
            num = 0;
        }
    }
}
