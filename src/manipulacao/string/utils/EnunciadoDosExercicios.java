package manipulacao.string.utils;

public enum EnunciadoDosExercicios {
	
	TITULO_DESAFIO("Desafio PWC"),
	ENUNCIADO_PRIMEIRO_EXERCICIO("Exercicio 01 - Reverter a oredm das palavras nas frases, mantendo a ordem das palavras."),
	ENUNCIADO_SEGUNDO_EXERCICIO("Exercicio 02 - Remova todos os caracters uplicados de uma string."),
	ENUNCIADO_TERCEIRO_EXERCICIO("Exercicio 03 - Encontre a substtring palindroma mais longa."),
	ENUNCIADO_QUARTO_EXERCICIO("Exercicio 04 - Coloque em maiuscula a primeira letra de cada frase na string."),
	ENUNCIADO_QUINTO_EXERCICIO("Exercicio 05 - Verificando se a palavra é um anagrama de um palindromo.");
	
	private String descrição;

	private EnunciadoDosExercicios(String descrição) {
		this.descrição = descrição;
	}

	public String getDescrição() {
		return descrição;
	}
	
	

}
