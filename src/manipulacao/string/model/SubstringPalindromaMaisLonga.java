package manipulacao.string.model;

import java.util.ArrayList;
import java.util.List;

import manipulacao.string.encapsulamento.DesafioPWC;

public class SubstringPalindromaMaisLonga extends Frase implements DesafioPWC {

	public SubstringPalindromaMaisLonga(String frase) {
		super(frase);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String executar() {
		// TODO Auto-generated method stub
		List<Character> buffer = new ArrayList<>();
		getFrase().chars().forEach(letra -> buffer.add((char) letra));
		StringBuffer stringEspecial = new StringBuffer();
		
		for (int i = 0; i < buffer.size(); i++) {
			stringEspecial.append(buffer.get(i));
			if (i > 1 && stringEspecial.toString().equals(new StringBuffer().append(stringEspecial.toString()).reverse().toString())) {
						
				return stringEspecial.toString();
				
			}
		}
		
		return null;	
	}

}
