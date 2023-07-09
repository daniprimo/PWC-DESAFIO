package manipulacao.string.model;

import java.util.ArrayList;
import java.util.List;

import manipulacao.string.encapsulamento.DesafioPWC;

public class SubstringPalindromaMaisLonga extends Frase implements DesafioPWC {

	public SubstringPalindromaMaisLonga(String frase) {
		super(frase);
		// TODO Auto-generated constructor stub
	}

	public SubstringPalindromaMaisLonga() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String executar() {
		// TODO Auto-generated method stub
		List<Character> listaDasLetras = new ArrayList<>();
		getFrase().chars().forEach(letra -> listaDasLetras.add((char) letra));
		StringBuffer concatenandoAsLetrasParaFormaremFrases = new StringBuffer();
		
		for (int i = 0; i < listaDasLetras.size(); i++) {
			concatenandoAsLetrasParaFormaremFrases.append(listaDasLetras.get(i));
			if (i > 1 && concatenandoAsLetrasParaFormaremFrases.toString()
					.equals(new StringBuffer().append(concatenandoAsLetrasParaFormaremFrases.toString()).reverse().toString())) {
						
				return concatenandoAsLetrasParaFormaremFrases.toString();
				
			}
		}
		
		return "Não contem palindroma na frase.";	
	}

	@Override
	public String executar(String frase) {
		List<Character> listaDasLetras = new ArrayList<>();
		frase.chars().forEach(letra -> listaDasLetras.add((char) letra));
		StringBuffer concatenandoAsLetrasParaFormaremFrases = new StringBuffer();
		
		for (int i = 0; i < listaDasLetras.size(); i++) {
			concatenandoAsLetrasParaFormaremFrases.append(listaDasLetras.get(i));
			if (i > 1 && concatenandoAsLetrasParaFormaremFrases.toString()
					.equals(new StringBuffer().append(concatenandoAsLetrasParaFormaremFrases.toString()).reverse().toString())) {
						
				return concatenandoAsLetrasParaFormaremFrases.toString();
				
			}
		}
		
		return "Não contem palindroma na frase.";	
	}

}
