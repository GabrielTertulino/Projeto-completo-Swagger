/**
 * 
 */
package br.com.distribuidora.service;

import java.util.List;

import br.com.distribuidora.model.Produto;

/**
 * @author Gabriel Tertulino
 *
 */
public interface ProdutoService {

	Produto salvar(Produto produto);
	List<Produto> listarProduto();
	void removerProduto(Produto produto);
	void removerPorId(int idProduto);
	Produto buscarPorId(int idProduto);

}