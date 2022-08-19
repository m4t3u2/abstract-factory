package pagamento;

import java.math.BigDecimal;

import gestorderisco.AlertaDeRiscoException;
import gestorderisco.GestorDeRisco;
import operadora.CapturaNaoAutorizadaException;
import operadora.Operadora;

public class Pagamento {

	private Operadora operadora;
	private GestorDeRisco gestorDeRisco;

	public Pagamento(ModuloPagamentoFactory moduloPagamentoFactory) {
		this.operadora = moduloPagamentoFactory.criarOperadora();
		this.gestorDeRisco = moduloPagamentoFactory.criarGestorDeRisco();
	}

	public Long autorizar(String cartao, BigDecimal valor) throws CapturaNaoAutorizadaException, AlertaDeRiscoException {
		this.operadora.capturar(cartao, valor);
		this.gestorDeRisco.avaliarRisco(cartao, valor);
		return this.operadora.confirmar();
	}

}
