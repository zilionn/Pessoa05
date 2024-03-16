package model;

import java.time.LocalDate;

public class Pessoa {
	
	private String nome;
	private LocalDate dataNascimento;
	private String profissao;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(int dia, int mes, int ano) {
		LocalDate I = LocalDate.of(ano, mes, dia);
		this.dataNascimento = I;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public int getIdade() {
		LocalDate hoje = LocalDate.now();
		
		int ano = hoje.getYear();
		int anoNasc = dataNascimento.getYear();
		
		int idade = ano - anoNasc;
		
		return idade;
		
	}

	
	
	
	
	
}
