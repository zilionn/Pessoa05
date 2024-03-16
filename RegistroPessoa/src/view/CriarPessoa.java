package view;

import model.Pessoa;

public class CriarPessoa {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		
		p1.setDataNascimento(21, 05, 1980);
		p1.setNome("João");
		p1.setProfissao("Gestor");
		
		int idade = p1.getIdade();
		
		System.out.println("NOME: " + p1.getNome());
		System.out.println("DATA DE NASCIMENTO: " + p1.getDataNascimento());
		System.out.println("PROFISSÃO: " + p1.getProfissao());
		System.out.println("IDADE: " + idade);
		

	}

}
