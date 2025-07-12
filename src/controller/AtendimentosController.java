/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.AtendimentosModel;
import util.Conexao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

/**
 *
 * @author italo
 */
public class AtendimentosController {
    public boolean inserir(AtendimentosModel atendimento){
        boolean retorno = false;
        Conexao c = new Conexao();
        c.conectar();
        
        String sql = "INSERT INTO atendimentos (pet_id, medico_id, data_hora, status, motivo_visita, diagnostico_final, created_at)VALUES (?,?,?,?,?,?,?)";
        
        try{
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            
            sentenca.setInt(1, atendimento.getPet_id());
            sentenca.setInt(2, atendimento.getMedico_id());
            // PARADO NA DATA_HORA
        }
    }
}
