package br.com.softplan.exercicio.dois.util.types;

public enum ItemType {
	COMPOSICAO(1, "Composicao"), 
	INSUMO(2, "Insumo");

	private Integer chave;
	private String descricao;

	private ItemType(Integer chave, String descricao) {
		setChave(chave);
		setDescricao(descricao);
	}

	public Integer getChave() {
		return chave;
	}

	private void setChave(Integer chave) {
		this.chave = chave;
	}

	public String getDescricao() {
		return descricao;
	}

	private void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
