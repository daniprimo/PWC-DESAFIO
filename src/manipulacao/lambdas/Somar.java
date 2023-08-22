package manipulacao.lambdas;

public class Somar implements Calculo {

	@Override
	public Double executar(Double x, Double y) {
		return x + y;
	}

}
