import java.util.Random;
import java.util.Scanner;
//vamos usar a partir da classe random do proprio java
public class lab02e {
    public static void adivinha(int a, int aleatorio){
        //criamos um obj para usar a classe random como a classe scanner


        if(a>aleatorio) {
            System.out.println("digite um valor main baixo");

        }else if(a<aleatorio){
                System.out.println("digite um valor mais alto");

            }else{
            System.out.println("acertou meu faixa :)))");

        }

    }
    public static void main(String[] argv){
        Scanner ent = new Scanner(System.in);
        int valor = ent.nextInt();

        //classe rand com os valores definidos ate 100

        Random aleaotorio_obijeto = new Random();
        int aleatorio = aleaotorio_obijeto.nextInt(100);


        do{
            //digita a entrada e faz ate o valor ser o mesmo do aleatorio
            valor = ent.nextInt();
            adivinha(valor, aleatorio);

        }while(valor!=aleatorio);
    }
}
