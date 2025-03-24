package uninter;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {		
		// Criação do cofrinho
		Cofrinho cofrinho = new Cofrinho();
		
		Scanner sc = new Scanner(System.in);
		// Menu:
		System.out.println("[ Cofrinho - Menu ]");
		System.out.println("1. Adicionar moeda");
		System.out.println("2. Remover moeda");
		System.out.println("3. Listar todas as moedas");
		System.out.println("4. Calcular total (em R$)");
		System.out.println("0. Encerrar programa");
		int opcao = sc.nextInt();
		
		int tipoMoeda;
		double valor;
		Moeda moeda;
		
		while (opcao != 0) {
			switch (opcao) {
			case 1:
				// adicionar moeda
				tipoMoeda = 0;
				
				while (tipoMoeda <= 0 || tipoMoeda > 3) {
					System.out.println("1. Real");
					System.out.println("2. Dolar");
					System.out.println("3. Euro");
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
					System.out.println("1. Real");
					System.out.println("2. Dolar");
					System.out.println("3. Euro");
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
			
			System.out.println("[ Cofrinho - Menu ]");
			System.out.println("1. Adicionar moeda");
			System.out.println("2. Remover moeda");
			System.out.println("3. Listar todas as moedas");
			System.out.println("4. Calcular total (em R$)");
			System.out.println("0. Encerrar programa");
			opcao = sc.nextInt();
		}
		
		sc.close();
	}
}
