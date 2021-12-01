package br.com.roberto.payment.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.roberto.payment.services.EntregaService;
import br.com.roberto.payment.services.ImpostoService;
import br.com.roberto.payment.services.PagamentoService;
import br.com.roberto.payment.services.enums.Estado;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class PagamentoServiceTest {

	private EntregaService entregaService;
	private ImpostoService impostoService;
	private static final Double VALOR_DO_PRODUTO = 300.0;
	
	@BeforeEach
	public void setUp() {
		entregaService = new EntregaService();
		impostoService = new ImpostoService();		
	}
	
	@Test
	public void deveRetornarValorPagamentoDF() {
		PagamentoService pagamentoService = new PagamentoService(entregaService, impostoService);
		assertEquals(330.1, pagamentoService.precoFinal(VALOR_DO_PRODUTO, Estado.DF));
	}
	
	@Test
	public void deveRetornarValorPagamentoSP() {
		PagamentoService pagamentoService = new PagamentoService(entregaService, impostoService);
		assertEquals(330.2, pagamentoService.precoFinal(VALOR_DO_PRODUTO, Estado.SP));
	}
	
	@Test
	public void deveRetornarValorPagamentoOutros() {
		PagamentoService pagamentoService = new PagamentoService(entregaService, impostoService);
		assertEquals(330.25, pagamentoService.precoFinal(VALOR_DO_PRODUTO, Estado.OUTROS));
	}

}
