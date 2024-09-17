import java.util.Scanner;

public class lab10 {
    public static void main(String[] argv) {
        Scanner entrada = new Scanner(System.in);

        //define condição de parada para o do-while
        String exit = "";


        do {
            //define o tipo da operação aritimetica
            System.out.println("digite sua operação");
            String ent = entrada.next();

            //declara os valores
            System.out.println("digite o valor 1");
            System.out.println("digite o valor 2");
            float valor = entrada.nextFloat();
            float valor1 = entrada.nextFloat();

            float saida = 0;
            //usar o equals
            if (ent.equals("+")) {
                saida = valor + valor1;
            } else if (ent.equals("-")) {
                saida = valor - valor1;
            } else if (ent.equals("*")) {
                saida = valor * valor1;
            } else if (ent.equals("/")) {
                saida = valor / valor1;
            }

            System.out.printf("sua operação foi %s: e seu valor foi %f", ent, saida);
        } while (exit != "s"||exit != "S");

    }
}
