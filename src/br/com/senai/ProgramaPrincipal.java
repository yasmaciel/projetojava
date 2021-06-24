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
			pessoaController.menu();

			int opcao = pessoaController.leOpcao();

			switch(opcao){
				case 1:
					pessoaController.menu(pessoa);
					break;

				
				case 2:
					produtoController.menu(produto);
					
				case 3:
					vendaController.menu(pessoas,vendas,produto);
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
	public void menu() {
		System.out.println("\n--- MENU ---");
		System.out.println("1) Cadastrar pessoa");
		System.out.println("5) Cadastrar produto");
		System.out.println("10)Cadastrar venda");
		System.out.println("11) Sair do sistema");
		System.out.println("-------------------");
}
}
