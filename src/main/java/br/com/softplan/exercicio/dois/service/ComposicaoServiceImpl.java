package br.com.softplan.exercicio.dois.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONArray;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.softplan.exercicio.dois.entidade.Composicao;
import br.com.softplan.exercicio.dois.entidade.Insumo;
import br.com.softplan.exercicio.dois.helper.ComposicaoHelper;
import br.com.softplan.exercicio.dois.util.types.ItemType;

public class ComposicaoServiceImpl implements ComposicaoService {

	@Override
	public List<ComposicaoHelper> carregarComposicoesHelper(JSONArray arrayJsonObject) {
		List<ComposicaoHelper> listaComposicaoHelper = new ArrayList<>();

		try {
			for (int itemIndex = 0; itemIndex < arrayJsonObject.size(); itemIndex++) {
				ObjectMapper objectMapper = new ObjectMapper();

				listaComposicaoHelper
						.add(objectMapper.readValue(arrayJsonObject.get(itemIndex).toString(), ComposicaoHelper.class));
			}
		} catch (JsonProcessingException exception) {
			exception.printStackTrace();
			return new ArrayList<>();
		}

		return listaComposicaoHelper;
	}

	@Override
	public Map<Integer, Composicao> mapearComposicoes(List<ComposicaoHelper> listaComposicaoHelper) {

		Map<Integer, Composicao> mapaComposicao;

		mapaComposicao = mapearComposicoesPrimarias(listaComposicaoHelper);
		mapaComposicao = mapearInsumos(listaComposicaoHelper, mapaComposicao);
		mapaComposicao = mapearComposicoesSecundarias(listaComposicaoHelper, mapaComposicao);

		return mapaComposicao;
	}

	private Map<Integer, Composicao> mapearComposicoesPrimarias(List<ComposicaoHelper> listaComposicaoHelper) {
		Map<Integer, Composicao> mapaComposicao = new HashMap<>();

		for (ComposicaoHelper composicaoHelper : listaComposicaoHelper)
			if (!mapaComposicao.containsKey(composicaoHelper.getCodigoComposicao())) {
				Composicao composicao = new Composicao(composicaoHelper.getCodigoComposicao(),
						composicaoHelper.getDescricaoComposicao(), composicaoHelper.getUnidadeComposicao());
				mapaComposicao.put(composicao.getCodigoComposicao(), composicao);
			}
		return mapaComposicao;
	}

	private Map<Integer, Composicao> mapearInsumos(List<ComposicaoHelper> listaComposicaoHelper,
			Map<Integer, Composicao> mapaComposicao) {

		for (ComposicaoHelper composicaoHelper : listaComposicaoHelper) {
			if (composicaoHelper.getTipoItem().equals(ItemType.INSUMO)) {
				Insumo insumo = new Insumo(composicaoHelper.getTipoItem(), composicaoHelper.getCodigoItem(),
						composicaoHelper.getDescricaoItemComposicao(), composicaoHelper.getUnidadeItem(),
						composicaoHelper.getQuantidadeComposicao(), composicaoHelper.getValorUnitario());

				Composicao composicao = mapaComposicao.get(composicaoHelper.getCodigoComposicao());

				double quantidadeInsumo = composicaoHelper.getQuantidadeComposicao();
				double valorUnitario = composicaoHelper.getValorUnitario();
				double valorComposicao = composicao.getValorComposicao();

				valorComposicao += quantidadeInsumo * valorUnitario;

				composicao.getListaItens().add(insumo);
				composicao.setValorComposicao(valorComposicao);

			}
		}
		return mapaComposicao;
	}

	private Map<Integer, Composicao> mapearComposicoesSecundarias(List<ComposicaoHelper> listaComposicaoHelper,
			Map<Integer, Composicao> mapaComposicao) {

		for (ComposicaoHelper composicaoHelper : listaComposicaoHelper)
			if (composicaoHelper.getTipoItem().equals(ItemType.COMPOSICAO)) {
				Composicao item = mapaComposicao.get(composicaoHelper.getCodigoItem());
				item.setQuantidadeComposicao(composicaoHelper.getQuantidadeComposicao());

				Composicao composicao = mapaComposicao.get(composicaoHelper.getCodigoComposicao());

				double quantidadeItemComposicao = item.getQuantidadeComposicao();
				double valorItemComposicao = item.getValorComposicao();
				double valorComposicao = composicao.getValorComposicao();

				valorComposicao += quantidadeItemComposicao * valorItemComposicao;

				composicao.getListaItens().add(item);
				composicao.setValorComposicao(valorComposicao);
			}
		return mapaComposicao;
	}

}
