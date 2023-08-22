package manipulacao.lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste {

		public static void main(String[] args) {
			Test1();
			Test2();
			
			BinaryOperator<Double> calc = (x, y) -> {return x + y;};
			System.out.println(calc.apply(2d, 7d));
		}

		private static void Test2() {
			// TODO Auto-generated method stub
			Calculo calc = (x, y) -> {return x + y;};
			calc.legal();
			System.out.println(calc.executar(5.0, 7.5));
			
		}

		private static void Test1() {
			Calculo calc = (x, y) -> x * y;
			Calculo.segundo();
			System.out.println(calc.executar(5.0, 7.5));
		}
	
}
