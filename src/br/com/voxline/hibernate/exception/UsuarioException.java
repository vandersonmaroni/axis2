package br.com.voxline.hibernate.exception;

public class UsuarioException extends RuntimeException{
	private static final long serialVersionUID = 3366787689394706393L;

	public String getMessage(String mensagem) {
		return mensagem;
	}
}
