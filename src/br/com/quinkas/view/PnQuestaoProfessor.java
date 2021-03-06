/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.quinkas.view;

import br.com.quinkas.conexao.EnviaSocket;
import br.com.quinkas.conexao.ISocket;
import br.com.quinkas.entidade.Alternativa;
import br.com.quinkas.entidade.Mensagem;
import br.com.quinkas.entidade.Participante;
import br.com.quinkas.manter.ManterParticipante;
import br.com.quinkas.manter.ManterPergunta;
import br.com.quinkas.manter.ManterPrincipal;
import br.com.quinkas.manter.ManterServer;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Felipe-Sistema
 */
public class PnQuestaoProfessor extends javax.swing.JPanel implements ISocket {

    private Alternativa altA;
    private Alternativa altB;
    private Alternativa altC;
    private Alternativa altD;
    private Integer tempo;
    private Integer numResposta;

    /**
     * Creates new form PnQuestaoProfessor
     */
    public PnQuestaoProfessor() {
        initComponents();
        ManterServer.setPainelAtual(this);
        numResposta = 0;
        Random r = new Random();
        Integer num = r.nextInt(4);
        if (num.equals(0)) {
            num = 1;
        }
        lbPergunta.setText(ManterPergunta.getPerguntaAtual().getPergunta());
        for (Alternativa alternativa : ManterPergunta.getPerguntaAtual().getAlternativas()) {
            switch (num) {
                case 1:
                    altA = alternativa;
                    lbRespostaA.setText("<html>" + altA.getResposta() + "</html>");
                    num++;
                    break;
                case 2:
                    altB = alternativa;
                    lbRespostaB.setText("<html>" + altB.getResposta() + "</html>");
                    num++;
                    break;
                case 3:
                    altC = alternativa;
                    lbRespostaC.setText("<html>" + altC.getResposta() + "</html>");
                    num++;
                    break;
                case 4:
                    altD = alternativa;
                    lbRespostaD.setText("<html>" + altD.getResposta() + "</html>");
                    num++;
                    break;
            }
            if (num > 4) {
                num = 1;
            }
        }
        tempo = 30;
        contagem();
        btProximo.setVisible(false);
    }

    private void contagem() {
        new Thread() {

            @Override
            public void run() {
                for (int i = 0; i < tempo; i++) {
                    Integer resta = tempo - i;
                    lbTempo.setText(resta.toString());
                    lbTempo.repaint();
                    lbTempo.revalidate();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(PnQuestaoInicial.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                respotaCorreta();
            }
        }.start();
    }

    private void respotaCorreta() {
        if (altA.getIsTrue()) {
            pnA.setBackground(new java.awt.Color(0, 102, 0));
            pnB.setBackground(new java.awt.Color(153, 0, 0));
            pnC.setBackground(new java.awt.Color(153, 0, 0));
            pnD.setBackground(new java.awt.Color(153, 0, 0));
        } else if (altB.getIsTrue()) {
            pnB.setBackground(new java.awt.Color(0, 102, 0));
            pnA.setBackground(new java.awt.Color(153, 0, 0));
            pnC.setBackground(new java.awt.Color(153, 0, 0));
            pnD.setBackground(new java.awt.Color(153, 0, 0));
        } else if (altC.getIsTrue()) {
            pnC.setBackground(new java.awt.Color(0, 102, 0));
            pnB.setBackground(new java.awt.Color(153, 0, 0));
            pnA.setBackground(new java.awt.Color(153, 0, 0));
            pnD.setBackground(new java.awt.Color(153, 0, 0));
        } else if (altD.getIsTrue()) {
            pnD.setBackground(new java.awt.Color(0, 102, 0));
            pnB.setBackground(new java.awt.Color(153, 0, 0));
            pnC.setBackground(new java.awt.Color(153, 0, 0));
            pnA.setBackground(new java.awt.Color(153, 0, 0));
        }
        btProximo.setVisible(true);
        ManterParticipante.listParticipantes();
        enviarParticipante();
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler9 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler21 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));
        filler22 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));
        lbTempo = new javax.swing.JLabel();
        lbPergunta = new javax.swing.JLabel();
        filler30 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        filler31 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jLabel7 = new javax.swing.JLabel();
        btProximo = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        pnA = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(5, 32767));
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler10 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler20 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        lbRespostaA = new javax.swing.JLabel();
        filler23 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        pnB = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        filler11 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler12 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler13 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        lbRespostaB = new javax.swing.JLabel();
        filler24 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler25 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        pnC = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        filler14 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler15 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler16 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        lbRespostaC = new javax.swing.JLabel();
        filler26 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler27 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        pnD = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        filler17 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler18 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler19 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        lbRespostaD = new javax.swing.JLabel();
        filler28 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler29 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));

        setLayout(new java.awt.GridBagLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(800, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("TEMPO");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        jPanel2.add(jLabel3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        jPanel2.add(filler8, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel2.add(filler9, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        jPanel2.add(filler21, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        jPanel2.add(filler22, gridBagConstraints);

        lbTempo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbTempo.setForeground(new java.awt.Color(0, 102, 102));
        lbTempo.setText("10s");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        jPanel2.add(lbTempo, gridBagConstraints);

        lbPergunta.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbPergunta.setText("Pergunta?");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(lbPergunta, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weighty = 0.1;
        jPanel2.add(filler30, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.weighty = 0.1;
        jPanel2.add(filler31, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Respondidos: 01");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        jPanel2.add(jLabel7, gridBagConstraints);

        btProximo.setBackground(new java.awt.Color(0, 0, 102));
        btProximo.setForeground(new java.awt.Color(255, 255, 255));
        btProximo.setText("Próximo");
        btProximo.setBorder(null);
        btProximo.setMaximumSize(new java.awt.Dimension(48, 40));
        btProximo.setMinimumSize(new java.awt.Dimension(48, 40));
        btProximo.setPreferredSize(new java.awt.Dimension(48, 40));
        btProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProximoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_END;
        jPanel2.add(btProximo, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.2;
        jPanel1.add(jPanel2, gridBagConstraints);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMinimumSize(new java.awt.Dimension(100, 260));
        jPanel3.setName(""); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(800, 260));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        pnA.setBackground(new java.awt.Color(153, 0, 0));
        pnA.setForeground(new java.awt.Color(255, 255, 255));
        pnA.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnA.setMinimumSize(new java.awt.Dimension(400, 120));
        pnA.setPreferredSize(new java.awt.Dimension(400, 130));
        pnA.setRequestFocusEnabled(false);
        pnA.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("A)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pnA.add(jLabel1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        pnA.add(filler6, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        pnA.add(filler7, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        pnA.add(filler10, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        pnA.add(filler20, gridBagConstraints);

        lbRespostaA.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbRespostaA.setForeground(new java.awt.Color(255, 255, 255));
        lbRespostaA.setText("Resposta A");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.weighty = 0.1;
        pnA.add(lbRespostaA, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        pnA.add(filler23, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel3.add(pnA, gridBagConstraints);

        pnB.setBackground(new java.awt.Color(0, 102, 204));
        pnB.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnB.setMinimumSize(new java.awt.Dimension(400, 120));
        pnB.setPreferredSize(new java.awt.Dimension(510, 120));
        pnB.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("B)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pnB.add(jLabel2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        pnB.add(filler11, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        pnB.add(filler12, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        pnB.add(filler13, gridBagConstraints);

        lbRespostaB.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbRespostaB.setForeground(new java.awt.Color(255, 255, 255));
        lbRespostaB.setText("Resposta B");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.weighty = 0.1;
        pnB.add(lbRespostaB, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        pnB.add(filler24, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        pnB.add(filler25, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel3.add(pnB, gridBagConstraints);

        pnC.setBackground(new java.awt.Color(153, 153, 0));
        pnC.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnC.setMinimumSize(new java.awt.Dimension(0, 120));
        pnC.setLayout(new java.awt.GridBagLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("C)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pnC.add(jLabel5, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        pnC.add(filler14, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        pnC.add(filler15, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        pnC.add(filler16, gridBagConstraints);

        lbRespostaC.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbRespostaC.setForeground(new java.awt.Color(255, 255, 255));
        lbRespostaC.setText("Resposta C");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.weighty = 0.1;
        pnC.add(lbRespostaC, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        pnC.add(filler26, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        pnC.add(filler27, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel3.add(pnC, gridBagConstraints);

        pnD.setBackground(new java.awt.Color(0, 102, 0));
        pnD.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnD.setMinimumSize(new java.awt.Dimension(0, 120));
        pnD.setPreferredSize(new java.awt.Dimension(400, 130));
        pnD.setLayout(new java.awt.GridBagLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("D)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pnD.add(jLabel4, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        pnD.add(filler17, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        pnD.add(filler18, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        pnD.add(filler19, gridBagConstraints);

        lbRespostaD.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbRespostaD.setForeground(new java.awt.Color(255, 255, 255));
        lbRespostaD.setText("Resposta D");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.weighty = 0.1;
        pnD.add(lbRespostaD, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        pnD.add(filler28, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        pnD.add(filler29, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel3.add(pnD, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        jPanel3.add(filler1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        jPanel3.add(filler2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel3.add(filler3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        jPanel3.add(filler4, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        jPanel3.add(filler5, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        jPanel1.add(jPanel3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        add(jPanel1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void btProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProximoActionPerformed
        PnQuestaoProfessorRank pn1 = new PnQuestaoProfessorRank();
        ManterPrincipal.getPrincipal().setContentPane(pn1);
        ManterPrincipal.getPrincipal().setVisible(true);
    }//GEN-LAST:event_btProximoActionPerformed

    private void enviarParticipante() {
        for (Map.Entry<String, Participante> entry : ManterParticipante.getParticipantes().entrySet()) {
            Participante participante = entry.getValue();
            EnviaSocket.enviarObjeto(participante, participante);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btProximo;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler10;
    private javax.swing.Box.Filler filler11;
    private javax.swing.Box.Filler filler12;
    private javax.swing.Box.Filler filler13;
    private javax.swing.Box.Filler filler14;
    private javax.swing.Box.Filler filler15;
    private javax.swing.Box.Filler filler16;
    private javax.swing.Box.Filler filler17;
    private javax.swing.Box.Filler filler18;
    private javax.swing.Box.Filler filler19;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler20;
    private javax.swing.Box.Filler filler21;
    private javax.swing.Box.Filler filler22;
    private javax.swing.Box.Filler filler23;
    private javax.swing.Box.Filler filler24;
    private javax.swing.Box.Filler filler25;
    private javax.swing.Box.Filler filler26;
    private javax.swing.Box.Filler filler27;
    private javax.swing.Box.Filler filler28;
    private javax.swing.Box.Filler filler29;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler30;
    private javax.swing.Box.Filler filler31;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.Box.Filler filler8;
    private javax.swing.Box.Filler filler9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbPergunta;
    private javax.swing.JLabel lbRespostaA;
    private javax.swing.JLabel lbRespostaB;
    private javax.swing.JLabel lbRespostaC;
    private javax.swing.JLabel lbRespostaD;
    private javax.swing.JLabel lbTempo;
    private javax.swing.JPanel pnA;
    private javax.swing.JPanel pnB;
    private javax.swing.JPanel pnC;
    private javax.swing.JPanel pnD;
    // End of variables declaration//GEN-END:variables

    @Override
    public void recebeObjeto(Object objeto) {
        if (objeto instanceof Mensagem) {
            calcularPontos((Mensagem) objeto);
            numResposta++;
        }
        if (Objects.equals(numResposta, ManterParticipante.getNumParticipante())) {
            respotaCorreta();
        }
    }

    private void calcularPontos(Mensagem mensagem) {
        Participante participante = ManterParticipante.getParticipantes().get(mensagem.getParticipante().getIpAndPorta().getIp());
        if (mensagem.getAlternativa().getIsTrue()) {
            Integer pontuacaoBasica = 200;
            pontuacaoBasica += (100 - (mensagem.getTempo().intValue() / 300));
            participante.setAcerto(participante.getAcerto() + 1);
            if (participante.getAcerto().equals(3)) {
                pontuacaoBasica += 300;
                participante.setAcerto(0);
            }
            participante.setPontos(participante.getPontos() + pontuacaoBasica);
        } else {
            participante.setAcerto(0);
            participante.setPontos(participante.getPontos() - 20);
        }
        System.out.println(participante.getNick() + " / Pontos: " + participante.getPontos() + " / Tempo: " + mensagem.getTempo());
//        participante.setPosicao(ManterParticipante.listParticipantes().indexOf(participante) + 1);
//        for (Participante listParticipante : ManterParticipante.listParticipantes()) {
//            System.out.println(listParticipante.getPontos() + " / " + listParticipante.getNick());
//
//        }
    }
}
