import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
 import net.proteanit.sql.DbUtils;


public class bookingdetails extends javax.swing.JFrame {
    Connection con=null;
    ResultSet rs=null;
    PreparedStatement pst=null;

    
    public bookingdetails() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        sname = new javax.swing.JTextField();
        rno = new javax.swing.JTextField();
        dept = new javax.swing.JTextField();
        rtype = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fees = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        print = new javax.swing.JButton();
        payment = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel1.setText("USERNAME");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(340, 120, 120, 18);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(76, 131, 0, 0);

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel3.setText("REGISTER NO");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(340, 210, 140, 18);

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel4.setText("DEPARTMENT");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(340, 260, 140, 18);

        jLabel5.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel5.setText("ROOM TYPE");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(340, 310, 130, 18);
        getContentPane().add(uname);
        uname.setBounds(500, 110, 152, 30);
        getContentPane().add(sname);
        sname.setBounds(500, 160, 152, 30);
        getContentPane().add(rno);
        rno.setBounds(500, 200, 152, 30);
        getContentPane().add(dept);
        dept.setBounds(500, 250, 152, 30);
        getContentPane().add(rtype);
        rtype.setBounds(500, 300, 152, 30);

        jLabel6.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel6.setText("STUDENT NAME");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(340, 170, 150, 18);

        jLabel7.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel7.setText("COST");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(340, 370, 80, 18);
        getContentPane().add(fees);
        fees.setBounds(500, 360, 152, 30);

        jLabel8.setFont(new java.awt.Font("Cooper Black", 1, 24)); // NOI18N
        jLabel8.setText("BOOKING DETAILS");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(380, 30, 270, 28);

        print.setFont(new java.awt.Font("Cooper Black", 1, 14)); // NOI18N
        print.setText("PRINT");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        getContentPane().add(print);
        print.setBounds(390, 450, 87, 25);

        payment.setFont(new java.awt.Font("Cooper Black", 1, 14)); // NOI18N
        payment.setText("PAYMENT");
        payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentActionPerformed(evt);
            }
        });
        getContentPane().add(payment);
        payment.setBounds(520, 450, 117, 25);

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nandhinee\\Pictures\\Screenshots\\Screenshot (9).png")); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 0, 1500, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void close() { 
    this.setVisible(false);
    this.dispose();
}
    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        String sql="select stud_name,regno,dept,roomtype,cost from studdetails where username=?";
        try
        {
         Class.forName("java.sql.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3307/hostelmgmt","root","");
        pst=con.prepareStatement(sql);
        pst.setString(1,uname.getText());
         rs=pst.executeQuery(); 
         if(rs.next())
         {
             String var1=rs.getString("stud_name");
             sname.setText(var1);
             String var2=rs.getString("regno");
             rno.setText(var2);
             String var3=rs.getString("dept");
             dept.setText(var3);
             String var4=rs.getString("roomtype");
             rtype.setText(var4);
             String var5=rs.getString("cost");
             fees.setText(var5);
             
         }
        }catch(Exception e)
       {JOptionPane.showMessageDialog(null,e);
            }
    
    }//GEN-LAST:event_printActionPerformed

    private void paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentActionPerformed
      close();
        pay s=new pay();
        s.setVisible(true);
    }//GEN-LAST:event_paymentActionPerformed

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
            java.util.logging.Logger.getLogger(bookingdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bookingdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bookingdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bookingdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bookingdetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dept;
    private javax.swing.JTextField fees;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton payment;
    private javax.swing.JButton print;
    private javax.swing.JTextField rno;
    private javax.swing.JTextField rtype;
    private javax.swing.JTextField sname;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables
}
