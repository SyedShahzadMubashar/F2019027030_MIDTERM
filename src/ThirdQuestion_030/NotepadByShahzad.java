
package ThirdQuestion_030;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.TextArea;
import java.awt.Toolkit;
import java.awt.print.PrinterException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;


/**
 *
 * @author CN Solution
 */
public class NotepadByShahzad extends javax.swing.JFrame {
String text;

    /**
     * Creates new form MainFrame
     */
    public NotepadByShahzad() {
        initComponents();
        
         Container contentPane = this.getContentPane();
        contentPane.add(mainTextArea);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(screenSize.width, screenSize.height);
        
        mainTextArea.setBounds(this.getBounds());
        setTitle("Notepad By Shahzad");
        
        setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        mainTextArea = new javax.swing.JTextArea();
        myToolBar = new javax.swing.JToolBar();
        Bopen = new javax.swing.JButton();
        Bnew = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        myTextArea = new javax.swing.JTextArea();
        myMenuBar = new javax.swing.JMenuBar();
        myTextFile = new javax.swing.JMenu();
        Textnew = new javax.swing.JMenuItem();
        Textopen = new javax.swing.JMenuItem();
        Textsave = new javax.swing.JMenuItem();
        Textprint = new javax.swing.JMenuItem();
        Textexit = new javax.swing.JMenuItem();
        myTextEdit = new javax.swing.JMenu();
        Textcopy = new javax.swing.JMenuItem();
        Textpaste = new javax.swing.JMenuItem();
        Textcut = new javax.swing.JMenuItem();
        Textdelete = new javax.swing.JMenuItem();
        Textselectall = new javax.swing.JMenuItem();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        mainTextArea.setColumns(20);
        mainTextArea.setRows(5);
        jScrollPane2.setViewportView(mainTextArea);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        myToolBar.setRollover(true);

        Bopen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ThirdQuestion_030/icons8-new-file-30.png"))); // NOI18N
        Bopen.setText("Open");
        Bopen.setFocusable(false);
        Bopen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Bopen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Bopen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BopenActionPerformed(evt);
            }
        });
        myToolBar.add(Bopen);

        Bnew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ThirdQuestion_030/icons8-add-file-26.png"))); // NOI18N
        Bnew.setText("New");
        Bnew.setFocusable(false);
        Bnew.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Bnew.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Bnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BnewActionPerformed(evt);
            }
        });
        myToolBar.add(Bnew);

        myTextArea.setColumns(20);
        myTextArea.setRows(5);
        jScrollPane3.setViewportView(myTextArea);

        myTextFile.setText("File");
        myTextFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myTextFileActionPerformed(evt);
            }
        });

        Textnew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Textnew.setText("New ");
        Textnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextnewActionPerformed(evt);
            }
        });
        myTextFile.add(Textnew);

        Textopen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Textopen.setText("Open");
        Textopen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextopenActionPerformed(evt);
            }
        });
        myTextFile.add(Textopen);

        Textsave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Textsave.setText("Save");
        Textsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextsaveActionPerformed(evt);
            }
        });
        myTextFile.add(Textsave);

        Textprint.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Textprint.setText("Print");
        Textprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextprintActionPerformed(evt);
            }
        });
        myTextFile.add(Textprint);

        Textexit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Textexit.setText("Exit");
        Textexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextexitActionPerformed(evt);
            }
        });
        myTextFile.add(Textexit);

        myMenuBar.add(myTextFile);

        myTextEdit.setText("Edit");

        Textcopy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Textcopy.setText("Copy");
        Textcopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextcopyActionPerformed(evt);
            }
        });
        myTextEdit.add(Textcopy);

        Textpaste.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Textpaste.setText("Paste");
        Textpaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextpasteActionPerformed(evt);
            }
        });
        myTextEdit.add(Textpaste);

        Textcut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Textcut.setText("Cut");
        Textcut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextcutActionPerformed(evt);
            }
        });
        myTextEdit.add(Textcut);

        Textdelete.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
        Textdelete.setText("Delete");
        Textdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextdeleteActionPerformed(evt);
            }
        });
        myTextEdit.add(Textdelete);

        Textselectall.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Textselectall.setText("Select All");
        Textselectall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextselectallActionPerformed(evt);
            }
        });
        myTextEdit.add(Textselectall);

        myMenuBar.add(myTextEdit);

        setJMenuBar(myMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(myToolBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(myToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextopenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextopenActionPerformed
        JFileChooser chooser = new JFileChooser("D:/Java");
            chooser.setAcceptAllFileFilterUsed(false); 
            FileNameExtensionFilter restrict = new FileNameExtensionFilter("Only .txt files", "txt"); 
            chooser.addChoosableFileFilter(restrict);
    	
            int result = chooser.showOpenDialog(this);
            if(result == JFileChooser.APPROVE_OPTION) {
                File file = chooser.getSelectedFile();
                
				
                try{
                    System.out.println("NotePad");
                    FileReader reader = new FileReader(file);
                    BufferedReader br = new BufferedReader(reader);
                    myTextArea.read( br, null );
                    br.close();
                    myTextArea.requestFocus();
                }catch(Exception e){
                    System.out.print(e);
                }
            }
       
    }//GEN-LAST:event_TextopenActionPerformed

    private void TextnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextnewActionPerformed
        // TODO add your handling code here:
        myTextArea.setText("");
    }//GEN-LAST:event_TextnewActionPerformed

    private void TextsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextsaveActionPerformed
        // TODO add your handling code here:
        final JFileChooser SaveAs = new JFileChooser();
            SaveAs.setApproveButtonText("Save");
            int actionDialog = SaveAs.showOpenDialog(this);
            if (actionDialog != JFileChooser.APPROVE_OPTION) {
                return;
            }

            File fileName = new File(SaveAs.getSelectedFile() + ".txt");
            BufferedWriter outFile = null;
            try {
                outFile = new BufferedWriter(new FileWriter(fileName));
                myTextArea.write(outFile);
            } catch (IOException e) {
            }
    }//GEN-LAST:event_TextsaveActionPerformed

    private void TextprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextprintActionPerformed
        try {
            // TODO add your handling code here:
            myTextArea.print();
        } catch (PrinterException ex) {
            Logger.getLogger(NotepadByShahzad.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_TextprintActionPerformed

    private void TextexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextexitActionPerformed
        // TODO add your handling code here:
        System.exit(1);
    }//GEN-LAST:event_TextexitActionPerformed

    private void TextcutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextcutActionPerformed
        // TODO add your handling code here:
        String text = myTextArea.getSelectedText();
            myTextArea.replaceRange("", myTextArea.getSelectionStart(), myTextArea.getSelectionEnd());
    }//GEN-LAST:event_TextcutActionPerformed

    private void TextcopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextcopyActionPerformed
        // TODO add your handling code here:
        String text = myTextArea.getSelectedText();
    }//GEN-LAST:event_TextcopyActionPerformed

    private void TextdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextdeleteActionPerformed
        // TODO add your handling code here:
        String cmdText=evt.getActionCommand();  
        cmdText.equals(Textdelete);  
        myTextArea.replaceSelection("");
    }//GEN-LAST:event_TextdeleteActionPerformed

    private void TextpasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextpasteActionPerformed
        // TODO add your handling code here:
        myTextArea.insert(text, myTextArea.getCaretPosition());
        

        
    }//GEN-LAST:event_TextpasteActionPerformed

    private void TextselectallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextselectallActionPerformed
        // TODO add your handling code here:
         myTextArea.selectAll();
    }//GEN-LAST:event_TextselectallActionPerformed

    private void BopenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BopenActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser("D:/Java");
            chooser.setAcceptAllFileFilterUsed(false); 
            FileNameExtensionFilter restrict = new FileNameExtensionFilter("Only .txt files", "txt"); 
            chooser.addChoosableFileFilter(restrict);
    	
            int result = chooser.showOpenDialog(this);
            if(result == JFileChooser.APPROVE_OPTION) {
                File file = chooser.getSelectedFile();
                
				
                try{
                    System.out.println("NotePad");
                    FileReader reader = new FileReader(file);
                    BufferedReader br = new BufferedReader(reader);
                    myTextArea.read( br, null );
                    br.close();
                    myTextArea.requestFocus();
                }catch(Exception e){
                    System.out.print(e);
                }
            }
    }//GEN-LAST:event_BopenActionPerformed

    private void BnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BnewActionPerformed
        // TODO add your handling code here:
        myTextArea.setText("");
    }//GEN-LAST:event_BnewActionPerformed

    private void myTextFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myTextFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myTextFileActionPerformed

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
            java.util.logging.Logger.getLogger(NotepadByShahzad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NotepadByShahzad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NotepadByShahzad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NotepadByShahzad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NotepadByShahzad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bnew;
    private javax.swing.JButton Bopen;
    private javax.swing.JMenuItem Textcopy;
    private javax.swing.JMenuItem Textcut;
    private javax.swing.JMenuItem Textdelete;
    private javax.swing.JMenuItem Textexit;
    private javax.swing.JMenuItem Textnew;
    private javax.swing.JMenuItem Textopen;
    private javax.swing.JMenuItem Textpaste;
    private javax.swing.JMenuItem Textprint;
    private javax.swing.JMenuItem Textsave;
    private javax.swing.JMenuItem Textselectall;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea mainTextArea;
    private javax.swing.JMenuBar myMenuBar;
    private javax.swing.JTextArea myTextArea;
    private javax.swing.JMenu myTextEdit;
    private javax.swing.JMenu myTextFile;
    private javax.swing.JToolBar myToolBar;
    // End of variables declaration//GEN-END:variables
}
