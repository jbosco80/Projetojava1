/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Model.Pessoa;
public class PessoaBD {
     Connection connection = null;

    public boolean inserirPessoa(Pessoa pessoa) 
    {
        System.out.println("Inserir Pessoa");
       
        connection = Conexao.getInstance().getConnection();
        
        System.out.println("Conectado e pronto para inserir");
        Statement stmt = null;
        
        try 
        {
            stmt = connection.createStatement();

            String sql = "INSERT INTO dados(nome,endereco,telefone,email) "
            		   + "VALUES ('"+ pessoa.getNome() + "','" + pessoa.getEndereco() + "', '" 
            		   + pessoa.getTelefone() + "', '" + pessoa.getEmail() + "')";
            System.out.println("SQL: " + sql);
            stmt.executeUpdate(sql);
           
            return true;
        } 
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
            return false;
        } 
        finally 
        {
            try 
            {
                stmt.close();
                connection.close();
            }
            catch (SQLException e)
            {
                System.out.println("Erro ao desconectar" + e.getMessage());
            }
        }
    } 

    
    public boolean atualizarPessoa(Pessoa pessoa, String nomeAlterar) 
    {
        System.out.println("Atualizar Pessoa");
        
        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado e pronto para atualizar");
        Statement stmt = null;
    
        try
        {
            stmt = connection.createStatement();

            String sql = "UPDATE dados SET nome='"+pessoa.getNome()+"'," +
                         "endereco='"+pessoa.getEndereco()+"', telefone='"+pessoa.getTelefone()+"'," +
                         "email='"+pessoa.getEmail()+"' WHERE nome='"+nomeAlterar+"';";
                    
            System.out.println("SQL: " + sql);
            stmt.executeUpdate(sql);
            
            return true;
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
            return false;
        }
        finally
        {
            
            try
            {
                stmt.close();
                connection.close();
            }
            catch (SQLException e)
            {
                System.out.println("Erro ao desconectar" + e.getMessage());
            }
        }
    }
    
    
    public String relatorioPessoas()
    {
    	String dados = "";
    	
    	connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado e preparando a listagem");
        Statement stmt = null;
        
        try
        {
            stmt = connection.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM dados");
            
            while (res.next())
            {
            	dados += "\n"+res.getString("nome");
		dados += "\n"+res.getString("endereco");
		dados += "\n"+res.getString("telefone");
		dados += "\n"+res.getString("email");
		dados += "\n-----------------------------------------";				
            }
            
        } 
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
            return null;
        }
        finally
        {
          
            try
            {
                stmt.close();
                connection.close();
            }
            catch (SQLException e)
            {
                System.out.println("Erro ao desconectar" + e.getMessage());
            }
        }
    	
    	return dados;
    }
    

    public ArrayList<Pessoa> getListaPessoas() 
    {
        ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
      
        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado e preparando a listagem");
        Statement stmt = null;
        
        try
        {
            stmt = connection.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM dados");
            
            while (res.next())
            {
                Pessoa pessoa = new Pessoa(res.getString("nome"), res.getString("endereco"), 
                		                   res.getString("telefone"), res.getString("email"));
                listaPessoas.add(pessoa);
            }
            
        } 
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
            return null;
        }
        finally
        {
          
            try
            {
                stmt.close();
                connection.close();
            }
            catch (SQLException e)
            {
                System.out.println("Erro ao desconectar" + e.getMessage());
            }
        }
        return listaPessoas;
    } 
    
    public boolean excluirPessoa(Pessoa pessoa) 
    {
    	boolean status = true;
    	
        System.out.println("Excluir Pessoa");
        
        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado e pronto para excluir");
        Statement stmt = null;
        
        try 
        {
            stmt = connection.createStatement();
            
            String sql = "DELETE FROM dados WHERE nome='"+pessoa.getNome()+"'";
            
            System.out.println("SQL: " + sql);
            
            if(stmt.executeUpdate(sql)!=0)
            {
            	status = true;	
            }
            else
            {
            	status = false;
            }
            
        } 
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
            status = false;
        }
        finally 
        {
            
            try
            {
                stmt.close();
                connection.close();
            } 
            catch (SQLException e)
            {
                System.out.println("Erro ao desconectar" + e.getMessage());
            }
        }
        return status;
    }
    
}
