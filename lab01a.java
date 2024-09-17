//vamos usar os metodos, gets-sets, objetos e visibilidade
//def a classe da primeira questao
import java.util.Scanner;

public class lab01a {

    //usando metodo
    public static float calculaarea(float R, float r) {

        float pi = 3.14159F;
        float A = pi * ((R * R) - (r * r));
        return A;
    }

    public static void main(String[] agrv){
        Scanner entrada = new Scanner(System.in);
        float R = entrada.nextFloat();
        float r = entrada.nextFloat();
        //nao usamos a declaração de objeto pois estamos usando o static
        float area=calculaarea(R, r);
        System.out.println(area);
        }

    }

