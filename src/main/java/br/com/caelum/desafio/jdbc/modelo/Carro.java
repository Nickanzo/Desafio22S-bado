package br.com.caelum.desafio.jdbc.modelo;

public class Carro {
	private Long id;
	private String dono;
	private String modelo;
	private String letras;
	private int numeros;
	private int ano;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getLetras() {
		return letras;
	}
	public void setLetras(String letras) {
		this.letras = letras;
	}
	public int getNumeros() {
		return numeros;
	}
	public void setNumeros(int i) {
		this.numeros = i;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
}
