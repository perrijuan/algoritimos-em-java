public class Contato {
        private String nome;
        private String tel;
        //Método construtor:
        public Contato(String nome, String tel){

//Note que o 'this' é necessário aqui!
            this.nome = nome;
            this.tel = tel;
        }
        @Override
        public boolean equals(Object obj){ //Criaremos nossa definição de "igualdade"
            if(obj == this) // comparação de referência!
                return false; //Isso mesmo, falso! Entende o motivo?
            if(!(obj instanceof Contato)) //"Se obj *NÃO* é da classe Contato, então...
                return false; //...obviamente.
            Contato c = (Contato)obj; //Converte o objeto genérico obj para o tipo Contato.
//A classe String tb herda de Object, daí tb tem seu próprio "equals()"!
            return this.nome.equals(c.getNome());
        }
        public String getNome(){
            return nome; //O mesmo que "return this.nome"
        }
        public void setNome(String nome){
            this.nome = nome;
        }

        //definindo a driver class
        public static void main(String[] args) {
            Agenda ag = new Agenda();
            Contato c1 = new Contato("João", "+55 21 99999-9999");
            Contato c2 = new Contato("João", "+55 21 92222-2222");
            Contato c3 = new Contato("Maria", "+55 21 98888-8888");
            Contato c4 = new Contato("José", "+55 21 97777-7777");
            Contato c5 = new Contato("", "+55 21 91111-1111");

            ag.adicionarContato(c1);
            ag.adicionarContato(c2);
            ag.adicionarContato(c3);
            ag.adicionarContato(c4);
            ag.adicionarContato(c5);
            ag.listarContatos();
            String d = (ag.ehDuplicado(c1)) ? "" : " NÃO ";
            System.out.println("\nO contato " + c1.getNome() + d + " é duplicado.");
        }
    }

