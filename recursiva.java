import java.util.*;

//função recursiva a estrutura

public class recursiva {
    public static int factorial(int n) {
        if (n < 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }


    public static void main(String[] agrs) {


        //define a classe de entrada
        Scanner entrada = new Scanner(System.in);

        int valor = entrada.nextInt();

        recursiva.factorial(valor);

        System.out.println(recursiva.factorial(valor));

        entrada.close();


    }
}





