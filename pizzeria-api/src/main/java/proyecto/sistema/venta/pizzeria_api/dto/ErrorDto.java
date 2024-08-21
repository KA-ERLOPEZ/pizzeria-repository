package proyecto.sistema.venta.pizzeria_api.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ErrorDto {

	static final long serialVersionUID = 1L;

	private LocalDateTime date;
	private String message;
	private String description;

	public ErrorDto(LocalDateTime date, String message, String description) {
		super();
		this.date = date;
		this.message = message;
		this.description = description;
	}

}
