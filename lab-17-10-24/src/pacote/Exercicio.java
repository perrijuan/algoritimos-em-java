package pacote;

public class Exercicio {

        public static void metodo1() {
            try {
                System.out.println("\tinicio do metodo1");
                Exercicio.metodo2();
                System.out.println("\tfim do metodo1");
            } catch(IndexOutOfBoundsException e) {
                System.out.println("\tExceção \"índice fora do limite\" capturada");
            }
        }
}
