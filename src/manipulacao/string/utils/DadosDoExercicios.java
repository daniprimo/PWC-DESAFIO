package manipulacao.string.utils;

public enum DadosDoExercicios {

	DADOS_DO_PRIMEIRO_EXERCICIO("Hello, Word! OpenAl is amazing"),
	DADOS_DO_SEGUNDO_EXERCICIO("Hello, Word!"),
	DADOS_DO_TERCEIRO_EXERCICIO("babad"),
	DADOS_DO_QUARTO_EXERCICIO("hello. how are you? i`m fine, thank you."),
	DADOS_DO_QUINTO_EXERCICIO("racecar");
	
	private String descricao;

	private DadosDoExercicios(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	
	
}
