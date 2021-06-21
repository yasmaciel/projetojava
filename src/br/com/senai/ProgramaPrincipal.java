package br.com.senai;

import java.util.ArrayList;
import java.util.List;

import br.com.senai.pessoa.Pessoa;
import br.com.senai.pessoa.PessoaController;
import br.com.senai.produto.Produto;
import br.com.senai.produto.ProdutoController;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<>();
		List<Produto> produto = new ArrayList<>();
		
		Produto produto2 = new Produto(
				"Abacate",
				2.5,
				35,2.5 * 35
				);
		produto.add(produto2);


		PessoaController pessoaController = new PessoaController();
		ProdutoController produtoController = new ProdutoController();
 
		boolean sair = false;

		do{
			pessoaController.menu();

			int opcao = pessoaController.leOpcao();

			switch(opcao){
				case 1:
					pessoas.add(pessoaController.cadastrarPessoa());
					break;

				case 2:
					pessoaController.listarPessoas(pessoas);
					break;
					
				case 3:
					pessoaController.editarPessoa(pessoas);
					break;
					
				case 4:
					pessoaController.excluirPessoa(pessoas);
					break;
					
				case 5:
					produto.add(produtoController.cadastrarProduto());
					break;
					
				case 6:
					produtoController.listarProdutos(produto);
					break;
					
				case 7:
					produtoController.editarProduto(produto);
					break;
				
				case 8:
					produtoController.excluirProduto(produto);
					break;
					
					
				case 9:
					sair = true;
					break;

				default:
					System.out.println("Opção inválida!");
					break;
			}
		}while(!sair);

		System.out.println("Sistema finalizado!");
	}

}
