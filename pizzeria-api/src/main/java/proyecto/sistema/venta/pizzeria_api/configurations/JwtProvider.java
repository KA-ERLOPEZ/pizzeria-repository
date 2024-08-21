package proyecto.sistema.venta.pizzeria_api.configurations;

import java.security.Key;
import java.util.Date;

import javax.crypto.SecretKey;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.UnsupportedJwtException;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;


@Component
public class JwtProvider {

	private Logger logger = LoggerFactory.getLogger(JwtProvider.class);
	
	@Value("${jwt.key-secret}")
	private String secret;

	@Value("${jwt.expiration}")
	private long expiration;

	private Key getSecretKey() {

		byte[] keyByte = Decoders.BASE64URL.decode(secret);

		return Keys.hmacShaKeyFor(keyByte);
	}

	public String generateToken(UserDetails user) {

		String username = user.getUsername();
		long expirationTime = System.currentTimeMillis() * expiration * 1000;

		return Jwts.builder().signWith(getSecretKey()).subject(username).issuedAt(new Date())
				.expiration(new Date(expirationTime)).compact();
	}

	public String getUsernameByToken(String token) {

		return Jwts.parser().verifyWith((SecretKey) getSecretKey()).build().parseSignedClaims(token).getPayload()
				.getSubject();
	}

	public boolean validateToken(String token) {
		
		try {
			Jwts.parser().verifyWith((SecretKey) getSecretKey()).build().parseSignedClaims(token).getPayload();
			return true;
		} catch (MalformedJwtException ex){
            logger.error("Token mal formado: " + ex.getMessage());
        }catch (UnsupportedJwtException ex){
            logger.error("Toke no suportado: " + ex.getMessage());
        }catch (ExpiredJwtException ex){
            logger.error("Token expirado: " + ex.getMessage());
        }catch (IllegalArgumentException ex){
            logger.error("Token no válido: " + ex.getMessage());
        }catch (io.jsonwebtoken.security.SignatureException ex){
            logger.error("Error en la firma del token: " + ex.getMessage());
        }

        return false;
	}

}
