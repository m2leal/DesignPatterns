package com.m2leal.dependency_injection.bean.impl;

import javax.inject.Inject;

import com.m2leal.dependency_injection.bean.CadastroFilmeService;
import com.m2leal.dependency_injection.model.Filme;
import com.m2leal.dependency_injection.repository.Filmes;

public class CadastroFilmeServiceImpl implements CadastroFilmeService {
	
	@Inject
	private Filmes filmes;
	
	@Override
	public void salvar(Filme filme) {
		filmes.salvar(filme);
	}

}
