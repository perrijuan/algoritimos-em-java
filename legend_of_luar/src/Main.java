public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        //criando objeto personagem

        personagem heroi = new personagem();

        heroi.nome = "zelda";
        heroi.lv = 1;
        heroi.ataque = 0.79;

        //temos que usar o objeto que foi criado
        heroi.mostrarvideo();

        //metodo de atacar e declara um valor
        heroi.atacar_ou_defender("java");

    }
}