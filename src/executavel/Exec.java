package executavel;

import java.util.ArrayList;
import java.util.Scanner;

import Model.Filme;
import Model.Pagamento;
import Model.Usuario;

public class Exec {
	public static void main(String[] args) {
		ArrayList<Filme> listaFilme = new ArrayList();
		ArrayList<Usuario> listaUsuario = new ArrayList();
		
		Filme filme1 = new Filme("Minha mãe e uma  peça", 2013, "Suzana Garcia", "Paulo Gustavo", "comedia");
		Filme filme2 = new Filme("Amor com data marcada", 2020, "John Whiitesell", "Emma Roberts", "Comedia Romance");
		Filme filme3 = new Filme("Alguem como eu", 2018, "Leonel Vieira", "Paola Oliveira", "Comedia");
		Filme filme4 = new Filme("O filho do noivo", 2019, "Jhon Asher", "Tom Everett", "Comedia");
		listaFilme.add(filme1);
		listaFilme.add(filme2);
		listaFilme.add(filme3);
		listaFilme.add(filme4);
		
		//usuario
		Usuario user1 = new Usuario("Sirlene", true, filme1);
		Usuario user2 = new Usuario("Dianaci", false, filme2);
		listaUsuario.add(user1);
		listaUsuario.add(user2);
		
		for(Filme filme: listaFilme) {
			System.out.println(filme.toString());
		}
		System.out.println("Opções: ");
		System.out.println("1: titulo");
		System.out.println("2: Ano");
		System.out.println("3: Diretor");
		System.out.println("4: Ator");
		System.out.println("5: Gênero");
		
		// permite o usuario digitar
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a opção que você deseja pesquisar: ");
		// nextLine(): permite que o usuario digite string
		String op = sc.nextLine();
	    
		switch (op) {
		case "1":
			System.out.println("Digite o nome do titulo do filme: ");
			String titulo = sc.nextLine();
			
			for(Filme listFilme: listaFilme) {
				if(titulo.equals(listFilme.getTitulo())) {
					System.out.println(listFilme);
				}
			}
			break;
			
		case "2":
			System.out.println("Digite o ano de lançamento do filme: ");
			int ano = sc.nextInt();
			
			for(Filme listFilme: listaFilme) {
				if(ano == listFilme.getAno()) {
					System.out.println(listFilme);
				}
			}
			break;
		case "3":
		    System.out.println("Digite o nome do diretor do filme: ");
		    String diretor = sc.nextLine();
			
			for(Filme listFilme : listaFilme) {
				if(diretor.equals(listFilme.getDiretor())) {
					System.out.println(listFilme);
				}
			}
			break;
			
		case "4":
		    System.out.println("Digite o nome do ator do filme: ");
		    String ator = sc.nextLine();
			
			for(Filme listFilme : listaFilme) {
				if(ator.equals(listFilme.getAtor())) {
					System.out.println(listFilme);
				} 
			}
			break;
			
		case "5":
		    System.out.println("Digite o tipo de gênero do filme: ");
		    String genero = sc.nextLine();
			
			for(Filme listFilme : listaFilme) {
				if(genero.equals(listFilme.getGênero())) {
					System.out.println(listFilme);
				}
			}
			break;

		default:
			System.out.println("Você digitou uma opção inexistente.");
		}
		

		// pagamento
		System.out.println("Digite o nome do usuario: ");
		String nomeU = sc.nextLine();
		
		Pagamento pagamento = new Pagamento();
		
		for(Usuario usuario : listaUsuario) {
			if(nomeU.equals(usuario.getNome())) {
				if(usuario.isAtivo()) {
					System.out.println("O usuário está com a mensalidade em dias.");
				} else {
					System.out.println("O usuário não está com o pagamento em dias. Adicione uma forma de pagamento para continuar a assistir.");
					System.out.println("1: Cartao de credito");
					System.out.println("2: Cartao de debito");
					System.out.println("3: Pix");
					System.out.println("4: TED");
					System.out.println("5: Boleto");
					
					System.out.println("Digite a forma de pagamento que você deseja efetuar: ");
					String opcao = sc.nextLine();
					
					switch (opcao) {
					case "1":
						System.out.println("Digite o numero do seu cartão de credito: ");
						int cartaoC = sc.nextInt();
						pagamento.setCartaoc(cartaoC);
						usuario.setAtivo(true);
						System.out.println("\nO pagamento foi realizado!");
						break;
						
					case "2":
						System.out.println("Digite o número do seu cartão de débito: ");
						int cartaoD = sc.nextInt();
					    pagamento.setCartaoc(cartaoD);
					    usuario.setAtivo(true);
					    System.out.println("\nO pagamento foi realizado!");
						break;
						
					case "3":
						System.out.println("Digite o número do seu cartão de débito: ");
						int pix = sc.nextInt();
					    pagamento.setPix(pix);
					    usuario.setAtivo(true);
					    System.out.println("\nO pagamento foi realizado!");
						break;
						
					case "4":
						System.out.println("Digite o número do TED: ");
					    int TED = sc.nextInt();
					    pagamento.setPix(TED);
					    usuario.setAtivo(true);
					    System.out.println("\nO pagamento foi realizado!");
						break;
						
					case "5":
					    System.out.println("Digite o código do boleto: ");
					    int boleto = sc.nextInt();
					    pagamento.setBoleto(boleto);
					    usuario.setAtivo(true);
					    System.out.println("\nO pagamento foi realizado!");
						break;


					default:
						break;
					}
				}
			}
		}
	}
}
