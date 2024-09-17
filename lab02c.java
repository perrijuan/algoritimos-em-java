import java.util.Scanner;

public class lab02c {
    //trabalhando com o uso de privilegios em poo
    private static void volume(float raio){
        //define o valor de pi e temos que por o F no final
        float pi = 3.14159F;
        //pegadinhas ronalds pois o java divide como inteiro logo temos que usar a notaçao em float logo 4.0 e 3.0
       double volume_calculo = (4.0/3.0)* pi*Math.pow(raio,3);
       System.out.println(volume_calculo);
    }
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        float r = entrada.nextFloat();
        volume(r);
    }
}
