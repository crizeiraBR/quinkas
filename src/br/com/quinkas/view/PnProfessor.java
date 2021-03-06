/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.quinkas.view;

import br.com.quinkas.dao.ConnectionFactory;
import br.com.quinkas.manter.ManterPrincipal;
import br.com.quinkas.manter.ManterProfessor;
import br.com.quinkas.util.CorPainel;
import br.com.quinkas.util.ErroEfeito;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author Felipe-Sistema
 */
public class PnProfessor extends javax.swing.JPanel {

    /**
     * Creates new form pnProfessor
     */
    public PnProfessor() {
        initComponents();
        try {
            ConnectionFactory.getConnection();
        } catch (Exception ex) {
            try {
                ConnectionFactory.criarBancoDeDados();
            } catch (Exception ex2) {
                JOptionPane.showMessageDialog(null, "Erro de conexão com o banco de dados!\nVerifique se a senha de conexão com o banco está correta na classe ConnectionFactory ou se o servidor MySQL está iniciado.");
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex2);
            }
        }
        pnErro.setVisible(false);
        CorPainel altera = new CorPainel(this);
        Thread t = new Thread(altera);
        t.start();
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                txLogin.requestFocus();
            }
        });
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
        txLogin = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btEntrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txSenha = new javax.swing.JPasswordField();
        lbCadastrar = new javax.swing.JLabel();
        pnErro = new javax.swing.JPanel();
        lbMensagemErro = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 20), new java.awt.Dimension(0, 20), new java.awt.Dimension(32767, 10));
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(10, 32767));
        lbRetorno = new javax.swing.JLabel();
        filler9 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(38, 0), new java.awt.Dimension(38, 0), new java.awt.Dimension(10, 32767));

        setBackground(new java.awt.Color(0, 0, 102));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setLayout(new java.awt.GridBagLayout());

        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(319, 250));

        txLogin.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txLogin.setForeground(new java.awt.Color(0, 102, 204));
        txLogin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email");

        btEntrar.setBackground(new java.awt.Color(4, 12, 167));
        btEntrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btEntrar.setText("ENTRAR");
        btEntrar.setBorder(null);
        btEntrar.setBorderPainted(false);
        btEntrar.setContentAreaFilled(false);
        btEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btEntrar.setFocusPainted(false);
        btEntrar.setOpaque(true);
        btEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btEntrarMouseClicked(evt);
            }
        });
        btEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntrarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Senha");

        txSenha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txSenha.setForeground(new java.awt.Color(0, 102, 204));
        txSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));

        lbCadastrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbCadastrar.setForeground(new java.awt.Color(51, 255, 255));
        lbCadastrar.setText("Cadastrar");
        lbCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbCadastrar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lbCadastrarMouseMoved(evt);
            }
        });
        lbCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbCadastrarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbCadastrarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbCadastrar)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btEntrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                                .addComponent(txLogin, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txSenha, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 134, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(139, 139, 139))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(136, 136, 136))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbCadastrar)
                .addGap(24, 24, 24))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        add(jPanel1, gridBagConstraints);

        pnErro.setBackground(new java.awt.Color(102, 0, 0));
        pnErro.setMinimumSize(new java.awt.Dimension(0, 0));
        pnErro.setPreferredSize(new java.awt.Dimension(600, 40));
        pnErro.setLayout(new java.awt.GridBagLayout());

        lbMensagemErro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbMensagemErro.setForeground(new java.awt.Color(255, 255, 255));
        lbMensagemErro.setText("Login/Senha Inválida.");
        pnErro.add(lbMensagemErro, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.weightx = 0.1;
        add(pnErro, gridBagConstraints);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/quinkas/imagem/senac_logo.png"))); // NOI18N
        jLabel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel3MouseMoved(evt);
            }
        });
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_END;
        add(jLabel5, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Desenvolvido pelos alunos: Érick, Felipe, Luiza e Robson.");
        jLabel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel3MouseMoved(evt);
            }
        });
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_END;
        add(jLabel3, gridBagConstraints);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/quinkas/imagem/logo_prof.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        add(jLabel1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weighty = 0.1;
        add(filler1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        add(filler2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.weighty = 0.1;
        add(filler3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 0.1;
        add(filler4, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 0.1;
        add(filler5, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        add(filler6, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 4;
        add(filler7, gridBagConstraints);

        lbRetorno.setForeground(new java.awt.Color(255, 255, 255));
        lbRetorno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/quinkas/imagem/retornar.png"))); // NOI18N
        lbRetorno.setText("Retornar ");
        lbRetorno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbRetorno.setInheritsPopupMenu(false);
        lbRetorno.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lbRetornoMouseMoved(evt);
            }
        });
        lbRetorno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        add(lbRetorno, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        add(filler9, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 6;
        add(filler8, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void btEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEntrarMouseClicked
        //        FrameNick nick = new FrameNick(this.jframe, jTextField1.getText());
        //        this.jframe.setContentPane(nick);
        //        this.jframe.setVisible(true);
    }//GEN-LAST:event_btEntrarMouseClicked

    private void btEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntrarActionPerformed
        String passText = new String(txSenha.getPassword());
        if (txLogin.getText().equals("") || passText.equals("")) {
            erroLogin();
            return;
        }
        Boolean existe = ManterProfessor.validarLogin(this.txLogin.getText(), passText);
        if (existe) {
            PnProfessorQuestionarios pn1 = new PnProfessorQuestionarios();
            ManterPrincipal.getPrincipal().setContentPane(pn1);
            ManterPrincipal.getPrincipal().setVisible(true);
        } else {
            erroLogin();
        }
    }//GEN-LAST:event_btEntrarActionPerformed

    private void erroLogin() {
        ErroEfeito altera = new ErroEfeito(pnErro);
        Thread t = new Thread(altera);
        t.start();
        txLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 0, 0)));
        txSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 0, 0)));
        txSenha.setText("");
        txLogin.requestFocus();
    }
    private void lbCadastrarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCadastrarMouseMoved
        //180 75 67
        lbCadastrar.setForeground(new java.awt.Color(20, 205, 255));

    }//GEN-LAST:event_lbCadastrarMouseMoved

    private void lbCadastrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCadastrarMouseExited
        lbCadastrar.setForeground(new java.awt.Color(51, 255, 255));
    }//GEN-LAST:event_lbCadastrarMouseExited

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        PnPin pnl = new PnPin();
        ManterPrincipal.getPrincipal().setContentPane(pnl);
        ManterPrincipal.getPrincipal().setVisible(true);
    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseMoved

    private void lbRetornoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbRetornoMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_lbRetornoMouseMoved

    private void lbCadastrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCadastrarMousePressed
        PnProfessorCadastro pnl = new PnProfessorCadastro();
        ManterPrincipal.getPrincipal().setContentPane(pnl);
        ManterPrincipal.getPrincipal().setVisible(true);
    }//GEN-LAST:event_lbCadastrarMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEntrar;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.Box.Filler filler8;
    private javax.swing.Box.Filler filler9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbCadastrar;
    private javax.swing.JLabel lbMensagemErro;
    private javax.swing.JLabel lbRetorno;
    private javax.swing.JPanel pnErro;
    private javax.swing.JTextField txLogin;
    private javax.swing.JPasswordField txSenha;
    // End of variables declaration//GEN-END:variables
}
