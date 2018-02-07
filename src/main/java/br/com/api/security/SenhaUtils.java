package br.com.api.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * 
 * @author rodolfo.ruffer
 *
 */
public class SenhaUtils {
	
	/**
	 * Método que gera hash da senha utilizando BCrypt.
	 * @param senha
	 * @return
	 */
	public static String gerarBCrypt(String senha) {
		
		if(senha == null) {
			return senha;
		}
		
		return new BCryptPasswordEncoder().encode(senha);
	}
	
	public static boolean senhaValida(String senha, String senhaEncoded) {
		return new BCryptPasswordEncoder().matches(senha, senhaEncoded);
		
	}

}
