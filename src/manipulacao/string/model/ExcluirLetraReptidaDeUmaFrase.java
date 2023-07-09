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
		StringBuffer buffer = new StringBuffer();
		getFrase().chars().distinct().forEach(letra -> buffer.append((char) letra));						
		return buffer.toString();
	}

}
