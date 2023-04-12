public class Apartament {
    private int codigo;
    private String logadouro;
    private  String numero;
    private String complemento;
    private int CEP;
    private int qtdQuartos;
    private float valor;
    private int andar;
    public Apartament(){
        this.setCodigo(123);
        this.setLogadouro("Rua São José");
        this.setNumero("456");
        this.setComplemento("próximo a casa amerela");
        this.setCEP(61602900);
        this.setQtdQuartos(4);
        this.setValor(800);
        this.setAndar(3);
    }

    public void definirEndereco (String numero, String complemento, int CEP){}
    public String consultarLogradouro(){
        return logadouro;
    }
    public String consultarNumero(){
        return numero;
    }
    public String consultarComplemento(){
        return complemento;
    }
    public int consultarCEP(){
        return CEP;
    }
    public void definirQtdQuartos(int quantidade){}
    public int consultarQtdQuartos(){
        return qtdQuartos;
    }
    public void definirValor(float valor){}
    public float consultarValor(){
        return valor;
    }
    public void definirAndar (int numeroAndar){}
    public int consultarAndar(){
        return andar;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getLogadouro() {
        return logadouro;
    }

    public void setLogadouro(String logadouro) {
        this.logadouro = logadouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getCEP() {
        return CEP;
    }

    public void setCEP(int CEP) {
        this.CEP = CEP;
    }

    public int getQtdQuartos() {
        return qtdQuartos;
    }

    public void setQtdQuartos(int qtdQuartos) {
        this.qtdQuartos = qtdQuartos;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}
