/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentList;

import cputils.FileUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.StringTokenizer;

/**
 *
 * @author Ahsana
 */
public class ListOfStudents extends javax.swing.JFrame {

    private static ArrayList<StudentMethods> students = new ArrayList<>();
    private static ArrayList<StudentMethods> studentsWithoutDup = new ArrayList<>();
    private String invalidFaculty = "";
    private String invalidGPA = "";

    public void ShowInvalidFaculty() {
        txtOutput.setText("");
        for (StudentMethods s : students) {
            if (s.getFaculty().equals("Basket Weaving")) {
                txtOutput.append(s.toString() + "             [F]" + "\n");
            }
        }
    }

    public void ShowInvalidGPA() {
        txtOutput.setText("");
        for (StudentMethods s : students) {
            if (s.getGpa() < 0 || s.getGpa() > 4) {
                txtOutput.append(s.toString() + "                 [G]" + "\n");
            }
        }
    }
    
    

    /**
     * Creates new form ListOfStudents
     */
    public ListOfStudents() {
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

        jLabel1 = new javax.swing.JLabel();
        txtFileName = new javax.swing.JTextField();
        btnLoadData = new javax.swing.JButton();
        btnRemoveDuplicates = new javax.swing.JButton();
        chkInvalidFaculty = new javax.swing.JCheckBox();
        chkInvalidGPA = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOutput = new javax.swing.JTextArea();
        btnDisplay = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("List Exercise");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("File Name:");

        txtFileName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtFileName.setText("students.csv");

        btnLoadData.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLoadData.setText("Load Data");
        btnLoadData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadDataActionPerformed(evt);
            }
        });

        btnRemoveDuplicates.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRemoveDuplicates.setText("Remove Duplicates");
        btnRemoveDuplicates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveDuplicatesActionPerformed(evt);
            }
        });

        chkInvalidFaculty.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        chkInvalidFaculty.setText("Flag Invalid Faculty");
        chkInvalidFaculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkInvalidFacultyActionPerformed(evt);
            }
        });

        chkInvalidGPA.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        chkInvalidGPA.setText("Flag Invalid GPA");
        chkInvalidGPA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkInvalidGPAActionPerformed(evt);
            }
        });

        txtOutput.setColumns(20);
        txtOutput.setRows(5);
        jScrollPane1.setViewportView(txtOutput);

        btnDisplay.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDisplay.setText("Display");
        btnDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFileName, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnLoadData))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chkInvalidFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(chkInvalidGPA)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDisplay)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnRemoveDuplicates)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnLoadData, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRemoveDuplicates))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtFileName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkInvalidFaculty)
                    .addComponent(chkInvalidGPA)
                    .addComponent(btnDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoadDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadDataActionPerformed
        int id = 0;
        String faculty = "";
        double gpa = 0;
        List<String> data = null;
        String fileName = txtFileName.getText();
        data = FileUtils.readIntoList(fileName);

        students = new ArrayList<StudentMethods>(data.size());

        for (int i = 0; i < data.size(); i++) {
            String line = data.get(i);

            StringTokenizer st = new StringTokenizer(line, ",");

            while (st.hasMoreElements()) {
                id = Integer.parseInt(st.nextToken());
                faculty = st.nextToken();
                gpa = Double.parseDouble(st.nextToken());
            }

            StudentMethods s = new StudentMethods(id, faculty, gpa);
            students.add(s);
        }
        int count = 0;
        for (StudentMethods s : students) {
            txtOutput.append(s.toString() + "\n");
            count++;
        }
        txtOutput.append("***Number of students: " + count);
    }//GEN-LAST:event_btnLoadDataActionPerformed

    private void btnRemoveDuplicatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveDuplicatesActionPerformed
        txtOutput.setText("");
        int id = 0;
        String faculty = "";
        double gpa = 0;
        List<String> data = null;
        String fileName = txtFileName.getText();
        data = FileUtils.readIntoList(fileName);
        
        List<String> dataWithoutDuplicates = new ArrayList<>(
                new LinkedHashSet<>(data));
        students = new ArrayList<StudentMethods>(dataWithoutDuplicates.size());

        for (int i = 0; i < dataWithoutDuplicates.size(); i++) {
            String line = dataWithoutDuplicates.get(i);

            StringTokenizer st = new StringTokenizer(line, ",");

            while (st.hasMoreElements()) {
                id = Integer.parseInt(st.nextToken());
                faculty = st.nextToken();
                gpa = Double.parseDouble(st.nextToken());
            }

            StudentMethods s = new StudentMethods(id, faculty, gpa);
            students.add(s);
        }
        int count = 0;
        for (StudentMethods s : students) {
            txtOutput.append(s.toString() + "\n");
            count++;
        }
        txtOutput.append("***Number of students: " + count);
    }//GEN-LAST:event_btnRemoveDuplicatesActionPerformed

    private void btnDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayActionPerformed
        int id = 0;
        String faculty = "";
        double gpa = 0;
        List<String> data = null;
        String fileName = txtFileName.getText();
        data = FileUtils.readIntoList(fileName);

        students = new ArrayList<StudentMethods>(data.size());

        for (int i = 0; i < data.size(); i++) {
            String line = data.get(i);

            StringTokenizer st = new StringTokenizer(line, ",");

            while (st.hasMoreElements()) {
                id = Integer.parseInt(st.nextToken());
                faculty = st.nextToken();
                gpa = Double.parseDouble(st.nextToken());
            }

            StudentMethods s = new StudentMethods(id, faculty, gpa);
            students.add(s);
        }
        int count = 0;
        for (StudentMethods s : students) {
            if(invalidFaculty == "invalidFaculty"){
                txtOutput.append(s.toString() + "        [F]" +  "\n");
            count++;
            }if(invalidGPA == "invalidGPA"){
            txtOutput.append(s.toString() + "       [G]" + "\n");
            count++;
            }if(invalidFaculty == "invalidFaculty" && invalidGPA == "invalidGPA"){
            txtOutput.append(s.toString() + "      [F] " + "   [G]" + "\n");
            count++;
            }
        }
        txtOutput.append("***Number of students: " + count);
    }//GEN-LAST:event_btnDisplayActionPerformed

    private void chkInvalidFacultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkInvalidFacultyActionPerformed
        invalidFaculty = "invalidFaculty";
    }//GEN-LAST:event_chkInvalidFacultyActionPerformed

    private void chkInvalidGPAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkInvalidGPAActionPerformed
        invalidGPA = "invalidGPA";
    }//GEN-LAST:event_chkInvalidGPAActionPerformed

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
            java.util.logging.Logger.getLogger(ListOfStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListOfStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListOfStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListOfStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListOfStudents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDisplay;
    private javax.swing.JButton btnLoadData;
    private javax.swing.JButton btnRemoveDuplicates;
    private javax.swing.JCheckBox chkInvalidFaculty;
    private javax.swing.JCheckBox chkInvalidGPA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtFileName;
    private javax.swing.JTextArea txtOutput;
    // End of variables declaration//GEN-END:variables
}
