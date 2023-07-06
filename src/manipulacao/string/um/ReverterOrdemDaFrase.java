package manipulacao.string.um;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverterOrdemDaFrase {

	private String frase;

	public ReverterOrdemDaFrase(String frase) {
		this.frase = frase;
	}
	
	
	public String letraMaiusculaNaPrimeiraFrase() {
		StringBuffer buffer = new StringBuffer();
		String[] strings = frase.split("[.]");
		List<String> listaDaStringSeparada = new ArrayList<>(Arrays.asList(strings));
		//listaDaStringSeparada.add(frase.split("[.?]").toString());
		for (String interacao : listaDaStringSeparada) {
			String string = interacao.strip();
			String maiuscula = string.substring(0, 1).toUpperCase() + string.substring(1).toLowerCase();
			buffer.append(maiuscula+". ");
		}
		
		interrogacao(buffer.toString());
		
	
		System.out.println(buffer.toString());
		
		return null;
	}
	
	private void interrogacao(String string) {
		StringBuffer buffer = new StringBuffer();
		String[] strings = frase.split("[?]");
		List<String> listaDaStringSeparada = new ArrayList<>(Arrays.asList(strings));
		for (String interacao : listaDaStringSeparada) {
			String stringStripada = interacao.strip();
			String maiuscula = stringStripada.substring(0, 1).toUpperCase() + stringStripada.substring(1).toLowerCase();
			buffer.append(maiuscula+"? ");
		}
		System.out.println(buffer.toString());
	}


	public String verificandoSeEPalindroma() {
		List<Character> buffer = new ArrayList<>();
		frase.chars().forEach(letra -> buffer.add((char) letra));
		StringBuffer stringEspecial = new StringBuffer();
		
		for (int i = 0; i < buffer.size(); i++) {
			stringEspecial.append(buffer.get(i));
			if (i > 1 && stringEspecial.toString().equals(new StringBuffer().append(stringEspecial.toString()).reverse().toString())) {
				System.out.println("deu bom");
						
				return stringEspecial.toString();
				
			}
		}
		
		
		return "Nao contem possibilidades de ser padrimonio";
	}

	public String regexDeExclusaoDePalavrasRepetidas() {		
		StringBuffer buffer = new StringBuffer();
		frase.chars().distinct().forEach(letra -> buffer.append((char) letra));						
		return buffer.toString();
	}

	public String inverterOrdemDasPalavrasDaFrase() {
		String[] split = frase.split(" ");
		List<String> lista = new ArrayList<>(Arrays.asList(split));
		StringBuffer concatenar = new StringBuffer();	
		int size = lista.size();
		int iterador = size - 1;
		for (int i = iterador; i >= 0; i--) {
			concatenar.append(lista.get(i)+" ");
		}			
		return concatenar.toString();
	}

	public static void main(String[] args) {
		
		ReverterOrdemDaFrase frase = new ReverterOrdemDaFrase("Hello, Word! OpenAl is amazing");
		System.out.println(frase.inverterOrdemDasPalavrasDaFrase());
		
		ReverterOrdemDaFrase removerCaractersIguais = new ReverterOrdemDaFrase("Hello, Word!");
		System.out.println(removerCaractersIguais.regexDeExclusaoDePalavrasRepetidas());

		ReverterOrdemDaFrase palindroma = new ReverterOrdemDaFrase("babad");
		System.out.println(palindroma.verificandoSeEPalindroma());

		ReverterOrdemDaFrase maiuscula = new ReverterOrdemDaFrase("hello. how are you? i`m fine, thank you.");
		maiuscula.letraMaiusculaNaPrimeiraFrase();

		
		//System.out.println(frase.reverterPalavraDentroDaFrase());
	}

}
