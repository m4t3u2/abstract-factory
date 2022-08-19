package gestorderisco.fcontrol;

import java.math.BigDecimal;

import gestorderisco.AlertaDeRiscoException;
import gestorderisco.GestorDeRisco;

public class FControl implements GestorDeRisco {

	@Override
	public void avaliarRisco(String cartao, BigDecimal valor) throws AlertaDeRiscoException {
		if (cartao.startsWith("7777")) {
			throw new AlertaDeRiscoException("Cartão suspeito!");
		}
	}

}
