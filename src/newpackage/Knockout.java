/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author DAIYAN
 */
public class Knockout extends javax.swing.JFrame {

    /**
     * Creates new form Knockout
     */
    public Knockout() {
        initComponents();
        showKnockout();
    }
    void showKnockout()
    {
         SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
    Date date1 = new Date();
    date1.setMonth(5);
    date1.setDate(30);
    Date date2 = new Date();
    date2.setMonth(6);
    date2.setDate(1);
    Date date3 = new Date();
    date3.setMonth(6);
    date3.setDate(2);
    Date date4 = new Date();
    date4.setDate(3);
    date4.setMonth(6);
    Date date5 = new Date();
    date5.setMonth(6);
    date5.setDate(4);
    Date date6 = new Date();
    date6.setMonth(6);
    date6.setDate(5);
    Date date7 = new Date();
    date7.setMonth(6);
    date7.setDate(6);
    Date date8 = new Date();
    date8.setMonth(6);
    date8.setDate(7);
    Date date9 = new Date();
    date9.setMonth(6);
    date9.setDate(8);
    Date date10 = new Date();
    date10.setMonth(6);
    date10.setDate(9);
    Date date11 = new Date();
    date11.setMonth(6);
    date11.setDate(10);
    Date date12 = new Date();
    date12.setMonth(6);
    date12.setDate(11);
    Date date13 = new Date();
    date13.setMonth(6);
    date13.setDate(12);
    Date date14 = new Date();
    date14.setMonth(6);
    date14.setDate(13);
    Date date15 = new Date();
    date15.setMonth(6);
    date15.setDate(14);
    Date date16 = new Date();
    date16.setMonth(6);
    date16.setDate(15);
    
    Date date = new Date();
    //date.setMonth(6);
    //date.setDate(10);
    if(date.before(date1))
    {
        jLabel17.setVisible(true);
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        jLabel9.setVisible(false);
        jLabel10.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        jLabel14.setVisible(false);
        jLabel15.setVisible(false);
        jLabel18.setVisible(false);
        jLabel19.setVisible(false);
        
    }
    else
    {
        jLabel17.setVisible(true);
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        jLabel9.setVisible(false);
        jLabel10.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        jLabel14.setVisible(false);
        jLabel15.setVisible(false);
       jLabel17.setVisible(false);
       jLabel18.setVisible(false);
       jLabel19.setVisible(false);
       jLabel1.setVisible(true); 
       if(date.compareTo(date1)==0 || date.after(date1))
        {
            jLabel2.setVisible(true);
            jLabel3.setVisible(true);
        }
       if(date.compareTo(date2)==0 || date.after(date2))
        {
            jLabel6.setVisible(true);
            jLabel7.setVisible(true);
        }
       if(date.compareTo(date3)==0 || date.after(date3))
        {
            jLabel4.setVisible(true);
            jLabel5.setVisible(true);
        }
       if(date.compareTo(date4)==0 || date.after(date4))
        {
            jLabel8.setVisible(true);
            jLabel9.setVisible(true);
        }
       if(date.compareTo(date7)==0 || date.after(date7))
        {
            jLabel10.setVisible(true);
            jLabel11.setVisible(true);
        }
       if(date.compareTo(date8)==0 || date.after(date8))
        {
            jLabel12.setVisible(true);
            jLabel13.setVisible(true);
        }
       if(date.compareTo(date11)==0 || date.after(date11))
        {
            jLabel14.setVisible(true);
        }
       if(date.compareTo(date12)==0 || date.after(date12))
        {
            jLabel15.setVisible(true);
        }
        if(date.compareTo(date15)==0 || date.after(date15))
        {
            jLabel18.setVisible(true);
            jLabel19.setVisible(true);
        }
    }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/images/kfra.png"))); // NOI18N
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel19.setText("CHAMPION");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/images/kuru.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/images/kfra.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/images/kbra.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/images/kbel.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 600, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/images/krus.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 110, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/images/kcro.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 270, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/images/kswe.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 440, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/images/keng.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 600, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/images/kfra.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/images/kbel.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 520, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/images/kcro.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 190, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/images/keng.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 520, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/images/kfra.png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/images/kcro.png"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 350, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/images/knck.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel16.setText("jLabel16");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/images/knck1.png"))); // NOI18N
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Knockout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Knockout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Knockout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Knockout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Knockout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
