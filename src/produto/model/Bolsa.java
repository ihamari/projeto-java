package produto.model;

public class Bolsa extends Produto {
	
	private int capacidadeLitros;
	private String estiloAlca;
	
	//Contrutor
	public Bolsa(int idProduto, String nome, String codigoDeBarras, String tamanho, String cor, String marca,
			float preco, int estoque, int capacidadeLitros, String estiloAlca) {
		super(idProduto, nome, codigoDeBarras, tamanho, cor, marca, preco, estoque);
		this.capacidadeLitros = capacidadeLitros;
		this.estiloAlca = estiloAlca;
	}

	
	//Getter e Setters

	public int getCapacidadeLitros() {
		return capacidadeLitros;
	}

	public void setCapacidadeLitros(int capacidadeLitros) {
		this.capacidadeLitros = capacidadeLitros;
	}

	public String getEstiloAlca() {
		return estiloAlca;
	}

	public void setEstiloAlca(String estiloAlca) {
		this.estiloAlca = estiloAlca;
	}
	

	@Override
	public void visualizarProduto() {
		super.visualizarProduto();
		System.out.println("Capacidade em litros: " + this.capacidadeLitros);
		System.out.println("Estilo alça: " + this.estiloAlca);
	}
	
	
	
}
