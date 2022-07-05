package com.m2leal.abstract_factory.pagamento;

import com.m2leal.abstract_factory.gestor_de_risco.GestorDeRisco;
import com.m2leal.abstract_factory.operadora.Operadora;

public interface ModuloPagamentoFactory {
	
	public Operadora criarOperadora();
	public GestorDeRisco criarGestorDeRisco();
	
}
