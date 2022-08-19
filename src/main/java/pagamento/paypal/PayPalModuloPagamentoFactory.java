package pagamento.paypal;

import gestorderisco.GestorDeRisco;
import gestorderisco.clearsale.ClearSale;
import operadora.Operadora;
import operadora.redecard.Redecard;
import pagamento.ModuloPagamentoFactory;

public class PayPalModuloPagamentoFactory implements ModuloPagamentoFactory {

	@Override
	public Operadora criarOperadora() {
		return new Redecard();
	}

	@Override
	public GestorDeRisco criarGestorDeRisco() {
		return new ClearSale();
	}

}
