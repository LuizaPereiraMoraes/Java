package bosch;

public class Escola {
    public static void main(String[] args) {
        String situacao;
        double nota = 7.1;
        int presenca = 90;
        boolean postura = true;

        if (nota >= 5.0 && presenca >= 75 && postura==true){
            situacao = "Aprovado";
        }
        else if (nota < 5.0 && presenca >= 75 && postura==true){
            situacao = "Recuperação das provas";
        }
        else if(nota >= 5.0 && presenca <75 & postura==true){
            situacao= "Sem férias";
        }
        else if(nota >= 5.0 && presenca>= 75 && !postura){
            situacao = "Chamar para conversar";
        }
        else{
            situacao = "Reprovado";
        }
        System.out.println(situacao);

    }
}
