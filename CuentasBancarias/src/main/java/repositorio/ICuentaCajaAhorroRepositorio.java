package repositorio;

import modelo.CuentaCajaAhorro;

public interface ICuentaCajaAhorroRepositorio {
	public boolean crearCuentaCajaDeAhorro(CuentaCajaAhorro persCuentaCajaDeAhorro);

	public boolean modificarCuentaCajaDeAhorro(CuentaCajaAhorro persCuentaCajaDeAhorro);

}