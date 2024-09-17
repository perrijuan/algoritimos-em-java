import java.util.Scanner;

public class lab01d {
     //metodo com static
     public static int factorial(int n) {
          int factorial_sum = 1;
          if (n < 1) {
               return 1;
          } else {
               for (int a = 1; a < n; a++) {
                    factorial_sum *= a;
               }
               return factorial_sum;

          }
     }
          public static void main (String[]args){

          Scanner ent = new Scanner(System.in);

          int valor = ent.nextInt();

          System.out.println(factorial(valor));

          }

}
