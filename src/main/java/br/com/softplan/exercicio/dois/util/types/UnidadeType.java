package br.com.softplan.exercicio.dois.util.types;

public enum UnidadeType {
	UN(1, "Unidade"), 
	M2(2, "Metro Quadrado"), 
	M3(3, "Metro Cubico"), 
	H(4, "Hora"), 
	KG(5, "Quilograma"),
	CHP(6, "Custo Hora Produtiva"), 
	CHI(7, "Custo Hora Improdutiva");

	private Integer chave;
	private String descricao;

	private UnidadeType(Integer chave, String descricao) {
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
