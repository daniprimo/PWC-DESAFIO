package manipulacao.string.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import manipulacao.string.encapsulamento.DesafioPWC;

public class PrimeiraLetraDaFraseEmMaiuscula extends Frase implements DesafioPWC {

	public PrimeiraLetraDaFraseEmMaiuscula(String frase) {
		super(frase);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String executar() {
		// TODO Auto-generated method stub
		StringBuffer concatenarAsStringsSeparaas = new StringBuffer();
		String[] stringsSeparadasPeloSplit = getFrase().split("[.]");
		List<String> listaDaStringSeparada = new ArrayList<>(Arrays.asList(stringsSeparadasPeloSplit));
		for (String acessandoLista : listaDaStringSeparada) {
			String string = acessandoLista.strip();
			String maiuscula = string.substring(0, 1).toUpperCase() + string.substring(1).toLowerCase();
			concatenarAsStringsSeparaas.append(maiuscula+". ");
		}
		
		
		if (concatenarAsStringsSeparaas.toString().contains("?")) {
			StringBuffer retornoDasStrings = new StringBuffer();
			String[] separandoAsStrinsDaInterrogacao = concatenarAsStringsSeparaas.toString().split("[?]");
			String ponto = concatenarAsStringsSeparaas.toString();
			retornoDasStrings.append(separandoAsStrinsDaInterrogacao[0]);
			retornoDasStrings.append(interrogacao(ponto));
			return retornoDasStrings.toString();

		}
		
		
		return concatenarAsStringsSeparaas.toString();
	}
	
	private String interrogacao(String string) {
		StringBuffer buffer = new StringBuffer();
		String[] strings = getFrase().split("[?]");
		String fraseSeparadaPeloStrip = strings[1].strip();
		String feito = fraseSeparadaPeloStrip.substring(0, 1).toUpperCase() + fraseSeparadaPeloStrip.substring(1).toLowerCase();
		buffer.append("? ");
		buffer.append(feito);
		return buffer.toString();
	}
	
	
}
