import java.util.*;


public class lab02 {
    public static void main(String [] argv){
       float R,r;
       Scanner ent = new Scanner(System.in);
       float pi = 3.14159f;
       R = ent.nextFloat();
       r = ent.nextFloat();
       double A =pi*(Math.pow(R,2)-Math.pow(r,2));

       System.out.println(A);
    }
}
