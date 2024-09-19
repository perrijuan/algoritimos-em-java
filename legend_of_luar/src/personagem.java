//classe do personagem
  public class personagem {
 String nome;
 int lv;
 double ataque;

 //metodo saida

    void mostrarvideo(){
        //pode usar o printf(%d e parametros)
        System.out.println(nome + lv + ataque);
    }
    //definir o metodo - > 
    void atacar_ou_defender(String inimigo) {
        System.out.printf("voce atacou um inimigo %s com ataque no valor de : %ld", inimigo, ataque);
    }

    }

