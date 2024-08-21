package proyecto.sistema.venta.pizzeria_api.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class GeneratePassword {

	
	public static void main(String [] args) {
		
		PasswordEncoder encoder = new BCryptPasswordEncoder();
		
		System.out.println(encoder.encode("password"));
	}
}
