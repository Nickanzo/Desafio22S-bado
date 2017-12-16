package br.com.caelum.desafio.jdbc.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.caelum.desafio.jdbc.ConnectionFactory;
import br.com.caelum.desafio.jdbc.modelo.Carro;

	public class CarroDao {
		private Connection connection;
		public CarroDao() {
			this.connection = new ConnectionFactory().getConnection();
	}
	
	public List<Carro> getLista(){
		try {
			List<Carro> carros = new ArrayList<Carro>();
			PreparedStatement stmt = this.connection.prepareStatement("select * from carros");
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {
				Carro carro = new Carro();
				carro.setId(rs.getLong("id"));
				carro.setDono(rs.getString("dono"));
				carro.setModelo(rs.getString("modelo"));
				carro.setLetras(rs.getString("letras"));
				carro.setNumeros(rs.getInt("numeros"));
				carro.setAno(rs.getInt("ano"));
				
				carros.add(carro);
			}
			rs.close();
			stmt.close();
			return carros;
		}catch (SQLException e){
			throw new RuntimeException (e);
		}
	}
	
	public void altera(Carro carro) {
		String sql = "update contatos set dono=?, modelo=?, "
				+"letras=?, numeros?, ano=?, where id=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, carro.getDono());
			stmt.setString(2, carro.getModelo());
			stmt.setString(3, carro.getLetras());
			stmt.setInt(4, carro.getNumeros());
			stmt.setInt(5, carro.getAno());
		}catch(SQLException e){
			throw new RuntimeException (e);
		}
	}
	
	public void remove(Carro carro) {
		try {
			PreparedStatement stmt = connection.prepareStatement("delete from contatos where id=?");
			stmt.setLong(1, carro.getId());
			stmt.execute();
			stmt.close();
		}catch(SQLException e){
			throw new RuntimeException (e);
		}
	}
	
	public void adiciona(Carro carro) {
		String sql = "insert into carros " + "(dono, modelo, letras, numeros, ano)" 
				+ " values (?,?,?,?,?)";
	
		try {
			
			PreparedStatement stmt =  connection.prepareStatement(sql);
			
			stmt.setString(1, carro.getDono());
			stmt.setString(2, carro.getModelo());
			stmt.setString(3, carro.getLetras());
			stmt.setLong(4, carro.getNumeros());
			stmt.setLong(5, carro.getAno());
			stmt.execute();
			stmt.close();
			}catch (SQLException e){
				throw new RuntimeException(e);
		
		}
	
	}

}
