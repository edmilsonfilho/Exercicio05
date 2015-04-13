package com.edmilson.model;

import sun.util.calendar.LocalGregorianCalendar.Date;

public class Contato {
	private String nome;
	private Date dataNascimento;
	private String email;
	private String endereco;
	
	public Contato(){
		Telefone telefone = new Telefone();
	}
	
	/*public Telefone recebeTelefone(String ddd, String telefone){
		telefone.setDdd(ddd);
		telefone.setTelefone(telefone);
	}*/

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
