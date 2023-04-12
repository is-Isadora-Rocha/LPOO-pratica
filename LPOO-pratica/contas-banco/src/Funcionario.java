public class Funcionario {
    private String nome;
    private double salario;

    public void nomeFuncionario (){
        System.out.println("O nome do funcionário é " + nome);
    }
    public void salarioFuncionario() {
        System.out.println("O salário do funcionário é "+ salario);
    }
    public void alterarNome(String novoNome){
        this.nome = novoNome;
        System.out.println("O nome alterado do funcionário é "+novoNome);
    }
    public void alterarSalario(double novoSalario){
        this.salario = novoSalario;
        System.out.println("O novo salário do funcionário "+getNome()+ " é de R$: " +novoSalario);
    }

    public Funcionario(){
        this.setSalario(200);
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
}
