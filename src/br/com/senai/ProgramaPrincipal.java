package br.com.senai;

import java.util.ArrayList;
import java.util.List;

import br.com.senai.loja.Venda;
import br.com.senai.loja.VendaController;
import br.com.senai.pessoa.Pessoa;
import br.com.senai.pessoa.PessoaController;
import br.com.senai.produto.Produto;
import br.com.senai.produto.ProdutoController;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<>();
		List<Produto> produto = new ArrayList<>();
		List<Venda> vendas = new ArrayList<Venda>();
		
		Produto produto2 = new Produto(
				"Abacate",
				2.5,
				35,2.5 * 35
				);
		produto.add(produto2);


		PessoaController pessoaController = new PessoaController();
		ProdutoController produtoController = new ProdutoController();
		VendaController vendaController = new VendaController();
 
		boolean sair = false;

		do{
			menu();

			int opcao = pessoaController.leOpcao();

			switch(opcao){
				case 1:
					pessoaController.menu(pessoas);
					break;

				
				case 2:
					produtoController.menu(produto);
					
				case 3:
					vendaController.menu(vendas, produto, pessoas);
					break;
					 
					
		case 4:
					sair = true;
					break;

				default:
					System.out.println("Opção inválida!");
					break;
			}
		}while(!sair);

		System.out.println("Sistema finalizado!");
	}
	public static void menu() {
		System.out.println("\n--- MENU PRINCIPAL ---");
		System.out.println("1) Pessoa");
		System.out.println("2) Produto");
		System.out.println("3) Venda");
		System.out.println("4) Sair do sistema");
		System.out.println("-------------------");
}
}
