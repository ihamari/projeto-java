package produto.repository;
import produto.model.Produto;

public interface ProdutoRepository {
	
	// CRUD Produto
	public void procurarPorId(int numero);
	public void listarTodosProdutos();
	public void cadastrar (Produto produto);
	public void atualizar (Produto produto);
	public void deletar (int numero);
}
