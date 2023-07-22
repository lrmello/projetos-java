package com.kratos.banco.app;

import com.kratos.banco.modelo.*;
import com.kratos.banco.modelo.atm.CaixaEletronico;
import com.kratos.banco.modelo.excecao.SaldoInsuficienteException;
import com.kratos.banco.modelo.pagamento.Boleto;
import com.kratos.banco.modelo.pagamento.DocumentoPagavel;
import com.kratos.banco.modelo.pagamento.Holerite;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Principal {

    public static void main(String[] args) {
        Pessoa titular1 = new Pessoa();
        titular1.setNome("Leonardo Reis");
        titular1.setDocumento("151545185456");
        titular1.setRendimentosAnual(new BigDecimal("15000"));
        titular1.setTipo(TipoPessoa.JURIDICA);
        titular1.setDataUltimaAtualizacao(LocalDateTime.parse("2023-06-19T13:20:00"));

        System.out.println(titular1.getTipo());
        System.out.println(titular1.getDataUltimaAtualizacao());



        Pessoa titular2 = new Pessoa();
        titular2.setNome("Vadia");
        titular2.setDocumento("151545185456");


        CaixaEletronico caixaEletronico = new CaixaEletronico();

        ContaEspecial suaConta = new ContaEspecial(titular2,456,987,new BigDecimal("1000"));
        ContaInvestimento minhaConta = new ContaInvestimento(titular1,123,987);

           try {
               minhaConta.depositar(new BigDecimal("30000"));
               minhaConta.sacar(new BigDecimal("100"));
               minhaConta.creditarRendimentos(new BigDecimal("0.8"));
               minhaConta.debitarTarifaMensal();

               suaConta.depositar(new BigDecimal("30000"));
               suaConta.sacar(new BigDecimal("40200"));
               suaConta.debitarTarifaMensal();

               Boleto boletoEscola = new Boleto(titular1, new BigDecimal("200"));
           Holerite salarioFuncionario = new Holerite(titular1, new BigDecimal("200"), 220);

           caixaEletronico.pagar(minhaConta, boletoEscola);
           caixaEletronico.pagar(minhaConta, salarioFuncionario);

           caixaEletronico.estornarPagamento(boletoEscola, minhaConta);

           boletoEscola.imprimirRecibo();
           salarioFuncionario.imprimirRecibo();
       }catch (SaldoInsuficienteException e){
           System.out.println("Erro ao executar operação na conta: " + e.getMessage());
       }


        caixaEletronico.imprimirSaldo(minhaConta);
        System.out.println("");
        caixaEletronico.imprimirSaldo(suaConta);


    }
}
