package com.edmilson.model;

import java.util.ArrayList;

import sun.util.calendar.BaseCalendar.Date;

public class Agenda {
	ArrayList<Contato> agenda = new ArrayList<Contato>();
	Contato contato = new Contato();
		
	public void agendaContatos(String nome, Date dataNascimento, String email, String endereco){
		contato.setNome(nome);
		contato.setDataNascimento((sun.util.calendar.LocalGregorianCalendar.Date) dataNascimento);
		contato.setEmail(email);
		contato.setEndereco(endereco);
		
		agenda.add(contato);
	}
	
}
