
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
public class pay extends javax.swing.JFrame {
Connection con=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    /**
     * Creates new form pay
     */
    public pay() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cname = new javax.swing.JTextField();
        cexp = new javax.swing.JTextField();
        cno = new javax.swing.JPasswordField();
        cpin = new javax.swing.JPasswordField();
        payment = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Cooper Black", 1, 24)); // NOI18N
        jLabel1.setText("PAYMENT");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(480, 40, 151, 28);

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel2.setText("CARD NO");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(400, 160, 68, 18);

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel3.setText("CARD NAME");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(390, 220, 92, 18);

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel4.setText("EXPIRY DATE");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(370, 280, 106, 18);

        jLabel5.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel5.setText("CVV");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(440, 340, 30, 18);
        getContentPane().add(cname);
        cname.setBounds(650, 210, 120, 30);
        getContentPane().add(cexp);
        cexp.setBounds(650, 270, 120, 30);
        getContentPane().add(cno);
        cno.setBounds(650, 150, 120, 30);
        getContentPane().add(cpin);
        cpin.setBounds(650, 330, 120, 30);

        payment.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        payment.setText("PAYBILL");
        payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentActionPerformed(evt);
            }
        });
        getContentPane().add(payment);
        payment.setBounds(520, 470, 99, 25);

        jButton1.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        jButton1.setText("LOGOUT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(1240, 20, 95, 25);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nandhinee\\Pictures\\Screenshots\\Screenshot (9).png")); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 1500, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public void close() { 
    this.setVisible(false);
    this.dispose();
}
    private void paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentActionPerformed
        String sql="insert into payment(card_no,card_name,exp_date,cvv) values(?,?,?,?)";
        try
        {
         Class.forName("java.sql.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3307/hostelmgmt","root","");
        pst=con.prepareStatement(sql);
        
        pst.setString(1,cno.getText());
         pst.setString(2,cname.getText());
         pst.setString(3,cexp.getText());
         pst.setString(4,cpin.getText());
         
           
            pst.executeUpdate(); 
            JOptionPane.showMessageDialog(null,"payment successful");
        }catch(Exception e)
       {JOptionPane.showMessageDialog(null,"payment unsuccessful!!please retry");
            }
        
           
    

    }//GEN-LAST:event_paymentActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        close();
        login s=new login();
        s.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(pay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cexp;
    private javax.swing.JTextField cname;
    private javax.swing.JPasswordField cno;
    private javax.swing.JPasswordField cpin;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton payment;
    // End of variables declaration//GEN-END:variables
}
