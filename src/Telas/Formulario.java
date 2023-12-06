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
import javax.swing.SwingConstants;

public class Formulario extends javax.swing.JFrame {

    int idHumano = -1;
    
    public Formulario() {
        initComponents();
    }
    
    public Formulario(ModeloHumano humanoSelecionado) {
        initComponents();
        preencherCampos(humanoSelecionado);
        this.idHumano = humanoSelecionado.getIdHumano();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jLabel3 = new javax.swing.JLabel();
        jtEnderecoFoto = new javax.swing.JTextField();
        jlFoto = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        listaSiglas = new java.awt.List();
        jtCEP = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnTeste = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtFotoBase64 = new javax.swing.JTextArea();

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

        //foto.setHorizontalAlignment(SwingConstants.CENTER);

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Alien8.gif"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Alien3.gif"))); // NOI18N

        btnTeste.setBackground(new java.awt.Color(0, 102, 255));
        btnTeste.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnTeste.setForeground(new java.awt.Color(255, 255, 255));
        btnTeste.setText("Teste");
        btnTeste.setBorder(null);
        btnTeste.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTeste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTesteActionPerformed(evt);
            }
        });

        jtFotoBase64.setColumns(20);
        jtFotoBase64.setRows(5);
        jtFotoBase64.setEnabled(false);
        jScrollPane2.setViewportView(jtFotoBase64);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnTeste, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                        .addComponent(jtEnderecoFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlComplemento)
                                    .addComponent(jtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlBairro)))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(listaSiglas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlCidade)
                                    .addComponent(jcbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlEstado)
                                    .addComponent(jcbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(listaSiglas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnTeste, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                || jtFotoBase64.getText() == null
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
                    inserirDB();
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
        
        new Thread() {
            @Override
            public void run() {
                try {
                    consultarCep();
                } catch (Exception ex) {
                    Thread.interrupted();
                }
            }
        }.start();
    }//GEN-LAST:event_searchCepBtn1MouseClicked

    private void jtCEPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCEPKeyReleased
        if (evt.getExtendedKeyCode() == evt.VK_ENTER) {
            consultarCep();
        }
    }//GEN-LAST:event_jtCEPKeyReleased

    private void btnTesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTesteActionPerformed
        new Thread() {
            @Override
            public void run() {
                jtCEP.setText("84072340");
                atualizarRotulos();
                atualizarSexo();
                consultarCep();
                
                jcbRotulo.setSelectedIndex(1);
                jcbSexo.setSelectedIndex(0);
                jtNumero.setText("123");
                jtComplemento.setText("teeeeeste");
                jtNome.setText("0_teste");
                jtFotoBase64.setText("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");
            }
        }.start();
    }//GEN-LAST:event_btnTesteActionPerformed

    private void inserirDB() {
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
            humano.setFotoHumano(foto.getText());

            HumanoDao humanoDao = new HumanoDao();
            if(idHumano == -1){
                humanoDao.insertHumano(humano);
            }else{
                humano.setIdHumano(idHumano);
                humanoDao.updateHumano(humano);
            }
            

            TelaPrincipal novaTela = new TelaPrincipal();
            novaTela.setVisible(true);
            this.dispose();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO 1!", ERROR_MESSAGE);
        }
    }
    
    private void preencherCampos(ModeloHumano humanoSelecionado){
        new Thread(){
            @Override
            public void run() {
                try {
                    jtNome.setText(humanoSelecionado.getNomeHumano());
                    jtLogradouro.setText(humanoSelecionado.getLogradouro());
                    jtNumero.setText(String.valueOf(humanoSelecionado.getNumero()));
                    if (humanoSelecionado.getComplemento() == null) {
                        jtComplemento.setText(null);
                    } else {
                        jtComplemento.setText(humanoSelecionado.getComplemento());
                    }
                    jtBairro.setText(humanoSelecionado.getBairro());
                    jtCEP.setText(humanoSelecionado.getCep());
                    jtFotoBase64.setText(humanoSelecionado.getFotoHumano());
                    atualizarSexo();
                    atualizarRotulos();
                    atualizarEstados();
                    
                    ModeloHumano estado = new ModeloHumano(humanoSelecionado.getEstado(), 1);
                    atualizarCidades(estado.getSigla());
                    
                    jcbCidade.setSelectedItem(humanoSelecionado.getCidade());
                    jcbCidade.setEnabled(true);
                    jcbEstado.setSelectedItem(humanoSelecionado.getEstado());
                    jcbSexo.setSelectedItem(humanoSelecionado.getSexo());
                    jcbRotulo.setSelectedItem(humanoSelecionado.getRotulo());
                }
                catch(Exception ex) {
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO 2!", ERROR_MESSAGE);
                }
            }
        }.start();
        
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
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO 3!", ERROR_MESSAGE);
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
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO 4!", ERROR_MESSAGE);
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
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO 6!", ERROR_MESSAGE);
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
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO 7!", ERROR_MESSAGE);
        }
    }

    private void consultarCep() {
        if (jtCEP.getText().trim().length() == 9) {
            ViaCEP viaCep = new ViaCEP();

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
                JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO 8!", ERROR_MESSAGE);
            }
            searchCepBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/findBtn.png")));
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
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnTeste;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel foto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
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
    private javax.swing.JTextArea jtFotoBase64;
    private javax.swing.JTextField jtLogradouro;
    private javax.swing.JTextField jtNome;
    private javax.swing.JFormattedTextField jtNumero;
    private java.awt.List listaSiglas;
    private javax.swing.JLabel searchCepBtn1;
    // End of variables declaration//GEN-END:variables
}
