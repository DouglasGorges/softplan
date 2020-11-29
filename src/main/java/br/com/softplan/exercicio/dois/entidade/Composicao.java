package br.com.softplan.exercicio.dois.entidade;

import java.util.ArrayList;
import java.util.List;

import br.com.softplan.exercicio.dois.util.types.UnidadeType;

public class Composicao extends Item {
	private Integer codigoComposicao;
	private String descricaoComposicao;
	private UnidadeType unidadeComposicao;
	private List<Item> listaItens = new ArrayList<>();
	private double valorComposicao;

	public Composicao(Integer codigoComposicao, String descricaoComposicao, UnidadeType unidadeComposicao) {
		this.codigoComposicao = codigoComposicao;
		this.descricaoComposicao = descricaoComposicao;
		this.unidadeComposicao = unidadeComposicao;
	}

	public Integer getCodigoComposicao() {
		return codigoComposicao;
	}

	public String getDescricaoComposicao() {
		return descricaoComposicao;
	}

	public UnidadeType getUnidadeComposicao() {
		return unidadeComposicao;
	}

	public List<Item> getListaItens() {
		return listaItens;
	}

	public double getValorComposicao() {
		return valorComposicao;
	}

	public void setValorComposicao(double valorComposicao) {
		this.valorComposicao = valorComposicao;
	}

}
