package manipulacao.lambdas.function;

import java.util.function.Function;

public class Funcoes {
	
	public static void main(String[] args) {
		Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Impar";
		
		System.out.println(parOuImpar.apply(32));
		
		Function<String, String> oResultadoE = valor -> "O resultado é: " + valor;
		Function<String, String> empolgado = valor -> valor + "!!";

		String resultadoFInal = parOuImpar
									.andThen(oResultadoE)
									.andThen(empolgado)
									.apply(55);
		
		System.out.println(resultadoFInal);
	}
}
