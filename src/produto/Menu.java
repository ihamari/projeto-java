package produto;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import produto.util.Cores;
import produto.controller.ProdutoController;
import produto.model.Bolsa;
import produto.model.Camiseta;
//import produto.model.Produto;



public class Menu {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int opcao, categoria, id, qtd;
		String nome, codigoBarras;
		String tamanho;
		String cor;
		String marca;
		float preco;
		int estoque;
		
		ProdutoController produtos = new ProdutoController();
		
		// ***********************************************TESTES**********************************************/
//		Produto p1 = new Produto(1, "Tênis Nike Just don't", "00012364", "42", "branco", "Naike", 20.0f, 5);
//		p1.reporEstoque(-2); // inválido
//		p1.reporEstoque(2); // 7
//		p1.visualizarProduto();
//		p1.compra(-2);// valor inválido
//		p1.compra(15);// Estoque insuficiente
//		p1.compra(3);// 4
//		p1.visualizarProduto();
		
		Camiseta p2 = new Camiseta(produtos.gerarID(), "Camiseta Adidas real de verdade", "00022364","M","preto", "Adidaz",20.0f,5,"v","curta");
//		p2.visualizarProduto();
//		p2.reporEstoque(-2); // inválido
//		p2.reporEstoque(2); // 7
//		p2.visualizarProduto();
//		p2.compra(-2);// valor inválido
//		p2.compra(15);// Estoque insuficiente
//		p2.compra(3);// 4
//		p2.visualizarProduto();
		
		produtos.cadastrar(p2);		
		
		Bolsa p3 = new Bolsa(produtos.gerarID(), "Bolsa Louis Vuitton", "000315648", "30 x 10 x 25 cm ", "marrom", "Luíz Vitão", 35.99f, 2, 3, "carteiro");
		produtos.cadastrar(p3);
		
		Camiseta p4 = new Camiseta(produtos.gerarID(), "Camiseta Nike Just don't", "00022364","M","preto", "Naike",20.0f,5,"v","curta");
		produtos.cadastrar(p4);
		
		
		while(true) {
			System.out.println(Cores.TEXT_PURPLE_BRIGHT + Cores.ANSI_WHITE_BACKGROUND
					+ "*********************************************************");
			System.out.println("                                                         ");
			System.out.println("                      SHEIN DO BRÁS                      ");
			System.out.println("                                                         ");
			System.out.println("*********************************************************");
			System.out.println("                                                         ");
			System.out.println("       1 - Cadastrar novo produto                        ");
			System.out.println("       2 - Listar todos os produtos                      ");
			System.out.println("       3 - Buscar produto por código                     ");
			System.out.println("       4 - Atualizar Dados do produto                    ");
			System.out.println("       5 - Remover/Desativar um produto do sistema       ");
			System.out.println("       6 - Reposição de estoque                          ");
			System.out.println("       7 - Compra realizada                              ");
			System.out.println("       8 - Sair                                          ");
			System.out.println("                                                         ");
			System.out.println("*********************************************************");
			System.out.println("Entre com a opção desejada:                              ");
			System.out.println("                                                         "
					+ Cores.TEXT_RESET);
			
			try {
				opcao = leia.nextInt();
				leia.nextLine();
			} catch (InputMismatchException e) {
				System.err.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}
			
			if(opcao == 8) {
				System.out.println(Cores.TEXT_YELLOW_BOLD + "\nShein do Brás - Mais barato impossível");
				sobre();
				leia.close();
				System.exit(0);
				
			}// chave do if
			
			switch (opcao) {
			case 1:
				System.out.println("Cadastrar novo produto\n");
				
				System.out.println("Digite o Nome do Produto");
				nome = leia.nextLine();
				
				System.out.println("Digite o Código de Barras do Produto: ");
				codigoBarras = leia.nextLine();
				
				System.out.println("Digite o Tamanho do Produto: ");
				tamanho = leia.nextLine();
				
				System.out.println("Digite a Cor do Produto: ");
				cor = leia.nextLine();
				
				System.out.println("Digite a Marca do Produto: ");
				marca = leia.nextLine();
				
				System.out.println("Digite o Preço do Produto: ");
				preco = leia.nextFloat();
				leia.nextLine();
				
				System.out.println("Digite a quantidade em estoque: ");
				estoque = leia.nextInt();
				leia.nextLine();
				
				do {
					System.out.println("Digite o Tipo de Produto (1-Camiseta ou 2-Bolsa)");
					categoria = leia.nextInt();
					leia.nextLine();
					if(categoria !=1 && categoria !=2) {
						System.out.println("Digite o uma categoria válida!");
					}
					
				}while(categoria < 1 && categoria > 2);
				
				
				
				switch(categoria) {
					case 1:
						String tipoGola;
						String comprimentoManga;
						
						System.out.println("Digite o tipo de gola: ");
						tipoGola = leia.nextLine();
						
						System.out.println("Digite o Comprimento da Manga: ");
						comprimentoManga = leia.nextLine();
						
						Camiseta camiseta = new Camiseta(produtos.gerarID(), nome, codigoBarras, tamanho, cor, marca, preco, estoque, tipoGola, comprimentoManga);
						produtos.cadastrar(camiseta);
						
						
						break;
					case 2:
						int capacidadeLitros;
						String estiloAlca;
						
						System.out.println("Digite a Capacidade em Litros: ");
						capacidadeLitros = leia.nextInt();
						leia.nextLine();
						
						System.out.println("Digite o Estilo da Alça: ");
						estiloAlca = leia.nextLine();
						
						Bolsa bolsa = new Bolsa(produtos.gerarID(), nome, codigoBarras, tamanho, cor, marca, preco, estoque, capacidadeLitros, estiloAlca);
						produtos.cadastrar(bolsa);
						
						break;
				}
				
				
				
				
				keyPress();

				break;
			case 2:
				System.out.println("Listar todos os produtos\n");
				produtos.listarTodosProdutos();
				
				keyPress();

				break;
			case 3:
				System.out.println("Buscar produto por código\n");
				System.out.println("Digite o id do Produto: ");
				id = leia.nextInt();
				leia.nextLine();
				
				produtos.procurarPorId(id);
				
				keyPress();

				break;
			case 4:
				System.out.println("Atualizar Dados do produto\n");
				System.out.println("Digite o id do Produto: ");
				id = leia.nextInt();
				leia.nextLine();
				
				//atributos da classe mãe
				System.out.println("Digite o Nome do Produto");
				nome = leia.nextLine();
				
				System.out.println("Digite o Código de Barras do Produto: ");
				codigoBarras = leia.nextLine();
				
				System.out.println("Digite o Tamanho do Produto: ");
				tamanho = leia.nextLine();
				
				System.out.println("Digite a Cor do Produto: ");
				cor = leia.nextLine();
				
				System.out.println("Digite a Marca do Produto: ");
				marca = leia.nextLine();
				
				System.out.println("Digite o Preço do Produto: ");
				preco = leia.nextFloat();
				leia.nextLine();
				
				System.out.println("Digite a quantidade em estoque: ");
				estoque = leia.nextInt();
				leia.nextLine();
				
				// classes herdeiras
				String classe;
				var buscaProduto = produtos.buscarNaCollection(id);

				if(buscaProduto != null) {
					classe = buscaProduto.getClass().getSimpleName();
					
					switch(classe) {
					case "Camiseta":
						String tipoGola;
						String comprimentoManga;
						
						System.out.println("Digite o tipo de gola: ");
						tipoGola = leia.nextLine();
						
						System.out.println("Digite o Comprimento da Manga: ");
						comprimentoManga = leia.nextLine();
						
						Camiseta camiseta = new Camiseta(id, nome, codigoBarras, tamanho, cor, marca, preco, estoque, tipoGola, comprimentoManga);
						produtos.atualizar(camiseta);
						
						
						break;
					case "Bolsa":
						int capacidadeLitros;
						String estiloAlca;
						
						System.out.println("Digite a Capacidade em Litros: ");
						capacidadeLitros = leia.nextInt();
						leia.nextLine();
						
						System.out.println("Digite o Estilo da Alça: ");
						estiloAlca = leia.nextLine();
						
						Bolsa bolsa = new Bolsa(id, nome, codigoBarras, tamanho, cor, marca, preco, estoque, capacidadeLitros, estiloAlca);
						produtos.atualizar(bolsa);
						
						break;
					}
					
				}else {
					System.out.println("O produto digitado não foi encontrado!");
				}
								
				
				keyPress();

				break;
			case 5:
				System.out.println("Remover/Desativar um produto do sistema\n");
				System.out.println("Digite o id do Produto: ");
				id = leia.nextInt();
				leia.nextLine();
				
				produtos.deletar(id);
				
				
				keyPress();

				break;
			case 6:
				System.out.println("Reposição de estoque\n");
				
				System.out.println("Digite o ID do produto:");
				id = leia.nextInt();
				leia.nextLine();
				
				
				do {
					System.out.println("Digite a qtd reestocada");
					qtd = leia.nextInt();
					leia.nextLine();
				} while (qtd<=0);
				
				produtos.repor(id, qtd);
				
				keyPress();

				break;
			case 7:
				System.out.println("Compra realizada\n");
				System.out.println("Digite o ID do produto:");
				id = leia.nextInt();
				leia.nextLine();
				
				
				do {
					System.out.println("Digite a qtd comprada");
					qtd = leia.nextInt();
					leia.nextLine();
				} while (qtd<=0);
				
				produtos.compra(id, qtd);
				
				
				keyPress();

				break;
			default:
				System.out.println("\nOpção Inválida! Escolha uma opção de 1 a 8\n");
				
				keyPress();
				break;
			}// chave do swicth
			
		}// chave do while

	} // chave do main
	
	
	public static void sobre() {
		System.out.println("\n*****************************************************");
		System.out.println("Projeto Desenvolvido por: Mariana Marie Iha");
		System.out.println("Email - ihamariana@gmail.com");
		System.out.println("github.com/ihamari");
		System.out.println("*******************************************************");
	}
	
	public static void keyPress() {
		try {
			System.out.println(Cores.TEXT_YELLOW_BRIGHT + "\n\nPressione Enter para Continuar...");
			System.in.read();
		} catch(IOException e){
			System.out.println("Você pressionou uma tecla diferente de enter!");
		}
	}

}
