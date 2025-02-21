package produto.model;

public abstract class Produto {
	
	private int idProduto;
	private String nome;
	private String codigoDeBarras;
	private String tamanho;
	private String cor;
	private String marca;
	private float preco;
	private int estoque;
	
	//construtor
	public Produto(int idProduto, String nome, String codigoDeBarras, String tamanho, String cor, String marca,
			float preco, int estoque) {
		super();
		this.idProduto = idProduto;
		this.nome = nome;
		this.codigoDeBarras = codigoDeBarras;
		this.tamanho = tamanho;
		this.cor = cor;
		this.marca = marca;
		this.preco = preco;
		this.estoque = estoque;
	}


	//GEtters and Setters
	public int getIdProduto() {
		return idProduto;
	}


	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCodigoDeBarras() {
		return codigoDeBarras;
	}


	public void setCodigoDeBarras(String codigoDeBarras) {
		this.codigoDeBarras = codigoDeBarras;
	}


	public String getTamanho() {
		return tamanho;
	}


	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public float getPreco() {
		return preco;
	}


	public void setPreco(float preco) {
		this.preco = preco;
	}


	public int getEstoque() {
		return estoque;
	}


	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}


	public boolean compra(int quantidade) {

		if(quantidade<=0){
			System.out.print("\nValor inválido\n");
			return false;	
		}
		else if(this.getEstoque() < quantidade){
			System.out.print("\nEstoque Insuficiente!\n");
			return false;			
		}
		else{
			this.setEstoque(this.getEstoque() - quantidade);
			System.out.print("\nCompra registrada com sucesso!\n"
					+ "Estoque atual:" + this.getEstoque());
			return true;		
		}
	}
	
	public boolean reporEstoque(int quantidade) {
		if(quantidade<=0){
			System.out.print("\nValor inválido\n");
			return false;	
		}
		else{
			this.setEstoque(this.getEstoque() + quantidade);
			System.out.print("\nEstoque atualizado com sucesso!\n"
					+ "Estoque atual:" + this.getEstoque());
			
			return true;
		}
		
	}
	
	public void visualizarProduto() {
		
		System.out.println("\n\n***********************************************************");
		System.out.println("PRODUTO - ID:"+ this.idProduto);
		System.out.println("***********************************************************");
		System.out.println("Nome do Produto: " + nome);
		System.out.println("Código de Barras: " + this.codigoDeBarras);
		System.out.println("Marca: " + this.marca);
		System.out.println("Preço: " + this.preco);
		System.out.println("Estoque: " + this.estoque);
		
	}
	
}
