package produto.model;

public class Camiseta extends Produto{
	
	private String tipoGola;
	private String comprimentoManga;
	
	// Construtor
	public Camiseta(int idProduto, String nome, String codigoDeBarras, String tamanho, String cor, String marca,
			float preco, int estoque, String tipoGola, String comprimentoManga) {
		super(idProduto, nome, codigoDeBarras, tamanho, cor, marca, preco, estoque);
		this.tipoGola = tipoGola;
		this.comprimentoManga = comprimentoManga;
	}
	
	//Getters and Setters
	public String getTipoGola() {
		return tipoGola;
	}
	public void setTipoGola(String tipoGola) {
		this.tipoGola = tipoGola;
	}
	public String getComprimentoManga() {
		return comprimentoManga;
	}
	public void setComprimentoManga(String comprimentoManga) {
		this.comprimentoManga = comprimentoManga;
	}
	
	@Override
	public void visualizarProduto() {
		super.visualizarProduto();
		System.out.println("Tipo de gola: " + this.tipoGola);
		System.out.println("Comprimento das manga: " + this.comprimentoManga);
	}
	
	
	
}
