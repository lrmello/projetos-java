package com.kratos.banco.modelo.atm;

import com.kratos.banco.modelo.Conta;
import com.kratos.banco.modelo.pagamento.DocumentoEstornavel;
import com.kratos.banco.modelo.pagamento.DocumentoPagavel;

public class CaixaEletronico {

    public void imprimirSaldo(Conta conta){
        System.out.println("Conta: " + conta.getAgencia() + "/" + conta.getNumero());
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Saldo disponível: " + conta.getSaldoDisponivel());
    }

    public void pagar(Conta conta, DocumentoPagavel documento){
        if (documento.estaPago()){
            throw new IllegalStateException("Documento já está pago");
        }

        conta.sacar(documento.getValorTotal());
        documento.quitarPagamento();
    }

    public void estornarPagamento(DocumentoEstornavel documento,Conta conta){
        if(!documento.estaPago()){
            throw new IllegalStateException("Documento não está pago");
        }
        conta.depositar(documento.getValorTotal());
        documento.estornarPagamento();
    }

}
