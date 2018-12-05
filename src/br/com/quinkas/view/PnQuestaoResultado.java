/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.quinkas.view;

import br.com.quinkas.conexao.ISocket;
import br.com.quinkas.entidade.Participante;
import br.com.quinkas.entidade.Ranking;
import br.com.quinkas.manter.ManterParticipante;
import br.com.quinkas.manter.ManterPrincipal;
import br.com.quinkas.manter.ManterServer;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Felipe-Sistema
 */
public class PnQuestaoResultado extends javax.swing.JPanel implements ISocket{

    /**
     * Creates new form PnQuestaoResultado
     */
    public PnQuestaoResultado(Boolean resposta, Participante participante) {
        initComponents();
        preencherBG(resposta);
        lbPosicao.setText("Sua posição é " + participante.getPosicao().toString() + "° lugar.");
        ManterServer.setPainelAtual(this);
//        Server serv = new Server(this);
//        Thread tServ = new Thread(serv);
//        tServ.start();
    }

    private void iniciarJogo() {
        PnQuestaoInicial pn1 = new PnQuestaoInicial();
        ManterPrincipal.getPrincipal().setContentPane(pn1);
        ManterPrincipal.getPrincipal().setVisible(true);
    }

    private void preencherBG(Boolean acertou) {
        if (acertou) {
            setBackground(new java.awt.Color(0, 204, 51));
            lbDesempenho.setText("Você acertou!");
        } else {
            setBackground(new java.awt.Color(102, 0, 0));
            lbDesempenho.setText("Você errou!");
        }
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
        lbDesempenho = new javax.swing.JLabel();
        lbPosicao = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 50), new java.awt.Dimension(0, 50), new java.awt.Dimension(32767, 50));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 20), new java.awt.Dimension(0, 20), new java.awt.Dimension(32767, 20));

        setBackground(new java.awt.Color(102, 0, 0));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setLayout(new java.awt.GridBagLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/quinkas/imagem/logo.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        add(jLabel1, gridBagConstraints);

        lbDesempenho.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        lbDesempenho.setForeground(new java.awt.Color(255, 255, 255));
        lbDesempenho.setText("Mensagem sobre o desempenho na resposta!");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        add(lbDesempenho, gridBagConstraints);

        lbPosicao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbPosicao.setForeground(new java.awt.Color(255, 255, 255));
        lbPosicao.setText("Sua posição é ?");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        add(lbPosicao, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        add(filler1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        add(filler2, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbDesempenho;
    private javax.swing.JLabel lbPosicao;
    // End of variables declaration//GEN-END:variables

    @Override
    public void recebeObjeto(Object objeto) {
        if(objeto instanceof Ranking){
            ManterParticipante.setRanking((Ranking)objeto);
            iniciarJogo();
        }
    }
}
