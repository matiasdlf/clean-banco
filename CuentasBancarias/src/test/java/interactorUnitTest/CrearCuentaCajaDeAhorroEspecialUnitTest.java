package interactorUnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import interactor.CrearCuentaCajaDeAhorroEspecialUseCase;
import modelo.Cliente;
import modelo.CuentaCajaDeAhorroEspecial;
import repositorio.ICuentaCajaDeAhorroEspecialRepositorio;

class CrearCuentaCajaDeAhorroEspecialUnitTest {

	@Test
	void crearCuentaCajaDeAhorroEspecial_CuentaCajaDeAhorroEspecialNoExiste_CuentaCreado() {
		ICuentaCajaDeAhorroEspecialRepositorio elRepositorioCuentaDeCajaAhorroEspecial = new RepositorioCuentaCajaDeAhorroEspecial();
		Cliente elCliente = Cliente.instancia(1, "Perez", "Juan", "20-12345678-4", "San Martin 100");
		CuentaCajaDeAhorroEspecial laCuentaCajaDeAhorroEspecial = CuentaCajaDeAhorroEspecial.instancia("1", elCliente);
		CrearCuentaCajaDeAhorroEspecialUseCase crearCrearCuentaCajaDeAhorroEspecialUseCase = new CrearCuentaCajaDeAhorroEspecialUseCase(
				elRepositorioCuentaDeCajaAhorroEspecial);

		boolean resultado = crearCrearCuentaCajaDeAhorroEspecialUseCase.CrearCuentaCajaDeAhorroEspecial(laCuentaCajaDeAhorroEspecial);
		assertTrue(resultado);

	}

	@Test
	void crearCuentaCajaDeAhorroEspecial_CuentaCajaDeAhorroEspecialExiste_CuentaNoCreado() {
		ICuentaCajaDeAhorroEspecialRepositorio elRepositorioCuentaDeCajaAhorroEspecial = new RepositorioCuentaCajaDeAhorroEspecial();
		Cliente elCliente = Cliente.instancia(1, "Perez", "Juan", "20-12345678-4", "San Martin 100");
		CuentaCajaDeAhorroEspecial laCuentaCajaDeAhorroEspecial = CuentaCajaDeAhorroEspecial.instancia("1", elCliente);
		CrearCuentaCajaDeAhorroEspecialUseCase crearCrearCuentaCajaDeAhorroEspecialUseCase = new CrearCuentaCajaDeAhorroEspecialUseCase(
				elRepositorioCuentaDeCajaAhorroEspecial);

		boolean resultado = crearCrearCuentaCajaDeAhorroEspecialUseCase
				.CrearCuentaCajaDeAhorroEspecial(laCuentaCajaDeAhorroEspecial);
		assertTrue(resultado);

	}

}

class RepositorioCuentaCajaDeAhorroEspecial implements ICuentaCajaDeAhorroEspecialRepositorio {

	public boolean resultado;

	@Override
	public boolean crearCuentaCajaDeAhorroEspecial(CuentaCajaDeAhorroEspecial persCuentaCajaDeAhorroEspecial) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean modificarCuentaCajaDeAhorroEspecial(CuentaCajaDeAhorroEspecial persCuentaCajaDeAhorroEspecial) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean guardarCajaAhorroEspecial(CuentaCajaDeAhorroEspecial nuevaCuenta) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean consultarCuentaCajaDeAhorroEspecial(CuentaCajaDeAhorroEspecial persCuentaCajaDeAhorroEspecial) {
		// TODO Auto-generated method stub
		return resultado;
	}
}
