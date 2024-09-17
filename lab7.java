//metodos
import java.util.Scanner;
public class lab7 {
    //esta em modo default
    String nome;
    int perdas;
    float renda;
    double lucro;




    public static void main(String[] agrs){
        lab7 investimento = new lab7();

        Scanner ent = new Scanner(System.in);

        String dados = ent.next();

        investimento.nome = dados;


        System.out.printf("os dados de sua conta tem como o nome : %s e sua perdas %d sua renda e %f e seu lucro e %lf", investimento.entrada, investimento.dados1, investimento.dados2, investimento.dados3);

    }
}
