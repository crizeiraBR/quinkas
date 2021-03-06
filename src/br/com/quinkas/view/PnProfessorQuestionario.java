/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.quinkas.view;

import br.com.quinkas.dao.impl.QuestionarioDAOImpl;
import br.com.quinkas.entidade.Questionario;
import br.com.quinkas.manter.ManterPrincipal;
import br.com.quinkas.manter.ManterProfessor;
import br.com.quinkas.util.CorPainel;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Felipe-Sistema
 */
public class PnProfessorQuestionario extends javax.swing.JPanel {

    private Questionario questionarioAtual;
    private Boolean precisaSalvar;

    /**
     * Creates new form PnProfessorQuestionario
     */
    public PnProfessorQuestionario(Questionario questionario) {
        initComponents();
        questionarioAtual = questionario;
        this.btInicarJogo.setEnabled(false);
        this.btQuestoes.setEnabled(false);
        if (questionarioAtual != null) {  
            this.txQuestionario.setText(questionarioAtual.getNome());
            this.btQuestoes.setEnabled(true);
            if(questionarioAtual.getPerguntas().size() != 0){
                this.btInicarJogo.setEnabled(true);
            }
        }
        CorPainel altera = new CorPainel(this);
        Thread t = new Thread(altera);
        t.start();
        precisaSalvar = false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        btQuestoes = new javax.swing.JButton();
        btInicarJogo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lbRetorno = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 20), new java.awt.Dimension(0, 20), new java.awt.Dimension(32767, 20));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 20), new java.awt.Dimension(0, 20), new java.awt.Dimension(32767, 20));
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        txQuestionario = new javax.swing.JTextField();
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));

        setBackground(new java.awt.Color(0, 0, 102));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setLayout(new java.awt.GridBagLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/quinkas/imagem/logo_prof.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        add(jLabel1, gridBagConstraints);

        btQuestoes.setBackground(new java.awt.Color(4, 12, 167));
        btQuestoes.setForeground(new java.awt.Color(255, 255, 255));
        btQuestoes.setText("Visualizar Questões");
        btQuestoes.setBorder(null);
        btQuestoes.setMaximumSize(new java.awt.Dimension(200, 60));
        btQuestoes.setMinimumSize(new java.awt.Dimension(200, 60));
        btQuestoes.setPreferredSize(new java.awt.Dimension(200, 60));
        btQuestoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQuestoesActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        add(btQuestoes, gridBagConstraints);

        btInicarJogo.setBackground(new java.awt.Color(4, 12, 167));
        btInicarJogo.setForeground(new java.awt.Color(255, 255, 255));
        btInicarJogo.setText("Iniciar PIN");
        btInicarJogo.setBorder(null);
        btInicarJogo.setMaximumSize(new java.awt.Dimension(200, 60));
        btInicarJogo.setMinimumSize(new java.awt.Dimension(200, 60));
        btInicarJogo.setPreferredSize(new java.awt.Dimension(200, 60));
        btInicarJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInicarJogoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 7;
        add(btInicarJogo, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Questionário:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        add(jLabel2, gridBagConstraints);

        lbRetorno.setForeground(new java.awt.Color(255, 255, 255));
        lbRetorno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/quinkas/imagem/retornar.png"))); // NOI18N
        lbRetorno.setText("Retornar ");
        lbRetorno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbRetorno.setInheritsPopupMenu(false);
        lbRetorno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbRetornoMousePressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        add(lbRetorno, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        add(jLabel4, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        add(filler1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 10;
        add(filler2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.weightx = 0.1;
        add(filler3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.weightx = 0.2;
        add(filler5, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.weighty = 0.1;
        add(filler4, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        add(filler6, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weighty = 0.1;
        add(filler7, gridBagConstraints);

        txQuestionario.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        txQuestionario.setForeground(new java.awt.Color(0, 102, 204));
        txQuestionario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txQuestionario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));
        txQuestionario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txQuestionarioKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(txQuestionario, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        add(filler8, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void lbRetornoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbRetornoMousePressed
        PnProfessorQuestionarios pnl = new PnProfessorQuestionarios();
        ManterPrincipal.getPrincipal().setContentPane(pnl);
        ManterPrincipal.getPrincipal().setVisible(true);
    }//GEN-LAST:event_lbRetornoMousePressed

    private void btInicarJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInicarJogoActionPerformed
        PnEsperaProfessor pnl = new PnEsperaProfessor(questionarioAtual);
        ManterPrincipal.getPrincipal().setContentPane(pnl);
        ManterPrincipal.getPrincipal().setVisible(true);
    }//GEN-LAST:event_btInicarJogoActionPerformed

    private void btQuestoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQuestoesActionPerformed
        if (questionarioAtual == null) {
            try {
                Questionario questionario = new Questionario();
                questionario.setNome(this.txQuestionario.getText());
                questionario.setDatacriacao(new Date());
                questionario.setProfessor(ManterProfessor.getProfessor());
                QuestionarioDAOImpl questionarioDao = new QuestionarioDAOImpl();
                questionario.setId(questionarioDao.inserir(questionario));
                questionarioAtual = questionario;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(lbRetorno, "Erro ao inserir questionario.");
                return;
            }
        } else if (precisaSalvar) {
            try {
                questionarioAtual.setNome(this.txQuestionario.getText());
                QuestionarioDAOImpl questionarioDao = new QuestionarioDAOImpl();
                questionarioDao.inserir(questionarioAtual);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(lbRetorno, "Erro ao alterar questionario.");
                return;
            }
        }
        PnProfessorPerguntas pnl = new PnProfessorPerguntas(questionarioAtual);
        ManterPrincipal.getPrincipal().setContentPane(pnl);
        ManterPrincipal.getPrincipal().setVisible(true);
    }//GEN-LAST:event_btQuestoesActionPerformed

    private void txQuestionarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txQuestionarioKeyPressed
        this.btQuestoes.setEnabled(true);
        precisaSalvar = true;
    }//GEN-LAST:event_txQuestionarioKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btInicarJogo;
    private javax.swing.JButton btQuestoes;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.Box.Filler filler8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbRetorno;
    private javax.swing.JTextField txQuestionario;
    // End of variables declaration//GEN-END:variables
}
