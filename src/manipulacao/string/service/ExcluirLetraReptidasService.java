package manipulacao.string.service;

import manipulacao.string.encapsulamento.InteragirComUsuario;
import manipulacao.string.model.ExcluirLetraReptidaDeUmaFrase;
import manipulacao.string.utils.EnunciadoDosExercicios;

public class ExcluirLetraReptidasService implements InteragirComUsuario {

	@Override
	public void start() {
		JOptionPaneService jOptionService = new JOptionPaneService();
		jOptionService.executar(EnunciadoDosExercicios.TITULO_DESAFIO.getDescrição(),
				EnunciadoDosExercicios.ENUNCIADO_SEGUNDO_EXERCICIO.getDescrição(), new ExcluirLetraReptidaDeUmaFrase());

	}

}
