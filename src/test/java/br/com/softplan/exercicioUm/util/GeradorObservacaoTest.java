package br.com.softplan.exercicioUm.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import br.com.softplan.exercicio.um.entidade.NotaFiscal;
import br.com.softplan.exercicio.um.util.GeradorObservacao;

public class GeradorObservacaoTest {

	@Test
	public void testGeraObservacao() {
		testGeraObservacaoVazia();
		testGeraObservacaoSingular();
		testGeraObservacaoPlural();
	}

	@Test
	public void testGeraObservacaoComValor() {
		testGeraObservacaoComValorListaVazia();
		testGeraObservacaoComValorSingular();
		testGeraObservacaoComValorPlural();
	}

	private void testGeraObservacaoVazia() {
		GeradorObservacao geradorObservacao = new GeradorObservacao();
		String observacaoNaoGerada = geradorObservacao.geraObservacao(Arrays.asList());

		assertEquals("", observacaoNaoGerada);
	}

	private void testGeraObservacaoSingular() {
		GeradorObservacao geradorObservacao = new GeradorObservacao();
		String observacaoGerada = geradorObservacao.geraObservacao(Arrays.asList(1));

		assertNotEquals("", observacaoGerada);
		Assert.assertThat(observacaoGerada, CoreMatchers.containsString("Fatura da nota fiscal de simples remessa: "));
	}

	private void testGeraObservacaoPlural() {
		GeradorObservacao geradorObservacao = new GeradorObservacao();
		String observacaoGerada = geradorObservacao.geraObservacao(Arrays.asList(1, 2, 3, 4, 5));

		assertNotEquals("", observacaoGerada);
		Assert.assertThat(observacaoGerada,
				CoreMatchers.containsString("Fatura das notas fiscais de simples remessa: "));
	}

	private void testGeraObservacaoComValorListaVazia() {
		GeradorObservacao geradorObservacao = new GeradorObservacao();
		ArrayList<NotaFiscal> listaNotasFiscais = new ArrayList<>();

		String observacaoNaoGerada = geradorObservacao.geraObservacaoComValor(listaNotasFiscais);

		assertEquals("", observacaoNaoGerada);
	}

	private void testGeraObservacaoComValorSingular() {
		GeradorObservacao geradorObservacao = new GeradorObservacao();
		ArrayList<NotaFiscal> listaNotasFiscais = new ArrayList<>();

		NotaFiscal notaFiscal = new NotaFiscal(1, 10.00D);
		listaNotasFiscais.add(notaFiscal);

		String observacaoGerada = geradorObservacao.geraObservacaoComValor(listaNotasFiscais);

		assertNotEquals("", observacaoGerada);
		Assert.assertThat(observacaoGerada, CoreMatchers.containsString("Fatura da nota fiscal de simples remessa: "));
	}

	private void testGeraObservacaoComValorPlural() {
		GeradorObservacao geradorObservacao = new GeradorObservacao();
		ArrayList<NotaFiscal> listaNotasFiscais = new ArrayList<>();

		NotaFiscal notaFiscal = new NotaFiscal(1, 10.00D);
		listaNotasFiscais.add(notaFiscal);

		notaFiscal = new NotaFiscal(2, 35.20D);
		listaNotasFiscais.add(notaFiscal);

		notaFiscal = new NotaFiscal();
		notaFiscal.setNumeroNota(3);;
		notaFiscal.setValorNota(3500.00D);
		listaNotasFiscais.add(notaFiscal);

		String observacaoGerada = geradorObservacao.geraObservacaoComValor(listaNotasFiscais);

		assertNotEquals("", observacaoGerada);
		Assert.assertThat(observacaoGerada,
				CoreMatchers.containsString("Fatura das notas fiscais de simples remessa: "));
	}

}
