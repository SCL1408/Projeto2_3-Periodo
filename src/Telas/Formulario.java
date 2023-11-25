package Telas;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

public class Formulario extends javax.swing.JFrame {


    public Formulario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchCepBtn = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jtNome = new javax.swing.JTextField();
        jlNome = new javax.swing.JLabel();
        jlCEP = new javax.swing.JLabel();
        jtCEP = new javax.swing.JTextField();
        searchCepBtn1 = new javax.swing.JLabel();
        jlLogradouro = new javax.swing.JLabel();
        jtLogradouro = new javax.swing.JTextField();
        jtNumero = new javax.swing.JFormattedTextField();
        jlNumero = new javax.swing.JLabel();
        jcbEstado = new javax.swing.JComboBox<>();
        jlEstado = new javax.swing.JLabel();
        jcbCidade = new javax.swing.JComboBox<>();
        jlCidade = new javax.swing.JLabel();
        jtBairro = new javax.swing.JFormattedTextField();
        jlBairro = new javax.swing.JLabel();
        jtComplemento = new javax.swing.JTextField();
        jlComplemento = new javax.swing.JLabel();
        jlSexo = new javax.swing.JLabel();
        jcbSexo = new javax.swing.JComboBox<>();
        jcbRotulo = new javax.swing.JComboBox<>();
        jlRotulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        foto = new javax.swing.JLabel();
        alien2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtEnderecoFoto = new javax.swing.JTextField();
        jlFoto = new javax.swing.JLabel();
        jtFotoBase64 = new javax.swing.JTextField();
        btnSair = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();

        searchCepBtn.setBackground(new java.awt.Color(0, 92, 184));
        searchCepBtn.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        searchCepBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchCepBtn.setOpaque(true);
        searchCepBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchCepBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchCepBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchCepBtnMouseExited(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 800));

        jPanel1.setBackground(new java.awt.Color(153, 0, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1280, 300));
        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 300));

        jtNome.setBackground(new java.awt.Color(255, 255, 255));

        jlNome.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jlNome.setText("Nome do humano");

        jlCEP.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jlCEP.setText("CEP");

        jtCEP.setBackground(new java.awt.Color(255, 255, 255));

        searchCepBtn1.setBackground(new java.awt.Color(153, 0, 255));
        searchCepBtn1.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        searchCepBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/findBtn.png"))); // NOI18N
        searchCepBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchCepBtn1.setOpaque(true);

        jlLogradouro.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jlLogradouro.setText("Logradouro");

        jtLogradouro.setBackground(new java.awt.Color(255, 255, 255));

        jtNumero.setBackground(new java.awt.Color(255, 255, 255));

        jlNumero.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jlNumero.setText("Número");

        jcbEstado.setBackground(new java.awt.Color(255, 255, 255));
        jcbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbEstado.setBorder(null);
        jcbEstado.setSelectedIndex(-1);

        jlEstado.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jlEstado.setText("Estado");

        jcbCidade.setBackground(new java.awt.Color(255, 255, 255));
        jcbCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbCidade.setBorder(null);
        jcbCidade.setEnabled(false);
        jcbCidade.setSelectedIndex(-1);

        jlCidade.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jlCidade.setText("Cidade");

        jtBairro.setBackground(new java.awt.Color(255, 255, 255));

        jlBairro.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jlBairro.setText("Bairro");

        jtComplemento.setBackground(new java.awt.Color(255, 255, 255));

        jlComplemento.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jlComplemento.setText("Complemento");

        jlSexo.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jlSexo.setText("Sexo");

        jcbSexo.setBackground(new java.awt.Color(255, 255, 255));
        jcbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbSexo.setBorder(null);
        jcbEstado.setSelectedIndex(-1);

        jcbRotulo.setBackground(new java.awt.Color(255, 255, 255));
        jcbRotulo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbRotulo.setBorder(null);
        jcbEstado.setSelectedIndex(-1);

        jlRotulo.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jlRotulo.setText("Rótulo");

        foto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fotoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(foto, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(foto, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
        );

        alien2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Alien2.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Alien3.gif"))); // NOI18N

        jtEnderecoFoto.setBackground(new java.awt.Color(255, 255, 255));
        jtEnderecoFoto.setEnabled(false);

        jlFoto.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jlFoto.setText("Foto");

        jtFotoBase64.setBackground(new java.awt.Color(255, 255, 255));
        jtFotoBase64.setEnabled(false);

        btnSair.setBackground(new java.awt.Color(0, 102, 255));
        btnSair.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setText("Sair");
        btnSair.setBorder(null);
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnSalvar.setBackground(new java.awt.Color(0, 102, 255));
        btnSalvar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("Salvar");
        btnSalvar.setBorder(null);
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtFotoBase64)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlComplemento)
                                    .addComponent(jtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlBairro))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlCidade)
                                    .addComponent(jcbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlEstado)
                                    .addComponent(jcbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jlFoto)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlSexo)
                                    .addComponent(jcbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlRotulo)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jcbRotulo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(51, 51, 51)
                                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jlNome)
                                        .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(12, 12, 12)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jlCEP)
                                            .addGap(74, 74, 74)
                                            .addComponent(searchCepBtn1))
                                        .addComponent(jtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jlLogradouro))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jlNumero)
                                        .addComponent(jtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jtEnderecoFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(alien2)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel3)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jlFoto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtEnderecoFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jlNome)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jlLogradouro)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jlCEP)
                                            .addComponent(searchCepBtn1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlNumero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jlCidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jlEstado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jlBairro)
                                    .addComponent(jlComplemento))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtComplemento)
                                    .addComponent(jtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlSexo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlRotulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jcbRotulo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(alien2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtFotoBase64))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchCepBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchCepBtnMouseClicked
    }//GEN-LAST:event_searchCepBtnMouseClicked

    private void searchCepBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchCepBtnMouseEntered
        searchCepBtn.setBackground(new Color(0, 55, 177));
        searchCepBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/findBtnBranco.png")));
    }//GEN-LAST:event_searchCepBtnMouseEntered

    private void searchCepBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchCepBtnMouseExited
        searchCepBtn.setBackground(new Color(0, 92, 184));
        searchCepBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/findBtn.png")));
    }//GEN-LAST:event_searchCepBtnMouseExited

    private void fotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fotoMouseClicked
        JFileChooser NewFoto = new JFileChooser();
        NewFoto.setDialogTitle("Selecione uma Imagem");
        NewFoto.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int op = NewFoto.showOpenDialog(this);
        if (op == JFileChooser.APPROVE_OPTION) {
            File file = new File("");
            file = NewFoto.getSelectedFile();
            String NomeArquivo = file.getAbsolutePath();
            ImageIcon imagem = new ImageIcon(file.getPath());
            foto.setIcon(new ImageIcon(imagem.getImage().getScaledInstance(foto.getWidth(), foto.getHeight(), Image.SCALE_DEFAULT)));
        }
    }//GEN-LAST:event_fotoMouseClicked

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alien2;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel foto;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> jcbCidade;
    private javax.swing.JComboBox<String> jcbEstado;
    private javax.swing.JComboBox<String> jcbRotulo;
    private javax.swing.JComboBox<String> jcbSexo;
    private javax.swing.JLabel jlBairro;
    private javax.swing.JLabel jlCEP;
    private javax.swing.JLabel jlCidade;
    private javax.swing.JLabel jlComplemento;
    private javax.swing.JLabel jlEstado;
    private javax.swing.JLabel jlFoto;
    private javax.swing.JLabel jlLogradouro;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlNumero;
    private javax.swing.JLabel jlRotulo;
    private javax.swing.JLabel jlSexo;
    private javax.swing.JFormattedTextField jtBairro;
    private javax.swing.JTextField jtCEP;
    private javax.swing.JTextField jtComplemento;
    private javax.swing.JTextField jtEnderecoFoto;
    private javax.swing.JTextField jtFotoBase64;
    private javax.swing.JTextField jtLogradouro;
    private javax.swing.JTextField jtNome;
    private javax.swing.JFormattedTextField jtNumero;
    private javax.swing.JLabel searchCepBtn;
    private javax.swing.JLabel searchCepBtn1;
    // End of variables declaration//GEN-END:variables
}
