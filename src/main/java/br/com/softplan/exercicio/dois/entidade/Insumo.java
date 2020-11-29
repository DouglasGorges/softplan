package br.com.softplan.exercicio.dois.entidade;

import br.com.softplan.exercicio.dois.util.types.ItemType;
import br.com.softplan.exercicio.dois.util.types.UnidadeType;

public class Insumo extends Item {
	
	public Insumo() {
	}

	public Insumo(ItemType tipoItem, Integer codigoItem, String descricaoItemComposicao, UnidadeType unidadeItem,
			double quantidadeComposicao, double valorUnitario) {
		this.setTipoItem(tipoItem);
		this.setCodigoItem(codigoItem);
		this.setDescricaoItemComposicao(descricaoItemComposicao);
		this.setUnidadeItem(unidadeItem);
		this.setQuantidadeComposicao(quantidadeComposicao);
	}
	
	@Override
	public void setTipoItem(ItemType tipoItem) {
		super.tipoItem = tipoItem;
	}

	@Override
	public void setCodigoItem(Integer codigoItem) {
		super.codigoItem = codigoItem;
	}

	@Override
	public void setDescricaoItemComposicao(String descricaoItemComposicao) {
		super.descricaoItemComposicao = descricaoItemComposicao;
	}

	@Override
	public void setUnidadeItem(UnidadeType unidadeItem) {
		super.unidadeItem = unidadeItem;
	}

	@Override
	public void setQuantidadeComposicao(double quantidadeComposicao) {
		super.quantidadeComposicao = quantidadeComposicao;
	}
	
}
