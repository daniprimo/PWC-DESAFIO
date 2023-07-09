package manipulacao.string.service;

import manipulacao.string.encapsulamento.InteragirComUsuario;
import manipulacao.string.model.SubstringPalindromaMaisLonga;
import manipulacao.string.utils.EnunciadoDosExercicios;

public class SubstringPalindromaMaisLongaService implements InteragirComUsuario {

	@Override
	public void start() {
		JOptionPaneService jOptionService = new JOptionPaneService();
		jOptionService.executar(EnunciadoDosExercicios.TITULO_DESAFIO.getDescrição(),
				EnunciadoDosExercicios.ENUNCIADO_TERCEIRO_EXERCICIO.getDescrição(), new SubstringPalindromaMaisLonga());
	}

}
