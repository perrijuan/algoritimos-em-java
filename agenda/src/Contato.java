public class Contato {
    private String nome;
    private String tel;

    //letra b

    //get
    public String getTel(){
        return tel;
    }

    //set
    public void  setTel(String contatonovo){
        this.tel=contatonovo;
    }

    //letra c

    //Método construtor:
    public Contato(String nome, String tel){
//Note que o 'this' é necessário aqui!
        this.tel = tel;
        if(nome.equals("")) {
            this.nome = "anao";
        }else{
            this.nome = nome;

            }
        }

    @Override
    public boolean equals(Object obj){ //Criaremos nossa definição de "igualdade"
         // comparação de referência!
             //Isso mesmo, falso! Entende o motivo?
        if(!(obj instanceof Contato)) //"Se obj *NÃO* é da classe Contato, então...
            return false; //...obviamente.
        Contato c = (Contato)obj;//Converte o objeto genérico obj para o tipo Contato.
//A classe String tb herda de Object, daí tb tem seu próprio "equals()"!
        return this.nome.equals(c.getNome())&& this.tel.equals((c.getTel()));

    }
    public String getNome(){
        return nome; //O mesmo que "return this.nome"
    }
    public void setNome(String nome){
        this.nome = nome;
    }
}
