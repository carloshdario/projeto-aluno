package br.com.carlos.projetoaluno;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Professor {
	protected int id;
	protected String disciplina;
	protected String nome;
	public Curso curso;

	public int getId() {
		return id;
	}

	
	public void setId(int id) {
		this.id = id;
	}


	public String getDisciplina() {
		return disciplina;
	}

	public String setDisciplina() {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Informe o nome da Disciplina: ");
			this.nome = sc.next();

			Pattern padrao = Pattern.compile("[A-Za-z ]+");
			Matcher objetoCombinado = padrao.matcher(this.disciplina);

			boolean verificacao = objetoCombinado.matches();

			if (verificacao == true) {
				System.out.println("Nome recebido corretamente");
				break;
			} else {
				System.out.println("Permitido apenas letras");
				continue;

			}
	
	}
		return this.disciplina;
	}

	public String getNome() {
		return nome;
	}

	public String setNome() {
		while (true) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("Informe o nome: ");
				this.nome = sc.nextLine();

				Pattern padrao = Pattern.compile("[A-Za-z ]+");
				Matcher objetoCombinado = padrao.matcher(this.nome);

				boolean verificacao = objetoCombinado.matches();

				if (verificacao == true) {
					System.out.println("Nome recebido corretamente");
					break;
				} else {
					System.out.println("Permitido apenas letras");
					continue;

				}
			} catch (Exception e) {
				System.out.println("Digite Apenas Letras");
			}
		}
		return this.nome;

	}

}
