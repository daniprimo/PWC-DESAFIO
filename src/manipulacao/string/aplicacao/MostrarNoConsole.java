package manipulacao.string.aplicacao;

import manipulacao.string.encapsulamento.DesafioPWC;
import manipulacao.string.encapsulamento.VisualAplicacao;
import manipulacao.string.model.ExcluirLetraReptidaDeUmaFrase;
import manipulacao.string.model.InverterOrdemDaFrase;
import manipulacao.string.model.IsStringEUmAnagrama;
import manipulacao.string.model.PrimeiraLetraDaFraseEmMaiuscula;
import manipulacao.string.model.SubstringPalindromaMaisLonga;
import manipulacao.string.utils.DadosDoExercicios;
import manipulacao.string.utils.EnunciadoDosExercicios;

public class MostrarNoConsole implements VisualAplicacao {

	@Override
	public void comDadosDoExercicio() {
	
		System.out.println("--------------------------------------------------------------");
		System.out.println("");
		
		System.out.println(EnunciadoDosExercicios.ENUNCIADO_PRIMEIRO_EXERCICIO.getDescrição());
		DesafioPWC reverterOrdem = new InverterOrdemDaFrase(DadosDoExercicios.DADOS_DO_PRIMEIRO_EXERCICIO.getDescricao());
		System.out.println("Input: "+ DadosDoExercicios.DADOS_DO_PRIMEIRO_EXERCICIO.getDescricao());
		System.out.println("Output: "+reverterOrdem.executar());
		
		System.out.println("");
		System.out.println("--------------------------------------------------------------");

		System.out.println(EnunciadoDosExercicios.ENUNCIADO_SEGUNDO_EXERCICIO.getDescrição());
		DesafioPWC letraDuplicada = new ExcluirLetraReptidaDeUmaFrase(DadosDoExercicios.DADOS_DO_SEGUNDO_EXERCICIO.getDescricao());
		System.out.println("Input: "+ DadosDoExercicios.DADOS_DO_SEGUNDO_EXERCICIO.getDescricao());
		System.out.println("Output: "+ letraDuplicada.executar());
		
		System.out.println("");
		System.out.println("--------------------------------------------------------------");

		System.out.println(EnunciadoDosExercicios.ENUNCIADO_TERCEIRO_EXERCICIO.getDescrição());
		DesafioPWC substringPalindroma = new SubstringPalindromaMaisLonga(DadosDoExercicios.DADOS_DO_TERCEIRO_EXERCICIO.getDescricao());
		System.out.println("Input: "+ DadosDoExercicios.DADOS_DO_TERCEIRO_EXERCICIO.getDescricao());
		System.out.println("Output: "+ substringPalindroma.executar());
		
		System.out.println("");
		System.out.println("--------------------------------------------------------------");

		System.out.println(EnunciadoDosExercicios.ENUNCIADO_QUARTO_EXERCICIO.getDescrição());
		DesafioPWC mudandoParaLetraMaiuscula = new PrimeiraLetraDaFraseEmMaiuscula(DadosDoExercicios.DADOS_DO_QUARTO_EXERCICIO.getDescricao());
		System.out.println("Input: "+ DadosDoExercicios.DADOS_DO_QUARTO_EXERCICIO.getDescricao());
		System.out.println(mudandoParaLetraMaiuscula.executar());
		
		System.out.println("");
		System.out.println("--------------------------------------------------------------");

		System.out.println(EnunciadoDosExercicios.ENUNCIADO_QUINTO_EXERCICIO.getDescrição());
		DesafioPWC isPalindroma = new IsStringEUmAnagrama(DadosDoExercicios.DADOS_DO_QUINTO_EXERCICIO.getDescricao());
		System.out.println("Input: "+ DadosDoExercicios.DADOS_DO_QUINTO_EXERCICIO.getDescricao());
		System.out.println(isPalindroma.executar());
		
		System.out.println("");
		System.out.println("--------------------------------------------------------------");

		
	}


}
