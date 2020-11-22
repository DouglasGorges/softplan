package br.com.softplan.exercicio.um.entidade;

public class NotaFiscal {
	int numeroNota;
	double valorNota;
	
	public NotaFiscal() {
	}

	public NotaFiscal(int numeroNota, double valorNota) {
		this.numeroNota = numeroNota;
		this.valorNota = valorNota;
	}

	public int getNumeroNota() {
		return numeroNota;
	}

	public void setNumeroNota(int numeroNota) {
		this.numeroNota = numeroNota;
	}

	public double getValorNota() {
		return valorNota;
	}

	public void setValorNota(double valorNota) {
		this.valorNota = valorNota;
	}
	
}
