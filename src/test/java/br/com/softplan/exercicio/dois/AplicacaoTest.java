package br.com.softplan.exercicio.dois;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.junit.Test;

import br.com.softplan.exercicio.dois.aplicacao.Aplicacao;
import br.com.softplan.exercicio.dois.entidade.Composicao;
import br.com.softplan.exercicio.dois.entidade.Insumo;
import br.com.softplan.exercicio.dois.util.types.ItemType;
import br.com.softplan.exercicio.dois.util.types.UnidadeType;

public class AplicacaoTest {

	@Test
	public void testComposicao() {
		Integer p_codigo = 1;
		String p_descricao = "ComposicaoTeste";
		UnidadeType p_unidade = UnidadeType.KG;

		Composicao composicao = new Composicao(p_codigo, p_descricao, p_unidade);

		Integer codigo = composicao.getCodigoComposicao();
		String descricao = composicao.getDescricaoComposicao();
		UnidadeType unidade = composicao.getUnidadeComposicao();

		assertEquals(p_codigo, codigo);
		assertEquals(p_descricao, descricao);
		assertEquals(p_unidade, unidade);
	}

	@Test
	public void testInsumo() {
		ItemType p_tipoItem = ItemType.INSUMO;
		Integer p_codigoItem = 1;
		String p_descricaoItemComposicao = "ComposicaoTeste";
		UnidadeType p_unidadeItem = UnidadeType.KG;
		double p_quantidadeComposicao = 1.5D;
		double p_valorUnitario = 0.17D;

		Insumo insumo = new Insumo(p_tipoItem, p_codigoItem, p_descricaoItemComposicao, p_unidadeItem,
				p_quantidadeComposicao, p_valorUnitario);

		ItemType tipoItem = insumo.getTipoItem();
		Integer codigoItem = insumo.getCodigoItem();
		String descricaoItemComposicao = insumo.getDescricaoItemComposicao();
		UnidadeType unidadeItem = insumo.getUnidadeItem();
		double quantidadeComposicao = insumo.getQuantidadeComposicao();
		double valorUnitario = insumo.getQuantidadeComposicao();

		assertEquals(p_tipoItem, tipoItem);
		assertEquals(p_codigoItem, codigoItem);
		assertEquals(p_descricaoItemComposicao, descricaoItemComposicao);
		assertEquals(p_unidadeItem, unidadeItem);
		assertEquals(p_unidadeItem, unidadeItem);
		assertEquals(quantidadeComposicao, valorUnitario, 1);
	}

	@Test
	public void testAplicacao() throws FileNotFoundException {
		String[] args = null;
		final InputStream original = System.in;
		final FileInputStream fips = new FileInputStream(new File(
				"/Users/douglasgorges/eclipse-workspace/exerciciosSoftplan/src/main/java/br/com/softplan/exercicio/dois/recurso/dados-entrada-servicos-composicoes.json"));
		System.setIn(fips);
		Aplicacao.main(args);
		System.setIn(original);
		
		//TODO Assert (...)
	}
}
