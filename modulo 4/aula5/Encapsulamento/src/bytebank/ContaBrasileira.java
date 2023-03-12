package bytebank;

public class ContaBrasileira {
    private String numero;
    private String nome;
    private String cpf;

    private String apelido;
    private double saldo;

    /*Construtor*/

    public ContaBrasileira(String numero, String nome, String cpf, String apelido, double saldo) {
        this.numero = numero;
        this.nome = nome;
        this.cpf = cpf;
        this.apelido = apelido;
        this.saldo = saldo;
    }

    public ContaBrasileira(String numero, String nome, String cpf, double saldo) {
        this.numero = numero;
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo(){
        return saldo;
    }

    /*Depósito*/
    public void deposito(double valor){
        saldo += valor;
    }
}
