package manipulacao.string.service;

import manipulacao.string.encapsulamento.InteragirComUsuario;
import manipulacao.string.model.InverterOrdemDaFrase;
import manipulacao.string.utils.EnunciadoDosExercicios;

public class ReverterOrdemService implements InteragirComUsuario {

	@Override
	public void start() {
		JOptionPaneService jOptionService = new JOptionPaneService();
		jOptionService.executar(EnunciadoDosExercicios.TITULO_DESAFIO.getDescrição(),
				EnunciadoDosExercicios.ENUNCIADO_PRIMEIRO_EXERCICIO.getDescrição(), new InverterOrdemDaFrase());
	
	}
	

}
