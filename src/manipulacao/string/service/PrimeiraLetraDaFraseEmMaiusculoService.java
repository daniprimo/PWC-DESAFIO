package manipulacao.string.service;

import manipulacao.string.encapsulamento.InteragirComUsuario;
import manipulacao.string.model.PrimeiraLetraDaFraseEmMaiuscula;
import manipulacao.string.utils.EnunciadoDosExercicios;

public class PrimeiraLetraDaFraseEmMaiusculoService implements InteragirComUsuario {

	@Override
	public void start() {
		JOptionPaneService jOptionService = new JOptionPaneService();
		jOptionService.executar(EnunciadoDosExercicios.TITULO_DESAFIO.getDescrição(),
				EnunciadoDosExercicios.ENUNCIADO_QUARTO_EXERCICIO.getDescrição(), new PrimeiraLetraDaFraseEmMaiuscula());

	}

}
