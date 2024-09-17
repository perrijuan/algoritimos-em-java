//lab 02
//sempre definir biblotecas padrao no java como em cpp
import java.util.Scanner;

public class lab02a {

    //metodo
    public static void notas(float a, float b){
            float media = (a + b) / 2;
            System.out.println(media);

    }

    public static void main(String[] argv){
       Scanner entrada = new Scanner(System.in);

        float ent1;
        float ent2;

       do {

           ent1=entrada.nextFloat();
           ent2=entrada.nextFloat();
           notas(ent1, ent2);

       }while(ent1!=-1&&ent2!=-1);
    }
}
