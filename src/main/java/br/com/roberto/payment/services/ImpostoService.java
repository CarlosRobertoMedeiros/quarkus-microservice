package br.com.roberto.payment.services;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ImpostoService {
	
	public Double valorImposto(Double valor) {
		return valor * 0.1;
	}
}
