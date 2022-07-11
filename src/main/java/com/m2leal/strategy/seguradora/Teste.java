package com.m2leal.strategy.seguradora;

import java.util.Scanner;

import com.m2leal.strategy.seguradora.model.Cliente;
import com.m2leal.strategy.seguradora.model.Sexo;
import com.m2leal.strategy.seguradora.model.TipoVeiculo;
import com.m2leal.strategy.seguradora.service.PropostaSeguro;
import com.m2leal.strategy.seguradora.service.calculadora.CalculadoraPremioSeguro;

public class Teste {
	
	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)) {
			
			System.out.print("Digite o nome: ");
			String nome = scanner.nextLine();
			
			System.out.print("Digite a idade: ");
			int idade = scanner.nextInt();
			
			System.out.print("Sexo (1) Masculino, (2) Feminino: ");
			int opcaoSexo = scanner.nextInt();
			Sexo sexo = Sexo.values()[opcaoSexo - 1];
			
			Cliente cliente = new Cliente(nome, idade, sexo);
			int opcaoVeiculo = 0;
			
			do {
				System.out.print("Tipo de veículo (1) Carro, (2) Moto, (<>) Sair: ");
				opcaoVeiculo = scanner.nextInt();
				
				if(opcaoVeiculo == 1 || opcaoVeiculo == 2) {
					System.out.print("Valor do veículo: ");
					double valorVeiculo = scanner.nextDouble();
					CalculadoraPremioSeguro calculadora = TipoVeiculo.values()[opcaoVeiculo - 1].getCalculadoraPremioSeguro();
					
					PropostaSeguro proposta = new PropostaSeguro(cliente);
					proposta.setCalculadora(calculadora);
					
					System.out.println(proposta.gerar(valorVeiculo));
				}
			} while(opcaoVeiculo == 1 || opcaoVeiculo == 2);
			
			System.out.println("Saindo !!!");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
