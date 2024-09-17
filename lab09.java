import java.util.Scanner;

public class lab09 {
    public static void main(String[] agrv){

        Scanner ent = new Scanner(System.in);

        //definimos nosssa entrada
        float raio = ent.nextFloat();
        //podemos usar o valor de pi com math.PI

        double volume = (4/3)*Math.PI*Math.pow(raio,3);

        System.out.println(volume);


    }
}
