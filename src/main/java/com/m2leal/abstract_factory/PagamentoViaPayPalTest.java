package com.m2leal.abstract_factory;

import java.math.BigDecimal;

import com.m2leal.abstract_factory.pagamento.ModuloPagamentoFactory;
import com.m2leal.abstract_factory.pagamento.Pagamento;
import com.m2leal.abstract_factory.pagamento.paypal.PayPalModuloPagamentoFactory;

public class PagamentoViaPayPalTest {
	
	public static void main(String[] args) {
		ModuloPagamentoFactory moduloPagamentoFactory = new PayPalModuloPagamentoFactory();
		Pagamento pagamento = new Pagamento(moduloPagamentoFactory);
		
		try {
			//Deve autorizar venda
			Long codigoAutorizacao = pagamento.autorizar("2222.2222", new BigDecimal("200"));
			System.out.println("Código da autorização: " + codigoAutorizacao);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		try {
			//Deve negar captura: Valor acima do limite para cartão
			pagamento.autorizar("2222.2222", new BigDecimal("2000"));
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		//Deve autorizar venda: Valor alto com cartão válido
		try {
			Long codigoAutorizacao = pagamento.autorizar("3333.2222", new BigDecimal("2000"));
			System.out.println("Código de autorização: " + codigoAutorizacao);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		//Deve gerar alerta de risco
		try {
			pagamento.autorizar("1111.2222", new BigDecimal("5500"));
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
}
