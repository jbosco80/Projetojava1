/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author aluno
 */
public class Login {
     private String nome;
    private String senha;
   

    public Login() 
    {
        this.nome=null;
        this.senha=null;
          
    }

    public Login(String nome, String senha)
    {
        this.nome = nome;
        this.senha = senha;
         
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getSenha()
    {
        return senha;
    }
    
    public void setSenha(String senha)
    {
        this.senha = senha;
    }
    
    
}
