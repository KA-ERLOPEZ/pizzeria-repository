package proyecto.sistema.venta.pizzeria_api.validations;

public interface Validable<T> {

	void validar();

	void agregarValidador(Validador<T> v);
}
