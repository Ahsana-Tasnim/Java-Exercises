package listexercise;

import cputils.FileUtils;
import cputils.FileUtilsExceptionsThrown;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class MainForm extends javax.swing.JFrame {

    List<Student> studentsFromFile;
    List<Student> uniqueStudents;

    public MainForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLoad = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtStudents = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        txtFile = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDuplicates = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtInvalidLines = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("List Exercise");

        btnLoad.setText("Load Data");
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });

        txtStudents.setColumns(20);
        txtStudents.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtStudents.setRows(5);
        jScrollPane1.setViewportView(txtStudents);

        jLabel1.setText("File:");

        txtFile.setText("students.csv");

        txtDuplicates.setColumns(20);
        txtDuplicates.setRows(5);
        jScrollPane2.setViewportView(txtDuplicates);

        txtInvalidLines.setColumns(20);
        txtInvalidLines.setRows(5);
        jScrollPane3.setViewportView(txtInvalidLines);

        jLabel2.setText("Invalid Lines");

        jLabel3.setText("Duplicates");

        jLabel4.setText("Students");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
                            .addComponent(jScrollPane3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtFile, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLoad)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLoad)
                    .addComponent(jLabel1)
                    .addComponent(txtFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3)))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed

        studentsFromFile = new ArrayList<>();
        String[] data = null;
        String fileName = txtFile.getText();
        
        String uniqueStudentFileName = "uniqueStudents.csv";
        List<String> uniqueList = new ArrayList<>();
        
        String duplicateStudentFileName = "duplicates.csv";
        List<String> duplicateList = new ArrayList<>();
        
        String invalidStudentFileName = "invalidEntries.csv";
        List<String> invalidList = new ArrayList<>();

        data = FileUtils.readIntoArray(fileName);
        Student[] students = new Student[data.length];
        for (int i = 0; i < data.length; i++) {
            String line = data[i];
            String[] pieces = line.split(",");
            int id = Integer.parseInt(pieces[0]);
            String program = pieces[1];
            double gpa = Double.parseDouble(pieces[2]);

            Student s = new Student(id, program, gpa);

            studentsFromFile.add(s);

            for (Student h : studentsFromFile) {
                if (!Student.isValidFaculty(s) || !Student.isValidGpa(s)) {
                    txtInvalidLines.append(s + "\n");
                    invalidList.add(h.toString());
                try {
                    FileUtilsExceptionsThrown.writeListToFile(invalidList, invalidStudentFileName);
                } catch (FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(this, ex);
                }
                }
                
                txtStudents.append(h.toString() + "\n");
                
                duplicateList.add(h.toString());
                try {
                    FileUtilsExceptionsThrown.writeListToFile(duplicateList, duplicateStudentFileName);
                } catch (FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(this, ex);
                }
            }
            txtStudents.append("Total Entries " + String.valueOf(studentsFromFile.size()));
            
            uniqueStudents = new ArrayList<>();
        for (Student uniquestudent : studentsFromFile) {
            if (!uniqueStudents.contains(uniquestudent)) {

                uniqueStudents.add(uniquestudent);
            }
        }
        for (Student u : uniqueStudents) {
            txtDuplicates.append(u.toString() + "\n");
            uniqueList.add(u.toString());
                try {
                    FileUtilsExceptionsThrown.writeListToFile(uniqueList, uniqueStudentFileName);
                } catch (FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(this, ex);
                }

        }
        }

    }//GEN-LAST:event_btnLoadActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txtDuplicates;
    private javax.swing.JTextField txtFile;
    private javax.swing.JTextArea txtInvalidLines;
    private javax.swing.JTextArea txtStudents;
    // End of variables declaration//GEN-END:variables
}