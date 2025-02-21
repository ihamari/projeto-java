package produto.controller;

import java.util.ArrayList;

import produto.model.Produto;
import produto.repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {
	
	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	int id = 0;

	
	
	@Override
	public void procurarPorId(int id) {
		var produto = buscarNaCollection(id);
		
		if (produto != null)
			produto.visualizarProduto();
		else System.err.println("Produto de ID "+ id + " não foi encontrado");
		
	}

	@Override
	public void listarTodosProdutos() {
		listaProdutos.forEach(produto -> produto.visualizarProduto());
		
	}

	@Override
	public void cadastrar(Produto produto) {
		listaProdutos.add(produto);
		System.out.println("\nO produto: " + produto.getNome()
				+ "\nid: " + produto.getIdProduto()
				+ "\n Foi registrado com sucesso!");
		
	}

	@Override
	public void atualizar(Produto produto) {
		var buscaProduto = buscarNaCollection(produto.getIdProduto());
				
		if(buscaProduto != null) {
			listaProdutos.set(listaProdutos.indexOf(buscaProduto), produto);
			System.out.println("\nO produto número: " + produto.getIdProduto() + " foi atualizada com sucesso!");
		}else {
			System.out.println("\nO produto número: " + produto.getIdProduto() + " não foi encontrada");
		}
		
	}

	@Override
	public void deletar(int id) {
		var produto = buscarNaCollection(id);
		
		if (produto != null) {
			if (listaProdutos.remove(produto) == true)
				System.out.println("\nProduto de id:"+ id + " foi deletado com sucesso!");
		} else 
			System.out.println("\nProduto de id:"+ id + " não foi encontrado!");
		
		
	}
	
	
	public int gerarID() {
		return ++ id;
	}
	
	public Produto buscarNaCollection(int id) {
		for (var produto: listaProdutos) {
			if (produto.getIdProduto() == id) {
				return produto;
			}
		}
		return null;
	}
	
	
	public void repor (int id, int qtd) {
		var produto = buscarNaCollection(id);
		
		if(produto != null) {
			produto.reporEstoque(qtd);
			System.out.println("\nEstoque do produto número: " + id + " foi atualizada com sucesso!");
		}else {
			System.out.println("\nO produto número: " + id + " não foi encontrado");
		}
	}
	
	
	public void compra(int id, int qtd) {
		var produto = buscarNaCollection(id);
		
		if(produto != null) {
			if (produto.compra(qtd)== true) 
				System.out.println("\nCompra registrada com sucesso!"
						+ "\nEstoque do produto número: " + id + " foi atualizada com sucesso");
		}else {
			System.out.println("\nO produto número: " + id + " não foi encontrado");
		}
	}
	
	
	
	

}
