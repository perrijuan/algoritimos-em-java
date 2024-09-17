//metodo equals
import java.util.*;

public class lab11 {

    //metodo foi definido na classe lab11
    static void compara(){
        //comapra usando a referencia
        int a = 64;
        int b = 43;
        int c = 64;

        //o printf não funciona dessa forma
        System.out.println(a==b);
        System.out.println(a==c);

    }
    //atribuindo um metodo parametros
     static void metodo_parametro(int valor) {

         int val = 3;

         if (valor != 0)
             System.out.println("valor:" + valor);
     }
     //meotodo publico
     public void meumetodopublic(String nome){
        //perrcorre a string
        for(int a=0; a<nome.length();a++){
            System.out.println(a);
        }

     }

     public void meumetodopublic2(float float32){
        System.out.println(Math.pow(float32,3));
     }


    //driver class
    public static void main(String[] agrv){

        //faz a chama do metodo
        Scanner entrada = new Scanner(System.in);
        int ent = entrada.nextInt();
        compara();

        metodo_parametro(ent);

        //criando um novo obejto para o meotodo publico
        lab11 meuobjeto = new lab11();
        String ent2 = entrada.next();
        meuobjeto.meumetodopublic(ent2);
        //acessa o metodo 3
        float ent3 = entrada.nextFloat();
        meuobjeto.meumetodopublic2(ent3);

    }

}
