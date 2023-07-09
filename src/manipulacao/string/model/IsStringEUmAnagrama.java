package manipulacao.string.model;

import manipulacao.string.encapsulamento.PalindromaService;

public class IsStringEUmAnagrama extends Frase implements PalindromaService {

	public IsStringEUmAnagrama(String frase) {
		super(frase);
		// TODO Auto-generated constructor stub
	}

	public IsStringEUmAnagrama() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String executar() {
			return "OutPut: "+ isPalindroma();
	}

	@Override
	public boolean isPalindroma() {
		return getFrase().toString().equals(new StringBuffer().append(getFrase().toString()).reverse().toString());
	}
	
	@Override
	public boolean isPalindroma(String frase) {
		return frase.toString().equals(new StringBuffer().append(getFrase().toString()).reverse().toString());
	}

	@Override
	public String executar(String frase) {		
		if (isPalindroma(frase)) {
			return "true";
		}else {
			return "false";
		}
	}

}
