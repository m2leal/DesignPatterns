package com.m2leal.abstract_factory.pagamento.pagseguro;

import com.m2leal.abstract_factory.gestor_de_risco.GestorDeRisco;
import com.m2leal.abstract_factory.gestor_de_risco.fcontrol.FControl;
import com.m2leal.abstract_factory.operadora.Operadora;
import com.m2leal.abstract_factory.operadora.cielo.Cielo;
import com.m2leal.abstract_factory.pagamento.ModuloPagamentoFactory;

public class PagSeguroModuloPagamentoFactory implements ModuloPagamentoFactory {

	@Override
	public Operadora criarOperadora() {
		return new Cielo();
	}

	@Override
	public GestorDeRisco criarGestorDeRisco() {
		return new FControl();
	}
	
}
