package br.com.roberto.payment.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.roberto.payment.services.EntregaService;
import br.com.roberto.payment.services.ImpostoService;
import br.com.roberto.payment.services.PagamentoService;
import br.com.roberto.payment.services.enums.Estado;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class PagamentoServiceTest {
	
//	@Inject
//	PagamentoService pagamentoService;
	
	@Test
	public void deveRetornarValorPagamento() {
		EntregaService entregaService = new EntregaService();
		ImpostoService impostoService = new ImpostoService();
		PagamentoService pagamentoService = new PagamentoService(entregaService, impostoService);
		assertEquals(330.1, pagamentoService.precoFinal(300.0, Estado.DF));
	}

}
