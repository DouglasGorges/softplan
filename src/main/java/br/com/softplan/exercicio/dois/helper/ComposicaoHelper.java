package br.com.softplan.exercicio.dois.helper;

import br.com.softplan.exercicio.dois.util.types.ItemType;
import br.com.softplan.exercicio.dois.util.types.UnidadeType;

public class ComposicaoHelper {
	Integer codigoComposicao;
	String descricaoComposicao;
	UnidadeType unidadeComposicao;
	ItemType tipoItem;
	Integer codigoItem;
	String descricaoItemComposicao;
	UnidadeType unidadeItem;
	double quantidadeComposicao;
	double valorUnitario;

	public Integer getCodigoComposicao() {
		return codigoComposicao;
	}

	public void setCodigoComposicao(Integer codigoComposicao) {
		this.codigoComposicao = codigoComposicao;
	}

	public String getDescricaoComposicao() {
		return descricaoComposicao;
	}

	public void setDescricaoComposicao(String descricaoComposicao) {
		this.descricaoComposicao = descricaoComposicao;
	}

	public UnidadeType getUnidadeComposicao() {
		return unidadeComposicao;
	}

	public void setUnidadeComposicao(UnidadeType unidadeComposicao) {
		this.unidadeComposicao = unidadeComposicao;
	}

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

	public void setQuantidadeComposicao(String quantidadeComposicao) {
		this.quantidadeComposicao = Double.parseDouble(quantidadeComposicao.replace(",", "."));
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(String valorUnitario) {
		if (!valorUnitario.isEmpty())
			this.valorUnitario = Double.parseDouble(valorUnitario.replace(",", "."));
		else this.valorUnitario = 0D;
	}

}
