package com.m2leal.abstract_factory.pagamento;

import java.math.BigDecimal;

import com.m2leal.abstract_factory.gestor_de_risco.AlertaDeRiscoException;
import com.m2leal.abstract_factory.gestor_de_risco.GestorDeRisco;
import com.m2leal.abstract_factory.operadora.CapturaNaoAutorizadaException;
import com.m2leal.abstract_factory.operadora.Operadora;

public class Pagamento {
	
	private Operadora operadora;
	private GestorDeRisco gestorDeRisco;
	
	public Pagamento(ModuloPagamentoFactory moduloPagamentoFactory) {
		this.operadora = moduloPagamentoFactory.criarOperadora();
		this.gestorDeRisco = moduloPagamentoFactory.criarGestorDeRisco();
	}
	
	public Long autorizar(String cartao, BigDecimal valor) throws CapturaNaoAutorizadaException, AlertaDeRiscoException {
		this.operadora.capturar(cartao, valor);
		this.gestorDeRisco.avaliarRisco(cartao, valor);
		return this.operadora.confirmar();
	}
}
