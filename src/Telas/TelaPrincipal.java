package Telas;

import dao.EstatisticaDao;
import dao.HumanoDao;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import modelos.ModeloEstatistica;
import modelos.ModeloHumano;


import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

public class TelaPrincipal extends javax.swing.JFrame {

    ModeloHumano humanoSelecionado = new ModeloHumano();
    
    public TelaPrincipal() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelChart = new javax.swing.JPanel();
        panelLog = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        panelHeader = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        labelHeader = new javax.swing.JLabel();
        alien1 = new javax.swing.JLabel();
        panelChartLog = new javax.swing.JPanel();
        panelTabela = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbHumanos = new javax.swing.JTable();
        listaIDS = new java.awt.List();
        listaFotos = new java.awt.List();
        panelBtns = new javax.swing.JPanel();
        btnCadastrar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        panelChart.setPreferredSize(new Dimension(300, 250));
        panelChart.setBackground(Color.RED); // Apenas para identificação visual

        javax.swing.GroupLayout panelChartLayout = new javax.swing.GroupLayout(panelChart);
        panelChart.setLayout(panelChartLayout);
        panelChartLayout.setHorizontalGroup(
            panelChartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panelChartLayout.setVerticalGroup(
            panelChartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        panelLog.setPreferredSize(new Dimension(300, 250));
        //panelLog.setBackground(Color.BLUE); // Apenas para identificação visual
        panelLog.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout panelLogLayout = new javax.swing.GroupLayout(panelLog);
        panelLog.setLayout(panelLogLayout);
        panelLogLayout.setHorizontalGroup(
            panelLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panelLogLayout.setVerticalGroup(
            panelLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 0, 255));
        setMaximumSize(new java.awt.Dimension(1280, 800));
        setMinimumSize(new java.awt.Dimension(1280, 800));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 0, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1280, 300));
        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 300));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 300));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));

        panelHeader.setBackground(new java.awt.Color(255, 0, 51));
        panelHeader.setForeground(new java.awt.Color(255, 0, 51));
        panelHeader.setOpaque(false);
        panelHeader.setLayout(new javax.swing.BoxLayout(panelHeader, javax.swing.BoxLayout.LINE_AXIS));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Alien6.gif"))); // NOI18N
        panelHeader.add(jLabel3);

        labelHeader.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        labelHeader.setForeground(new java.awt.Color(255, 255, 255));
        labelHeader.setText("Controle");
        panelHeader.add(labelHeader);

        alien1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Alien1.png"))); // NOI18N
        panelHeader.add(alien1);

        jPanel1.add(panelHeader);

        panelChartLog.setLayout(new javax.swing.BoxLayout(panelChartLog, javax.swing.BoxLayout.X_AXIS));

        panelChartLog.add(panelChart);
        panelChartLog.add(Box.createHorizontalGlue());
        panelChartLog.add(panelLog);

        jPanel1.add(panelChartLog);

        panelTabela.setLayout(new java.awt.CardLayout());

        tbHumanos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Sexo", "Rotulo", "Logradouro", "Numero", "Complemento", "Bairro", "Cidade", "Estado", "CEP"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbHumanos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbHumanosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbHumanos);
        if (tbHumanos.getColumnModel().getColumnCount() > 0) {
            tbHumanos.getColumnModel().getColumn(0).setResizable(false);
            tbHumanos.getColumnModel().getColumn(1).setResizable(false);
            tbHumanos.getColumnModel().getColumn(2).setResizable(false);
            tbHumanos.getColumnModel().getColumn(3).setResizable(false);
            tbHumanos.getColumnModel().getColumn(4).setResizable(false);
            tbHumanos.getColumnModel().getColumn(5).setResizable(false);
            tbHumanos.getColumnModel().getColumn(6).setResizable(false);
            tbHumanos.getColumnModel().getColumn(7).setResizable(false);
            tbHumanos.getColumnModel().getColumn(8).setResizable(false);
            tbHumanos.getColumnModel().getColumn(9).setResizable(false);
        }

        panelTabela.add(jScrollPane1, "card2");
        panelTabela.add(listaIDS, "card3");
        panelTabela.add(listaFotos, "card4");

        jPanel1.add(panelTabela);

        panelBtns.setOpaque(false);

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBtnsLayout = new javax.swing.GroupLayout(panelBtns);
        panelBtns.setLayout(panelBtnsLayout);
        panelBtnsLayout.setHorizontalGroup(
            panelBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtnsLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 752, Short.MAX_VALUE)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        panelBtnsLayout.setVerticalGroup(
            panelBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBtnsLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(panelBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        jPanel1.add(panelBtns);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        atualizarTela();
        renderizarTabela();
    }//GEN-LAST:event_formWindowOpened

    private void tbHumanosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbHumanosMouseClicked
        if(tbHumanos.getSelectedRow()!=-1){
            humanoSelecionado.setIdHumano(Integer.parseInt(listaIDS.getItem(tbHumanos.getSelectedRow())));
            humanoSelecionado.setFotoHumano(listaFotos.getItem(tbHumanos.getSelectedRow()));
            humanoSelecionado.setNomeHumano(tbHumanos.getValueAt(tbHumanos.getSelectedRow(), 0).toString());
            humanoSelecionado.setSexo(tbHumanos.getValueAt(tbHumanos.getSelectedRow(), 1).toString());
            humanoSelecionado.setRotulo(tbHumanos.getValueAt(tbHumanos.getSelectedRow(), 2).toString());
            humanoSelecionado.setLogradouro(tbHumanos.getValueAt(tbHumanos.getSelectedRow(), 3).toString());
            humanoSelecionado.setNumero(Integer.parseInt(tbHumanos.getValueAt(tbHumanos.getSelectedRow(), 4).toString()));
            if(tbHumanos.getValueAt(tbHumanos.getSelectedRow(), 5)!=null)
                humanoSelecionado.setComplemento(tbHumanos.getValueAt(tbHumanos.getSelectedRow(), 5).toString());
            humanoSelecionado.setBairro(tbHumanos.getValueAt(tbHumanos.getSelectedRow(), 6).toString());
            humanoSelecionado.setCidade(tbHumanos.getValueAt(tbHumanos.getSelectedRow(), 7).toString());
            humanoSelecionado.setEstado(tbHumanos.getValueAt(tbHumanos.getSelectedRow(), 8).toString());
            humanoSelecionado.setCep(tbHumanos.getValueAt(tbHumanos.getSelectedRow(), 9).toString());
        }
    }//GEN-LAST:event_tbHumanosMouseClicked

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (tbHumanos.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Não tem como editar o nada", "NADA SELECIONADO!", WARNING_MESSAGE);
        }
        else{
            Formulario novaTela = new Formulario(humanoSelecionado);
            novaTela.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        Formulario novaTela = new Formulario();
            novaTela.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void atualizarTela( ){
        new Thread(){
            @Override
            public void run(){
                try{
                    ModeloEstatistica estatistica = new ModeloEstatistica();
                    EstatisticaDao estatisticaDao = new EstatisticaDao();
                    DefaultCategoryDataset graficoBarra = new DefaultCategoryDataset();

                    estatisticaDao.retrieve(estatistica);
//                    System.out.println(estatistica.getCountLogInsert());
//                    System.out.println(estatistica.getCountLogUpdate());
//                    System.out.println(estatistica.getCountLogDelete());

                    graficoBarra.setValue(estatistica.getCountLogInsert(), "INSERT", "INSERT");
                    graficoBarra.setValue(estatistica.getCountLogUpdate(), "UPDATE", "UPDATE");
                    graficoBarra.setValue(estatistica.getCountLogDelete(), "DELETE", "DELETE");

                    JFreeChart barChart = ChartFactory.createBarChart("Estatísticas do log de alterações", "Quantidade",
                            "Valores", graficoBarra,
                            PlotOrientation.VERTICAL, true, true, false);
                    CategoryPlot barchrt = barChart.getCategoryPlot();
                    barchrt.setRangeGridlinePaint(new Color(140, 105, 204));
                    ChartPanel ChartP = new ChartPanel(barChart);
                    panelLog.removeAll();
                    panelLog.add(ChartP, BorderLayout.CENTER);
                    panelLog.validate();
                }
                catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Erro inesperado: "+ex, "Erro  em atualizaDash", WARNING_MESSAGE);
                    Thread.interrupted();
                }
            }
        }.start();
    }
    
    private void renderizarTabela(){
        new Thread(){
            @Override
            public void run() {
                try {
                    ArrayList<ModeloHumano> listaHumanos = new ArrayList<ModeloHumano>();
                    DefaultTableModel modeloTabelaHumanos = (DefaultTableModel) tbHumanos.getModel();
                    HumanoDao humanoDao = new HumanoDao();

                    limparTabela();

                    listaHumanos = humanoDao.retrieve();

                    for (ModeloHumano humano : listaHumanos) {
                        modeloTabelaHumanos.addRow(new String[]{
                            humano.getNomeHumano(),
                            humano.getSexo(),
                            humano.getRotulo(),
                            humano.getLogradouro(),
                            Integer.toString(humano.getNumero()),
                            humano.getComplemento(),
                            humano.getBairro(),
                            humano.getCidade(),
                            humano.getEstado(),
                            humano.getCep()
                        });
                        listaIDS.add(Integer.toString(humano.getIdHumano()));
                        listaFotos.add(humano.getFotoHumano());
                    }
                }
                catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO 1!", ERROR_MESSAGE);
                    Thread.interrupted();
                }
            }
        }.start();
    }
    
    private void limparTabela(){
        while (tbHumanos.getRowCount() > 0) {
            DefaultTableModel modeloTabelaHumanos = (DefaultTableModel) tbHumanos.getModel();
            modeloTabelaHumanos.getDataVector().removeAllElements();
        }
        listaIDS.removeAll();
        listaFotos.removeAll();
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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alien1;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelHeader;
    private java.awt.List listaFotos;
    private java.awt.List listaIDS;
    private javax.swing.JPanel panelBtns;
    private javax.swing.JPanel panelChart;
    private javax.swing.JPanel panelChartLog;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel panelLog;
    private javax.swing.JPanel panelTabela;
    private javax.swing.JTable tbHumanos;
    // End of variables declaration//GEN-END:variables
}
