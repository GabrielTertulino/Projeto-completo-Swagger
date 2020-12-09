/**
 * 
 */
package br.com.distribuidora.exception;

/**
 * @author Gabriel Tertulino
 *
 */
public class EntidadeComDependenciasException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public EntidadeComDependenciasException(String mensagem) {
		super(mensagem);
	}
}