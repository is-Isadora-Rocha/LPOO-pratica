public class ContaBanco {
    //atributos
    public int numero;
    private double limite;
    private double saldo;

    //métodos
    public void depositar(double valorD){
        this.setSaldo(this.getSaldo() + valorD);
        System.out.println("Você depositou R$: "+valorD+ " reais");

    }
    public void sacar(double valorS){
        if (this.getSaldo() >= valorS) {
            this.setSaldo(this.getSaldo() - valorS);
        } else {
            System.out.println("Valor insuficiente para saque!");
        }
        System.out.println("Você sacou R$ "+valorS+ " reais");
    }
    public void verSaldo(double saldo){
        System.out.println("Saldo atual: R$ "+this.getSaldo()+" reais");
    }

    //construtor
    public ContaBanco(){
    }
    //getters e setters
    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public double getLimite(){
        return limite;
    }
    public void setLimite(double limite){
        this.limite = limite;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

}
