package interactor;

import modelo.Cliente;
import repositorio.IClienteRepositorio;

public class verificarClienteUseCase {

	private IClienteRepositorio elRepositorio;

	public verificarClienteUseCase(IClienteRepositorio elRepositorio) {
		this.elRepositorio = elRepositorio;
	}
	
	public boolean verificarCliente(Cliente clienteAVerificar){
		if(elRepositorio.verificarCliente(clienteAVerificar.getCuil(), clienteAVerificar.getApellido(), clienteAVerificar.getNombre() ) ) {
			return true;
		}
		return false;
		
		
	}

}