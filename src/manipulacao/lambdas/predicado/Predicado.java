package manipulacao.lambdas.predicado;

import java.util.function.Predicate;

import manipulacao.lambdas.Produto;

public class Predicado {

	public static void main(String[] args) {
		Predicate<Produto> isCaro = prod -> (prod.preco * (1 - prod.desconto)) >= 750;
		
		Produto produto = new Produto("Notebook", 3393.89, 0.15);
		System.out.println(isCaro.test(produto));
	}
	
}
