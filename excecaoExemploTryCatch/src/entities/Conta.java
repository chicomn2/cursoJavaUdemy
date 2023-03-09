package entities;

import exceptions.BusinessException;

public class Conta {
	private Integer numero;
	private String nome;
	private Double saldo;
	private Double limite;
	public Conta(Integer numero, String nome, Double saldo, Double limite) {

		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
		this.limite = limite;
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
	public Double getLimite() {
		return limite;
	}
	public void setLimite(Double limite) {
		this.limite = limite;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void deposito(Double valor) {
		saldo+=valor;
	}
	
	public void saque(Double valor) {
		validarSaque(valor);
		saldo-=valor;
	}
	
	private void validarSaque(Double valor) {
		if(valor>getLimite()) {
			throw new BusinessException("O valor solicitado é maior que seu limite de saque");
		} if (valor > getSaldo()) {
			throw new BusinessException("O valor solicitado é maior que seu saldo");
				}
	}
	

}
