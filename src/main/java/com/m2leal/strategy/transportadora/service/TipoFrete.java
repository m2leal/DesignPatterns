package com.m2leal.strategy.transportadora.service;

import com.m2leal.strategy.transportadora.service.frete.Normal;
import com.m2leal.strategy.transportadora.service.frete.Sedex;

public enum TipoFrete {
	
	NORMAL {
		@Override
		public Frete obterFrete() {
			return new Normal();
		}
	},
	SEDEX {
		@Override
		public Frete obterFrete() {
			return new Sedex();
		}
	};
	
	public abstract Frete obterFrete();
}
