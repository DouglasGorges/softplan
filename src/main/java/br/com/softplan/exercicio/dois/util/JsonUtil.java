package br.com.softplan.exercicio.dois.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonUtil {

	private JsonUtil() {
	}

	public static JSONArray stringParaArrayDeObjeto(String json) {
		try {
			return (JSONArray) new JSONParser().parse(json);
		} catch (ParseException exception) {
			exception.printStackTrace();
			return null;
		}
	}

	public static String carregarJsonDoArquivo(String caminhoArquivoJson) {
		try {
			return new String(Files.readAllBytes(Paths.get(caminhoArquivoJson)));
		} catch (IOException exception) {
			exception.printStackTrace();
			return null;
		}
	}
}
