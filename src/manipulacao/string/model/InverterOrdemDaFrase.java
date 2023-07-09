package manipulacao.string.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import manipulacao.string.encapsulamento.DesafioPWC;

public class InverterOrdemDaFrase extends Frase implements DesafioPWC {

	public InverterOrdemDaFrase(String frase) {
		super(frase);
	}

	public InverterOrdemDaFrase() {
		// TODO Auto-generated constructor stub
	}

	public String executar() {
		String[] separandoTodasPalavrasDaFrase = getFrase().split(" ");
		List<String> listaDasPalavras = new ArrayList<>(Arrays.asList(separandoTodasPalavrasDaFrase));
		StringBuffer concatenarAsPalvrasNaOrdemInvertida = new StringBuffer();	
		int size = listaDasPalavras.size();
		int iterador = size - 1;
		for (int i = iterador; i >= 0; i--) {
			concatenarAsPalvrasNaOrdemInvertida.append(listaDasPalavras.get(i)+" ");
		}			
		return concatenarAsPalvrasNaOrdemInvertida.toString();
	}

	@Override
	public String executar(String frase) {
		String[] separandoTodasPalavrasDaFrase = frase.split(" ");
		List<String> listaDasPalavras = new ArrayList<>(Arrays.asList(separandoTodasPalavrasDaFrase));
		StringBuffer concatenarAsPalvrasNaOrdemInvertida = new StringBuffer();	
		int size = listaDasPalavras.size();
		int iterador = size - 1;
		for (int i = iterador; i >= 0; i--) {
			concatenarAsPalvrasNaOrdemInvertida.append(listaDasPalavras.get(i)+" ");
		}			
		return concatenarAsPalvrasNaOrdemInvertida.toString();
	}
	
	

}
