/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;
import java.sql.*;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sajjad
 */
public class SearchBook extends javax.swing.JFrame {

    /**
     * Creates new form BookStore
     */
    private String un="";
    public SearchBook() {
        initComponents();
         this.setResizable(false);
        String query="Select distinct catagory from book_store";
       try
       {
           Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/raihan","root","");
           PreparedStatement pst=con.prepareStatement(query);
           ResultSet rs=pst.executeQuery();
           while(rs.next())
           {
               String name=rs.getString("Catagory");
               jComboBox4.addItem(name);
           }
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(this, e);
       }
        
    }
    public void Setuname(String uname)
    {
        this.un=uname;
    }
  private void close()
    {
        WindowEvent winClosing=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
      Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosing);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<String>();
        jComboBox3 = new javax.swing.JComboBox();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<String>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();

        jButton5.setText("jButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SEARCH BOOK");
        setBackground(new java.awt.Color(153, 153, 153));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Book", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("BOOK NAME:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 180, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("BOOK AUTHOR NAME:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 180, -1));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th", "9th", "10th", "11th", "12th", "13th", "14th", "15th" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, -1, -1));

        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 320, 30));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("Select");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Edition:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, -1, -1));

        jComboBox4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 180, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Catagory:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Raihan\\Documents\\NetBeansProjects\\PROJECT\\search-iconfinal.png")); // NOI18N
        jButton3.setBorder(null);
        jButton3.setMaximumSize(new java.awt.Dimension(107, 107));
        jButton3.setMinimumSize(new java.awt.Dimension(107, 107));
        jButton3.setPreferredSize(new java.awt.Dimension(107, 107));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 40, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 100, 350, 396));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Exchange Book", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 267, 202, -1));
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 331, 202, -1));

        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th", "9th", "10th", "11th", "12th", "13th", "14th", "15th" }));
        jPanel2.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 194, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Book Name:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 269, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Book Author Name:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 333, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Edition:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 197, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Catagory:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 197, -1, -1));

        jComboBox5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Programming", "Electrical", "Physics", "Mathematics", "Novel", "Chemestry", "History" }));
        jPanel2.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 194, 135, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Raihan\\Documents\\NetBeansProjects\\PROJECT\\Books-1-icon.png")); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 380, 400));

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Confirm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton7.setText("History");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton7)
                .addContainerGap(222, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(jButton7))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 511, 740, -1));

        jPanel4.setBackground(new java.awt.Color(51, 153, 255));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setText("Exit");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton6)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 90));

        setSize(new java.awt.Dimension(756, 635));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          if(jTextField1.getText().equals(null)||jTextField2.getText().equals(null)||jTextField3.getText().equals(null)||jTextField3.getText().equals(null))
      {
          
           JOptionPane.showMessageDialog(null,"All text field must be filled!!!!","Warning message box",JOptionPane.WARNING_MESSAGE);
      } 
          else{
        int tcopy=0;
        int indicator=0;
        int flag=0;
        String Bname=jTextField1.getText();
        String  Aname=jTextField2.getText();
        String Edi=jComboBox1.getSelectedItem().toString();
        String cata=jComboBox4.getSelectedItem().toString();
        String query="Select * from book_store where Book_Name='"+Bname+"' and Edition='"+Edi+"'";//search 1st executed
        String query1="Update book_store set Copy=Copy-1 where Book_Name='"+Bname+"' and Edition='"+Edi+"'";//search 2nd executed
        String query2="Insert into book_store values ('"+jTextField3.getText()+"','"+jTextField4.getText()+"','"+jComboBox2.getSelectedItem().toString()+"','"+jComboBox5.getSelectedItem().toString()+"',1)";
        String query3="Update book_store set Copy=Copy+1 where Book_Name='"+jTextField3.getText()+"' and Edition='"+jComboBox2.getSelectedItem().toString()+"'";
        String query4="Select * from book_store where Book_Name='"+jTextField3.getText()+"' and Edition='"+jComboBox2.getSelectedItem().toString()+"'";
       
        try
       {
           Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/raihan","root","");
           PreparedStatement pst=con.prepareStatement(query);
           ResultSet rs=pst.executeQuery();
           while(rs.next())
           {
               tcopy=rs.getInt("Copy");
              flag=1;
           }
            pst.close();
            con.close();
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(this, e);
       }
         if(flag==0 ){
             JOptionPane.showMessageDialog(this,"Request denied!!");
         }
         else if(flag!=0 && tcopy>0)
         {
            try
            {
           Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/raihan","root","");
           Statement pst=con.createStatement();
           pst.executeUpdate(query1);
            pst.close();
            con.close();
           //JOptionPane.showMessageDialog(this, "update taken book");
            }
            catch(Exception e)
                {
                    JOptionPane.showMessageDialog(this, e);
                }
         try
             {
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/raihan","root","");
                 PreparedStatement pst=con.prepareStatement(query4);
                 ResultSet rs=pst.executeQuery();
           while(rs.next())
           {
              indicator=1;
           }
            pst.close();
            con.close();
             }
            catch(Exception e)
                {
                    JOptionPane.showMessageDialog(this, e);
                 }
                if(indicator==1 )
                 {
                        try
                         {
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/raihan","root","");
                                Statement pst=con.createStatement();
                                pst.executeUpdate(query3);
                                pst.close();
                                con.close();
           
                          }
                        catch(Exception e)
                            {
                                    JOptionPane.showMessageDialog(this, e);
                             }
            //JOptionPane.showMessageDialog(this, "Update given book!!");
         
            
                 }
                else
                        {
                            try
                               {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/raihan", "root", "");
                                    Statement stm = con.createStatement();
                                    stm.execute(query2);
			    
                                    stm.close();
                                    con.close();
                                //JOptionPane.showMessageDialog(this, "Inserted new book Successfully !!");
                               
                              
                               
                                
                                
                                }
                            catch(Exception ex)
                                {
                           
                            
                                    JOptionPane.showMessageDialog(this, ex);
                                }
                        }
                        try
                               {
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/raihan", "root", "");
                                Statement stm= con.createStatement();
                                stm.execute("Insert into exchange_history values ('"+un+"','"+Bname+"','"+jTextField3.getText()+"','"+cata+"','"+Edi+"','"+jComboBox2.getSelectedItem().toString()+"','"+jComboBox5.getSelectedItem().toString()+"') ");
                                
                               
                                 stm.close();
                                con.close();
                                // JOptionPane.showMessageDialog(this, "Inserted exchange history Successfully !!!");
                                
                                }
                        catch(Exception ex)
                        {
			JOptionPane.showMessageDialog(this, ex);
                         }
        
        JOptionPane.showMessageDialog(this, "Request accepted !!!");
       }
         else if(tcopy<=0)
         {
            JOptionPane.showMessageDialog(this, "Sorry Book stock is empty at this moment!!!"); 
         }
         else
         {
             
         }
         jTextField1.setText(null);
         jTextField2.setText(null);
         jTextField3.setText(null);
         jTextField4.setText(null);
         jComboBox3.setSelectedItem(null);
          }
         
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         Login lz=new Login();
       lz.setVisible(true);
       close();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
       
       
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      
       String Book="";
       String auth="";
       String edi="";
       String cata="";
         try
                               {
                                   String name=jComboBox3.getSelectedItem().toString(); 
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/raihan", "root", "");
                                PreparedStatement stm= con.prepareStatement("select * from book_store where Book_Name='"+name+"'");
                                ResultSet rs=stm.executeQuery();
                               
                                 while(rs.next())
                                 {
                                     Book=rs.getString("Book_Name");
                                     auth=rs.getString("Author_Name");
                                     edi=rs.getString("Edition");
                                     cata=rs.getString("Catagory");      
                                    jTextField1.setText(Book);
                                     jTextField2.setText(auth);
                                     jComboBox1.setSelectedItem(edi);
                                 
                                    
                                    
                                  
                                 }
                                 stm.close();
                                con.close();
                                
                            }
                        catch(Exception ex)
                        {
			JOptionPane.showMessageDialog(this, ex);
                         }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jComboBox3.removeAllItems();
        try
                               {
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/raihan", "root", "");
                                PreparedStatement stm= con.prepareStatement("select * from book_store where Catagory='"+jComboBox4.getSelectedItem().toString()+"'");
                                ResultSet rs=stm.executeQuery();
                               
                                 while(rs.next())
                                 {
                                    
                                    String bn=rs.getString("Book_Name");
                                    
                                    jComboBox3.addItem(bn);
                                 }
                                 stm.close();
                                con.close();
                                
                            }
                        catch(Exception ex)
                        {
			JOptionPane.showMessageDialog(this, ex);
                         } 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         int i;
       i= JOptionPane.showConfirmDialog(rootPane, "Are you sure to exit!!");
       if(i==0)
       {
           System.exit(0);
       }
       else
       {
           
       }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        UserHistory u=new UserHistory(un);
        
        u.setVisible(true);
        close();
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(SearchBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
