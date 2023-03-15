package model;

public class ContaPoupanca extends Conta {

    private double saldoGuardado;

    private double codigoDeOperacao;

    public ContaPoupanca(String codigo, Cliente titular, String apelido, String senha, String saldo, double codigoDeOperacao) {
        super(codigo, titular, apelido, senha, saldo);
        this.codigoDeOperacao = codigoDeOperacao;
    }

    public void guardar(double quantia){
        if(saldo < quantia){
           return;
        }

        saldoGuardado += quantia;
    }
}
