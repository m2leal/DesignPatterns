package com.m2leal.abstract_factory;

import java.math.BigDecimal;

import com.m2leal.abstract_factory.pagamento.ModuloPagamentoFactory;
import com.m2leal.abstract_factory.pagamento.Pagamento;
import com.m2leal.abstract_factory.pagamento.pagseguro.PagSeguroModuloPagamentoFactory;

public class PagamentoViaPagSeguroTest {
	
	public static void main(String[] args) {
		ModuloPagamentoFactory moduloPagamentoFactory = new PagSeguroModuloPagamentoFactory();
		Pagamento pagamento = new Pagamento(moduloPagamentoFactory);
		
		
		try {
			// Deve autorizar venda()
			Long codigoAutorizacao = pagamento.autorizar("2222.2222", new BigDecimal("200"));
			System.out.println("Codigo da autorização: " + codigoAutorizacao);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		try {
			//Deve negar: Cartão inválido
			pagamento.autorizar("5555.2222", new BigDecimal("2000"));
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		try {
			//Deve gerar alerta de risco
			pagamento.autorizar("7777.2222", new BigDecimal("5500"));
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
}
