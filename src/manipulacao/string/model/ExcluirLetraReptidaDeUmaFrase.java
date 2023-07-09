package manipulacao.string.model;

import manipulacao.string.encapsulamento.DesafioPWC;

public class ExcluirLetraReptidaDeUmaFrase extends Frase implements DesafioPWC {

	public ExcluirLetraReptidaDeUmaFrase(String frase) {
		super(frase);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String executar() {
		// TODO Auto-generated method stub
		StringBuffer concatenarAsLetras = new StringBuffer();
		getFrase().chars().distinct().forEach(letra -> concatenarAsLetras.append((char) letra));						
		return concatenarAsLetras.toString();
	}

}
