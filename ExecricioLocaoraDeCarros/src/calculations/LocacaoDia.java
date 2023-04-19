package calculations;

import java.time.Duration;
import java.time.LocalDateTime;

public class LocacaoDia extends Locacao {
	Double precoDia;
	Double valorLocacao;
	Double valorImposto;
	
	
	public LocacaoDia(LocalDateTime horaSaida, LocalDateTime horaDevolucao, Double precoDia) {
		super(horaSaida, horaDevolucao);
		this.precoDia = precoDia;
	}

	public Double getPrecoDia() {
		return precoDia;
	}

	public void setPrecoDia(Double precoDia) {
		this.precoDia = precoDia;
	}

	public Double valorLocacao() {
		return valorLocacao = Math.ceil(((double)Duration.between(horaSaida, horaDevolucao).toMinutes())/1440)*precoDia;
	}
	
	

	public Double valorImposto() {
			return valorImposto = valorLocacao * 0.15;
		
	}

	@Override
	public String toString() {
		return "Recibo: \n" + "Valor Locação: " + valorLocacao()
				+ "\n" + "Impostos: " + valorImposto() + "\n" + "Valor total: "
				+ String.format("%.2f", valorLocacao() + valorImposto());
	}

}