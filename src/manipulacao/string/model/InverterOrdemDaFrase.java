package manipulacao.string.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import manipulacao.string.encapsulamento.DesafioPWC;

public class InverterOrdemDaFrase extends Frase implements DesafioPWC {

	public InverterOrdemDaFrase(String frase) {
		super(frase);
	}

	public String executar() {
		String[] split = getFrase().split(" ");
		List<String> lista = new ArrayList<>(Arrays.asList(split));
		StringBuffer concatenar = new StringBuffer();	
		int size = lista.size();
		int iterador = size - 1;
		for (int i = iterador; i >= 0; i--) {
			concatenar.append(lista.get(i)+" ");
		}			
		return concatenar.toString();
	}
	
	

}
