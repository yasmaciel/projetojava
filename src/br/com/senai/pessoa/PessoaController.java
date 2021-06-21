package br.com.senai.pessoa;

import java.util.List;
import java.util.Scanner;

import br.com.senai.produto.Produto;

public class PessoaController {

	private Scanner tec;

	public PessoaController(){
		tec = new Scanner(System.in);
	}

	public int leOpcao(){
		System.out.print("> ");
		return tec.nextInt();
	}

	public void menu(){
		System.out.println("\n--- MENU ---");
		System.out.println("1) Cadastrar pessoa");
		System.out.println("2) Listar pessoas cadastradas");
		System.out.println("3) Editar Pessoa");
		System.out.println("4) Excluir pessoa");
		System.out.println("5) Cadastrar produto");
		System.out.println("6) Listar produtos cadastradas");
		System.out.println("7) Editar produto");
		System.out.println("8) Exclui produto");
		System.out.println("9) Sair do sistema");
		System.out.println("-------------------");
	}
	

	public Pessoa cadastrarPessoa(){
		Pessoa pessoa = new Pessoa();

		System.out.println("--- CADASTRAR PESSOA ---");
		System.out.print("Informe o nome: ");
		tec.nextLine();
		pessoa.setNome(tec.nextLine());

		System.out.print("Informe o ano de nascimento: ");
		pessoa.setAnoDeNascimento(tec.nextInt());

		System.out.print("Informe a altura: ");
		pessoa.setAltura(tec.nextDouble());
		
		System.out.print("Informe o pais: ");
		tec.nextLine();
		pessoa.setNomePais(tec.nextLine());
		
		System.out.print("Infome o estado: ");
		pessoa.setNomedoestado(tec.nextLine());
		
		System.out.print("infome a Uf: ");
		pessoa.setUf(tec.nextLine());
		
		System.out.print("Infome a cidade: ");
		pessoa.setNomeCidade(tec.nextLine());
		
		System.out.print("Informe o Bairro: ");
		pessoa.setBairro(tec.nextLine());
		
		System.out.print("Informe a Rua: ");
		pessoa.setRua(tec.nextLine());
		
		System.out.print("Informe o complemento: ");
		pessoa.setComplemento(tec.nextLine());
		
		System.out.print("Informe o Numero: ");
		pessoa.setNumero(tec.nextLine());
		
		return pessoa;
	}

	public List<Pessoa> listarPessoas(List<Pessoa> pessoas){ 
		
		if(pessoas.isEmpty()) {
			System.out.println("Não possui dados para listar.");
			
			return null;
		}
		System.out.println("--- PESSOAS CADASTRADAS ---");

		System.out.printf("|%2s| %20s | %4s | %5s | %6s | %10s | %10s| %5s | %15s | %20s | %20s | %5s  |\n", 
				"Id","Nome", "Ano", "Idade", "Altura", "pais", "estado", "UF" , "cidade", "Bairro", "Rua", "Complemento","Numero" );

		for(int i = 0; i < pessoas.size(); i++){
			System.out.printf("|%2d | %20s | %4d | %5d | %6.2f | %10s | %10s| %6s | %10s | %15s | %20s | %5s | %5s \n",
					i + 1,
					pessoas.get(i).getNome(),
					pessoas.get(i).getAnoDeNascimento(),
					pessoas.get(i).getIdade(),
					pessoas.get(i).getAltura(),
					pessoas.get(i).getNomePais(),
					pessoas.get(i).getNomedoestado(),
					pessoas.get(i).getUf(),
					pessoas.get(i).getNomeCidade(),
					pessoas.get(i).getBairro(),
					pessoas.get(i).getRua(),
					pessoas.get(i).getComplemento(),
					pessoas.get(i).getNumero());
					
		}

		return pessoas;

	}

	
	public List<Pessoa> editarPessoa(List<Pessoa> pessoas) {
		Pessoa pessoa = new Pessoa();
		listarPessoas(pessoas);
		
		if(pessoas.isEmpty()) {
			return null;
		
		}
		System.out.println("Informe o id de pessoa para editar: ");
		int idPessoa = tec.nextInt() - 1;
		
		System.out.println("1) Informe o nome");
		System.out.println("2) Informe o Ano de Nascimento");
		System.out.println("3) Informe a sua altura");
		int opcao = tec.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println("-----EDITAR O NOME -----");
			System.out.println("Informe o novo nome: ");
			pessoa.setNome(tec.next());
			
		pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
		pessoa.setAltura(pessoas.get(idPessoa).getAltura());

		pessoas.set(idPessoa, pessoa);
		
			break;
			
		case 2:
			System.out.println("------EDITAR ANO DE NASCIMENTO-------");
			System.out.println("Informe o ano de nascimento ");
			pessoa.setAnoDeNascimento(tec.nextInt());
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			
		
				pessoas.set(idPessoa, pessoa);
			break;
			
		case 3:
			System.out.println("---------EDITAR ALTURA---------");
			System.out.println("Informe a aultura: ");
			pessoa.setAltura(tec.nextDouble());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			
			pessoas.set(idPessoa, pessoa);
			
			break;
			
		default:
			System.out.println("opção inválida!");
			
			break;
			
		}
		
		return pessoas;
	}
	public void excluirPessoa(List<Pessoa>pessoas) {
		listarPessoas(pessoas);
		
		if(pessoas.isEmpty()) {
			return;
		}
		System.out.println("-----EXCLUIR PESSOA-----");
		System.out.println("Informe a pessoa para excluir:");
		int idPessoa = tec.nextInt() - 1;
		
		if(pessoas.size() <= idPessoa) {
			System.out.println("Produto não cadastrado.");
			return;
		}
		pessoas.remove(idPessoa);
	}
	
}
			
		
		


