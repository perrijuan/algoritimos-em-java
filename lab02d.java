
import java.util.Scanner;
public class lab02d {
    private static void caluladora(String entrada, float b, float c) {


        //atribui a variavel auxiliar o switch case
        float auxiliar = switch (entrada) {
            case "+" -> b + c;
            case "-" -> b - c;
            case "*" -> b * c;
            case "/" -> b / c;
            default -> 0;
        };
        System.out.println(auxiliar);

    }

    public static void main(String[] agrv) {
        System.out.println("Digite qual operação aritimetica");
        Scanner entrada = new Scanner(System.in);
        String ent1;
        float dados1;
        float dados2;
        do {
             ent1 = entrada.next();
             dados1 = entrada.nextFloat();
             dados2 = entrada.nextFloat();
            System.out.println("Digite qual operação aritimetica");
            caluladora(ent1, dados1, dados2);
            //consertar a parada do while
        }while(ent1 != "s"&&ent1 !="S") ;


    }
}