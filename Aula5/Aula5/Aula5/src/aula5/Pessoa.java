package aula5;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import javax.swing.JOptionPane;

public class Pessoa {
    private String codigo;
    private String nome;
    private String cpf;
    private String sobrenome;
    private String endereco;
    private String complemento;
    private String dataNasc;
    private int cor;
    private String cidadeNasc;
    private String cidade;
    private String estado;
    private int sexo;
    private int livros;
    private int filmes;
    private int seriados;
    private String comidas;
    private String telefones;
    private ResultSet resultado = null;
    BancoDeDados bancos = new BancoDeDados();
        
    /*public static void main(String[] args) {
        new Cadastro().setVisible(true);
    }*/

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCidade() {
		return this.cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getComplemento() {
        return this.complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getDataNasc() {
        return this.dataNasc;
    }

    public void setDataNasc(String datanasc) {
        this.dataNasc = datanasc;
    }

    public int getCor() {
        return cor;
    }

    public void setCor(int cor) {
        this.cor = cor;
    }

    public String getCidadeNasc() {
        return cidadeNasc;
    }

    public void setCidadeNasc(String cidadeNasc) {
        this.cidadeNasc = cidadeNasc;
    }

    public String getEstado() {
        return estado;
    }

    public String getEstado(String sigla) {
        return sigla;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public int getLivros() {
        return livros;
    }
    
    public boolean getLivros(int selecionado) {
        if(selecionado == 0) {
        	return false;
        }else {
        	return true;
        }
    }

    public void setLivros(int livros) {
        this.livros = livros;
    }

    public int getFilmes() {
        return this.filmes;
    }

    public boolean getFilmes(int selecionado) {
        if(selecionado == 0) {
        	return false;
        }else {
        	return true;
        }
    }
    
    public void setFilmes(int filmes) {
        this.filmes = filmes;
    }

    public int getSeriados() {
        return this.seriados;
    }

    public boolean getSeriados(int selecionado) {
        if(selecionado == 0) {
        	return false;
        }else {
        	return true;
        }
    }
    
    public void setSeriados(int seriados) {
        this.seriados = seriados;
    }

    public String getComidas() {
        return this.comidas;
    }

    public void setComida(Object Comida) {
        if(comidas != null) {
        	this.comidas += "," + Comida;
        }else {
        	this.comidas = (String) Comida;
        }
    }

    public String getTelefones() {
    	return this.telefones;
    }

    public void setTelefone(String lista) {
    		if(telefones != null) {
    			this.telefones += " " + lista;
    		}else {
    			this.telefones =  lista;
    		}
        }
    public String novo() {
		String codigo = null;
		String codCheck = null;
		String sql = null;
		Statement stmt;
		try {
			bancos.conectar();
			sql = "Select max(codigo) from pessoa;";
			stmt = bancos.conexao.prepareCall(sql);
			resultado = stmt.executeQuery(sql);
			resultado.first();
			codigo = resultado.getString(1);
		}catch(Exception e){
			System.out.println("Erro: " + e.getMessage());
		}
		try {
			bancos.conectar();
			sql = "Select max(cods_inativos) from cod_inativo;";
			stmt = bancos.conexao.prepareCall(sql);
			resultado = stmt.executeQuery(sql);
			resultado.first();
			codCheck = resultado.getString(1);
		}catch(Exception e){
			System.out.println("Erro: " + e.getMessage());
		}
		int acrescCod = Integer.parseInt(codigo);
		acrescCod += 1;
		int acrescCodCheck = Integer.parseInt(codCheck);
		acrescCodCheck += 1;
		if(acrescCodCheck > acrescCod) {
			codCheck = Integer.toString(acrescCodCheck);
			return codCheck;
		}else {
			codigo = Integer.toString(acrescCod);
			return codigo;
		}
	}
    
    public void inserir() {

		try {
			String sql = "insert into pessoa (nome,cpf,sobrenome,endereco,complemento,dataNasc,cor,cidadeNasc,"
					+ "cidade,estado,sexo,livros,filmes,seriados,comida,telefone)"
					+ " values (" + "'" + this.nome + "'," + "'" + this.cpf + "',"  + "'" + this.sobrenome + "',"
					+ "'"+ this.endereco +"'," + "'" + this.complemento +"'," + "'" + this.dataNasc + "'," + "'" + this.cor 
					+ "'," + "'" + this.cidadeNasc + "',"+ "'" + this.cidade + "'," + "'" + this.estado + "'," + "'"
					+ this.sexo + "',"+ "'" + this.livros + "'," + "'" + this.filmes + "'," + "'" + this.seriados +"'," + "'"
					+ this.comidas + "'," + "'" + this.telefones + "'" +")";
			Statement stmt = bancos.conexao.prepareCall(sql);
			stmt.execute(sql);
			JOptionPane.showMessageDialog(null, "Inserido com Sucesso");
		} catch (SQLException e) {
			System.out.println("Erro: " + e.getMessage());
			JOptionPane.showMessageDialog(null, "Erro ao excluir");
		}

	}
	
    public void alterar() {
		try {
		String sql = null;
		sql = "update pessoa set nome='" + this.nome + "', cpf='" + this.cpf + "', sobrenome='";
		sql+= this.sobrenome +"',endereco='" + this.endereco + "',complemento='" + this.complemento;
		sql+= "',dataNasc='"+ this.dataNasc + "',cor=" + this.cor + ",cidadeNasc='" + this.cidadeNasc;
		sql+= "',cidade='" + this.cidade + "',estado='" + this.estado + "',sexo=" + this.sexo + ",livros=";
		sql+= this.livros + ",filmes=" + this.filmes + ",seriados=" + this.seriados + ",comida='"; 
		sql+= this.comidas + "'" + ",telefone='" + this.telefones + "'" + " where codigo=" + this.codigo;
		Statement stmt = bancos.conexao.prepareCall(sql);
		stmt.execute(sql);
		JOptionPane.showMessageDialog(null, "Alterado com Sucesso");
	} catch (SQLException e) {
		System.out.println("Erro: " + e.getMessage());
		JOptionPane.showMessageDialog(null, "Erro ao alterar");
	}
	}
	
    public String pesquisar(String campoBd, String campo) {
		String sql = null;
		String retorno = null;
		Statement stmt;
		try {
			bancos.conectar();
			sql = "Select " + campoBd + " from pessoa where codigo =" + "'" + campo + "'";
			stmt = bancos.conexao.prepareCall(sql);
			resultado = stmt.executeQuery(sql);
			resultado.first();
			retorno = resultado.getString(1);
			
		}catch(Exception e){
			System.out.println("Erro: " + e.getMessage());
	}
		return retorno;
	}
    
    public int pesquisarInt(String campoBd, String campo) {
		String sql = null;
		int retorno = 0;
		Statement stmt;
		try {
			bancos.conectar();
			sql = "Select " + campoBd + " from pessoa where codigo =" + "'" + campo + "'";
			stmt = bancos.conexao.prepareCall(sql);
			resultado = stmt.executeQuery(sql);
			resultado.first();
			retorno = resultado.getInt(1);
		}catch(Exception e){
			System.out.println("Erro: " + e.getMessage());
	}
		return retorno;
	}
	
    public void excluir(String codigoDel) {
		try {
			String sql = "delete from pessoa where codigo=" + codigoDel;
			Statement stmt = bancos.conexao.prepareCall(sql);
			stmt.execute(sql);
			JOptionPane.showMessageDialog(null, "Excluído com Sucesso");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null,"Erro: " + e.getMessage());
		}

		
    }    
}
