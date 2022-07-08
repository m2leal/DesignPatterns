package com.m2leal.dependency_injection;

import java.util.Calendar;
import java.util.Date;

import com.m2leal.dependency_injection.bean.CadastroFilmeService;
import com.m2leal.dependency_injection.model.Filme;
import com.m2leal.dependency_injection.util.cdi.WeldContext;

public class Teste {
	
	public static void main(String[] args) {
		CadastroFilmeService service = WeldContext.INSTANCE.getBean(CadastroFilmeService.class);
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, 1999);
		calendar.set(Calendar.MONTH, Calendar.MAY);
		calendar.set(Calendar.DAY_OF_MONTH, 21);
		Filme filme = new Filme("Matrix", calendar.getTime());
		service.salvar(filme);
		
		filme = new Filme("Thor - Love and Thunder", new Date());
		service.salvar(filme);
	}
	
}
