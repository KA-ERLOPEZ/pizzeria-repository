package proyecto.sistema.venta.pizzeria_api.services;

import java.util.List;

public interface GenericService<T, PK> {

	T getById(PK id);
	
	T save(T entity);
	
	T update(T entity);
	
	void deleteById(PK id);
	
	void delete(T entity);
	
	List<T>getAll();
}
