
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
public class user_register extends javax.swing.JFrame {

   
    

    Connection con=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    
    
    public user_register() {
        initComponents();
    }

    
    public void close() { 
    this.setVisible(false);
    this.dispose();}
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pass = new javax.swing.JLabel();
        register = new javax.swing.JButton();
        tf3 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        tf1 = new javax.swing.JTextField();
        uname = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        pass.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        pass.setText("PASSWORD");
        getContentPane().add(pass);
        pass.setBounds(350, 230, 86, 18);

        register.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        register.setText("REGISTER");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });
        getContentPane().add(register);
        register.setBounds(487, 471, 131, 31);
        getContentPane().add(tf3);
        tf3.setBounds(620, 220, 149, 29);

        jButton1.setFont(new java.awt.Font("Cooper Black", 1, 14)); // NOI18N
        jButton1.setText("HOMEPAGE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(1200, 650, 130, 25);
        getContentPane().add(tf1);
        tf1.setBounds(620, 150, 145, 28);

        uname.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        uname.setText("USERNAME");
        getContentPane().add(uname);
        uname.setBounds(350, 160, 86, 18);

        jLabel1.setFont(new java.awt.Font("Cooper Black", 1, 24)); // NOI18N
        jLabel1.setText("SIGN UP");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(495, 41, 112, 28);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nandhinee\\Pictures\\Screenshots\\Screenshot (9).png")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1500, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
             
             String sql="insert into register(username,password) values(?,?)";
        try
        {
         Class.forName("java.sql.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3307/hostelmgmt","root","");
        pst=con.prepareStatement(sql);
        
        pst.setString(1,tf1.getText());
         
          pst.setString(2,tf3.getText());
           
            pst.executeUpdate(); 
            JOptionPane.showMessageDialog(null,"SUCCESSFULLY REGISTERED");
        }catch(Exception e)
       {JOptionPane.showMessageDialog(null,e);
            }
        
           

    }//GEN-LAST:event_registerActionPerformed

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
            java.util.logging.Logger.getLogger(user_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(user_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(user_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(user_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new user_register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel pass;
    private javax.swing.JButton register;
    private javax.swing.JTextField tf1;
    private javax.swing.JPasswordField tf3;
    private javax.swing.JLabel uname;
    // End of variables declaration//GEN-END:variables
}
