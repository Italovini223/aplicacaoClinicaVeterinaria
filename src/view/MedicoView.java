/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import controller.MedicoController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.MedicoModel;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
/**
 *
 * @author User
 */
public class MedicoView extends javax.swing.JInternalFrame {
    
    private int linha = -1;
    public MedicoView() {
        initComponents();
        preencherTabela();
        inicializa();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbNovo = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbFechar = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jtxIdMedico = new javax.swing.JTextField();
        jtxNome = new javax.swing.JTextField();
        jtxEmail = new javax.swing.JTextField();
        jtxTelefone = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxCrmv = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtxDataNascimento = new javax.swing.JTextField();
        jbPesquisar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jcbSituacao = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMedico = new javax.swing.JTable();
        jbLimpar = new javax.swing.JButton();

        jbNovo.setText("Novo");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });

        jbEditar.setText("Editar");
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jbFechar.setText("Fechar");
        jbFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFecharActionPerformed(evt);
            }
        });

        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jtxIdMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxIdMedicoActionPerformed(evt);
            }
        });

        jtxNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxNomeActionPerformed(evt);
            }
        });

        jtxEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxEmailActionPerformed(evt);
            }
        });

        jtxTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxTelefoneActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Código:");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nome:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("CRMV:");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("E-mail:");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Telefone:");

        jtxCrmv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxCrmvActionPerformed(evt);
            }
        });

        jLabel6.setText("Situação:");

        jtxDataNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxDataNascimentoActionPerformed(evt);
            }
        });

        jbPesquisar.setText("Pesquisar");
        jbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarActionPerformed(evt);
            }
        });

        jLabel7.setText("Data de Nascimento:");

        jcbSituacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Inativo" }));
        jcbSituacao.setSelectedItem(-1);
        jcbSituacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbSituacaoActionPerformed(evt);
            }
        });

        jtMedico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "CRMV", "E-mail", "Telefone", "Situação", "Data de Nascimento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtMedico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtMedicoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtMedico);

        jbLimpar.setText("Limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxCrmv, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(120, 120, 120)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtxIdMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(jbPesquisar))
                    .addComponent(jtxNome, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxTelefone)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jcbSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 182, Short.MAX_VALUE))
                    .addComponent(jtxDataNascimento)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jbNovo)
                        .addGap(18, 18, 18)
                        .addComponent(jbSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(jbEditar)
                        .addGap(18, 18, 18)
                        .addComponent(jbExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(jbLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(jbFechar)
                        .addGap(174, 174, 174))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 851, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtxIdMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbPesquisar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxCrmv))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxDataNascimento)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNovo)
                    .addComponent(jbExcluir)
                    .addComponent(jbFechar)
                    .addComponent(jbEditar)
                    .addComponent(jbSalvar)
                    .addComponent(jbLimpar))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(247, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jbFecharActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        jbPesquisar.setEnabled(false);
        jbNovo.setEnabled(false);
        jbEditar.setEnabled(false);
        jbExcluir.setEnabled(false);
        jbLimpar.setEnabled(true);
        jbSalvar.setEnabled(true);
        jtxIdMedico.setEditable(false);
        jtxNome.setEditable(true);
        jtxCrmv.setEditable(true);
        jtxTelefone.setEditable(true);
        jtxDataNascimento.setEditable(true);
        jtxEmail.setEditable(true);
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jtxIdMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxIdMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxIdMedicoActionPerformed

    private void jtxNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxNomeActionPerformed

    private void jtxEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxEmailActionPerformed

    private void jtxTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxTelefoneActionPerformed

    private void jtxCrmvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxCrmvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxCrmvActionPerformed

    private void jtxDataNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxDataNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxDataNascimentoActionPerformed

    private void jbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarActionPerformed
        MedicoModel medico = new MedicoModel();
        if(jtxIdMedico.getText().isEmpty())
            JOptionPane.showMessageDialog(this, "Preencha o código do médico!"
                    , "Retorno Tela", JOptionPane.ERROR_MESSAGE);
        else{
            medico.setIdMedico(Integer.parseInt(jtxIdMedico.getText()));
            //CONTROLLER
            MedicoController controller = new MedicoController();
            medico = controller.selecionar(medico);
            //VALIDAR SE OBJETO MEDICO FOI ENCONTRADO... 
            if(medico == null)
                JOptionPane.showMessageDialog(this, "Médico não encontrado!"
                    , "Retorno BD", JOptionPane.ERROR_MESSAGE);
            else{
                //PREENCHER OS CAMPOS...
                jtxNome.setText(medico.getNome());
                jtxCrmv.setText(String.valueOf(medico.getCrmv()));
                jtxTelefone.setText(medico.getTelefone());
                jtxDataNascimento.setText(converterDataParaFormatoUsuario(medico.getDataNascimento()));
                jtxEmail.setText(medico.getEmail());
                jcbSituacao.setSelectedItem(medico.getSituacao());
                
                jbNovo.setEnabled(false);
                jbEditar.setEnabled(true);
                jbExcluir.setEnabled(true);
                jbSalvar.setEnabled(false);
                jbLimpar.setEnabled(true);
                jtxIdMedico.setEditable(false);
                jtxNome.setEditable(true);
                jtxCrmv.setEditable(true);
                jtxTelefone.setEditable(true);
                jtxDataNascimento.setEditable(true);
                jtxEmail.setEditable(true);
            }
        }
    }//GEN-LAST:event_jbPesquisarActionPerformed

    private void jcbSituacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbSituacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbSituacaoActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        String nome = jtxNome.getText();
        String crmvStr = jtxCrmv.getText();
        String telefone = jtxTelefone.getText();
        String dataNascimento = converterDataParaFormatoBanco(jtxDataNascimento.getText());
        if (dataNascimento == null) return; // cancela a operação se a data for inválida
        String email = jtxEmail.getText();
        if((crmvStr.isEmpty())||(telefone.isEmpty())||(dataNascimento.isEmpty()) || (email.isEmpty()) || (nome.isEmpty()))
            JOptionPane.showMessageDialog(this, "Digite todos os campos!"
                    , "Retorno Tela", JOptionPane.ERROR_MESSAGE);
        else{
            int crmv = Integer.parseInt(crmvStr);
            MedicoModel medico = new MedicoModel();
            medico.setNome(nome);
            medico.setCrmv(crmv);
            medico.setTelefone(telefone);
            medico.setDataNascimento(dataNascimento);
            medico.setEmail(email);
            medico.setSituacao(jcbSituacao.getSelectedItem().toString());
            //CONTROLLER
            MedicoController controller = new MedicoController();
            if(controller.inserir(medico)){
                JOptionPane.showMessageDialog(this, "Médico inserido com sucesso!");
                limparCampos();
                inicializa();
                preencherTabela();
            }else
                JOptionPane.showMessageDialog(this, "Erro ao inserir o médico!"
                    , "Retorno BD", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        MedicoModel medico = new MedicoModel();
        if(jtxIdMedico.getText().isEmpty())
            JOptionPane.showMessageDialog(this, "Digite o código do médico!"
                    , "Retorno Tela", JOptionPane.ERROR_MESSAGE);
        else{
            medico.setIdMedico(Integer.parseInt(jtxIdMedico.getText()));
            //CONTROLLER 
            MedicoController controller = new MedicoController();
            if(controller.excluir(medico)){
                JOptionPane.showMessageDialog(this, "Excluído com sucesso!");
                limparCampos();
                inicializa();
                preencherTabela();
            }else 
                JOptionPane.showMessageDialog(this, "Erro ao Excluir!"
                    , "Retorno BD", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        int idMedico = Integer.parseInt(jtxIdMedico.getText());
        String nome = jtxNome.getText();
        String email = jtxEmail.getText();
        String telefone = jtxTelefone.getText();
        int crmv = Integer.parseInt(jtxCrmv.getText());
        String dataNascimento = converterDataParaFormatoBanco(jtxDataNascimento.getText());
        if (dataNascimento == null) return; // cancela a operação se a data for inválida
        if((nome.isEmpty())||(email.isEmpty())||(telefone.isEmpty()) || (dataNascimento.isEmpty()))
            JOptionPane.showMessageDialog(this, "Digite todos os campos!"
                    , "Retorno Tela", JOptionPane.ERROR_MESSAGE);
        else{
            MedicoModel medico = new MedicoModel();
            medico.setIdMedico(idMedico);
            medico.setNome(nome);
            medico.setEmail(email);
            medico.setTelefone(telefone);
            medico.setCrmv(crmv);
            medico.setDataNascimento(dataNascimento);
            medico.setSituacao(jcbSituacao.getSelectedItem().toString());
            //CONTROLLER
            MedicoController controller = new MedicoController();
            if(controller.editar(medico)){
                JOptionPane.showMessageDialog(this, "Atualização com sucesso!");
                limparCampos();
                inicializa();
                preencherTabela();
            }else
                JOptionPane.showMessageDialog(this, "Erro ao editar médico!"
                    , "Retorno BD", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jtMedicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtMedicoMouseClicked
        linha = jtMedico.getSelectedRow();
        if(linha !=-1){
            jtxIdMedico.setText(jtMedico.getValueAt(linha, 0).toString());
            jtxNome.setText(jtMedico.getValueAt(linha, 1).toString());
            jtxCrmv.setText(jtMedico.getValueAt(linha, 2).toString());
            jtxEmail.setText(jtMedico.getValueAt(linha, 3).toString());
            jtxTelefone.setText(jtMedico.getValueAt(linha, 4).toString());
            jtxDataNascimento.setText(jtMedico.getValueAt(linha, 6).toString());
            jcbSituacao.setSelectedItem(jtMedico.getValueAt(linha, 5).toString());
            
            jbNovo.setEnabled(false);
            jbSalvar.setEnabled(false);
            jbEditar.setEnabled(true);
            jbExcluir.setEnabled(true);
            jbLimpar.setEnabled(true);
            
            jtxIdMedico.setEditable(false);
            jtxNome.setEditable(true);
            jtxCrmv.setEditable(true);
            jtxTelefone.setEditable(true);
            jtxDataNascimento.setEditable(true);
            jtxEmail.setEditable(true);
            linha = -1;
        }
    }//GEN-LAST:event_jtMedicoMouseClicked

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        limparCampos();
        inicializa();
    }//GEN-LAST:event_jbLimparActionPerformed

    private void preencherTabela(){
        MedicoController controller = new MedicoController();
        ArrayList<MedicoModel> lista = controller.selecionarTodos();
        DefaultTableModel modeloTabela = (DefaultTableModel) jtMedico.getModel();
        modeloTabela.setRowCount(0);
        if(lista.isEmpty())
            JOptionPane.showMessageDialog(this, "Nenhum médico cadastrado!"
                    ,"Retorno Tela", JOptionPane.ERROR_MESSAGE);
        else{
            
            for(MedicoModel f: lista){
                modeloTabela.addRow(new String[]{
                    String.valueOf(f.getIdMedico()),
                    f.getNome(),
                    String.valueOf(f.getCrmv()),
                    f.getEmail(),
                    f.getTelefone(),
                    f.getSituacao(),
                    f.getDataNascimento(),
                });
            }
        }
    }
    private void inicializa(){
        jtxIdMedico.setEditable(true);
        jtxNome.setEditable(false);
        jtxEmail.setEditable(false);
        jtxTelefone.setEditable(false);
        jtxCrmv.setEditable(false);
        jtxDataNascimento.setEditable(false);
        jbSalvar.setEnabled(false);
        jbEditar.setEnabled(false);
        jbExcluir.setEnabled(false);
        jbPesquisar.setEnabled(true);
        jbLimpar.setEnabled(false);
        jbNovo.setEnabled(true);
        jcbSituacao.setSelectedIndex(-1);
    }
    private void limparCampos() {
        jtxIdMedico.setText("");
        jtxNome.setText("");
        jtxEmail.setText("");
        jtxTelefone.setText("");
        jtxCrmv.setText("");
        jtxDataNascimento.setText("");
        jcbSituacao.setSelectedIndex(-1); 
    }

    private String converterDataParaFormatoBanco(String dataUsuario) {
        try {
            DateTimeFormatter formatoUsuario = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            DateTimeFormatter formatoBanco = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate data = LocalDate.parse(dataUsuario, formatoUsuario);
            return data.format(formatoBanco);
        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(this, "Data inválida! Use o formato dd/MM/yyyy", "Erro", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    private String converterDataParaFormatoUsuario(String dataBanco) {
        try {
            DateTimeFormatter formatoBanco = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            DateTimeFormatter formatoUsuario = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate data = LocalDate.parse(dataBanco, formatoBanco);
            return data.format(formatoUsuario);
        } catch (DateTimeParseException e) {
            return dataBanco; // fallback se der erro
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbFechar;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JComboBox<String> jcbSituacao;
    private javax.swing.JTable jtMedico;
    private javax.swing.JTextField jtxCrmv;
    private javax.swing.JTextField jtxDataNascimento;
    private javax.swing.JTextField jtxEmail;
    private javax.swing.JTextField jtxIdMedico;
    private javax.swing.JTextField jtxNome;
    private javax.swing.JTextField jtxTelefone;
    // End of variables declaration//GEN-END:variables
}
