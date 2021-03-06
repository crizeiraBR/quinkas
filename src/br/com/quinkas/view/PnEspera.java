/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.quinkas.view;

import br.com.quinkas.conexao.ISocket;
import br.com.quinkas.estrutura.ListaEncadeada;
import br.com.quinkas.manter.ManterLista;
import br.com.quinkas.manter.ManterPrincipal;
import br.com.quinkas.manter.ManterServer;
import br.com.quinkas.util.CorPainel;

/**
 *
 * @author Felipe-Sistema
 */
public class PnEspera extends javax.swing.JPanel implements ISocket {
    Integer numJogadores;
    
    public PnEspera() {
        initComponents();
        CorPainel altera = new CorPainel(this);
        Thread t = new Thread(altera);
        t.start();
        numJogadores = 0;       
        ManterServer.setPainelAtual(this);
        ManterServer.iniciarServer();
    }
    
    private void iniciarJogo(){
        //serv.dispose();
        PnQuestaoInicial pn1 = new PnQuestaoInicial();
        ManterPrincipal.getPrincipal().setContentPane(pn1);
        ManterPrincipal.getPrincipal().setVisible(true);
    }

//    private void addJogador(String nome){
//        javax.swing.JLabel lbJogador = new javax.swing.JLabel();
//        lbJogador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
//        lbJogador.setForeground(new java.awt.Color(0, 0, 0));
//        lbJogador.setText(nome);
//        javax.swing.Box.Filler espaceJog = new javax.swing.Box.Filler(new java.awt.Dimension(10, 10), new java.awt.Dimension(10, 10), new java.awt.Dimension(0, 0));
//        jPanel2.add(lbJogador);
//        jPanel2.add(espaceJog);
//        numJogadores++;
//        this.lbJoradores.setText("Jogadores: " + numJogadores.toString());
//    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 20), new java.awt.Dimension(0, 20), new java.awt.Dimension(32767, 20));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 20), new java.awt.Dimension(0, 20), new java.awt.Dimension(32767, 20));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 20), new java.awt.Dimension(0, 20), new java.awt.Dimension(32767, 20));
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 102));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setLayout(new java.awt.GridBagLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/quinkas/imagem/logo.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        add(jLabel1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        add(filler1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        add(filler2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        add(filler3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        add(filler4, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        add(filler5, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Aguarde o início da partida...");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        add(jLabel2, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void recebeObjeto(Object objeto) {
        if(objeto instanceof ListaEncadeada){
            ManterLista.setLista((ListaEncadeada)objeto);
            System.out.println(ManterLista.getLista());
        }else if(objeto instanceof Boolean){
            if((Boolean)objeto){
                iniciarJogo();
            }
        }
    }
}
