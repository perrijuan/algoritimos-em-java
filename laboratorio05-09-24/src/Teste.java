public class Teste {
    public static void main(String[] args) {
        Gerente jose = new Gerente("José", 2222, 10500.00, null);
        Funcionario eugenio = new Funcionario("Eugênio", 9999, 4500.00,
                jose);
        //definiu trimestre faz parte do metodo bonus
        Trimestre t = Trimestre._2o;
        System.out.println("\nBônus de " + jose.getNome() + " no " + t + "trimestre:");
        System.out.println(jose.bonus(t));
        System.out.println("\nBônus de " + eugenio.getNome() + " no " + t +
                " trimestre:");
        System.out.println(eugenio.bonus(t));
    }
}
