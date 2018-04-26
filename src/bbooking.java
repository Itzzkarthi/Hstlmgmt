import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
 import net.proteanit.sql.DbUtils;
public class bbooking extends javax.swing.JFrame {
Connection con=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    
    public bbooking() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        avail_table1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        avail_table2 = new javax.swing.JTable();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        proceed = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Cooper Black", 1, 24)); // NOI18N
        jLabel1.setText("BOOK HOSTEL");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(450, 40, 210, 30);

        avail_table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "ROOMTYPE", "AVAILABILITY"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(avail_table1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(580, 200, 452, 45);

        avail_table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "ROOMTYPE", "AVAILABILITY"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(avail_table2);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(580, 270, 452, 47);

        jRadioButton1.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jRadioButton1.setText("DOUBLE BEDROOM AVAILABILITY");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(210, 210, 300, 27);

        jRadioButton2.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jRadioButton2.setText("SINGLE BEDROOM AVAILABILITY");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(210, 290, 280, 27);

        proceed.setFont(new java.awt.Font("Cooper Black", 1, 16)); // NOI18N
        proceed.setText("PROCEED");
        proceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedActionPerformed(evt);
            }
        });
        getContentPane().add(proceed);
        proceed.setBounds(408, 411, 170, 27);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nandhinee\\Pictures\\Screenshots\\Screenshot (9).png")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1500, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void close() { 
    this.setVisible(false);
    this.dispose();
}
    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
       String sql=" select * from boyshostel1";
        
        try
        {
         Class.forName("java.sql.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3307/hostelmgmt","root","");
        
        pst=con.prepareStatement(sql);
        
        
        rs=pst.executeQuery();
        avail_table1.setModel(DbUtils.resultSetToTableModel(rs)); 
        
        }catch(Exception e)
        {JOptionPane.showMessageDialog(null,e);
        } 
      
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        String sql=" select * from boyshostel2";
       
        try
        {
         Class.forName("java.sql.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3307/hostelmgmt","root","");
        
        pst=con.prepareStatement(sql);
        
        
        rs=pst.executeQuery();
        avail_table2.setModel(DbUtils.resultSetToTableModel(rs)); 
        
        
        }catch(Exception e)
        {JOptionPane.showMessageDialog(null,e);
        } 
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void proceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedActionPerformed
        close();
            bbook s=new bbook();
            s.setVisible(true);
        
    }//GEN-LAST:event_proceedActionPerformed

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
            java.util.logging.Logger.getLogger(bbooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bbooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bbooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bbooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bbooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable avail_table1;
    private javax.swing.JTable avail_table2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton proceed;
    // End of variables declaration//GEN-END:variables
}
