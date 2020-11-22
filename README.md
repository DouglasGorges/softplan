Olá!

Eu ainda não havia tido, de um modo sólido, qualquer contato com testes. Os testes aplicados nesses desafios foram criados com base em conteúdo disponível na WEB.

Sendo assim, ressalto alguns pontos de meu código:

EXERCÍCIO 1

	br.com.softplan.exercicioUm.util.GeradorObservacaoTest
	
		Optei por criar testes unitários para o código legado com intenção de aumentar a cobertura. Agora, o código possui 100% de cobertura por testes unitários.
		
		Observe que, para testar mais de uma via do fluxo de dados, eu crio um método com a anotação @Test e invoco a execução dos demais. Essa abordagem me incomoda porque é estranho, para mim, um método da classe de testes não contar com alguma anotação do jUnit. Procurei na WEB outra forma de fazê-lo mas não tive sucesso.

	br.com.softplan.exercicio.um.util.GeradorObservacao

		Eu extraí o controle do texto plural ou singular para um método com a intenção de reutilizar código;
		Como o método legado recebe uma lista de inteiros, parametrizei o argumento da lista para o tipo Integer.

		Criei uma classe de Nota Fiscal para implementar Orientação a Objeto na geração da observação.

		Eu não gostei da forma como ocorre o controle na montagem da String de retorno, pois temos código repetido. Pensei em extrair a nova funcionalidade para um novo método e aplicar abstração mas, como estamos tratando do mesmo assunto, que é gerar observação, optei por deixar na mesma classe.