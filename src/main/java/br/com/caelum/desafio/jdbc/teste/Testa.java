package br.com.caelum.desafio.jdbc.teste;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.caelum.desafio.jdbc.ConnectionFactory;
import br.com.caelum.desafio.jdbc.dao.CarroDao;
import br.com.caelum.desafio.jdbc.modelo.Carro;

public class Testa {
	public static void main(String[] args) throws SQLException {
		Carro carro = new Carro();
		carro.setDono("Eu");
		carro.setModelo("Lambo");
		carro.setLetras("SAS");
		carro.setNumeros(4885);
		carro.setAno(1999);
		
		CarroDao dao = new CarroDao();
		dao.adiciona(carro);
		
		System.out.println("Funciona!");
	}
}
