package br.com.softplan.exercicio.dois.aplicacao;

import java.util.List;
import java.util.Map;

import org.json.simple.JSONArray;

import br.com.softplan.exercicio.dois.entidade.Composicao;
import br.com.softplan.exercicio.dois.helper.ComposicaoHelper;
import br.com.softplan.exercicio.dois.service.ComposicaoService;
import br.com.softplan.exercicio.dois.service.ComposicaoServiceImpl;
import br.com.softplan.exercicio.dois.util.JsonUtil;

public class Aplicacao {
	private static final String CAMINHO_JSON = "/Users/douglasgorges/eclipse-workspace/exerciciosSoftplan/src/main/java/br/com/softplan/exercicio/dois/recurso/dados-entrada-servicos-composicoes.json";
	private static ComposicaoService composicaoService = new ComposicaoServiceImpl();

	public static void main(String[] args) {

		String strJson = JsonUtil.carregarJsonDoArquivo(CAMINHO_JSON);

		JSONArray arrayJsonObject = JsonUtil.stringParaArrayDeObjeto(strJson);

		List<ComposicaoHelper> listaComposicaoHelper = composicaoService.carregarComposicoesHelper(arrayJsonObject);
		Map<Integer, Composicao> mapaComposicao = composicaoService.mapearComposicoes(listaComposicaoHelper);

		imprimirMapa(mapaComposicao);

	}

	private static void imprimirMapa(Map<Integer, Composicao> mapaComposicao) {
		mapaComposicao.forEach((codComposicao,
				composicao) -> System.out.println(composicao.getCodigoComposicao() + " "
						+ composicao.getDescricaoComposicao() + " " + composicao.getUnidadeComposicao() + " "
						+ String.format("%.2f", composicao.getValorComposicao()).replace(".", ",")));
	}

}
