package app;

import java.util.Locale;
import java.util.Scanner;

import DomainExeception.DomainExeception;
import entites.Conta;

public class Programa {

	public static void main(String[] args) throws DomainExeception {
		
		try {
			Scanner sc = new Scanner(System.in);
			Locale.setDefault(Locale.US);
			
			System.out.println("Inserir dados conta");
			System.out.print("Numero: ");
			int numero = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Saldo inicial: ");
			double saldo = sc.nextDouble();
			System.out.print("Limite da sacar: ");
			double limite = sc.nextDouble();
			
			Conta conta = new Conta(numero, nome, saldo, limite);
			
			System.out.print("Inserir valor para sacar: ");
			double sacar = sc.nextDouble();
			conta.sacar(sacar);
			
			System.out.println("Novo saldo: " + String.format("%.2f", conta.getSaldo()));
			sc.close();
		}
		catch(DomainExeception e) {
			System.out.println("Erro na conta: " + e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Erro inesperado");
		}
			
		
	}

}
