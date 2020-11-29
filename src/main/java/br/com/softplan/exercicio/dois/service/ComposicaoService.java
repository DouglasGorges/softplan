package br.com.softplan.exercicio.dois.service;

import java.util.List;
import java.util.Map;

import org.json.simple.JSONArray;

import br.com.softplan.exercicio.dois.entidade.Composicao;
import br.com.softplan.exercicio.dois.helper.ComposicaoHelper;

public interface ComposicaoService {
	public List<ComposicaoHelper> carregarComposicoesHelper(JSONArray arrayJsonObject);

	public Map<Integer, Composicao> mapearComposicoes(List<ComposicaoHelper> listaComposicaoHelper);
}
