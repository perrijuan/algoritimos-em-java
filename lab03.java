import java.util.*;

public class lab03 {
  public static void main(String[] agrv){
      //programa que solicita os dados de um usuario

      int idade;
      double altura;
      String nome;

      Scanner ent = new Scanner(System.in);

      nome = ent.next();
      altura = ent.nextDouble();
      idade = ent.nextInt();

      System.out.println("sua idade :" + idade + "sua altura" + altura + "seu nome" + nome);


      ent.close();

  }
}
