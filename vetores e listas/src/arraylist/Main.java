package arraylist;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //definindo arrays

        //define a entrada
        Scanner entrada = new Scanner(System.in);
        String[] nomes = new String[9];

        //declaramos cada valor do vetor
        for(int a=0; a<nomes.length;a++){
            String name = entrada.nextLine();
            nomes[a]= name;
        }

        for(int b=0;b<nomes.length;b++){
            System.out.println(nomes[b]);

        }

        //array a=new array();

        nomes[8]="sobrescrita teste";

        System.out.println(nomes[8]);

        //testa metodos com vetores simples
        list.adicionarnomes();

        //escolha das listas de animes ou rpgs
        arrayvariaveis.listas();

    }
}