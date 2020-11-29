package br.com.softplan.exercicio.dois.entidade;

import br.com.softplan.exercicio.dois.util.types.ItemType;
import br.com.softplan.exercicio.dois.util.types.UnidadeType;

public abstract class Item {
	ItemType tipoItem;
	Integer codigoItem;
	String descricaoItemComposicao;
	UnidadeType unidadeItem;
	double quantidadeComposicao;
	double valorUnitario;

	public ItemType getTipoItem() {
		return tipoItem;
	}

	public void setTipoItem(ItemType tipoItem) {
		this.tipoItem = tipoItem;
	}

	public Integer getCodigoItem() {
		return codigoItem;
	}

	public void setCodigoItem(Integer codigoItem) {
		this.codigoItem = codigoItem;
	}

	public String getDescricaoItemComposicao() {
		return descricaoItemComposicao;
	}

	public void setDescricaoItemComposicao(String descricaoItemComposicao) {
		this.descricaoItemComposicao = descricaoItemComposicao;
	}

	public UnidadeType getUnidadeItem() {
		return unidadeItem;
	}

	public void setUnidadeItem(UnidadeType unidadeItem) {
		this.unidadeItem = unidadeItem;
	}

	public double getQuantidadeComposicao() {
		return quantidadeComposicao;
	}

	public void setQuantidadeComposicao(double quantidadeComposicao) {
		this.quantidadeComposicao = quantidadeComposicao;
	}
}
