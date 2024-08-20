import java.util.*;
public class lab04 {
    public static void main(String[] agrv){
        float nota1, nota2;
        Scanner entrada = new Scanner(System.in);
        nota1 = entrada.nextFloat();
        nota2 = entrada.nextFloat();

        float media = (nota1+nota2)/2;
        if(media>7){
            System.out.println("aprovação");
        }else if (media>3 || media >6){
            System.out.println("prova final");
        }else{
            System.out.println("tu mamou nesse periodo");
        }
        System.out.println("sua media foi:" + media);
        entrada.close();

    }
}
