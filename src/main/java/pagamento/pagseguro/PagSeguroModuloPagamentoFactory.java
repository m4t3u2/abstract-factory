package pagamento.pagseguro;

import gestorderisco.GestorDeRisco;
import gestorderisco.fcontrol.FControl;
import operadora.Operadora;
import operadora.cielo.Cielo;
import pagamento.ModuloPagamentoFactory;

public class PagSeguroModuloPagamentoFactory implements ModuloPagamentoFactory {

	@Override
	public Operadora criarOperadora() {
		return new Cielo();
	}

	@Override
	public GestorDeRisco criarGestorDeRisco() {
		return new FControl();
	}

}
