package proyecto.sistema.venta.pizzeria_api;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PizzeriaApiApplication {

	@Bean
	public ModelMapper mapper(){
		return new ModelMapper();
	}
	public static void main(String[] args) {
		SpringApplication.run(PizzeriaApiApplication.class, args);
	}

}
