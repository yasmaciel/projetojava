package br.com.senai.produto;

import java.util.List;
import java.util.Scanner;




public class ProdutoController {
	
	private Scanner tec;

	public ProdutoController(){
		tec = new Scanner(System.in);
	}
	
		

	public Produto cadastrarProduto(){
		Produto produto = new Produto();

		System.out.println("--- CADASTRAR PRODUTO ---");
		System.out.print("Informe o nome do produto: ");
		produto.setNomeDoProduto(tec.next());

		System.out.print("Informe o valor por unidade: ");
		produto.setValorUnitarioDoProduto(tec.nextDouble());

		System.out.print("Informe a quantidade que deseja: ");
		produto.setQuantidadeDoProduto(tec.nextInt());
		produto.setValorTotalDoProduto(produto.getQuantidadeDoProduto()*produto.getValorUnitarioDoProduto());

		return produto;
	}
	
	public List<Produto> listarProdutos(List<Produto> produtos){
		if(produtos.isEmpty()) {
			System.out.println("Não possui produtos cadastrados");
			return null;
		}
		
		System.out.println("--- PRODUTOS CADASTRADAS ---");
		
		System.out.printf("| %2s | %10s | %10s | %10s | %10s |\n", 
				"Id","Produto", "Valor Unitario Do Produto","Quantidade do Produto", "Volor total do produto" );
		
		for(int i = 0; i < produtos.size(); i ++){
			System.out.printf("|%2d | %10s | %25f | %21d | %22f | \n",
					i + 1 ,
					produtos.get(i).getNomeDoProduto(),
					produtos.get(i).getValorUnitarioDoProduto(),
					produtos.get(i).getQuantidadeDoProduto(),
					produtos.get(i).getValorTotalDoProduto());
			
	
			
		}
		return produtos;
	}
	
	public List<Produto> editarProduto(List<Produto> produtos) {
		Produto produto = new Produto();
		listarProdutos(produtos);
		
		if(produtos.isEmpty()) {
			return null;
			
		}
		
		System.out.println("Informe o id do produto para editar: ");
		int idProduto = tec.nextInt() - 1;
		
		System.out.println("1) Nome do produto");
		System.out.println("2) Quantidade de produto");
		System.out.println("3) Valor unitário do produto");
		System.out.println("Informe o campo para ser editado");
		int opcao = tec.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println("-----EDITAR O NOME DO PRODUTO-----");
			System.out.println("Informe o novo nomr do produto: ");
			produto.setNomeDoProduto(tec.next());
			
		produto.setQuantidadeDoProduto(produtos.get(idProduto).getQuantidadeDoProduto());
		produto.setValorUnitarioDoProduto(produtos.get(idProduto).getValorUnitarioDoProduto());
		produto.setValorTotalDoProduto(produtos.get(idProduto).getValorTotalDoProduto());
		
			produtos.set(idProduto, produto);
		
			break;
			
		case 2:
			System.out.println("------EDITAR QUANTIDADE DO PRODUTO-------");
			System.out.println("Informe a quantidade de produto: ");
			produto.setNomeDoProduto(produtos.get(idProduto).getNomeDoProduto());
			produto.setValorUnitarioDoProduto(produtos.get(idProduto).getValorUnitarioDoProduto());
			
			produto.setValorTotalDoProduto(
					produto.getValorUnitarioDoProduto()* produto.getQuantidadeDoProduto());
			
				produtos.set(idProduto, produto);
			break;
			
		case 3:
			System.out.println("---------EDITAR O VALOR UNITÁRIO DO PRODUTO---------");
			System.out.println("Informe um novo valor unitário: ");
			produto.setValorUnitarioDoProduto(tec.nextDouble());
			
			produto.setNomeDoProduto(produtos.get(idProduto).getNomeDoProduto());
			produto.setQuantidadeDoProduto(produtos.get(idProduto).getQuantidadeDoProduto());
			produto.setValorTotalDoProduto(produtos.get(idProduto).getValorTotalDoProduto());
			
			produtos.set(idProduto, produto);
			
			produto.setValorTotalDoProduto(produto.getQuantidadeDoProduto() * produto.getValorUnitarioDoProduto());
			
			break;
			
		default:
			System.out.println("opção inválida!");
			
			break;
			
		}
		
		return produtos;
		
	}
	public void excluirProduto(List<Produto>produtos) {
		listarProdutos(produtos);
		
		if(produtos.isEmpty()) {
			return;
		}
		System.out.println("-----EXCLUIR PRODUTO-----");
		System.out.println("Informe o produto para excluir:");
		int idProduto = tec.nextInt() - 1;
		
		if(produtos.size() <= idProduto) {
			System.out.println("Produto não cadastrado.");
			return;
		}
		produtos.remove(idProduto);
	}
	
}
		
		 
		
		
		
		
		
	



