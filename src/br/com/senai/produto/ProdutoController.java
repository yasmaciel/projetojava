package br.com.senai.produto;

import java.util.List;
import java.util.Scanner;

import br.com.senai.pessoa.Pessoa;


public class ProdutoController {
	
	private Scanner tec;

	public ProdutoController(){
		tec = new Scanner(System.in);
	}

	public int leOpcao(){
		System.out.print("> ");
		return tec.nextInt();
	}

	public void menu(){
		System.out.println("\n--- MENU ---");
		System.out.println("1) Cadastrar produto");
		System.out.println("2) Listar produtos cadastradas");
		System.out.println("9) Sair do sistema");
		System.out.println("-------------------");
	}

	public Produto cadastrarProduto(){
		Produto produto = new Produto();

		System.out.println("--- CADASTRAR PRODUTO ---");
		System.out.print("Informe o nome do produto: ");
		tec.nextLine();
		produto.setNomeDoProduto(tec.nextLine());

		System.out.print("Informe o valor por unidade: ");
		produto.setValorUnitarioDoProduto(tec.nextInt());

		System.out.print("Informe a quantidade que deseja: ");
		produto.setQuantidadeDoProduto(tec.nextInt());
		
		System.out.print("Informe o pais: ");
		tec.nextLine();
		produto.setValorTotalDoProduto(tec.nextInt());
		
		
		
		return produto;
	}
	
	public List<Produto> listarProdutos(List<Produto> produtos){
		System.out.println("--- PRODUTOS CADASTRADAS ---");
		
		System.out.printf("| %20s | %6s | %5s | %6s |\n", 
				"Produto", "Valor Unitario Do Produto","Quantidade do Produto", "Volor total do produto" );
		
		for(int i = 0; i < produtos.size(); i ++){
			System.out.printf("| %20s | %6.2f | %5d | %6.2f | \n",
					produtos.get(i).getValorUnitarioDoProduto(),
					produtos.get(i).getQuantidadeDoProduto(),
					produtos.get(i).getValorTotalDoProduto(),
					produtos.get(i).getNomeDoProduto());
			
	
			
		}
		return produtos;
	}
}
		
		 
		
		
		
		
		
	



