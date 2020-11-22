package br.com.softplan.exercicio.um.util;

import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

import br.com.softplan.exercicio.um.entidade.NotaFiscal;

public class GeradorObservacao {

	// Gera observa��es, com texto pre-definido, incluindo os n�meros, das notas
	// fiscais, recebidos no par�metro
	public String geraObservacao(List<Integer> lista) {
		if (!lista.isEmpty()) {
			return retornaCodigos(lista) + ".";
		}
		return "";
	}

	public String geraObservacaoComValor(List<NotaFiscal> listaNotasFiscais) {
		if (!listaNotasFiscais.isEmpty()) {
			return retornaCodigosEValores(listaNotasFiscais);
		}

		return "";
	}

	// Cria observa��o
	private String retornaCodigos(List<Integer> lista) {
		String texto = definirFlexaoDoTexto(lista);

		// Acha separador
		StringBuilder cod = new StringBuilder();
		for (Iterator<Integer> iterator = lista.iterator(); iterator.hasNext();) {
			Integer c = iterator.next();
			String s = "";
			if (cod.toString() == null || cod.toString().length() <= 0)
				s = "";
			else if (iterator.hasNext())
				s = ", ";
			else
				s = " e ";

			cod.append(s + c);
		}

		return texto + cod;
	}

	private String retornaCodigosEValores(List<NotaFiscal> listaNotasFiscais) {
		String texto = definirFlexaoDoTexto(listaNotasFiscais);

		double valorTotal = 0D;
		DecimalFormat decimalFormat = new DecimalFormat("###,###,###,###,###.00");

		StringBuilder cod = new StringBuilder();
		for (Iterator<NotaFiscal> iterator = listaNotasFiscais.iterator(); iterator.hasNext();) {
			NotaFiscal notaFiscal = iterator.next();
			String s = "";
			if (cod.toString() == null || cod.toString().length() <= 0)
				s = "";
			else if (iterator.hasNext())
				s = ", ";
			else
				s = " e ";

			valorTotal += notaFiscal.getValorNota();
			cod.append(s + notaFiscal.getNumeroNota() + " cujo valor é R$ "
					+ decimalFormat.format(notaFiscal.getValorNota()));
		}

		cod.append(". Total: " + decimalFormat.format(valorTotal) + ".");

		return texto + cod;
	}

	public String definirFlexaoDoTexto(List lista) {
		if (lista.size() >= 2)
			return "Fatura das notas fiscais de simples remessa: ";
		else
			return "Fatura da nota fiscal de simples remessa: ";
	}
}