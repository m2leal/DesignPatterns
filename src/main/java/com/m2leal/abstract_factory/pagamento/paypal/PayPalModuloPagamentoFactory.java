package com.m2leal.abstract_factory.pagamento.paypal;

import com.m2leal.abstract_factory.gestor_de_risco.GestorDeRisco;
import com.m2leal.abstract_factory.gestor_de_risco.clearsale.ClearSale;
import com.m2leal.abstract_factory.operadora.Operadora;
import com.m2leal.abstract_factory.operadora.redecard.RedeCard;
import com.m2leal.abstract_factory.pagamento.ModuloPagamentoFactory;

public class PayPalModuloPagamentoFactory implements ModuloPagamentoFactory {

	@Override
	public Operadora criarOperadora() {
		return new RedeCard();
	}

	@Override
	public GestorDeRisco criarGestorDeRisco() {
		return new ClearSale();
	}
	
}
