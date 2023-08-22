package manipulacao.lambdas;

@FunctionalInterface
public interface Calculo {

	Double executar(Double x, Double y);
	
	default String legal() {
		return "legal";
	}

	static String segundo() {
		return "muitoLegal";
	}

}
