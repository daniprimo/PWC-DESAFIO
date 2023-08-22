package manipulacao.lambdas.consumidor;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import manipulacao.lambdas.Produto;

public class Consumidor {

	public static void main(String[] args) {
		Consumer<Produto> imprimir = p -> System.out.println(p.nome);
		
		Produto produto = new Produto("Notebook", 3393.89, 0.15);
		imprimir.accept(produto);
		
		List<Produto> prods = Arrays.asList(produto);
		prods.forEach(imprimir);
		prods.forEach(p -> System.out.println(p.nome));

	}
	
}
