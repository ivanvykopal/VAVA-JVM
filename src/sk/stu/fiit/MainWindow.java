/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuItem;

/**
 *
 * @author Acer
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        lbOSname = new javax.swing.JLabel();
        lbUsername = new javax.swing.JLabel();
        lbJava = new javax.swing.JLabel();
        lbDirectory = new javax.swing.JLabel();
        lbDirectorySize = new javax.swing.JLabel();
        lbJVMMemorySize = new javax.swing.JLabel();
        lbJVMMemory = new javax.swing.JLabel();
        lbJVMFreeMemory = new javax.swing.JLabel();
        btnDiagnostic = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        lbOSversion = new javax.swing.JLabel();
        lbOSarchitecture = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miShutdown = new javax.swing.JMenuItem();
        miRestart = new javax.swing.JMenuItem();
        miLogout = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        miExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Diagnostika PC a JVM");
        setPreferredSize(new java.awt.Dimension(1000, 1000));
        getContentPane().setLayout(new java.awt.GridLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        lbOSname.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 50, 25, 25);
        jPanel1.add(lbOSname, gridBagConstraints);

        lbUsername.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 50, 25, 25);
        jPanel1.add(lbUsername, gridBagConstraints);

        lbJava.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 50, 25, 25);
        jPanel1.add(lbJava, gridBagConstraints);

        lbDirectory.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 50, 25, 25);
        jPanel1.add(lbDirectory, gridBagConstraints);

        lbDirectorySize.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 50, 25, 25);
        jPanel1.add(lbDirectorySize, gridBagConstraints);

        lbJVMMemorySize.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 50, 25, 25);
        jPanel1.add(lbJVMMemorySize, gridBagConstraints);

        lbJVMMemory.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 50, 25, 25);
        jPanel1.add(lbJVMMemory, gridBagConstraints);

        lbJVMFreeMemory.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 50, 25, 25);
        jPanel1.add(lbJVMFreeMemory, gridBagConstraints);

        btnDiagnostic.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        btnDiagnostic.setText("Diagnostika");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.insets = new java.awt.Insets(25, 25, 25, 25);
        jPanel1.add(btnDiagnostic, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        jLabel9.setText("Diagnostika PC a JVM");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(25, 25, 25, 25);
        jPanel1.add(jLabel9, gridBagConstraints);

        lbOSversion.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 50, 25, 25);
        jPanel1.add(lbOSversion, gridBagConstraints);

        lbOSarchitecture.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 50, 25, 25);
        jPanel1.add(lbOSarchitecture, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel1.setText("Názov OS:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 25, 25, 25);
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel2.setText("Verzia OS:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 25, 25, 25);
        jPanel1.add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel3.setText("Architektúra OS:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 25, 25, 25);
        jPanel1.add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel4.setText("Meno používateľa:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 25, 25, 25);
        jPanel1.add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel5.setText("Verzia Javy:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 25, 25, 25);
        jPanel1.add(jLabel5, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel6.setText("Používateľský adresár:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 25, 25, 25);
        jPanel1.add(jLabel6, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel7.setText("Celková veľkosť používateľského adresára:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 25, 25, 25);
        jPanel1.add(jLabel7, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel8.setText("Celková dostupná pamäť určená pre JVM:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 25, 25, 25);
        jPanel1.add(jLabel8, gridBagConstraints);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel10.setText("Dostupnä pamäť pre JVM:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 25, 25, 25);
        jPanel1.add(jLabel10, gridBagConstraints);

        jLabel11.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel11.setText("Voľná pamäť v JVM pred alokáciou:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 25, 25, 25);
        jPanel1.add(jLabel11, gridBagConstraints);

        getContentPane().add(jPanel1);

        jMenu1.setText("Súbor");
        jMenu1.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        miShutdown.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        miShutdown.setText("Vypnutie zariadenia");
        jMenu1.add(miShutdown);

        miRestart.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        miRestart.setText("Reštart zariadenia");
        jMenu1.add(miRestart);

        miLogout.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        miLogout.setText("Odhlásenie zariadenia");
        jMenu1.add(miLogout);
        jMenu1.add(jSeparator1);

        miExit.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        miExit.setText("Koniec");
        jMenu1.add(miExit);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDiagnostic;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lbDirectory;
    private javax.swing.JLabel lbDirectorySize;
    private javax.swing.JLabel lbJVMFreeMemory;
    private javax.swing.JLabel lbJVMMemory;
    private javax.swing.JLabel lbJVMMemorySize;
    private javax.swing.JLabel lbJava;
    private javax.swing.JLabel lbOSarchitecture;
    private javax.swing.JLabel lbOSname;
    private javax.swing.JLabel lbOSversion;
    private javax.swing.JLabel lbUsername;
    private javax.swing.JMenuItem miExit;
    private javax.swing.JMenuItem miLogout;
    private javax.swing.JMenuItem miRestart;
    private javax.swing.JMenuItem miShutdown;
    // End of variables declaration//GEN-END:variables

    public void setLbDirectory(String text) {
        this.lbDirectory.setText(text);
    }

    public void setLbDirectorySize(String text) {
        this.lbDirectorySize.setText(text);
    }

    public void setLbJVMFreeMemory(String text) {
        this.lbJVMFreeMemory.setText(text);
    }

    public void setLbJVMMemory(String text) {
        this.lbJVMMemory.setText(text);
    }

    public void setLbJVMMemorySize(String text) {
        this.lbJVMMemorySize.setText(text);
    }

    public void setLbJava(String text) {
        this.lbJava.setText(text);
    }

    public void setLbOSname(String text) {
        this.lbOSname.setText(text);
    }

    public void setLbOSarchitecture(String text) {
        this.lbOSarchitecture.setText(text);
    }

    public void setLbOSversion(String text) {
        this.lbOSversion.setText(text);
    }

    public void setLbUsername(String text) {
        this.lbUsername.setText(text);
    }

    public JButton getBtnDiagnostic() {
        return btnDiagnostic;
    }

    public JMenuItem getMiExit() {
        return miExit;
    }

    public JMenuItem getMiLogout() {
        return miLogout;
    }

    public JMenuItem getMiRestart() {
        return miRestart;
    }

    public JMenuItem getMiShutdown() {
        return miShutdown;
    }

}