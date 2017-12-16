package br.com.caelum.desafio.jdbc.dao;

import java.util.List;

import br.com.caelum.desafio.jdbc.modelo.Carro;

public class TestaLista {
	public static void main(String[] args) {
		CarroDao dao = new CarroDao();
		
		List<Carro> carros = dao.getLista();
		
		for (Carro carro : carros) {
			System.out.println("Dono: " + carro.getDono());
			System.out.println("Modelo: " + carro.getModelo());
			System.out.println("Letras: " + carro.getLetras());
			System.out.println("Numeros: " + carro.getNumeros());
			System.out.println("Ano: " + carro.getAno());
		}
	}
}

