package proyecto.sistema.venta.pizzeria_api.configurations.exeptions;

public class ConflictException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public ConflictException(String message) {
		super(message);
	}

}
