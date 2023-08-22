package manipulacao.lambdas.consumidor;

import java.util.function.Consumer;

import manipulacao.lambdas.Produto;

public class Consumidor {

	public static void main(String[] args) {
		Consumer<Produto> imprimir = p -> System.out.println(p.nome);
		
		
	}
	
}
