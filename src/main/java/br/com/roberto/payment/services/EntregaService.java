package br.com.roberto.payment.services;

import javax.enterprise.context.ApplicationScoped;

import br.com.roberto.payment.services.enums.Estado;

@ApplicationScoped
public class EntregaService {

	public Double valorTaxaDeAcordoCom(Estado estado) {
		Double taxa = null;
		switch (estado) {
			case DF: taxa = 0.10; break;
			case SP: taxa = 0.20; break;
			case OUTROS: taxa = 0.25; break;
			default: taxa = 0.30; break;
		}
		return taxa;
	}
	
	

}
