package com.gft.main;

import java.util.Scanner;

import com.gft.veiculo.model.Veiculo;

public class Main {

	public static void main(String[] args) {
		
		Veiculo carro = new Veiculo();
		
		Scanner sc = new Scanner(System.in);
		
		int opcao;
		int qtdeLitros;
		String cor;
		
		do {
		System.out.println("\nMENU");
		System.out.println("Escolha uma opção para dirigir o carro");
		System.out.println("1 - Ligar");
		System.out.println("2 - Desligar");
		System.out.println("3 - Acelerar");
		System.out.println("4 - Abastecer");
		System.out.println("5 - Frear");
		System.out.println("6 - Pintar");
		System.out.println("7 - Sair");
		
		System.out.println("\nEscolha uma opção: ");
		opcao = sc.nextInt();
		
		switch (opcao) {
		
		case 1:
			carro.Ligar();
			break;
			
		case 2:
			carro.Desligar();
			break;
			
		case 3:
			carro.Acelerar();
			break;
			
		case 4: {
			System.out.println("Quantos litros você deseja abastecer? ");
			qtdeLitros = sc.nextInt();
			carro.Abastecer(qtdeLitros);
			break;
		}
		
		case 5:
			carro.Frear();
			break;
			
		case 6: {
			System.out.println("Qual a cor do seu carro? ");
			cor = sc.next();
			carro.Pintar(cor);
			break;
		}
		
		case 7:
			break;
			
		default: 
			System.out.println("Você digitou uma opção inválida");
		}
		
		} while (opcao != 7);
		
	}

}
