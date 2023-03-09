package entities;

public class PessoaFisica extends Pessoa {
	private Double gastosSaude;

	public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}
	@Override
	public Double impostoDevido () {
		Double total = 0.0;
		if(getRendaAnual()>=20000) {
			total+=getRendaAnual()*0.25;
			total-=gastosSaude*0.5;
		} else {
			total+=getRendaAnual()*0.15;
			total-=gastosSaude*0.5;
		}
		return total;
		
	}
}
