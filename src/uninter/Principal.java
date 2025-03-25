package uninter;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {		
		// Criação do cofrinho
		Cofrinho cofrinho = new Cofrinho();
		
		Scanner sc = new Scanner(System.in);
		// Chama o menu do cofre:
		cofrinho.menu();
		int opcao = sc.nextInt();
		
		int tipoMoeda;
		double valor;
		Moeda moeda;
		
		/*
		 * Repete o menu enquanto a condição não for satisfeita
		 * 1-4 - opções do menu / 0 - encerra o programa
		 */
		while (opcao != 0) {
			switch (opcao) {
			case 1:
				// adicionar moeda
				tipoMoeda = 0;
				
				while (tipoMoeda <= 0 || tipoMoeda > 3) {
					// chama o menu da classe Moeda
					Moeda.menu();
					tipoMoeda = sc.nextInt();
				}
				
				moeda = null;
				if (tipoMoeda == 1) {
					System.out.print("Digite o valor: ");
					valor = sc.nextDouble();
					moeda = new Real(valor);
				} else if (tipoMoeda == 2) {
					System.out.print("Digite o valor: ");
					valor = sc.nextDouble();
					moeda = new Dolar(valor);
				} else {
					System.out.print("Digite o valor: ");
					valor = sc.nextDouble();
					moeda = new Euro(valor);
				}
				
				cofrinho.adicionar(moeda);
				break;
				
			case 2:
				// remover moeda
				tipoMoeda = 0;
				
				while (tipoMoeda <= 0 || tipoMoeda > 3) {
					Moeda.menu();
					tipoMoeda = sc.nextInt();
				}
				
				moeda = null;
				if (tipoMoeda == 1) {
					System.out.print("Digite o valor: ");
					valor = sc.nextDouble();
					moeda = new Real(valor);
				} else if (tipoMoeda == 2) {
					System.out.print("Digite o valor: ");
					valor = sc.nextDouble();
					moeda = new Dolar(valor);
				} else {
					System.out.print("Digite o valor: ");
					valor = sc.nextDouble();
					moeda = new Euro(valor);
				}
				
				cofrinho.remover(moeda);
				break;
				
			case 3:
				// listar moedas
				cofrinho.listarMoedas();
				System.out.println();
				break;
				
			case 4:
				// cálculo - total
				System.out.printf("Total: R$%.2f", cofrinho.totalConvertido());
				System.out.println();
				break;
				
			default:
				System.out.println("Opção inválida.");
			}
			
			cofrinho.menu();
			opcao = sc.nextInt();
		}
		
		sc.close();
	}
}
