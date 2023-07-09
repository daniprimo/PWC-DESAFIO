package manipulacao.string.service;

import javax.swing.JOptionPane;

import manipulacao.string.encapsulamento.DesafioPWC;
import manipulacao.string.encapsulamento.PalindromaService;

public class JOptionPaneService {

	public void executar(String titulo, String enunciado, DesafioPWC instancia) {

		try {
			String string = JOptionPane.showInputDialog(null, enunciado, titulo, JOptionPane.PLAIN_MESSAGE);
			String invertida = instancia.executar(string);
			JOptionPane.showMessageDialog(null,
					"Dado que foi inserido: " + string + "\n\n Dado invertido: " + invertida);
			registrandoEmConsole(enunciado, string, invertida);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao iserir dado");
		}

	}


	public void registrandoEmConsole(String enunciado, String inserido, String invertida) {
		System.out.println("--------------------------------------------------------------");
		System.out.println("");

		System.out.println("  Utilizando o system interação com usuario, atividades baseadas no Desafio PWC\n\n");

		System.out.println("  Enunciado: " + enunciado);
		System.out.println("  Input: " + inserido);
		System.out.println("  Output: " + invertida);

		System.out.println("");
		System.out.println("--------------------------------------------------------------");
	}

}
