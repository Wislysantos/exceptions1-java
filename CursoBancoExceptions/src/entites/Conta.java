package entites;

import DomainExeception.DomainExeception;

public class Conta {
	
	private Integer numero;
	private String nome;
	private Double saldo;
	private Double retiradaLimite;
	
	public Conta() {
	}

	public Conta(Integer numero, String nome, Double saldo, Double retiradaLimite) {
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
		this.retiradaLimite = retiradaLimite;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSaldo() {
		return saldo;
	}	

	public Double getRetiradaLimite() {
		return retiradaLimite;
	}

	public void setRetiradaLimite(Double retiradaLimite) {
		this.retiradaLimite = retiradaLimite;
	}
	
	public void deposito(double resultado) {
		saldo += resultado;
	}
	
	public void sacar(double resultado) throws DomainExeception {
		if (saldo < resultado) {
			throw new DomainExeception("Saque maior do que saldo");// vai na assinatura do método e indica que este método poderá lançar uma 
			//exceção que deve ou ser relançada ou capturada pelo método que a está chamando.
			}
		if (retiradaLimite < resultado) {
			throw new DomainExeception("Saque é amior do que o limiti do saque");	
		}
		
	saldo -= resultado ;			
	}
		
	

}
