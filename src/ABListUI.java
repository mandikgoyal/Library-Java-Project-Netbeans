import javax.swing.table.*;
import java.sql.*;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ABListUI.java
 *
 * Created on May 13, 2010, 6:02:09 PM
 */

/**
 *
 * @author xp_system
 */
public class ABListUI extends javax.swing.JFrame {

    /** Creates new form ABListUI */
    public ABListUI() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MyDialog = new javax.swing.JDialog();
        cmdBack = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        cmdExit = new javax.swing.JButton();
        cmdIssue = new javax.swing.JButton();

        MyDialog.setTitle("Issued books");
        MyDialog.setMinimumSize(new java.awt.Dimension(600, 350));
        MyDialog.addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                MyDialogWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        cmdBack.setText("Close Me");
        cmdBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBackActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Accession No.", "Title", "Author", "Price", "Edition"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout MyDialogLayout = new javax.swing.GroupLayout(MyDialog.getContentPane());
        MyDialog.getContentPane().setLayout(MyDialogLayout);
        MyDialogLayout.setHorizontalGroup(
            MyDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MyDialogLayout.createSequentialGroup()
                .addGroup(MyDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MyDialogLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE))
                    .addGroup(MyDialogLayout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(cmdBack)))
                .addContainerGap())
        );
        MyDialogLayout.setVerticalGroup(
            MyDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MyDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmdBack)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Available Book List");
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Accession No", "Title", "Author", "Price", "Edition"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        cmdExit.setText("Exit");
        cmdExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdExitActionPerformed(evt);
            }
        });

        cmdIssue.setText("Click Here to See Issued Books");
        cmdIssue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdIssueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(cmdIssue, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(cmdExit)
                .addGap(174, 174, 174))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdExit)
                    .addComponent(cmdIssue))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // Before writting the followng line, you should import the line:
	// import javax.swing.table.*; at the top of your application
	DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
	// Clear the existing table
	int rows = model.getRowCount();
	if (rows > 0) {
            for (int i = 0; i < rows; i++) {
                model.removeRow(0);
            }
        }
        // SQL Query
        char st = 'Y';  // Lib table
        String query = "SELECT * FROM Lib WHERE status = '" + st + "';";
        try {
            // Connect to MySQL database
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/Library","root","TIGER");
            // Create SQL statement and execute query.
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            // Iterate through the result and display on screen
            while (rs.next()) {
                String Acno = rs.getString("acc_no");
                String bTitle = rs.getString("btitle");
                String Auth1 = rs.getString("author1");
                String Price = rs.getString("price");
                String edition = rs.getString("edition");
                //System.out.println(Acno + "|" + bTitle + "|" + Auth1 + "|" + Price + "|" + edition);
                model.addRow(new Object[] {Acno, bTitle, Auth1, Price, edition});
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_formWindowGainedFocus

    private void cmdExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdExitActionPerformed
        this.setVisible(false);
}//GEN-LAST:event_cmdExitActionPerformed

    private void cmdIssueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdIssueActionPerformed
        MyDialog.setVisible(true);
    }//GEN-LAST:event_cmdIssueActionPerformed

    private void cmdBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBackActionPerformed
        MyDialog.dispose();
    }//GEN-LAST:event_cmdBackActionPerformed

    private void MyDialogWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_MyDialogWindowGainedFocus
        DefaultTableModel Dmodel = (DefaultTableModel) jTable2.getModel();
	// Clear the existing table
	int rows = Dmodel.getRowCount();
	if (rows > 0) {
            for (int i = 0; i < rows; i++) {
                Dmodel.removeRow(0);
            }
        }
        // SQL Query
        char st = 'N';  // Lib table
        String query = "SELECT * FROM Lib WHERE status = '" + st + "';";
        try {
            // Connect to MySQL database
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/Library","root","TIGER");
            // Create SQL statement and execute query.
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            // Iterate through the result and display on screen
            while (rs.next()) {
                String Acno = rs.getString("acc_no");
                String bTitle = rs.getString("btitle");
                String Auth1 = rs.getString("author1");
                String Price = rs.getString("price");
                String edition = rs.getString("edition");
                //System.out.println(Acno + "|" + bTitle + "|" + Auth1 + "|" + Price + "|" + edition);
                Dmodel.addRow(new Object[] {Acno, bTitle, Auth1, Price, edition});
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_MyDialogWindowGainedFocus

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ABListUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog MyDialog;
    private javax.swing.JButton cmdBack;
    private javax.swing.JButton cmdExit;
    private javax.swing.JButton cmdIssue;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables

}
