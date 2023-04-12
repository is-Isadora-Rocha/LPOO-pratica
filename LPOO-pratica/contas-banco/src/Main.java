public class Main {
    public static void main(String[] args) {
        ContaBanco conta = new ContaBanco();
        conta.verSaldo(conta.getSaldo());
        conta.setNumero(1234);
        conta.setSaldo(2.500);
        conta.setLimite(100);

        conta.depositar(1000);
        conta.sacar(300);
        conta.verSaldo(conta.getSaldo());

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Roberto");
        funcionario.setSalario(300);
        funcionario.nomeFuncionario();
        funcionario.salarioFuncionario();

        funcionario.alterarNome("Rogério");
        funcionario.alterarSalario(500);
        funcionario.getNome();
        funcionario.getSalario();
    }
}