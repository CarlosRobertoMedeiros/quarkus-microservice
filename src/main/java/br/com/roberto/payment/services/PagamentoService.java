package br.com.roberto.payment.services;

import br.com.roberto.payment.services.enums.Estado;

public class PagamentoService {

	private EntregaService entregaService;
	
	private ImpostoService impostoService;

	public PagamentoService(EntregaService entregaService, ImpostoService impostoService) {
		super();
		this.entregaService = entregaService;
		this.impostoService = impostoService;
	}

	public Double precoFinal(Double custo, Estado estado) {
		return custo + entregaService.valorTaxaDeAcordoCom(estado)
					 + impostoService.valorImposto(custo);
	}

}
