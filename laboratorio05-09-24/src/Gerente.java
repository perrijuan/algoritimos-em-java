//gerente herda da classe funcionario
public class Gerente extends Funcionario{
    //classe construtor vamos chamar os objetos da classe func
    public Gerente(String nome, int mat, double sal, Funcionario chefe){
        super(nome, mat, sal, chefe);
    }
    @Override
    public double bonus(Trimestre t){
        //usei o super no bonus para ter acesso com o obj da classe pai
        return (t == Trimestre._4o) ? salario * 0.15 : super.bonus(t);
    }
    public double bonus(){
        return salario * 0.2;
    }
}