/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.quinkas.view;

import br.com.quinkas.entidade.Professor;
import br.com.quinkas.manter.ManterPrincipal;
import br.com.quinkas.manter.ManterProfessor;
import br.com.quinkas.util.CorPainel;
import br.com.quinkas.util.ErroEfeito;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author Felipe-Sistema
 */
public class PnProfessorCadastro extends javax.swing.JPanel {

    /**
     * Creates new form pnProfessorCadastro
     */
    public PnProfessorCadastro() {
        initComponents();
        pnErro.setVisible(false);
        CorPainel altera = new CorPainel(this);
        Thread t = new Thread(altera);
        t.start();
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                txNome.requestFocus();
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

        pnErro = new javax.swing.JPanel();
        lbMensagemErro = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btEntrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txSenha = new javax.swing.JPasswordField();
        txEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbRetorno = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 20), new java.awt.Dimension(0, 20), new java.awt.Dimension(32767, 20));

        setBackground(new java.awt.Color(0, 0, 102));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setLayout(new java.awt.GridBagLayout());

        pnErro.setBackground(new java.awt.Color(102, 0, 0));
        pnErro.setMinimumSize(new java.awt.Dimension(0, 0));
        pnErro.setPreferredSize(new java.awt.Dimension(600, 40));
        pnErro.setLayout(new java.awt.GridBagLayout());

        lbMensagemErro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbMensagemErro.setForeground(new java.awt.Color(255, 255, 255));
        lbMensagemErro.setText("Você é um(a) professor(a) ou um(a) burro(a)? Preencha os campos corretamente.");
        pnErro.add(lbMensagemErro, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.weightx = 0.1;
        add(pnErro, gridBagConstraints);

        jPanel1.setMinimumSize(new java.awt.Dimension(600, 250));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 250));

        txNome.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        txNome.setForeground(new java.awt.Color(0, 102, 204));
        txNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nome");

        btEntrar.setBackground(new java.awt.Color(4, 12, 167));
        btEntrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btEntrar.setText("CADASTRAR");
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

        txSenha.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        txSenha.setForeground(new java.awt.Color(0, 102, 204));
        txSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));

        txEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txEmail.setForeground(new java.awt.Color(0, 102, 204));
        txEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Email");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addComponent(jLabel7))
                                .addComponent(txEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(txSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btEntrar, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 512, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txNome, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        add(jPanel1, gridBagConstraints);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/quinkas/imagem/logo_prof.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        add(jLabel1, gridBagConstraints);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/quinkas/imagem/senac_logo.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_END;
        add(jLabel5, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Desenvolvido pelos alunos: Érick, Felipe, Luiza e Robson.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_END;
        add(jLabel3, gridBagConstraints);

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
        gridBagConstraints.gridy = 6;
        add(lbRetorno, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weighty = 0.1;
        add(filler1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.weighty = 0.1;
        add(filler2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        add(filler3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 6;
        add(filler4, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 0.1;
        add(filler5, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 0.1;
        add(filler6, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 7;
        add(filler7, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void btEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEntrarMouseClicked
        //        FrameNick nick = new FrameNick(this.jframe, jTextField1.getText());
        //        this.jframe.setContentPane(nick);
        //        this.jframe.setVisible(true);
    }//GEN-LAST:event_btEntrarMouseClicked

    private void btEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntrarActionPerformed
        String passText = new String(txSenha.getPassword());
        passText = passText.trim();
        String nome = txNome.getText().trim();
        String email = txEmail.getText().trim();
        txNome.setText(nome);
        txSenha.setText(passText);
        txEmail.setText(email);
        if (nome.equals("") || email.equals("") || passText.equals("")) {
            erroCadastro();
            return;
        }
        if (ManterProfessor.emailExiste(email)) {
            JOptionPane.showMessageDialog(null, "Email já cadastrado!");
        } else {
            Professor professor = new Professor();
            professor.setNome(nome);
            professor.setSenha(passText);
            professor.setEmail(email);
            try {
                ManterProfessor.cadastrarProfessor(professor);
                PnProfessorQuestionarios pn1 = new PnProfessorQuestionarios();
                ManterPrincipal.getPrincipal().setContentPane(pn1);
                ManterPrincipal.getPrincipal().setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(lbRetorno, "Erro grave ao salvar. Verifique sua conexão. " + e.getMessage());
            }
        }
    }//GEN-LAST:event_btEntrarActionPerformed

    private void erroCadastro() {
        ErroEfeito altera = new ErroEfeito(pnErro);
        Thread t = new Thread(altera);
        t.start();

        String passText = new String(txSenha.getPassword());
        passText = passText.trim();
        String nome = txNome.getText().trim();
        String email = txEmail.getText().trim();
        if (passText.equals("")) {
            txSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 0, 0)));
            txSenha.requestFocus();
        }
        if (email.equals("")) {
            txEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 0, 0)));
            txEmail.requestFocus();
        }
        if (nome.equals("")) {
            txNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 0, 0)));
            txNome.requestFocus();
        }
        txSenha.setText("");
    }
    private void lbRetornoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbRetornoMousePressed
        PnProfessor pnl = new PnProfessor();
        ManterPrincipal.getPrincipal().setContentPane(pnl);
        ManterPrincipal.getPrincipal().setVisible(true);
    }//GEN-LAST:event_lbRetornoMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEntrar;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbMensagemErro;
    private javax.swing.JLabel lbRetorno;
    private javax.swing.JPanel pnErro;
    private javax.swing.JTextField txEmail;
    private javax.swing.JTextField txNome;
    private javax.swing.JPasswordField txSenha;
    // End of variables declaration//GEN-END:variables
}
