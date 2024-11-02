package pacote;


    


    public static void metodo2(){
        try {
            System.out.println("\t\tinicio do metodo2");
            Exercicio.metodo3();
            System.out.println("\t\tfim do metodo2");
        } catch(NullPointerException e) {

            System.out.println("\t\tExceção ponteiro nulo capturada");
        }
    }

