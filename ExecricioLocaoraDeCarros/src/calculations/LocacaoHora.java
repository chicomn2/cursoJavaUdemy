package calculations;

import java.time.Duration;
import java.time.LocalDateTime;

public class LocacaoHora extends Locacao {
	Double precoHora;
	Double valorLocacao;
	Double valorImposto;
	
	
	public LocacaoHora(LocalDateTime horaSaida, LocalDateTime horaDevolucao, Double precoHora) {
		super(horaSaida, horaDevolucao);
		this.precoHora = precoHora;
	}

	public Double getPrecoHora() {
		return precoHora;
	}

	public void setPrecoHora(Double precoHora) {
		this.precoHora = precoHora;
	}

	public Double valorLocacao() {
	return valorLocacao = Math.ceil((double) (Duration.between(horaSaida, horaDevolucao).toMinutes())/60)*precoHora;
		
	}
	
	

	public Double valorImposto() {
		if (valorLocacao > 100.00) {
			return valorImposto = valorLocacao * 0.15;
		} else {
			return valorImposto = valorLocacao * 0.2;
		}
	}

	@Override
	public String toString() {
		return "Recibo: \n" + "Valor Locação: " + valorLocacao()
				+ "\n" + "Impostos: " + valorImposto() + "\n" + "Valor total: "
				+ String.format("%.2f", valorLocacao() + valorImposto());
	}

}
