import java.util.*;

public class lista1 {
    public static void main(String[] agrs){
      Scanner entrada = new Scanner(System.in);
       System.out.println("digite -1 para parar de fazer as medias ");
        String val = entrada.next();
      do {
          float notap1 = entrada.nextInt();
          float notap2 = entrada.nextInt();

          System.out.println((notap1+notap2)/2);
          val = entrada.next();
          //se atentar com a comparacao de variaveis nao de endereço
      } while(val.equals("-1"));


    }
}
