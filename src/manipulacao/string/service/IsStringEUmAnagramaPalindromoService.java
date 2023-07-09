package manipulacao.string.service;

import manipulacao.string.encapsulamento.InteragirComUsuario;
import manipulacao.string.model.IsStringEUmAnagrama;
import manipulacao.string.utils.EnunciadoDosExercicios;

public class IsStringEUmAnagramaPalindromoService implements InteragirComUsuario {

	@Override
	public void start() {
		JOptionPaneService jOptionService = new JOptionPaneService();
		jOptionService.executar(EnunciadoDosExercicios.TITULO_DESAFIO.getDescrição(),
				EnunciadoDosExercicios.ENUNCIADO_QUINTO_EXERCICIO.getDescrição(), new IsStringEUmAnagrama());

	}

}
