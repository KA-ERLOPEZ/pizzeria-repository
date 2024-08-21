package proyecto.sistema.venta.pizzeria_api.configurations.exeptions;

import java.net.http.HttpHeaders;
import java.time.LocalDateTime;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import proyecto.sistema.venta.pizzeria_api.dto.ErrorDto;

@RestControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler{

	
	@ExceptionHandler(CustomException.class)
	public ResponseEntity<ErrorDto> notFoundException(CustomException ex, WebRequest request){
			
		return new ResponseEntity<>(new ErrorDto(
				LocalDateTime.now(), 
				ex.getMessage(), 
				request.getDescription(false)),HttpStatus.NOT_FOUND );
	}
	
	@ExceptionHandler(ConflictException.class)
	public ResponseEntity<ErrorDto> confictException(ConflictException ex, WebRequest request){
			
		return new ResponseEntity<>(new ErrorDto(
				LocalDateTime.now(), 
				ex.getMessage(), 
				request.getDescription(false)),HttpStatus.CONFLICT);
	}
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDto>internalServerException(Exception ex, WebRequest request){
		
		return new ResponseEntity<ErrorDto>(new ErrorDto(
				LocalDateTime.now(),
				ex.getMessage(), 
				request.getDescription(false)), HttpStatus.INTERNAL_SERVER_ERROR);
	}
 
	
	
	protected ResponseEntity<Object> handleMethodArgumentNotValid(
			MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {

		String message = ex.getBindingResult()
				.getAllErrors().stream().map(error -> {
					
					return error.getObjectName()+": "+error.getDefaultMessage();
				}).collect(Collectors.joining());
		
	return new ResponseEntity<>(new ErrorDto(LocalDateTime.now(), 
			message, 
			request.getDescription(false)), HttpStatus.BAD_REQUEST);
	}
	
}
