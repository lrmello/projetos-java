package model;

public class Conta {

    private String codigo;
    private Cliente titular;
    private String senha;
    private String saldo;

    private boolean ativa;

    public Conta(String codigo, Cliente titular, String apelido, String senha, String saldo) {
        this.codigo = codigo;
        this.senha = senha;
        this.saldo = saldo;
    }

    public Conta(String codigo, Cliente titular, String senha, String saldo) {
        this.codigo = codigo;
        this.titular = titular;
        this.senha = senha;
        this.saldo = saldo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    public boolean isAtiva(){
        return ativa;
    }

    /*metodos*/
    @Override
    public String toString() {
        return "Conta{" +
                "codigo='" + codigo + '\'' +
                ", senha='" + senha + '\'' +
                ", saldo='" + saldo + '\'' +
                '}';
    }

    public boolean depositar(double quantia){
        if (!ativa) {
            System.err.println("Erro para depositar: conta inativa");
            return false;
        }
       this.saldo += quantia;
            return true;
    }
}
