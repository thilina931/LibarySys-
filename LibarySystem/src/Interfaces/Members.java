/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import libarysystem.Book;
import libarysystem.Member;
import libarysystem.Serialization;
import libarysystem.SetOfBooks;
import libarysystem.SetOfMembers;
/**
 *
 * @author Thilina
 */
public class Members extends javax.swing.JFrame {

    /**
     * Creates new form Members
     */
 private SetOfMembers theMembers=new SetOfMembers(); 
 private SetOfMembers searchList=new SetOfMembers();   
  private SetOfBooks holdings=new SetOfBooks();
 
 public static final String FILE_NAME_BOOKS = "Books.txt";
  public static final String FILE_NAME_MEMBERS = "Members.txt";
    int timeRun=0;
    
    public Members() {
        initComponents();
          try { 
            for(Member member : Serialization.deserializeMembers())
            {
                theMembers.addMember(member);
            }
        } catch (IOException | ClassNotFoundException ex) {
             
        }
         try { 
            for(Book book : Serialization.deserializeBooks())
            {
                holdings.addBook(book);
            }
        } catch (IOException | ClassNotFoundException ex) {
             //JOptionPane.showMessageDialog(this, ex);
        }
         
         TableLoad(tbInfoTable,theMembers);
         TableLoad(tbInfo1Table,theMembers);
         TableLoad(tbInfo2,theMembers);
        ////////////////////////////////////////////////////////////////////////
        
         currentDate();
        
        new Thread()
        {
        public void run()
        {
        while(timeRun==0)
        {
            Calendar cal=new GregorianCalendar();
            
            int hour=cal.get(Calendar.HOUR);
            int minute=cal.get(Calendar.MINUTE);
            int second=cal.get(Calendar.SECOND);
            int AM_PM=cal.get(Calendar.AM_PM);
            String day_night=" ";
            
            if(AM_PM==1)
        {
            day_night="PM";
        }
            else
        {
            day_night="AM";
        }
            
            String time= hour+":"+minute+":"+second+" "+day_night;
            showtime.setText(time);
        }
        }
        
        }.start();  
        
        ////////////////////////////////////////////////////////////////////////
        
    
    }
    
      //show date
    public void currentDate(){

                    Calendar cal=new GregorianCalendar();
                    int month=cal.get(Calendar.MONTH);
                    int year=cal.get(Calendar.YEAR);
                    int day=cal.get(Calendar.DAY_OF_MONTH);
                    showdate.setText(year+"-"+(month+1)+"-"+day);
               }
    
    
    //////////////////////////////////////////////////////////////


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtEditName = new javax.swing.JTextField();
        lblID1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbInfo1Table = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblID3 = new javax.swing.JLabel();
        lblID2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbPastTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbInfo2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtSeach1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbInfoTable = new javax.swing.JTable();
        nameRadio = new javax.swing.JRadioButton();
        IDRadio = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        showdate = new javax.swing.JLabel();
        showtime = new javax.swing.JLabel();
        BackgroundImg = new javax.swing.JLabel();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jLabel3.setText("Name :");

        jButton1.setText("ADD Member");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel3)
                .addGap(37, 37, 37)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jButton1)
                .addContainerGap(291, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(300, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Add New Members", jPanel3);

        jLabel4.setText("Member ID");

        jLabel5.setText("Member Name");

        tbInfo1Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ));
        tbInfo1Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbInfo1TableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbInfo1Table);

        btnDelete.setText("Delete ");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblID1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtEditName, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                        .addGap(42, 42, 42)
                        .addComponent(btnDelete)))
                .addContainerGap(175, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblID1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel5))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEditName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jTabbedPane1.addTab("Delete members", jPanel4);

        jLabel6.setText("Member Details ");

        jLabel7.setText("Member ID :");

        jLabel8.setText("Member Name :");

        tbPastTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tbPastTable);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Current on Table :");

        tbInfo2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ));
        tbInfo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbInfo2MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tbInfo2);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Member Table :");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(18, 18, 18)
                                    .addComponent(lblID3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel6))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblID2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(126, 126, 126)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel1)))))
                .addGap(0, 23, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(41, 41, 41)
                                .addComponent(jLabel7)
                                .addGap(8, 8, 8))
                            .addComponent(lblID3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblID2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel8))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        jTabbedPane1.addTab("Member Histry", jPanel5);

        jLabel2.setText("Enter Details");

        txtSeach1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSeach1KeyReleased(evt);
            }
        });

        tbInfoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ));
        tbInfoTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbInfoTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbInfoTable);

        buttonGroup1.add(nameRadio);
        nameRadio.setText("Member Name");

        buttonGroup1.add(IDRadio);
        IDRadio.setText("Member ID");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtSeach1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(nameRadio)
                        .addGap(18, 18, 18)
                        .addComponent(IDRadio))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSeach1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameRadio)
                            .addComponent(IDRadio))))
                .addGap(59, 59, 59)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Serch Members", jPanel2);

        jPanel1.add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 90, 750, 400);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagers/homeButton.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(0, 0, 91, 83);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagers/logo.png"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(210, 0, 300, 90);

        showdate.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        showdate.setText("..");
        jPanel1.add(showdate);
        showdate.setBounds(620, 50, 150, 30);

        showtime.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        showtime.setText("..");
        jPanel1.add(showtime);
        showtime.setBounds(640, 10, 130, 30);

        BackgroundImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagers/bkground.jpg"))); // NOI18N
        jPanel1.add(BackgroundImg);
        BackgroundImg.setBounds(0, 0, 790, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSeach1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSeach1KeyReleased
        // TODO add your handling code here:
        
         if(!txtSeach1.getText().equalsIgnoreCase(""))
    {
        if(nameRadio.isSelected())
        {
           searchList=theMembers.getMemberFromName(txtSeach1.getText());
           
           searchMemberTableLoad(tbInfoTable,searchList); 
        }
        else if(IDRadio.isSelected())
        {
            if(isInt(txtSeach1.getText()))
            {
            searchList=theMembers.getMemberFromNumber(Integer.parseInt(txtSeach1.getText()));
               searchMemberTableLoad(tbInfoTable,searchList); 
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Please insert an Integer Value to Search by Member ID ","Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
   /////////////////////////////////////////////////////           
        
    }//GEN-LAST:event_txtSeach1KeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Backto home 
         LibaryHome l=new LibaryHome();
        l.setVisible(true);
        dispose();
           
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tbInfoTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbInfoTableMouseClicked
        // TODO add your handling code here:
          // when user click on tbInfo table, all the information what in user selected row will want to show on Update tab

        //  load info to update tab

        DefaultTableModel dtm = (DefaultTableModel) tbInfoTable.getModel();

        int row = tbInfoTable.getSelectedRow();

        lblID1.setText(tbInfoTable.getValueAt(row, 0).toString());
        txtEditName.setText(tbInfoTable.getValueAt(row, 1).toString());
        // rederect to update tab
        jTabbedPane1.setSelectedIndex(2);
           
    }//GEN-LAST:event_tbInfoTableMouseClicked

    private void tbInfo1TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbInfo1TableMouseClicked
        // TODO add your handling code here:
         // get selected row
        int row = tbInfo1Table.getSelectedRow();
        lblID1.setText(tbInfo1Table.getValueAt(row, 0).toString());
        txtEditName.setText(tbInfo1Table.getValueAt(row, 1).toString());     
  ///////////////////////////      
    }//GEN-LAST:event_tbInfo1TableMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
           if (lblID1.getText().equals("---")) {
            
            JOptionPane.showMessageDialog(this, "Please select a member to Delete","Error",JOptionPane.ERROR_MESSAGE);
            return ;
        }
            int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this Member?", "Confirm",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.YES_OPTION)
            {
                Member member=theMembers.getMemberFromNumber(Integer.parseInt(lblID1.getText())).firstElement();
                if(!member.getBooksOnLoan().isEmpty())
                {
                    JOptionPane.showMessageDialog(rootPane, "Member cannot be deleted. There are books to returned !");   
                }
                else
                {
                  theMembers.removeMember(member);
                  
                   //table load in search page
         TableLoad(tbInfoTable,theMembers);
          //table load in update page
         TableLoad(tbInfo1Table,theMembers);
         //table update on member history page
             TableLoad(tbInfo2,theMembers);
         
                  try {
                      Serialization.Serialize(theMembers,"Members.txt");
                      } 
                    catch (Exception ex) {
                  
               }
                JOptionPane.showMessageDialog(rootPane, "Member is been deleted successfully !");
                // clear all fields
            
            lblID1.setText("---");
            txtEditName.setText(null);
            
               }
            }
            
        else
        {
            JOptionPane.showMessageDialog(this, "Delete Unsuccessful");
        }
       /////////////////////////////////////// 
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tbInfo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbInfo2MouseClicked
        // TODO add your handling code here:
        
        int row = tbInfo2.getSelectedRow();

        lblID3.setText(tbInfo2.getValueAt(row, 0).toString());
        lblID2.setText(tbInfo2.getValueAt(row, 1).toString());
        
        currentBookLoad(holdings.getBorrowedBooks(),lblID2.getText());
        
        //////////////////////////////////////
    }//GEN-LAST:event_tbInfo2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        
        if(txtName.getText().isEmpty())
       {
           JOptionPane.showMessageDialog(this, "Please give a valid name ","Error",JOptionPane.ERROR_MESSAGE);
       }
       else
       {
        if (isName(txtName.getText())) {
        // show a confirmation message box to user
        int i = JOptionPane.showConfirmDialog(this, "Do you want to proceed?", "Add Data", JOptionPane.NO_OPTION);

        if (i != 0) {

            return;
        }
       
        theMembers.addMember(new Member(txtName.getText()));
              boolean isok =true;
        try{
            Serialization.Serialize(theMembers,"Members.txt");
            
            for (Member member: Serialization.deserializeMembers()) 
            {
		System.out.println(member);
            }
              isok =true;
          }
          catch(Exception ex)
          {
                   isok =false;
                   JOptionPane.showMessageDialog(this,ex);
          }
          
   

        if (isok == true) {

            JOptionPane.showMessageDialog(this, "Data Adding Succssful");
            // clear all fields
            txtName.setText(null);
            //table load in search page
         TableLoad(tbInfoTable,theMembers);
         TableLoad(tbInfo1Table,theMembers);
          //table load in update page
 TableLoad(tbInfo2,theMembers);

        } else {

            JOptionPane.showMessageDialog(this, "Unsuccessful Process");
        }
        }
       }
        //////////////////////////
    }//GEN-LAST:event_jButton1MouseClicked

        //display search results
    public void searchMemberTableLoad(JTable table,SetOfMembers searchList)
    { 
            String[] colName = { "Member ID", "Name"}; 
            Object[][] object = new Object[ searchList.size()][2];
            int i = 0;
            if ( searchList.size() != 0) {
                for (Member member : searchList) {
                    object[i][0] = member.getMemberNumber();
                    object[i][1] = member.getName();
                    i++;
                  
                }    
            }
            
            DefaultTableModel model = new DefaultTableModel(object,colName)
                    {
    public boolean isCellEditable(int row, int column)
    {
      return false;//This causes all cells to be not editable
    }
  };
            table.setModel(model);
            table.setRowSorter(new TableRowSorter<TableModel> (model));
            table.setAutoscrolls(true);
            table.getTableHeader().setReorderingAllowed(false);
    }
    ///////////////////////////////////////////////////////////
    
    
     //currently loan books
     public void currentBookLoad(SetOfBooks holdings,String Membername)
     {
        String[] colName = { "Accession Number", "ISBN Number", "Title", "Author "};
            Object[][] object = new Object[ holdings.size()][5];
            int i = 0;
            if ( holdings.size() != 0) {
                for (Book book :  holdings) {
                    if(book.getBorrower().getName().equalsIgnoreCase(Membername))
                    {
                    object[i][0] = book.getAccessionNumber();
                    object[i][1] = book.getISBNNumber();
                    object[i][2] = book.getTitle();
                    object[i][3] = book.getAuthor();
                      i++;
                    }
            }
            }
            DefaultTableModel model = new DefaultTableModel(object,colName)
                    {
    public boolean isCellEditable(int row, int column)
    {
      return false;//This causes all cells to be not editable
    }
  };
            tbPastTable.setModel(model);
            tbPastTable.setRowSorter(new TableRowSorter<TableModel> (model));
            tbPastTable.setAutoscrolls(true);
            tbPastTable.getTableHeader().setReorderingAllowed(false);
     }
   
    ///////////////////////////////////////////////////////////
     //tableload
    public void TableLoad(JTable table,SetOfMembers theMembers)
    {
        String[] colName = { "Member ID", "Name"};
            Object[][] object = new Object[ theMembers.size()][2];
            int i = 0;
            if ( theMembers.size() != 0) {
                for (Member member : theMembers) {
                    object[i][0] = member.getMemberNumber();
                    object[i][1] = member.getName();
                    i++;
                  
                }    
            }
            
            DefaultTableModel model = new DefaultTableModel(object,colName)
                    {
           
    @Override
    public boolean isCellEditable(int row, int column)
    {
      return false;//This causes all cells to be not editable
    }
  };
            table.setModel(model);
            table.setRowSorter(new TableRowSorter<TableModel> (model));
            table.setAutoscrolls(true);
            table.getTableHeader().setReorderingAllowed(false);
        
    }
     
     
     //////////////////////////////////////////////////////////
    
     //check that string is number(int)
    public static boolean isInt(String text) {


        try {

            int i = Integer.parseInt(text);

            return true;

        } catch (Exception ex) {

            System.out.println("VALIDATE EXCEPTION -- > " + ex.getMessage());
            return false;
        }
    }
    
    //////////////////////////////////////////////////////////////
    // check is valied name
    public static boolean isName(String text){
    
      return text.matches("[a-zA-z]+([ '-][a-zA-z]+)*");
    }
    //////////////////////////////////////////////////////////////
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
            java.util.logging.Logger.getLogger(Members.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Members.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Members.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Members.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Members().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundImg;
    private javax.swing.JRadioButton IDRadio;
    private javax.swing.JButton btnDelete;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblID1;
    private javax.swing.JLabel lblID2;
    private javax.swing.JLabel lblID3;
    private javax.swing.JRadioButton nameRadio;
    private javax.swing.JLabel showdate;
    private javax.swing.JLabel showtime;
    private javax.swing.JTable tbInfo1Table;
    private javax.swing.JTable tbInfo2;
    private javax.swing.JTable tbInfoTable;
    private javax.swing.JTable tbPastTable;
    private javax.swing.JTextField txtEditName;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSeach1;
    // End of variables declaration//GEN-END:variables
}
