import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
public class bbook extends javax.swing.JFrame {
Connection con=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    
    public bbook() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    public void close() { 
    this.setVisible(false);
    this.dispose();
}
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        sname = new javax.swing.JTextField();
        rno = new javax.swing.JTextField();
        dept = new javax.swing.JComboBox();
        fname = new javax.swing.JTextField();
        fno = new javax.swing.JTextField();
        sno = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        addr = new javax.swing.JTextArea();
        city = new javax.swing.JTextField();
        coun = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        combo_type = new javax.swing.JComboBox();
        fees = new javax.swing.JTextField();
        book = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Cooper Black", 1, 24)); // NOI18N
        jLabel1.setText("STUDENT DETAILS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(293, 0, 420, 41);

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel2.setText("STUDENT NAME");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(210, 100, 170, 20);

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel3.setText("ROLL NO");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(210, 140, 140, 18);

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel4.setText("DEPARTMENT");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(210, 180, 160, 18);

        jLabel5.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel5.setText("FATHER NAME");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(210, 220, 160, 18);

        jLabel6.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel6.setText("FATHER CONTACT NO");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(210, 260, 210, 18);

        jLabel7.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel7.setText("STUDENT CONTACT NO");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(210, 300, 200, 18);

        jLabel8.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel8.setText("ADDRESS");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(210, 350, 130, 18);

        jLabel9.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel9.setText("CITY");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(210, 430, 150, 18);

        jLabel10.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel10.setText("COUNTRY");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(210, 470, 150, 18);

        jLabel12.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel12.setText("USERNAME");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(210, 60, 140, 18);
        getContentPane().add(uname);
        uname.setBounds(467, 50, 220, 28);
        getContentPane().add(sname);
        sname.setBounds(467, 90, 220, 30);
        getContentPane().add(rno);
        rno.setBounds(467, 130, 220, 30);

        dept.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "cse", "IT", "Mechanical", "Auto", "Biotech" }));
        dept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptActionPerformed(evt);
            }
        });
        getContentPane().add(dept);
        dept.setBounds(467, 170, 220, 30);
        getContentPane().add(fname);
        fname.setBounds(467, 210, 220, 30);
        getContentPane().add(fno);
        fno.setBounds(470, 250, 220, 30);

        sno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snoActionPerformed(evt);
            }
        });
        getContentPane().add(sno);
        sno.setBounds(470, 290, 220, 30);

        addr.setColumns(20);
        addr.setRows(5);
        jScrollPane1.setViewportView(addr);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(470, 340, 290, 70);
        getContentPane().add(city);
        city.setBounds(470, 420, 230, 30);
        getContentPane().add(coun);
        coun.setBounds(470, 470, 230, 30);
        getContentPane().add(jLabel11);
        jLabel11.setBounds(595, 54, 107, 138);

        jLabel14.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel14.setText("ROOM TYPE");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(210, 541, 100, 18);

        jLabel15.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel15.setText("HOSTEL FEES");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(210, 582, 160, 18);

        combo_type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "DOUBLE BEDROOM", "SINGLE BEDROOM" }));
        combo_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_typeActionPerformed(evt);
            }
        });
        getContentPane().add(combo_type);
        combo_type.setBounds(470, 536, 180, 30);
        getContentPane().add(fees);
        fees.setBounds(470, 577, 180, 30);

        book.setFont(new java.awt.Font("Cooper Black", 1, 14)); // NOI18N
        book.setText("BOOK");
        book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookActionPerformed(evt);
            }
        });
        getContentPane().add(book);
        book.setBounds(359, 637, 90, 25);

        jButton1.setFont(new java.awt.Font("Cooper Black", 1, 12)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(983, 652, 75, 23);

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nandhinee\\Pictures\\Screenshots\\Screenshot (9).png")); // NOI18N
        jLabel13.setText("jLabel13");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(0, 0, 1500, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deptActionPerformed

    private void snoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_snoActionPerformed

    private void combo_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_typeActionPerformed
        String value=(String)combo_type.getSelectedItem();
        String sql="select cost from fees where type=?";
        try
        {
            Class.forName("java.sql.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3307/hostelmgmt","root","");
            pst=con.prepareStatement(sql);
            pst.setString(1,value);
            rs=pst.executeQuery();
            if(rs.next())
            {
                String add1=rs.getString("cost");
                fees.setText(add1);
            }
        }catch(Exception e)
        {JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_combo_typeActionPerformed

    private void bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookActionPerformed
       String sql3="insert into studdetails(username,stud_name,regno,dept,fname,fcontact,scontact,address,city,country,roomtype,cost) values(?,?,?,?,?,?,?,?,?,?,?,?)";
        try
        {
            Class.forName("java.sql.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3307/hostelmgmt","root","");
            pst=con.prepareStatement(sql3);

            pst.setString(1,uname.getText());
            pst.setString(2,sname.getText());
            pst.setString(3,rno.getText());
            String value= dept.getSelectedItem().toString();
            pst.setString(4,value);
            
            pst.setString(5,fname.getText());
            pst.setString(6,fno.getText());
            pst.setString(7,sno.getText());
            pst.setString(8,addr.getText());
            pst.setString(9,city.getText());
            pst.setString(10,coun.getText());
            String value1= combo_type.getSelectedItem().toString();
            pst.setString(11,value1);
            pst.setString(12,fees.getText());
            pst.executeUpdate();
         
        }catch(Exception e)
        {JOptionPane.showMessageDialog(null,e);
        }
        
        

        int qua=0;

        try
        {
            Class.forName("java.sql.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3307/hostelmgmt","root","");

            String value1= combo_type.getSelectedItem().toString();

            if(value1=="DOUBLE BEDROOM")
            {
                String sql1="(SELECT availability from boyshostel1 where roomtype='DoubleBedroom')";
                pst=con.prepareStatement(sql1);
                rs=pst.executeQuery();

                while(rs.next())
                {
                    qua=rs.getInt("availability");
                }
                int now=qua-1;
                pst.executeUpdate("update boyshostel1 set availability='"+now+"' where roomtype='DoubleBedroom'");
            }
            else if(value1=="SINGLE BEDROOM")
            {
                String sql2="(SELECT availability from boyshostel2 where roomtype='SingleBedroom')";
                pst=con.prepareStatement(sql2);
                rs=pst.executeQuery();

                while(rs.next())
                {
                    qua=rs.getInt("availability");
                }
                int now=qua-1;
                pst.executeUpdate("update boyshostel2 set availability='"+now+"' where roomtype='SingleBedroom'");
            }

            JOptionPane.showMessageDialog(null,"DATA REGISTERED AND UPDATED");
            close();
            bookingdetails s=new bookingdetails();
            s.setVisible(true);

        }catch(Exception e)
        {JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_bookActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        close();
            bbooking s=new bbooking();
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
            java.util.logging.Logger.getLogger(bbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bbook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea addr;
    private javax.swing.JButton book;
    private javax.swing.JTextField city;
    private javax.swing.JComboBox combo_type;
    private javax.swing.JTextField coun;
    private javax.swing.JComboBox dept;
    private javax.swing.JTextField fees;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField fno;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField rno;
    private javax.swing.JTextField sname;
    private javax.swing.JTextField sno;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables
}
