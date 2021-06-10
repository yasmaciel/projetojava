package br.com.senai.pessoa;

import java.util.List;
import java.util.Scanner;

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
		
		System.out.println("Informe o pais");
		tec.nextLine();
		pessoa.setNomePais(tec.nextLine());
		
		System.out.println("Infome o estado");
		
		pessoa.setNomedoestado(tec.nextLine());
		
		System.out.println("infome a Uf ");
	
		pessoa.setUf(tec.nextLine());
		
		System.out.println("Infome a cidade");
		
		pessoa.setNomeCidade(tec.nextLine());
		
		System.out.println("Informe o Bairro");
		
		pessoa.setBairro(tec.nextLine());
		
		System.out.println("Informe a Rua");
		
		pessoa.setRua(tec.nextLine());
		
		System.out.println("Informe o complemento");
		
		pessoa.setNomeCidade(tec.nextLine());
		
		System.out.println("Informe o Numero");
		
		pessoa.setNumero(tec.nextLine());
		
		
		
		
		
		
		
		
		
		

		return pessoa;
	}

	public List<Pessoa> listarPessoas(List<Pessoa> pessoas){
		System.out.println("--- PESSOAS CADASTRADAS ---");

		System.out.printf("| %20s | %4s | %5s | %6s | %10s | %6s| %5s | %15s | %20s | %20s | %5s  |\n", 
				"Nome", "Ano", "Idade", "Altura", "pais", "estado", "cidade", "Bairro", "Rua", "Complemento","Numero" );

		for(int i = 0; i < pessoas.size(); i++){
			System.out.printf("| %20s | %4d | %5d | %6.2f | %10s | %10s| %6s | %10s | %15s | %20s | %5s | %5s \n",
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
}
