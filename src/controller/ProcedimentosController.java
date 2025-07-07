/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.ProcedimentosModel;
import util.Conexao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.text.ParseException;

/**
 *
 * @author Gamer
 */
public class ProcedimentosController {
    public boolean inserir(ProcedimentosModel procedimento){
        boolean retorno = false;
        Conexao c = new Conexao();
        c.conectar();
        
        String sql = "INSERT INTO pets (nome, descricao, valor_padrao)VALUES (?,?,?)";
        
        try{
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            
            sentenca.setString(1,procedimento.getNome());
            sentenca.setString(2, procedimento.getDescricao());
            sentenca.setFloat(3, procedimento.getValor());
            
            if (!sentenca.execute()) {
                retorno = true;
            }
            
        }catch(SQLException e){
            System.err.println("Erro ao inserir pet: " + e.getMessage());
        }
        
        c.desconectar();
        return retorno;
    }
    
    public boolean editar(ProcedimentosModel procedimento){
        boolean retorno = false;
        Conexao c = new Conexao();
        
        String sql = "UPDATE procedimentos SET nome = ?, "
                + "descricao = ?, valor_padrao = ? WHERE id = ?";
        
        try{
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            
            sentenca.setString(1, procedimento.getNome());
            sentenca.setString(2, procedimento.getDescricao());
            sentenca.setFloat(3, procedimento.getValor());
            sentenca.setInt(4, procedimento.getId());
            
            if (!sentenca.execute()) {
                retorno = true;
            }
        }catch(SQLException e){
            System.out.println("Erro na sentença SQL: " + e.getMessage());
        }
        
        c.desconectar();
        return retorno; 
    }
    
    public boolean excluir (ProcedimentosModel procedimento){
        boolean retorno = false;
        
        Conexao c = new Conexao();
        c.conectar();
        String sql = "DELETE FROM procedimentos WHERE id = ?";
        
        try{
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            sentenca.setInt(1, procedimento.getId());
            if(!sentenca.execute()){
                retorno = true;
            }
        } catch (SQLException e){
            System.out.println("Erro na sentença SQL: " + e.getMessage());
        }
        
        c.desconectar();
        return retorno;
    }
    
    public ProcedimentosModel selecionar(ProcedimentosModel procedimento){
        ProcedimentosModel retorno = null;
        Conexao c = new Conexao();
        c.desconectar();
        
        String sql = "SELECT * FROM procedimentos WHERE id = ?";
        
        try{
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            sentenca.setInt(1, procedimento.getId());
            ResultSet result = sentenca.executeQuery();
            if(result.next()){
                retorno = new ProcedimentosModel();
                retorno.setId(result.getInt("id"));
                retorno.setNome(result.getString("nome"));
                retorno.setDescricao(result.getString("descricao"));
                retorno.setValor(result.getFloat("valor_padrao"));
                
            }
        } catch(SQLException e){
           System.out.println("Erro na sentença SQL: " + e.getMessage());
        }
        c.desconectar();
        return retorno;
    }
    
    public ArrayList<ProcedimentosModel> selecionarTodos(){
        ArrayList<ProcedimentosModel> retorno = new ArrayList<>();
        Conexao c = new Conexao();
        c.conectar();
        String sql = "SELECT * FROM procedimentos";
        
        try{
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            ResultSet result = sentenca.executeQuery();
            while(result.next()){
                ProcedimentosModel p = new ProcedimentosModel();
                p.setId(result.getInt("id"));
                p.setNome(result.getString("nome"));
                p.setDescricao(result.getString("descricao"));
                p.setValor(result.getFloat("valor_padrao"));
                
                retorno.add(p);
            }
        }catch(SQLException e){
            System.out.println("Erro na sentença SQL: " + e.getMessage());
        }
        c.desconectar();
        return retorno;
    }
}
