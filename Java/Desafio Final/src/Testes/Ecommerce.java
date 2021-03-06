package Testes;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Classes.Produto;

public class Ecommerce {

	public static Scanner in = new Scanner(System.in);
	public static FileInputStream leitura = null;
	public static BufferedReader conversao = null;
	public static List<String> codigosCadastrados = new ArrayList<>();
	public static List<String> linhas = new ArrayList<>();

	public static void main(String[] args) {
		menu();
	}

	public static void menu() {
		System.out.println("*** Menu ***");
		System.out.println("1 - Cadastrar um novo produto");
		System.out.println("2 - Buscar dados de um produto");
		System.out.println("3 - Listar todos os produtos");
		System.out.println("4 - Atualizar produto");
		System.out.println("5 - Sair do programa");
		System.out.println("Pressione qualquer outra tecla para sair");
		System.out.print("Selecione a sua op��o: ");
		int opcao = checkInt();
		while (opcao < 0 || opcao > 5) {
			System.out.print("Selecione uma op��o v�lida: ");
			opcao = checkInt();
		}
		switch (opcao) {
		case 1:
			cadastrarProduto();
			break;

		case 2:
			buscarProduto();
			break;

		case 3:
			exibirProdutos();
			break;

		case 4:
			atualizarProduto();
			break;
		case 5:
			System.out.println("Voc� escolheu sair do programa!");
			System.exit(0);
			break;
		default:
			System.out.println("Op��o inv�lida!");
			menu();
			break;
		}
	}

	public static void cadastrarProduto() {
		FileOutputStream arquivo = null;
		try {
			arquivo = new FileOutputStream("produtos.txt", true);
			leitura = new FileInputStream("produtos.txt");
			InputStreamReader conteudo = new InputStreamReader(leitura);
			conversao = new BufferedReader(conteudo);
			System.out.println("Voc� escolheu cadastrar um novo produto");
			System.out.print("Digite o c�digo do produto: ");
			int codigo = checkInt();
			while(codigo < 0) {
				System.out.print("Digite o c�digo do produto: ");
				codigo = checkInt();
			}

			// Guardando todos os c�digos da lista produtos.txt em codigosCadastrados

			while (conversao.ready()) {
				String linha = conversao.readLine();
				String item[] = linha.split(";");
				codigosCadastrados.add(item[0]);
			}

			// Verificando se c�digo j� existe
			String c = "" + codigo;
			for (String cod : codigosCadastrados) {
				if (c.equals(cod)) {
					System.out.println("Produto j� cadastrado");
					menu();
				}
			}

			in.nextLine();
			System.out.print("Digite o nome do produto: ");
			String nome = in.nextLine();
			System.out.print("Digite o pre�o do produto: ");
			double preco = checkDouble();
			while(preco < 0) {
				System.out.print("Digite o pre�o do produto: ");
				preco = checkDouble();
			}
			System.out.print("Digite a quantidade do produto: ");
			int quantidade = checkInt();
			while(quantidade < 0) {
				System.out.print("Digite a quantidade do produto: ");
				quantidade = checkInt();
			}

			Produto prod = new Produto(codigo, nome, preco, quantidade);
			byte[] produto = (prod.getCodigo() + ";" + prod.getNome() + ";" + prod.getPreco() + ";"
					+ prod.getQuantidade() + "\n").getBytes();
			arquivo.write(produto);
			System.out.println("Produto adicionado com sucesso com sucesso!");
			menu();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void buscarProduto() {
		try {
			leitura = new FileInputStream("produtos.txt");
			InputStreamReader conteudo = new InputStreamReader(leitura);
			conversao = new BufferedReader(conteudo);

			System.out.println("Voc� escolheu buscar por um produto");
			System.out.print("Digite o c�digo do produto: ");
			int codigo = checkInt();
			while(codigo < 0) {
				System.out.print("Digite o c�digo do produto: ");
				codigo = checkInt();
			}

			// Buscando todos os c�digos na lista produtos.txt
			String linhaCopia = "";
			boolean encontrou = true;
			String c = "" + codigo;
			while (conversao.ready()) {
				String linha = conversao.readLine();
				String item[] = linha.split(";");
				if (c.equals(item[0])) {
					linhaCopia = linha;
					encontrou = true;
					break;
				} else {
					encontrou = false;
				}
			}

			// Terminando de buscar c�digos na lista produtos.txt
			// Exibindo se encontrou ou n�o o produto
			if (encontrou) {
				String prod[] = linhaCopia.split(";");
				System.out.println("Exibindo dados do produto");
				System.out.println("C�digo: " + prod[0]);
				System.out.println("Nome: " + prod[1]);
				System.out.println("Pre�o: R$" + prod[2]);
				System.out.println("Quantidade: " + prod[3]);
				menu();
			} else {
				System.out.println("*** Produto n�o encontrado ***");
				menu();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void exibirProdutos() {
		try {
			leitura = new FileInputStream("produtos.txt");
			InputStreamReader conteudo = new InputStreamReader(leitura);
			conversao = new BufferedReader(conteudo);
			System.out.println("Voc� escolheu listar todos os produtos");
			System.out.println("Cod\t\tNome\t\tPre�o\t\tQuantidade");
			while (conversao.ready()) {
				String linha = conversao.readLine();
				String item[] = linha.split(";");
				System.out.printf("%s\t\t%s\t\t%s\t\t%s\n", item[0], item[1], item[2], item[3]);
			}
			menu();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

	public static void atualizarProduto() {
		FileOutputStream arquivo = null;
		try {

			leitura = new FileInputStream("produtos.txt");
			InputStreamReader conteudo = new InputStreamReader(leitura);
			conversao = new BufferedReader(conteudo);

			System.out.println("Voc� escolheu atualizar um produto");
			System.out.print("Digite o c�digo do produto: ");
			int codigo = checkInt();
			while(codigo < 0) {
				System.out.print("Digite o c�digo do produto: ");
				codigo = checkInt();
			}

			// Buscando todos os c�digos na lista produtos.txt
			boolean encontrou = false;
			String c = "" + codigo;
			while (conversao.ready()) {
				String linha = conversao.readLine();
				String item[] = linha.split(";");
				if (c.equals(item[0])) {
					in.nextLine();
					System.out.print("Digite o nome do produto: ");
					String nome = in.nextLine();
					System.out.print("Digite o pre�o do produto: ");
					double preco = checkDouble();
					while(preco < 0) {
						System.out.print("Digite o pre�o do produto: ");
						preco = checkDouble();
					}
					System.out.print("Digite a quantidade do produto: ");
					int quantidade = in.nextInt();
					while(codigo < 0) {
						System.out.print("Digite a quantidade do produto: ");
						codigo = checkInt();
					}
					String itemLista = codigo + ";" + nome + ";" + preco + ";" + quantidade;
					linhas.add(itemLista);
					encontrou = true;
				} else {
					linhas.add(linha);
				}
			}

			if (encontrou) {
				arquivo = new FileOutputStream("produtos.txt", false);
				for (String cadaLinha : linhas) {
					byte[] produto = (cadaLinha + "\n").getBytes();
					arquivo.write(produto);
				}
				System.out.println("Produto atualizado com sucesso");
				linhas.clear();
				menu();
			} else {
				System.out.println("*** Produto n�o encontrado ***");
				linhas.clear();
				menu();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Helpers

	public static int checkInt() {

		while (!in.hasNextInt()) {
			System.out.print("Digite um valor v�lido: ");
			in.next();
		}
		int checked = in.nextInt();
		return checked;
	}
	
	public static double checkDouble() {

		while (!in.hasNextDouble()) {
			System.out.print("Digite um valor v�lido: ");
			in.next();
		}
		double checked = in.nextDouble();
		return checked;
	}

}
