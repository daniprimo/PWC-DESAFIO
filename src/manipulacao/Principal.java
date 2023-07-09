package manipulacao;

import javax.swing.JOptionPane;

import manipulacao.string.aplicacao.InteragirComOUsuario;
import manipulacao.string.aplicacao.MostrarNoConsole;
import manipulacao.string.encapsulamento.InteragirComUsuario;
import manipulacao.string.encapsulamento.VisualAplicacao;

public class Principal {

	public static void main(String[] args) {
		VisualAplicacao mostrarNoConsoleIdenticoODoDesafio = new MostrarNoConsole();
		InteragirComUsuario interagindoComOUsuario = new InteragirComOUsuario();

		boolean isIterador = true;
		while (isIterador) {

			String opcao = JOptionPane.showInputDialog(" Digite [1] - Para retornar os dados padrao do desafio.\n"
					+ " Digite [2] - Para interagir inserindo dados.\n" + " Digite [3] - Encerrar a aplicação.");

			switch (Integer.parseInt(opcao)) {
			case 1: {
				mostrarNoConsoleIdenticoODoDesafio.comDadosDoExercicio();
				break;
			}
			case 2: {
				interagindoComOUsuario.start();
				break;
			}
			case 3: {
				JOptionPane.showMessageDialog(null, "  Obrigado por utilizar nosso sistema. Tchau !!!");
				isIterador = false;
				break;
			}
			default:
				JOptionPane.showMessageDialog(null, "  Valor inserido invávlido");
				isIterador = true;
			}
			
		

		}


	}


}
