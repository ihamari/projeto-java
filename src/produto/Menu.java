package produto;

import java.util.Scanner;
import produto.util.Cores;



public class Menu {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int opcao;
		
		while(true) {
			System.out.println(Cores.TEXT_YELLOW_BOLD + Cores.ANSI_BLACK_BACKGROUND
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
			
			opcao = leia.nextInt();
			
			if(opcao == 8) {
				System.out.println(Cores.TEXT_YELLOW_BOLD + "\nShein do Brás - Mais barato impossível");
				sobre();
				leia.close();
				System.exit(0);
				
			}// chave do if
			
			switch (opcao) {
			case 1:
				System.out.println("Cadastrar novo produto\n\n");

				break;
			case 2:
				System.out.println("Listar todos os produtos\n\n");

				break;
			case 3:
				System.out.println("Buscar produto por código\n\n");

				break;
			case 4:
				System.out.println("Atualizar Dados do produto\n\n");

				break;
			case 5:
				System.out.println("Remover/Desativar um produto do sistema\n\n");

				break;
			case 6:
				System.out.println("Reposição de estoque\n\n");

				break;
			case 7:
				System.out.println("Compra realizada\n\n");

				break;
			default:
				System.out.println("\nOpção Inválida! Escolha uma opção de 1 a 8\n");
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

}
