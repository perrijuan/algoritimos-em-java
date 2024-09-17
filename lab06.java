import java.util.Scanner;

//as classes são executadads com .java
public class lab06 {
    //atributos a caracteristica dessa classe
    String nome;
    String descricao;
    String autor;

    public static void main(String[] agrs) {
        //definimos os atributos como classes
        Scanner ent = new Scanner(System.in);
        //criamos o obejto paa usar o tipo esse novo tipo fica armazenado na heap
        lab06 livro = new lab06();

        //objetos
        livro.nome = "struct and programing system";
        livro.descricao = "um livro sobre programacao e algoritimos";
        livro.autor = "esqueci";
        //transferindo o objeto para uma variavel
        String aux = livro.descricao;

        System.out.println(livro.nome);
        System.out.println(livro.descricao);
        System.out.println(aux);
        //quando quisermos imprimir n intems podemos usar o printf como na linguagem c
        System.out.printf("o nome do livro e: %s e a sua descricao e: %s", livro.nome, livro.descricao);

    }


}


