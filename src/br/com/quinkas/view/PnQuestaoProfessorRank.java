/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.quinkas.view;

import br.com.quinkas.conexao.EnviaSocket;
import br.com.quinkas.entidade.Participante;
import br.com.quinkas.manter.ManterParticipante;
import br.com.quinkas.manter.ManterPrincipal;
import br.com.quinkas.util.CorPainel;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Felipe-Sistema
 */
public class PnQuestaoProfessorRank extends javax.swing.JPanel {

    /**
     * Creates new form PnQuestaoProfessorRank
     */
    public PnQuestaoProfessorRank() {
        initComponents();
        CorPainel altera = new CorPainel(this);
        Thread t = new Thread(altera);
        t.start();
        preencherJogadores("Nome 1", "Nome 2", "Nome 3", "Nome 4");
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
        jLabel2 = new javax.swing.JLabel();
        lbJogador1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbJogador2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbJogador3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbJogador4 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 50), new java.awt.Dimension(0, 50), new java.awt.Dimension(32767, 50));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 20), new java.awt.Dimension(0, 20), new java.awt.Dimension(32767, 20));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 20), new java.awt.Dimension(0, 20), new java.awt.Dimension(32767, 20));
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 20), new java.awt.Dimension(0, 20), new java.awt.Dimension(32767, 20));
        btProximo = new javax.swing.JButton();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 50), new java.awt.Dimension(0, 50), new java.awt.Dimension(32767, 50));

        setBackground(new java.awt.Color(0, 0, 102));
        setLayout(new java.awt.GridBagLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/quinkas/imagem/logo.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("1° Lugar ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_END;
        add(jLabel2, gridBagConstraints);

        lbJogador1.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        lbJogador1.setForeground(new java.awt.Color(255, 255, 255));
        lbJogador1.setText("Jogador 1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        add(lbJogador1, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("2° Lugar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        add(jLabel4, gridBagConstraints);

        lbJogador2.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        lbJogador2.setForeground(new java.awt.Color(255, 255, 255));
        lbJogador2.setText("Jogador 2");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        add(lbJogador2, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("3° Lugar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        add(jLabel6, gridBagConstraints);

        lbJogador3.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        lbJogador3.setForeground(new java.awt.Color(255, 255, 255));
        lbJogador3.setText("Jogador 3");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 9;
        add(lbJogador3, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("4° Lugar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 11;
        add(jLabel8, gridBagConstraints);

        lbJogador4.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        lbJogador4.setForeground(new java.awt.Color(255, 255, 255));
        lbJogador4.setText("Jogador 4");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 12;
        add(lbJogador4, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        add(filler1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        add(filler2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        add(filler3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        add(filler4, gridBagConstraints);

        btProximo.setText("Próximo");
        btProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProximoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 14;
        add(btProximo, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 13;
        add(filler5, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void btProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProximoActionPerformed
        iniciarJogo();
        PnQuestaoInicial pn1 = new PnQuestaoInicial();
        ManterPrincipal.getPrincipal().setContentPane(pn1);
        ManterPrincipal.getPrincipal().setVisible(true);
    }//GEN-LAST:event_btProximoActionPerformed

    private void iniciarJogo() {
        for (Map.Entry<String, Participante> entry : ManterParticipante.getParticipantes().entrySet()) {
            Participante participante = entry.getValue();
            Boolean iniciar = true;
            EnviaSocket.enviarObjeto(iniciar, participante);
        }
    }

    private void preencherJogadores(String primeiro, String segundo, String terceiro, String quarto) {
        lbJogador1.setText(primeiro);
        lbJogador2.setText(segundo);
        lbJogador3.setText(terceiro);
        lbJogador4.setText(quarto);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btProximo;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lbJogador1;
    private javax.swing.JLabel lbJogador2;
    private javax.swing.JLabel lbJogador3;
    private javax.swing.JLabel lbJogador4;
    // End of variables declaration//GEN-END:variables
}
