/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DAIYAN
 */
public class Round_1 extends javax.swing.JFrame {

    /**
     * Creates new form Round_1
     */
    public Round_1() {
        initComponents();
        showResults();
    }
    
    /*
    In this function a file is opened from pc
    where all the results of first round of the FIFA Worldcup 2018 is stored.
    Then according to date,this function shows the result at that day.If The date
    is before worldcup then it will show nothing,but but if the date is somewhere between worldcup or after worldcup,then
    it will show the results of the matches which have already been played
    */
    public static void showResults()
    {
        //jLabel2.setText("5-0");
        //System.out.println("aaaa");
        String[] s=new String[48];
        int i=0;
        try {
            //File file = new File("C:\\Users\\Asus\\Documents\\NetBeansProjects\\Fif\\src\\results.txt");
            File file = new File("C:\\Users\\daiya\\Documents\\Final Project\\src\\results.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                s[i]=scanner.nextLine();
                i++;
            }
            scanner.close();
            
        } catch (Exception ex) {
            Logger.getLogger(Round_1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
    Date date1 = new Date();
    date1.setMonth(5);
    date1.setDate(14);
    Date date2 = new Date();
    date2.setMonth(5);
    date2.setDate(15);
    Date date3 = new Date();
    date3.setMonth(5);
    date3.setDate(16);
    Date date4 = new Date();
    date4.setDate(17);
    date4.setMonth(5);
    Date date5 = new Date();
    date5.setMonth(5);
    date5.setDate(18);
    Date date6 = new Date();
    date6.setMonth(5);
    date6.setDate(19);
    Date date7 = new Date();
    date7.setMonth(5);
    date7.setDate(20);
    Date date8 = new Date();
    date8.setMonth(5);
    date8.setDate(21);
    Date date9 = new Date();
    date9.setMonth(5);
    date9.setDate(22);
    Date date10 = new Date();
    date10.setMonth(5);
    date10.setDate(23);
    Date date11 = new Date();
    date11.setMonth(5);
    date11.setDate(24);
    Date date12 = new Date();
    date12.setMonth(5);
    date12.setDate(25);
    Date date13 = new Date();
    date13.setMonth(5);
    date13.setDate(26);
    Date date14 = new Date();
    date14.setMonth(5);
    date14.setDate(27);
    Date date15 = new Date();
    date15.setMonth(5);
    date15.setDate(28);
    Date date16 = new Date();
    date16.setMonth(5);
    date16.setDate(29);
    
    Date date = new Date();
   //date.setMonth(5);
   //date.setDate(15);
    
    if(date.before(date1))
    {
        ;
    }
    if(date.compareTo(date1)==0)
    {
        r1.setText(s[0]);
    }
    if(date.compareTo(date2)==0)
    {
        r1.setText(s[0]);
        r2.setText(s[1]);
        r3.setText(s[2]);
    }
    if(date.compareTo(date3)==0)
    {
        r1.setText(s[0]);
        r2.setText(s[1]);
        r3.setText(s[2]);
        r4.setText(s[3]);
        r5.setText(s[4]);
        r6.setText(s[5]);
        r7.setText(s[6]);
    }
    if(date.compareTo(date4)==0)
    {
        r1.setText(s[0]);
        r2.setText(s[1]);
        r3.setText(s[2]);
        r4.setText(s[3]);
        r5.setText(s[4]);
        r6.setText(s[5]);
        r7.setText(s[6]);
        r8.setText(s[7]);
        r9.setText(s[8]);
        r10.setText(s[9]);
    }
    if(date.compareTo(date5)==0)
    {
        r1.setText(s[0]);
        r2.setText(s[1]);
        r3.setText(s[2]);
        r4.setText(s[3]);
        r5.setText(s[4]);
        r6.setText(s[5]);
        r7.setText(s[6]);
        r8.setText(s[7]);
        r9.setText(s[8]);
        r10.setText(s[9]);
        r11.setText(s[10]);
        r12.setText(s[11]);
        r13.setText(s[12]);
    }
    if(date.compareTo(date6)==0)
    {
        r1.setText(s[0]);
        r2.setText(s[1]);
        r3.setText(s[2]);
        r4.setText(s[3]);
        r5.setText(s[4]);
        r6.setText(s[5]);
        r7.setText(s[6]);
        r8.setText(s[7]);
        r9.setText(s[8]);
        r10.setText(s[9]);
        r11.setText(s[10]);
        r12.setText(s[11]);
        r13.setText(s[12]);
        r14.setText(s[13]);
        r15.setText(s[14]);
        r16.setText(s[15]);
    }
    if(date.compareTo(date7)==0)
    {
        r1.setText(s[0]);
        r2.setText(s[1]);
        r3.setText(s[2]);
        r4.setText(s[3]);
        r5.setText(s[4]);
        r6.setText(s[5]);
        r7.setText(s[6]);
        r8.setText(s[7]);
        r9.setText(s[8]);
        r10.setText(s[9]);
        r11.setText(s[10]);
        r12.setText(s[11]);
        r13.setText(s[12]);
        r14.setText(s[13]);
        r15.setText(s[14]);
        r16.setText(s[15]);
        r17.setText(s[16]);
        r18.setText(s[17]);
        r19.setText(s[18]);
    }
    if(date.compareTo(date8)==0)
    {
        r1.setText(s[0]);
        r2.setText(s[1]);
        r3.setText(s[2]);
        r4.setText(s[3]);
        r5.setText(s[4]);
        r6.setText(s[5]);
        r7.setText(s[6]);
        r8.setText(s[7]);
        r9.setText(s[8]);
        r10.setText(s[9]);
        r11.setText(s[10]);
        r12.setText(s[11]);
        r13.setText(s[12]);
        r14.setText(s[13]);
        r15.setText(s[14]);
        r16.setText(s[15]);
        r17.setText(s[16]);
        r18.setText(s[17]);
        r19.setText(s[18]);
        r20.setText(s[19]);
        r21.setText(s[20]);
        r22.setText(s[21]);
    }
    if(date.compareTo(date9)==0)
    {
        r1.setText(s[0]);
        r2.setText(s[1]);
        r3.setText(s[2]);
        r4.setText(s[3]);
        r5.setText(s[4]);
        r6.setText(s[5]);
        r7.setText(s[6]);
        r8.setText(s[7]);
        r9.setText(s[8]);
        r10.setText(s[9]);
        r11.setText(s[10]);
        r12.setText(s[11]);
        r13.setText(s[12]);
        r14.setText(s[13]);
        r15.setText(s[14]);
        r16.setText(s[15]);
        r17.setText(s[16]);
        r18.setText(s[17]);
        r19.setText(s[18]);
        r20.setText(s[19]);
        r21.setText(s[20]);
        r22.setText(s[21]);
        r23.setText(s[22]);
        r24.setText(s[23]);
        r25.setText(s[24]);
    }
    if(date.compareTo(date10)==0)
    {
        r1.setText(s[0]);
        r2.setText(s[1]);
        r3.setText(s[2]);
        r4.setText(s[3]);
        r5.setText(s[4]);
        r6.setText(s[5]);
        r7.setText(s[6]);
        r8.setText(s[7]);
        r9.setText(s[8]);
        r10.setText(s[9]);
        r11.setText(s[10]);
        r12.setText(s[11]);
        r13.setText(s[12]);
        r14.setText(s[13]);
        r15.setText(s[14]);
        r16.setText(s[15]);
        r17.setText(s[16]);
        r18.setText(s[17]);
        r19.setText(s[18]);
        r20.setText(s[19]);
        r21.setText(s[20]);
        r22.setText(s[21]);
        r23.setText(s[22]);
        r24.setText(s[23]);
        r25.setText(s[24]);
        r26.setText(s[25]);
        r27.setText(s[26]);
        r28.setText(s[27]);
    }
    if(date.compareTo(date11)==0)
    {
              r1.setText(s[0]);
        r2.setText(s[1]);
        r3.setText(s[2]);
        r4.setText(s[3]);
        r5.setText(s[4]);
        r6.setText(s[5]);
        r7.setText(s[6]);
        r8.setText(s[7]);
        r9.setText(s[8]);
        r10.setText(s[9]);
        r11.setText(s[10]);
        r12.setText(s[11]);
        r13.setText(s[12]);
        r14.setText(s[13]);
        r15.setText(s[14]);
        r16.setText(s[15]);
        r17.setText(s[16]);
        r18.setText(s[17]);
        r19.setText(s[18]);
        r20.setText(s[19]);
        r21.setText(s[20]);
        r22.setText(s[21]);
        r23.setText(s[22]);
        r24.setText(s[23]);
        r25.setText(s[24]);
        r26.setText(s[25]);
        r27.setText(s[26]);
        r28.setText(s[27]);
        r29.setText(s[28]);
        r30.setText(s[29]);
        r31.setText(s[30]);
    }
    if(date.compareTo(date12)==0)
    {
              r1.setText(s[0]);
        r2.setText(s[1]);
        r3.setText(s[2]);
        r4.setText(s[3]);
        r5.setText(s[4]);
        r6.setText(s[5]);
        r7.setText(s[6]);
        r8.setText(s[7]);
        r9.setText(s[8]);
        r10.setText(s[9]);
        r11.setText(s[10]);
        r12.setText(s[11]);
        r13.setText(s[12]);
        r14.setText(s[13]);
        r15.setText(s[14]);
        r16.setText(s[15]);
        r17.setText(s[16]);
        r18.setText(s[17]);
        r19.setText(s[18]);
        r20.setText(s[19]);
        r21.setText(s[20]);
        r22.setText(s[21]);
        r23.setText(s[22]);
        r24.setText(s[23]);
        r25.setText(s[24]);
        r26.setText(s[25]);
        r27.setText(s[26]);
        r28.setText(s[27]);
        r29.setText(s[28]);
        r30.setText(s[29]);
        r31.setText(s[30]);
        r32.setText(s[31]);
        r33.setText(s[32]);
        r34.setText(s[33]);
    }
    if(date.compareTo(date13)==0)
    {
              r1.setText(s[0]);
        r2.setText(s[1]);
        r3.setText(s[2]);
        r4.setText(s[3]);
        r5.setText(s[4]);
        r6.setText(s[5]);
        r7.setText(s[6]);
        r8.setText(s[7]);
        r9.setText(s[8]);
        r10.setText(s[9]);
        r11.setText(s[10]);
        r12.setText(s[11]);
        r13.setText(s[12]);
        r14.setText(s[13]);
        r15.setText(s[14]);
        r16.setText(s[15]);
        r17.setText(s[16]);
        r18.setText(s[17]);
        r19.setText(s[18]);
        r20.setText(s[19]);
        r21.setText(s[20]);
        r22.setText(s[21]);
        r23.setText(s[22]);
        r24.setText(s[23]);
        r25.setText(s[24]);
        r26.setText(s[25]);
        r27.setText(s[26]);
        r28.setText(s[27]);
        r29.setText(s[28]);
        r30.setText(s[29]);
        r31.setText(s[30]);
        r32.setText(s[31]);
        r33.setText(s[32]);
        r34.setText(s[33]);
        r35.setText(s[34]);
        r36.setText(s[35]);
        r37.setText(s[36]);
        r38.setText(s[37]);
    }
    if(date.compareTo(date14)==0)
    {
              r1.setText(s[0]);
        r2.setText(s[1]);
        r3.setText(s[2]);
        r4.setText(s[3]);
        r5.setText(s[4]);
        r6.setText(s[5]);
        r7.setText(s[6]);
        r8.setText(s[7]);
        r9.setText(s[8]);
        r10.setText(s[9]);
        r11.setText(s[10]);
        r12.setText(s[11]);
        r13.setText(s[12]);
        r14.setText(s[13]);
        r15.setText(s[14]);
        r16.setText(s[15]);
        r17.setText(s[16]);
        r18.setText(s[17]);
        r19.setText(s[18]);
        r20.setText(s[19]);
        r21.setText(s[20]);
        r22.setText(s[21]);
        r23.setText(s[22]);
        r24.setText(s[23]);
        r25.setText(s[24]);
        r26.setText(s[25]);
        r27.setText(s[26]);
        r28.setText(s[27]);
        r29.setText(s[28]);
        r30.setText(s[29]);
        r31.setText(s[30]);
        r32.setText(s[31]);
        r33.setText(s[32]);
        r34.setText(s[33]);
        r35.setText(s[34]);
        r36.setText(s[35]);
        r37.setText(s[36]);
        r38.setText(s[37]);
        r39.setText(s[38]);
        r40.setText(s[39]);
        r41.setText(s[40]);
        r42.setText(s[41]);
        r43.setText(s[42]);

    }
    if(date.compareTo(date15)==0)
    {
              r1.setText(s[0]);
        r2.setText(s[1]);
        r3.setText(s[2]);
        r4.setText(s[3]);
        r5.setText(s[4]);
        r6.setText(s[5]);
        r7.setText(s[6]);
        r8.setText(s[7]);
        r9.setText(s[8]);
        r10.setText(s[9]);
        r11.setText(s[10]);
        r12.setText(s[11]);
        r13.setText(s[12]);
        r14.setText(s[13]);
        r15.setText(s[14]);
        r16.setText(s[15]);
        r17.setText(s[16]);
        r18.setText(s[17]);
        r19.setText(s[18]);
        r20.setText(s[19]);
        r21.setText(s[20]);
        r22.setText(s[21]);
        r23.setText(s[22]);
        r24.setText(s[23]);
        r25.setText(s[24]);
        r26.setText(s[25]);
        r27.setText(s[26]);
        r28.setText(s[27]);
        r29.setText(s[28]);
        r30.setText(s[29]);
        r31.setText(s[30]);
        r32.setText(s[31]);
        r33.setText(s[32]);
        r34.setText(s[33]);
        r35.setText(s[34]);
        r36.setText(s[35]);
        r37.setText(s[36]);
        r38.setText(s[37]);
        r39.setText(s[38]);
        r40.setText(s[39]);
        r41.setText(s[40]);
        r42.setText(s[41]);
        r43.setText(s[42]);
        r44.setText(s[43]);
        r45.setText(s[44]);
        r46.setText(s[45]);
    }
        
    if(date.after(date16) || date.compareTo(date16)==0){
        r1.setText(s[0]);
        r2.setText(s[1]);
        r3.setText(s[2]);
        r4.setText(s[3]);
        r5.setText(s[4]);
        r6.setText(s[5]);
        r7.setText(s[6]);
        r8.setText(s[7]);
        r9.setText(s[8]);
        r10.setText(s[9]);
        r11.setText(s[10]);
        r12.setText(s[11]);
        r13.setText(s[12]);
        r14.setText(s[13]);
        r15.setText(s[14]);
        r16.setText(s[15]);
        r17.setText(s[16]);
        r18.setText(s[17]);
        r19.setText(s[18]);
        r20.setText(s[19]);
        r21.setText(s[20]);
        r22.setText(s[21]);
        r23.setText(s[22]);
        r24.setText(s[23]);
        r25.setText(s[24]);
        r26.setText(s[25]);
        r27.setText(s[26]);
        r28.setText(s[27]);
        r29.setText(s[28]);
        r30.setText(s[29]);
        r31.setText(s[30]);
        r32.setText(s[31]);
        r33.setText(s[32]);
        r34.setText(s[33]);
        r35.setText(s[34]);
        r36.setText(s[35]);
        r37.setText(s[36]);
        r38.setText(s[37]);
        r39.setText(s[38]);
        r40.setText(s[39]);
        r41.setText(s[40]);
        r42.setText(s[41]);
        r43.setText(s[42]);
        r44.setText(s[43]);
        r45.setText(s[44]);
        r46.setText(s[45]);
        r47.setText(s[46]);
        r48.setText(s[47]);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        r1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        r2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        r3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        r4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        r5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        r6 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        r7 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        r8 = new javax.swing.JLabel();
        r9 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        r10 = new javax.swing.JLabel();
        r11 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        r12 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        r13 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        r14 = new javax.swing.JLabel();
        r15 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        r16 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        r17 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        r18 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        r19 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        r20 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        r21 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        r22 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        r23 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        r24 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        r25 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        r26 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        r27 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        r28 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        r29 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        r30 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        r31 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        r32 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        r33 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        r34 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        r35 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        r36 = new javax.swing.JLabel();
        r37 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        r38 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        r39 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        r40 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        r41 = new javax.swing.JLabel();
        r42 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        r43 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        r44 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        r45 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        r46 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        r47 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        r48 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(200, 50, 40));
        setPreferredSize(new java.awt.Dimension(900, 600));

        jPanel1.setBackground(new java.awt.Color(255, 255, 240));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setText("Russia");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

        r1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        r1.setText("-");
        jPanel1.add(r1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel3.setText("Saudi Arabia");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel4.setText("Egypt");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));

        r2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        r2.setText("-");
        jPanel1.add(r2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 110, -1));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel6.setText("Uruguay");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, 193, -1));

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel7.setText("Morocco");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 270, -1, -1));

        r3.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        r3.setText("-");
        jPanel1.add(r3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, -1, -1));

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel9.setText("Iran");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 270, -1, -1));

        r4.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        r4.setText("-");
        jPanel1.add(r4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, -1, -1));

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel11.setText("Portugal");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 370, -1, -1));

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel12.setText("Spain");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 370, -1, -1));

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel13.setText("France");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 470, -1, -1));

        r5.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        r5.setText("-");
        jPanel1.add(r5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 470, -1, -1));

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel15.setText("Australia");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 470, -1, -1));

        jLabel16.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel16.setText("Argentina");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 570, -1, -1));

        r6.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        r6.setText("-");
        jPanel1.add(r6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 570, -1, -1));

        jLabel18.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel18.setText("Iceland");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 570, -1, -1));

        r7.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        r7.setText("-");
        jPanel1.add(r7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 670, -1, -1));

        jLabel20.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel20.setText("Peru");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 670, -1, -1));

        jLabel21.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel21.setText("Denmark");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 670, -1, -1));

        jLabel22.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel22.setText("Nigeria");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 770, -1, -1));

        jLabel23.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel23.setText("Croatia");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 770, -1, -1));

        r8.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        r8.setText("-");
        jPanel1.add(r8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 770, -1, -1));

        r9.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        r9.setText("-");
        jPanel1.add(r9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 870, -1, -1));

        jLabel26.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel26.setText("serbia");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 870, -1, -1));

        jLabel27.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel27.setText("Costa rica");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 870, -1, -1));

        jLabel28.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel28.setText("Germany");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 970, -1, -1));

        jLabel29.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel29.setText("Mexico");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 960, -1, -1));

        r10.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        r10.setText("-");
        jPanel1.add(r10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 970, -1, -1));

        r11.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        r11.setText("-");
        jPanel1.add(r11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 1070, -1, -1));

        jLabel32.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel32.setText("Swizerland");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 1070, -1, -1));

        jLabel33.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel33.setText("Brazil");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 1070, -1, -1));

        jLabel34.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel34.setText("Korea");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 1170, -1, -1));

        r12.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        r12.setText("-");
        jPanel1.add(r12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 1170, -1, -1));

        jLabel36.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel36.setText("Swedan");
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 1170, -1, -1));

        jLabel37.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel37.setText("Belgium");
        jPanel1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 1270, -1, -1));

        r13.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        r13.setText("-");
        jPanel1.add(r13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 1270, -1, -1));

        jLabel39.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel39.setText("Panama");
        jPanel1.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 1270, -1, -1));

        jLabel40.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel40.setText("England");
        jPanel1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 1370, -1, -1));

        jLabel41.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel41.setText("Tunisia");
        jPanel1.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 1370, -1, -1));

        r14.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        r14.setText("-");
        jPanel1.add(r14, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 1370, -1, -1));

        r15.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        r15.setText("-");
        jPanel1.add(r15, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 1470, -1, -1));

        jLabel44.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel44.setText("Japan");
        jPanel1.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 1470, -1, -1));

        jLabel45.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel45.setText("Colombia");
        jPanel1.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 1470, -1, -1));

        jLabel46.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel46.setText("Senegal");
        jPanel1.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 1570, -1, -1));

        r16.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        r16.setText("-");
        jPanel1.add(r16, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 1570, -1, -1));

        jLabel48.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel48.setText("Poland");
        jPanel1.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 1570, -1, -1));

        jLabel49.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel49.setText("Egypt");
        jPanel1.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 1660, -1, -1));

        r17.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        r17.setText("-");
        jPanel1.add(r17, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 1670, -1, -1));

        jLabel51.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel51.setText("Russia");
        jPanel1.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 1670, -1, -1));

        r18.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        r18.setText("-");
        jPanel1.add(r18, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 1770, -1, -1));

        jLabel53.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel53.setText("Portugal");
        jPanel1.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 1770, -1, -1));

        jLabel54.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel54.setText("Morocco");
        jPanel1.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 1760, -1, -1));

        jLabel55.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel55.setText("Saudi arabia");
        jPanel1.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 1870, -1, -1));

        r19.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        r19.setText("-");
        jPanel1.add(r19, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 1870, -1, -1));

        jLabel57.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel57.setText("Uruguay");
        jPanel1.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 1870, -1, -1));

        jLabel58.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel58.setText("Spain");
        jPanel1.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 1970, -1, -1));

        r20.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        r20.setText("-");
        jPanel1.add(r20, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 1970, -1, -1));

        jLabel60.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel60.setText("Iran");
        jPanel1.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 1970, -1, -1));

        r21.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        r21.setText("-");
        jPanel1.add(r21, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 2070, -1, -1));

        jLabel62.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel62.setText("Australia");
        jPanel1.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 2070, -1, -1));

        jLabel63.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel63.setText("Denmark");
        jPanel1.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 2070, -1, -1));

        jLabel64.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel64.setText("Peru");
        jPanel1.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 2170, -1, -1));

        jLabel65.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel65.setText("France");
        jPanel1.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 2170, -1, -1));

        r22.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        r22.setText("-");
        jPanel1.add(r22, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 2170, -1, -1));

        jLabel67.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel67.setText("Croatia");
        jPanel1.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 2270, -1, -1));

        jLabel68.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel68.setText("Argentina");
        jPanel1.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 2270, -1, -1));

        r23.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        r23.setText("-");
        jPanel1.add(r23, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 2270, -1, -1));

        jLabel70.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel70.setText("Costa rica");
        jPanel1.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 2370, -1, -1));

        r24.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        r24.setText("-");
        jPanel1.add(r24, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 2370, -1, -1));

        jLabel72.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel72.setText("Brazil");
        jPanel1.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 2370, -1, -1));

        jLabel73.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel73.setText("Iceland");
        jPanel1.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 2470, -1, -1));

        r25.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        r25.setText("-");
        jPanel1.add(r25, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 2470, -1, -1));

        jLabel75.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel75.setText("Nigeria");
        jPanel1.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 2470, -1, -1));

        jLabel76.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel76.setText("Swizerland");
        jPanel1.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 2570, -1, -1));

        r26.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        r26.setText("-");
        jPanel1.add(r26, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 2570, -1, -1));

        jLabel78.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel78.setText("Serbia");
        jPanel1.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 2570, -1, -1));

        jLabel79.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel79.setText("Belgium");
        jPanel1.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 2670, -1, -1));

        r27.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        r27.setText("-");
        jPanel1.add(r27, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 2670, -1, -1));

        jLabel81.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel81.setText("Tunisia");
        jPanel1.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 2670, -1, -1));

        r28.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        r28.setText("-");
        jPanel1.add(r28, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 2770, -1, -1));

        jLabel83.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel83.setText("Mexico");
        jPanel1.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 2770, -1, -1));

        jLabel84.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel84.setText("Korea");
        jPanel1.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 2770, -1, -1));

        jLabel85.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel85.setText("Swedan");
        jPanel1.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 2860, -1, -1));

        r29.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        r29.setText("-");
        jPanel1.add(r29, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 2870, -1, -1));

        jLabel87.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel87.setText("Germany");
        jPanel1.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 2870, -1, -1));

        r30.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        r30.setText("-");
        jPanel1.add(r30, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 2970, -1, -1));

        jLabel89.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel89.setText("England");
        jPanel1.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 2970, -1, -1));

        jLabel90.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel90.setText("Panama");
        jPanel1.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 2970, -1, -1));

        r31.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        r31.setText("-");
        jPanel1.add(r31, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 3070, -1, -1));

        jLabel92.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel92.setText("Senegal");
        jPanel1.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 3070, -1, -1));

        jLabel93.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel93.setText("japan");
        jPanel1.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 3070, -1, -1));

        jLabel94.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel94.setText("Colombia");
        jPanel1.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 3170, -1, -1));

        r32.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        r32.setText("-");
        jPanel1.add(r32, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 3170, -1, -1));

        jLabel96.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel96.setText("Poland");
        jPanel1.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 3170, -1, -1));

        jLabel97.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel97.setText("Uruguay");
        jPanel1.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 3270, -1, -1));

        jLabel98.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel98.setText("Russia");
        jPanel1.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 3270, -1, -1));

        r33.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        r33.setText("-");
        jPanel1.add(r33, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 3270, -1, -1));

        jLabel100.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel100.setText("Saudi Arabia");
        jPanel1.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 3370, -1, -1));

        r34.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        r34.setText("-");
        jPanel1.add(r34, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 3370, -1, -1));

        jLabel102.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel102.setText("Egypt");
        jPanel1.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 3370, -1, -1));

        r35.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        r35.setText("-");
        jPanel1.add(r35, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 3470, -1, -1));

        jLabel104.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel104.setText("Morocco");
        jPanel1.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 3470, -1, -1));

        jLabel105.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel105.setText("Spain");
        jPanel1.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 3470, -1, -1));

        jLabel106.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel106.setText("Iran");
        jPanel1.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 3570, -1, -1));

        jLabel107.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel107.setText("Portugal");
        jPanel1.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 3570, -1, -1));

        r36.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        r36.setText("-");
        jPanel1.add(r36, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 3570, -1, -1));

        r37.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        r37.setText("-");
        jPanel1.add(r37, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 3670, -1, -1));

        jLabel110.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel110.setText("France");
        jPanel1.add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 3670, -1, -1));

        jLabel111.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel111.setText("Denmark");
        jPanel1.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 3670, -1, -1));

        jLabel112.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel112.setText("Peru");
        jPanel1.add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 3770, -1, -1));

        r38.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        r38.setText("-");
        jPanel1.add(r38, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 3770, -1, -1));

        jLabel114.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel114.setText("Australia");
        jPanel1.add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 3770, -1, -1));

        r39.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        r39.setText("-");
        jPanel1.add(r39, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 3870, -1, -1));

        jLabel116.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel116.setText("Iceland");
        jPanel1.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 3870, -1, -1));

        jLabel117.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel117.setText("Croatia");
        jPanel1.add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 3870, -1, -1));

        jLabel118.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel118.setText("Nigeria");
        jPanel1.add(jLabel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 3970, -1, -1));

        jLabel119.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel119.setText("Argentina");
        jPanel1.add(jLabel119, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 3970, -1, -1));

        r40.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        r40.setText("-");
        jPanel1.add(r40, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 3970, -1, -1));

        jLabel121.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel121.setText("Mexico");
        jPanel1.add(jLabel121, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 4070, -1, -1));

        jLabel122.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel122.setText("Swedan");
        jPanel1.add(jLabel122, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 4070, -1, -1));

        r41.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        r41.setText("-");
        jPanel1.add(r41, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 4070, -1, -1));

        r42.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        r42.setText("-");
        jPanel1.add(r42, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 4170, -1, -1));

        jLabel125.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel125.setText("Germany");
        jPanel1.add(jLabel125, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 4170, -1, -1));

        jLabel126.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel126.setText("Korea");
        jPanel1.add(jLabel126, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 4170, -1, -1));

        jLabel127.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel127.setText("Brazil");
        jPanel1.add(jLabel127, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 4270, -1, -1));

        jLabel128.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel128.setText("Serbia");
        jPanel1.add(jLabel128, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 4270, -1, -1));

        r43.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        r43.setText("-");
        jPanel1.add(r43, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 4270, -1, -1));

        jLabel130.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel130.setText("Costa Rica");
        jPanel1.add(jLabel130, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 4370, -1, -1));

        jLabel131.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel131.setText("Swizerland");
        jPanel1.add(jLabel131, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 4370, -1, -1));

        r44.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        r44.setText("-");
        jPanel1.add(r44, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 4370, -1, -1));

        jLabel133.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel133.setText("Senegal");
        jPanel1.add(jLabel133, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 4470, -1, -1));

        r45.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        r45.setText("-");
        jPanel1.add(r45, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 4470, -1, -1));

        jLabel135.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel135.setText("Colombia");
        jPanel1.add(jLabel135, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 4470, -1, -1));

        jLabel136.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel136.setText("Japan");
        jPanel1.add(jLabel136, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 4570, -1, -1));

        jLabel137.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel137.setText("Poland");
        jPanel1.add(jLabel137, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 4570, -1, -1));

        r46.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        r46.setText("-");
        jPanel1.add(r46, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 4570, -1, -1));

        jLabel139.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel139.setText("England");
        jPanel1.add(jLabel139, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 4670, -1, -1));

        r47.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        r47.setText("-");
        jPanel1.add(r47, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 4670, -1, -1));

        jLabel141.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel141.setText("Belgium");
        jPanel1.add(jLabel141, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 4670, -1, -1));

        jLabel142.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel142.setText("Panama");
        jPanel1.add(jLabel142, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 4770, -1, -1));

        r48.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        r48.setText("-");
        jPanel1.add(r48, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 4770, -1, -1));

        jLabel144.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel144.setText("Tunisia");
        jPanel1.add(jLabel144, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 4770, -1, -1));

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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
            java.util.logging.Logger.getLogger(Round_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Round_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Round_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Round_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Round_1().setVisible(true);
            }
        });
    }
    //200,50,40
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel r1;
    public static javax.swing.JLabel r10;
    public static javax.swing.JLabel r11;
    public static javax.swing.JLabel r12;
    public static javax.swing.JLabel r13;
    public static javax.swing.JLabel r14;
    public static javax.swing.JLabel r15;
    public static javax.swing.JLabel r16;
    public static javax.swing.JLabel r17;
    public static javax.swing.JLabel r18;
    public static javax.swing.JLabel r19;
    public static javax.swing.JLabel r2;
    public static javax.swing.JLabel r20;
    public static javax.swing.JLabel r21;
    public static javax.swing.JLabel r22;
    public static javax.swing.JLabel r23;
    public static javax.swing.JLabel r24;
    public static javax.swing.JLabel r25;
    public static javax.swing.JLabel r26;
    public static javax.swing.JLabel r27;
    public static javax.swing.JLabel r28;
    public static javax.swing.JLabel r29;
    public static javax.swing.JLabel r3;
    public static javax.swing.JLabel r30;
    public static javax.swing.JLabel r31;
    public static javax.swing.JLabel r32;
    public static javax.swing.JLabel r33;
    public static javax.swing.JLabel r34;
    public static javax.swing.JLabel r35;
    public static javax.swing.JLabel r36;
    public static javax.swing.JLabel r37;
    public static javax.swing.JLabel r38;
    public static javax.swing.JLabel r39;
    public static javax.swing.JLabel r4;
    public static javax.swing.JLabel r40;
    public static javax.swing.JLabel r41;
    public static javax.swing.JLabel r42;
    public static javax.swing.JLabel r43;
    public static javax.swing.JLabel r44;
    public static javax.swing.JLabel r45;
    public static javax.swing.JLabel r46;
    public static javax.swing.JLabel r47;
    public static javax.swing.JLabel r48;
    public static javax.swing.JLabel r5;
    public static javax.swing.JLabel r6;
    public static javax.swing.JLabel r7;
    public static javax.swing.JLabel r8;
    public static javax.swing.JLabel r9;
    // End of variables declaration//GEN-END:variables
}
