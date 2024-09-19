import java.util.*;

public class type_non_primitive {

    public static void main(String [] agrv){
        //strings, vetores, vectores, matriz sao nao primitivos
        String valor ="a noite esta tao bonita quanto seus olhos";
        //uso do metodo
        metodos(valor);

        Scanner entrada = new Scanner(System.in);



    }

    //define o metodo para exibir a frase em maisculo
    public static void metodos(String name){
        String maiusulo=name.toUpperCase();
        System.out.printf("frase em up-case : %s", maiusulo);

    }

    public void interpolacao(String saida){
        //ver como podemos usar classes de entrada em metodos 
        metodos(saida);
        String cat = entrada.next();
        System.out.printf("sua saida foi concatenada com a palavra: %s" + cat);
    }
}

