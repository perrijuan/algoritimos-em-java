import java.util.Scanner;
public class lab01c {
    public static void media(Float p1, Float p2){

        float mediana=(p1+p2)/2;
        if(mediana>= 7){
            System.out.println("passou ");
        } else if (mediana>3||mediana<7) {
            System.out.println("ta de pf cria ");
        }else{
            System.out.println("faz o L");
        }
    }

    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        float a = entrada.nextFloat();
        float b = entrada.nextFloat();

        media(a,b);

    }
}
