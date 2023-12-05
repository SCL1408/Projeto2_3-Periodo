package Telas;

import APIs.CIdadesIBGE;
import static APIs.EstadosIBGE.leEstadosIBGE;
import static APIs.CIdadesIBGE.leCidadesIBGE;
import APIs.ViaCEP;
import APIs.ViaCEPException;
import dao.HumanoDao;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import modelos.ModeloHumano;
import java.util.logging.Logger;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.WARNING_MESSAGE;

public class Formulario extends javax.swing.JFrame {


    public Formulario() {
        initComponents();
    }
    
    public Formulario(ModeloHumano humanoSelecionado) {
        initComponents();
        preencherCampos(humanoSelecionado);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchCepBtn = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jtNome = new javax.swing.JTextField();
        jlNome = new javax.swing.JLabel();
        jlCEP = new javax.swing.JLabel();
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
        btnVoltar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtFotoBase64 = new javax.swing.JLabel();
        listaSiglas = new java.awt.List();
        jtCEP = new javax.swing.JFormattedTextField();

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
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 0, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1280, 300));
        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 300));

        jlNome.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jlNome.setText("Nome do humano");

        jlCEP.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jlCEP.setText("CEP");

        searchCepBtn1.setBackground(new java.awt.Color(153, 0, 255));
        searchCepBtn1.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        searchCepBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/findBtn.png"))); // NOI18N
        searchCepBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchCepBtn1.setOpaque(true);
        searchCepBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchCepBtn1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchCepBtn1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchCepBtn1MouseExited(evt);
            }
        });

        jlLogradouro.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jlLogradouro.setText("Logradouro");

        jlNumero.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jlNumero.setText("Número");

        jcbEstado.setBorder(null);
        jcbEstado.setSelectedIndex(-1);
        jcbEstado.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jcbEstadoPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jlEstado.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jlEstado.setText("Estado");

        jcbCidade.setBorder(null);
        jcbCidade.setEnabled(false);
        jcbCidade.setSelectedIndex(-1);

        jlCidade.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jlCidade.setText("Cidade");

        jlBairro.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jlBairro.setText("Bairro");

        jlComplemento.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jlComplemento.setText("Complemento");

        jlSexo.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jlSexo.setText("Sexo");

        jcbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        jcbSexo.setBorder(null);
        jcbEstado.setSelectedIndex(-1);
        jcbSexo.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jcbSexoPopupMenuWillBecomeVisible(evt);
            }
        });

        jcbRotulo.setBorder(null);
        jcbEstado.setSelectedIndex(-1);
        jcbRotulo.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jcbRotuloPopupMenuWillBecomeVisible(evt);
            }
        });

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
            .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        alien2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Alien2.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Alien3.gif"))); // NOI18N

        jtEnderecoFoto.setEnabled(false);

        jlFoto.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jlFoto.setText("Foto");

        btnVoltar.setBackground(new java.awt.Color(0, 102, 255));
        btnVoltar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("Voltar");
        btnVoltar.setBorder(null);
        btnVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

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

        jScrollPane1.setToolTipText("");
        jScrollPane1.setEnabled(false);
        jScrollPane1.setFocusable(false);
        jScrollPane1.setOpaque(false);
        jScrollPane1.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(jtFotoBase64);

        listaSiglas.setVisible(false);

        try {
            jtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtCEP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtCEPKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
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
                                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                                        .addComponent(jtCEP, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jlLogradouro))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jlNumero)
                                        .addComponent(jtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jtEnderecoFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(alien2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listaSiglas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
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
                                        .addComponent(jlLogradouro)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlNome, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jlCEP, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(searchCepBtn1, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                                            .addComponent(jtCEP)))))
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
                                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(alien2)
                            .addComponent(listaSiglas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
            jtEnderecoFoto.setText(NomeArquivo);

            Path pathToImage = Paths.get(NomeArquivo);

            byte[] imageBytes = null;
            try {
                imageBytes = Files.readAllBytes(pathToImage);
            } catch (IOException ex) {
                Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
            }
            String base64EncodedImageBytes = Base64.getEncoder().encodeToString(imageBytes);
            jtFotoBase64.setText(base64EncodedImageBytes);
        }
    }//GEN-LAST:event_fotoMouseClicked

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TelaPrincipal novaTela = new TelaPrincipal();
        novaTela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        new Thread(){
            @Override
            public void run(){
                try{
                    atualizarEstados();
                }
                catch(Exception ex){
                    Thread.interrupted();
                }
            }
        }.start();
    }//GEN-LAST:event_formWindowOpened

    private void jcbSexoPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jcbSexoPopupMenuWillBecomeVisible
        new Thread(){
            @Override
            public void run(){
                try{
                    atualizarSexo();
                }
                catch(Exception ex){
                    Thread.interrupted();
                }
            }
        }.start();
    }//GEN-LAST:event_jcbSexoPopupMenuWillBecomeVisible

    private void jcbEstadoPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jcbEstadoPopupMenuWillBecomeInvisible
        if (jcbEstado.getSelectedIndex() != -1) {
            new Thread(){
            @Override
            public void run(){
                try{
                    atualizarCidades();
                    jcbCidade.setEnabled(true);
                } catch (Exception ex){
                    Thread.interrupted();
                }
            }
        }.start();
            
        }
        else{
            jcbCidade.setEnabled(false);
        }
    }//GEN-LAST:event_jcbEstadoPopupMenuWillBecomeInvisible

    private void jcbRotuloPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jcbRotuloPopupMenuWillBecomeVisible
        new Thread() {
            @Override
            public void run() {
                try {
                    atualizarRotulos();
                } catch (Exception ex) {
                    Thread.interrupted();
                }
            }
        }.start();
    }//GEN-LAST:event_jcbRotuloPopupMenuWillBecomeVisible

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (jtNome.getText() == null
                || jtLogradouro.getText() == null
                || jtNumero.getText() == null
                || jtBairro.getText() == null
                || jtCEP.getText() == null
                || jcbCidade.getSelectedIndex()==-1
                || jcbEstado.getSelectedIndex()==-1
                || jcbSexo.getSelectedIndex()==-1
                || jcbRotulo.getSelectedIndex()==-1) {
            JOptionPane.showMessageDialog(null, "Dados Inválidos");//exibe mensagem de invalidez
            jtNome.requestFocus();
        } else {            
            new Thread(){
                @Override
                public void run(){
                    try {
                        ModeloHumano humano = new ModeloHumano();

                        humano.setNomeHumano(jtNome.getText());
                        humano.setLogradouro(jtLogradouro.getText());
                        humano.setNumero(Integer.parseInt(jtNumero.getText()));
                        humano.setComplemento(jtComplemento.getText());
                        humano.setBairro(jtBairro.getText());
                        humano.setCep(jtCEP.getText());
                        humano.setSexo(jcbSexo.getSelectedItem().toString());
                        humano.setRotulo(jcbRotulo.getSelectedItem().toString());
                        humano.setCidade(jcbCidade.getSelectedItem().toString());
                        humano.setEstado(jcbEstado.getSelectedItem().toString());

                        HumanoDao humanoDao = new HumanoDao();
                        humanoDao.insertHumano(humano);
                        
                        TelaPrincipal novaTela = new TelaPrincipal();
                        novaTela.setVisible(true);
                        btnVoltarActionPerformed(evt);
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), " 5!", ERROR_MESSAGE);
                    }
                }
            }.start();
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void searchCepBtn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchCepBtn1MouseEntered
        searchCepBtn1.setBackground(new Color(163, 10, 255));
        searchCepBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/findBtnBranco.png")));
    }//GEN-LAST:event_searchCepBtn1MouseEntered

    private void searchCepBtn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchCepBtn1MouseExited
        searchCepBtn1.setBackground(new Color(153, 0, 255));
        searchCepBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/findBtn.png")));
    }//GEN-LAST:event_searchCepBtn1MouseExited

    private void searchCepBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchCepBtn1MouseClicked
        consultarCep();
    }//GEN-LAST:event_searchCepBtn1MouseClicked

    private void jtCEPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCEPKeyReleased
        if (evt.getExtendedKeyCode() == evt.VK_ENTER) {
            consultarCep();
        }
    }//GEN-LAST:event_jtCEPKeyReleased

    private void preencherCampos(ModeloHumano humanoSelecionado){
        jtNome.setText(humanoSelecionado.getNomeHumano());
        jtLogradouro.setText(humanoSelecionado.getLogradouro());
        jtNumero.setText(String.valueOf(humanoSelecionado.getNumero()));
        if(humanoSelecionado.getComplemento()==null)
            jtComplemento.setText(null);
        else
            jtComplemento.setText(humanoSelecionado.getComplemento());
        jtBairro.setText(humanoSelecionado.getBairro());
        jcbCidade.setSelectedItem(humanoSelecionado.getCidade());
        jcbEstado.setSelectedItem(humanoSelecionado.getEstado());
        jcbSexo.setSelectedItem(humanoSelecionado.getSexo());
        jcbRotulo.setSelectedItem(humanoSelecionado.getRotulo());
        jtCEP.setText(humanoSelecionado.getCep());
    }
    
    private void atualizarEstados() {
        try {
            String[][] listaEstados = leEstadosIBGE();
            jcbEstado.removeAllItems();
            for (String[] estado : listaEstados) {
                jcbEstado.addItem(estado[0]);
                listaSiglas.add(estado[1]);
            }
            jcbEstado.setSelectedIndex(-1);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO 1!", ERROR_MESSAGE);
        }
    }
    
    private void atualizarCidades() {
        try {
            jcbCidade.removeAllItems();
            String[] listaCidade = leCidadesIBGE(listaSiglas.getItem(jcbEstado.getSelectedIndex()));
            for (String cidade : listaCidade) {
                jcbCidade.addItem(cidade);
            }
            jcbCidade.setSelectedIndex(-1);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO 2!", ERROR_MESSAGE);
        }
    }
    
    private void atualizarCidades(String sigla){
        try {
            jcbCidade.removeAllItems();
            String[] listaCidade = leCidadesIBGE(sigla);
            for (String cidade : listaCidade) {
                jcbCidade.addItem(cidade);
            }
            jcbCidade.setSelectedIndex(-1);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO 5!", ERROR_MESSAGE);
        }
    }
    
    private void atualizarSexo() {
        try {
            jcbSexo.removeAllItems();
            HumanoDao dao = new HumanoDao();
            String[] sexos = dao.retrieveSexo();
            for (String sexo : sexos) {
                jcbSexo.addItem(sexo);
            }
            jcbSexo.setSelectedIndex(-1);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO 3!", ERROR_MESSAGE);
        }
    }
    
    private void atualizarRotulos() {
        try {
            jcbRotulo.removeAllItems();
            HumanoDao dao = new HumanoDao();
            String[] rotulos = dao.retrieveRotulo();
            for (String rotulo : rotulos) {
                jcbRotulo.addItem(rotulo);
            }
            jcbRotulo.setSelectedIndex(-1);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO 4!", ERROR_MESSAGE);
        }
    }

    private void consultarCep() {
        if (jtCEP.getText().trim().length() == 9) {
            ViaCEP viaCep = new ViaCEP();
            
            new Thread() {
                @Override
                public void run() {
                    try {
                        searchCepBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/loading2.gif")));
                        searchCepBtn1.setOpaque(false);
                        viaCep.buscar(jtCEP.getText());
                        
                        ModeloHumano estado = new ModeloHumano(viaCep.getUf());
                        atualizarCidades(estado.getSigla());
                        atualizarEstados();

                        jtBairro.setText(viaCep.getBairro());
                        jtLogradouro.setText(viaCep.getLogradouro());
                        jcbEstado.setSelectedItem(estado.getEstado());
                        jcbCidade.setEnabled(true);
                        jcbCidade.setSelectedItem(viaCep.getLocalidade());
                        searchCepBtn1.setOpaque(true);
                    } catch (ViaCEPException ex) {
                        JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO 6!", ERROR_MESSAGE);
                    }
                    searchCepBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/findBtn.png")));
                }
            }.start();
        } else {
            JOptionPane.showMessageDialog(null, "CEP inválido!", "ERRO!", WARNING_MESSAGE);
        }
    }
    
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
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel foto;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
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
    private javax.swing.JFormattedTextField jtCEP;
    private javax.swing.JTextField jtComplemento;
    private javax.swing.JTextField jtEnderecoFoto;
    private javax.swing.JLabel jtFotoBase64;
    private javax.swing.JTextField jtLogradouro;
    private javax.swing.JTextField jtNome;
    private javax.swing.JFormattedTextField jtNumero;
    private java.awt.List listaSiglas;
    private javax.swing.JLabel searchCepBtn;
    private javax.swing.JLabel searchCepBtn1;
    // End of variables declaration//GEN-END:variables
}
