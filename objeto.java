import java.util.*;

//a classe cria um novo tipo

public class objeto {
    public static String decisao(Integer n, Integer z) {
        if (n == z) {
            //passagem por referencia
            return "usam o mesmo endereço de memoria";


        } else if (n.equals(z)) {
            return "eles tem o mesmo valor mais o endereço de memoria diferente";
        } else {
             return"valores diferentes";
        }

    }


    public static void main(String[] agrv) {
        Scanner ent = new Scanner(System.in);
        int a, b;
        a = ent.nextInt();
        b = ent.nextInt();
        System.out.println(decisao(a, b));

    }
}
