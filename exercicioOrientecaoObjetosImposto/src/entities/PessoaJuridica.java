package entities;

public class PessoaJuridica extends Pessoa {
	private Integer numeroFuncionarios;

	public PessoaJuridica(String nome, Double rendaAnual, Integer numeroFuncionarios) {
		super(nome, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public Integer getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(Integer numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}
@Override
	public Double impostoDevido() {
		Double total = 0.0;
		if (numeroFuncionarios > 10) {
			total += getRendaAnual() * 0.14;
		} else {
			total += getRendaAnual() * 0.16;
		}
		return total;
	}

}
