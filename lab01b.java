import java.util.Scanner;
public class lab01b {
    //metodo da classe lab01b

    public static void dados (String nome, int idade, float altura){

        System.out.println(nome + idade + altura);


    }

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String nome1 = entrada.next();
        int idade2 = entrada.nextInt();
        float altura3= entrada.nextFloat();
        //static nao tem obj
        dados(nome1,idade2,altura3);
    }
}
