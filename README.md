EXERCÍCIO 2

	Método main:
		br.com.softplan.exercicio.dois.aplicacao.Aplicacao.main(String[])
		
	
	br.com.softplan.exercicio.dois.util.JsonUtil
		
		Essa classe contém métodos úteis na manipulação do json. Decidi dividí-la em dois métodos: um que trata o recebimento de um json do arquivo e devolve-o em String, e outro que recebe essa String e devolve um array de objetos json.
		Dessa forma, caso venhamos a consumir o json de outra fonte, basta criar um método que o transforme em String que, daí em diante, já estamos preparados para computá-lo.

	br.com.softplan.exercicio.dois.helper.ComposicaoHelper

		Essa classe é responsável por fazer o mapeamento inicial de atributos do json para uma entidade no java.
		Como nossos atributos do json são compostos por outros (onde uma composição pode fazer parte de outra), precisei fazer o mapeamento espelhado das informações pra, só então, começar a manipular os modelos de objetos.

	br.com.softplan.exercicio.dois.entidade.Item
	br.com.softplan.exercicio.dois.entidade.Insumo
	br.com.softplan.exercicio.dois.entidade.Composicao

		Essas três classe são os mapeamentos das informações do json. Como uma composição e um Insumo são itens que podem ser atribuídos uns aos outros, ambos estendem a classe Item.

	br.com.softplan.exercicio.dois.service.ComposicaoServiceImpl

		Essa classe é responsável por executar os serviços na anipulação das entidades necessárias para a manipulação das composições.


	Por fim, temos duas classes enum para mapeamento dos tipos de Item (Insumo, Composição) e de Unidades de Medida (Tempo, peso…).

Sobre os testes, só consegui pensar em testar a instanciação das entidades de modelo, atribuindo valores e depois testando se os valores capturados serão os mesmos antes atribuídos.
Esse exercício já foi bem mais difícil de visualizar a construção deles. Não gostei do jeito que ficou e sei que poderia ficar melhor, só não encontrei formas de fazê-lo.
Não quis buscar ajuda com colegas que acredito terem a solução porque senti que estaria trapaceando, por isso me limitei aos conteúdos dispostos na WEB.