package pagamento;

import gestorderisco.GestorDeRisco;
import operadora.Operadora;

public interface ModuloPagamentoFactory {

	public Operadora criarOperadora();

	public GestorDeRisco criarGestorDeRisco();

}
