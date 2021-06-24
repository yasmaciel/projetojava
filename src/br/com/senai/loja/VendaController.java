package br.com.senai.loja;


import java.util.List;
import java.util.Scanner;

import br.com.senai.pessoa.Pessoa;
import br.com.senai.pessoa.PessoaController;
import br.com.senai.produto.Produto;
import br.com.senai.produto.ProdutoController;

public class VendaController {
	
	private Scanner tec;
	private ProdutoController produtoController;
	private PessoaController pessoaController;
	
	public VendaController() {
		tec = new Scanner (System.in);
		produtoController = new ProdutoController();
		pessoaController = new PessoaController();
	}
	public int leOpcao() {
		System.out.println(">");
		return tec.nextInt();
	}
	
	public void menu(){
		System.out.println("\n--- MENU ---");
		System.out.println("1) Criar");
		System.out.println("2)Listar");
		System.out.println("4) Sair do sistema");
		
	}
			
	
	public List<Venda> listarVenda(List<Venda> vendas) {
		
		System.out.println("----VENDAS REALIZADAS-----");
		
		System.out.printf("| %10s | %10s | %4s | %6s |\n",
				"Cliente", "Produto", "Qtd", "Valor"
				);
		
		for (int i = 0; i < vendas.size(); i++) {
			System.out.printf("| %10s | %10s | %4d | %6.2f|\n", 
					vendas.get(i).getPessoa().getNome(),
					vendas.get(i).getProduto().getNomeDoProduto(),
					vendas.get(i).getQuantidade(),
					vendas.get(i).getValor()
					);
			
			
		}
		
		return vendas;
		
		
	}
	
	public Venda cadastrarVenda(List<Produto> produtos, List<Pessoa> pessoas) {
		
		if(produtos.isEmpty() || pessoas.isEmpty()) {
			System.out.println("Impossiel realizar vendas sem PRODUTOS ou PESSOAS cadastradas.");
			return null;
		}
		
		produtoController.listarProdutos(produtos);
		pessoaController.listarPessoas(pessoas);
		
		Venda venda = new Venda();
		Produto produto = new Produto();
		Pessoa pessoa = new Pessoa();
		
		System.out.println("Informe o id da pessoa:");
		int idpessoa = tec.nextInt() -1 ;
		
		pessoa.setNome(pessoas.get(idpessoa).getNome());
		pessoa.setAltura(pessoas.get(idpessoa).getAltura());
		pessoa.setAnoDeNascimento(pessoas.get(idpessoa).getAnoDeNascimento());
		
		venda.setPessoa(pessoa);
		
		System.out.println("Informe o Id do produto: ");
		int idProduto = tec.nextInt() - 1;
		
		
		produto.setNomeDoProduto(produtos.get(idProduto).getNomeDoProduto());
		produto.setQuantidadeDoProduto(produtos.get(idProduto).getQuantidadeDoProduto());
		produto.setValorUnitarioDoProduto(produtos.get(idProduto).getValorUnitarioDoProduto());
		produto.setValorTotalDoProduto(produtos.get(idProduto).getValorTotalDoProduto());
		
		venda.setProduto(produto);
		System.out.println("Informe a quantidade desejada: ");
		venda.setQuantidade(tec.nextInt());
		venda.setValor(produto.getValorUnitarioDoProduto() * venda.getQuantidade());
		
		return venda;
		
	}

}
