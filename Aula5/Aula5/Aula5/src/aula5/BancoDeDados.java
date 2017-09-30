package aula5;

import java.sql.Connection;
import java.util.Date;

import javax.swing.JOptionPane;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BancoDeDados {
	
	public Connection conexao = null;
	private Statement declara = null;
	
	
	public void conectar() {
		String servidor = "jdbc:mysql://localhost:3306/cadastros";
		String usuario = "root";
		String senha = "";
		String driver = "com.mysql.jdbc.Driver";
		try {
			Class.forName(driver);
			this.conexao = DriverManager.getConnection(servidor,usuario,senha);
			this.declara = this.conexao.createStatement();
		}catch(Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
	
	public boolean estaConectado() {
		if(this.conexao != null) {
			return true;
		}else {
			return false;
		}
	}
	
	public void desconectar() {
		try {
			this.conexao.close();
		}catch(Exception e){
			System.out.println("Erro: " + e.getMessage());
		}
		
		
	}
}
