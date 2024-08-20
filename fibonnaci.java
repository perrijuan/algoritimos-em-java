
import java.util.Scanner;

public class fibonnaci {
    public static int fibo(int n){
        if(n <= 1) {
            return 1;
        }else{
                return fibo(n-1)+fibo(n-2);
            }
        }

        public static void main(String[] agrs){

        Scanner ent = new Scanner(System.in);

        int dados = ent.nextInt();

        System.out.println(fibonnaci.fibo(dados));
    }
}
