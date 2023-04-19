package calculations;

import java.time.LocalDateTime;

public class Locacao {
LocalDateTime horaSaida, horaDevolucao;

public Locacao(LocalDateTime horaSaida, LocalDateTime horaDevolucao) {
	this.horaSaida = horaSaida;
	this.horaDevolucao = horaDevolucao;
}

public LocalDateTime getHoraSaida() {
	return horaSaida;
}

public void setHoraSaida(LocalDateTime horaSaida) {
	this.horaSaida = horaSaida;
}

public LocalDateTime getHoraDevolucao() {
	return horaDevolucao;
}

public void setHoraDevolucao(LocalDateTime horaDevolucao) {
	this.horaDevolucao = horaDevolucao;
}
}
