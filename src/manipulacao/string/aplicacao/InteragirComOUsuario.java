package manipulacao.string.aplicacao;

import javax.swing.JOptionPane;

import manipulacao.string.encapsulamento.InteragirComUsuario;
import manipulacao.string.service.ExcluirLetraReptidasService;
import manipulacao.string.service.IsStringEUmAnagramaPalindromoService;
import manipulacao.string.service.PrimeiraLetraDaFraseEmMaiusculoService;
import manipulacao.string.service.ReverterOrdemService;
import manipulacao.string.service.SubstringPalindromaMaisLongaService;
import manipulacao.string.utils.EnunciadoDosExercicios;

public class InteragirComOUsuario implements InteragirComUsuario {

	public void start() {

	System.out.println(" ------------ Programa de Manipulacao de Strings Historico ------------------------- \n\n");
		
		String modelo = "  Para qual exercicio deseja inserir dados \n" + " Digite [1] - "
				+ EnunciadoDosExercicios.ENUNCIADO_PRIMEIRO_EXERCICIO.getDescrição() + "\n\n" + " Digite [2] - "
				+ EnunciadoDosExercicios.ENUNCIADO_SEGUNDO_EXERCICIO.getDescrição() + "\n\n" + " Digite [3] - "
				+ EnunciadoDosExercicios.ENUNCIADO_TERCEIRO_EXERCICIO.getDescrição() + "\n\n" + " Digite [4] - "
				+ EnunciadoDosExercicios.ENUNCIADO_QUARTO_EXERCICIO.getDescrição() + "\n\n" + " Digite [5] - "
				+ EnunciadoDosExercicios.ENUNCIADO_QUINTO_EXERCICIO.getDescrição() + "\n\n";
		
		boolean isIterador = true;
		while (isIterador) {
			
			String dialog = JOptionPane.showInputDialog(null,
					modelo, "Digite sua escolha:", JOptionPane.PLAIN_MESSAGE);
			
			

			InteragirComUsuario comUsuario;
			switch (Integer.parseInt(dialog)) {
			case 1: {
				comUsuario = new ReverterOrdemService();
				comUsuario.start();
				break;
			}
			case 2: {
				comUsuario = new ExcluirLetraReptidasService();
				comUsuario.start();
				break;
			}
			case 3: {
				comUsuario = new SubstringPalindromaMaisLongaService();
				comUsuario.start();
				break;
			}
			case 4: {
				comUsuario = new PrimeiraLetraDaFraseEmMaiusculoService();
				comUsuario.start();
				break;
			}
			case 5: {
				comUsuario = new IsStringEUmAnagramaPalindromoService();
				comUsuario.start();
				break;
			}
			default:
				JOptionPane.showMessageDialog(null, "Opcao não existe.");
				isIterador = true;
			}
			
			String opcao = JOptionPane.showInputDialog(" Digite [1] - Para retornar ao menu.\n"
					+ " Digite [2] - Para continuar na interação.");
			
			if (opcao.equals("1")) {
				isIterador = false;
			}
			
			
		}

	}

}
