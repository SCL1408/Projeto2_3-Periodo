package Telas;

import dao.EstatisticaDao;
import dao.HumanoDao;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import javax.swing.JPanel;
import modelos.ModeloEstatistica;


import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

public class TelaPrincipal extends javax.swing.JFrame {

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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelChartLog = new javax.swing.JPanel();
        panelTabela = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbHumanos = new javax.swing.JTable();
        listaIDS = new java.awt.List();

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

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Controle");
        panelHeader.add(jLabel1);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Alien1.png"))); // NOI18N
        panelHeader.add(jLabel2);

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
                "Nome", "Sexo", "Categoria", "Logradouro", "Numero", "Complemento", "Bairro", "Cidade", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
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
        }

        panelTabela.add(jScrollPane1, "card2");

        listaIDS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaIDSActionPerformed(evt);
            }
        });
        panelTabela.add(listaIDS, "card3");

        jPanel1.add(panelTabela);

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
        atualizaTela();
    }//GEN-LAST:event_formWindowOpened

    private void listaIDSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaIDSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaIDSActionPerformed

    private void atualizaTela( ){
        new Thread(){
            @Override
            public void run(){
                try{
                    ModeloEstatistica estatistica = new ModeloEstatistica();
                    EstatisticaDao estatisticaDao = new EstatisticaDao();
                    DefaultCategoryDataset graficoBarra = new DefaultCategoryDataset();

                    estatisticaDao.retrieve(estatistica);
                    System.out.println(estatistica.getCountLogInsert());
                    System.out.println(estatistica.getCountLogUpdate());
                    System.out.println(estatistica.getCountLogDelete());

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.List listaIDS;
    private javax.swing.JPanel panelChart;
    private javax.swing.JPanel panelChartLog;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel panelLog;
    private javax.swing.JPanel panelTabela;
    private javax.swing.JTable tbHumanos;
    // End of variables declaration//GEN-END:variables
}
