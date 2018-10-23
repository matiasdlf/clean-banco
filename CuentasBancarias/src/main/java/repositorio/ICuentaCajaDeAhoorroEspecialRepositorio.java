package repositorio;

import modelo.CuentaCajaDeAhorroComun;
import modelo.CuentaCajaDeAhorroEspecial;

public interface ICuentaCajaDeAhoorroEspecialRepositorio {
	public boolean crearCuentaCajaDeAhorroEspecial(CuentaCajaDeAhorroEspecial persCuentaCajaDeAhorroEspecial);
	public boolean modificarCuentaCajaDeAhorroEspecial(CuentaCajaDeAhorroComun persCuentaCajaDeAhorroEspecial);
	
}
