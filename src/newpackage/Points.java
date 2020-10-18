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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DAIYAN
 */
public class Points extends javax.swing.JFrame {

    /**
     * Creates new form Points
     */
    public Points() {
        initComponents();
        showPoints();
    }
    /*
    In this Function point table is shown.
    The point of each teams of each groups updates with dates.
    There are total 8 files for each groups from Group A to group B,
    where all the necessary values are stored.Depending on the date,files are opened and shown.
    All the values of the groups are firstly stored in the 8 arrays of string and then shown.
    */
    void showPoints()
    {
        /*
        To compare dates,necessary dates are created
        */
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
    date.setMonth(5);
    date.setDate(30);
    
    String[] A=new String[60];
    String[] B=new String[60];
    String[] C=new String[60];
    String[] D=new String[60];
    String[] E=new String[60];
    String[] F=new String[60];
    String[] G=new String[60];
    String[] H=new String[60];

    /*Opening files and storing them into the Arrays of string
    Excceptins are handled*/
    
        int i=0;
        try {
           // File file = new File("C:\\Users\\Asus\\Documents\\NetBeansProjects\\Fif\\src\\groupA.txt");
            File file = new File("C:\\Users\\daiya\\Documents\\Final Project\\src\\groupA.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                A[i]=scanner.nextLine();
                i++;
            }
            scanner.close();
            
        } catch (Exception ex) {
            Logger.getLogger(Round_1.class.getName()).log(Level.SEVERE, null, ex);
        }
        i=0;
        try {
            //File file = new File("C:\\Users\\Asus\\Documents\\NetBeansProjects\\Fif\\src\\groupB.txt");
            File file = new File("C:\\Users\\daiya\\Documents\\Final Project\\src\\groupB.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                B[i]=scanner.nextLine();
                i++;
            }
            scanner.close();
            
        } catch (Exception ex) {
            Logger.getLogger(Round_1.class.getName()).log(Level.SEVERE, null, ex);
        }
        i=0;
        try {
           // File file = new File("C:\\Users\\Asus\\Documents\\NetBeansProjects\\Fif\\src\\groupC.txt");
           File file = new File("C:\\Users\\daiya\\Documents\\Final Project\\src\\groupC.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                C[i]=scanner.nextLine();
                i++;
            }
            scanner.close();
            
        } catch (Exception ex) {
            Logger.getLogger(Round_1.class.getName()).log(Level.SEVERE, null, ex);
        }
        i=0;
        try {
            //File file = new File("C:\\Users\\Asus\\Documents\\NetBeansProjects\\Fif\\src\\groupD.txt");
            File file = new File("C:\\Users\\daiya\\Documents\\Final Project\\src\\groupD.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                D[i]=scanner.nextLine();
                i++;
            }
            scanner.close();
            
        } catch (Exception ex) {
            Logger.getLogger(Round_1.class.getName()).log(Level.SEVERE, null, ex);
        }
        i=0;
        try {
            //File file = new File("C:\\Users\\Asus\\Documents\\NetBeansProjects\\Fif\\src\\groupE.txt");
            File file = new File("C:\\Users\\daiya\\Documents\\Final Project\\src\\groupE.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                E[i]=scanner.nextLine();
                i++;
            }
            scanner.close();
            
        } catch (Exception ex) {
            Logger.getLogger(Round_1.class.getName()).log(Level.SEVERE, null, ex);
        }
        i=0;
        try {
           // File file = new File("C:\\Users\\Asus\\Documents\\NetBeansProjects\\Fif\\src\\groupF.txt");
            File file = new File("C:\\Users\\daiya\\Documents\\Final Project\\src\\groupF.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                F[i]=scanner.nextLine();
                i++;
            }
            scanner.close();
            
        } catch (Exception ex) {
            Logger.getLogger(Round_1.class.getName()).log(Level.SEVERE, null, ex);
        }
        i=0;
        try {
            //File file = new File("C:\\Users\\Asus\\Documents\\NetBeansProjects\\Fif\\src\\groupG.txt");
            File file = new File("C:\\Users\\daiya\\Documents\\Final Project\\src\\groupG.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                G[i]=scanner.nextLine();
                i++;
            }
            scanner.close();
            
        } catch (Exception ex) {
            Logger.getLogger(Round_1.class.getName()).log(Level.SEVERE, null, ex);
        }
        i=0;
        try {
           // File file = new File("C:\\Users\\Asus\\Documents\\NetBeansProjects\\Fif\\src\\groupH.txt");
            File file = new File("C:\\Users\\daiya\\Documents\\Final Project\\src\\groupH.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                H[i]=scanner.nextLine();
                i++;
            }
            scanner.close();
            
        } catch (Exception ex) {
            Logger.getLogger(Round_1.class.getName()).log(Level.SEVERE, null, ex);
        }
        /*
        For all the three stages,all the values are distibuted according to current date
        */
        if(date.after(date1) && date.before(date6))
        {
        DefaultTableModel mode1 = (DefaultTableModel) gruopA.getModel();
        mode1.addRow(new Object[]{"URUGUAY",A[0],A[1],A[2],A[3],A[4]});
        mode1.addRow(new Object[]{"RUSSIA",A[5],A[6],A[7],A[8],A[9]});
        mode1.addRow(new Object[]{"SAUDI ARABIA",A[10],A[11],A[12],A[13],A[14]});
        mode1.addRow(new Object[]{"EGYPT",A[15],A[16],A[17],A[18],A[19]});  
        
        DefaultTableModel mode2 = (DefaultTableModel) gruopB.getModel();
        mode2.addRow(new Object[]{"ESPAIN",B[0],B[1],B[2],B[3],B[4]});
        mode2.addRow(new Object[]{"PORTUGAL",B[5],B[6],B[7],B[8],B[9]});
        mode2.addRow(new Object[]{"IRAN",B[10],B[11],B[12],B[13],B[14]});
        mode2.addRow(new Object[]{"MOROCCO",B[15],B[16],B[17],B[18],B[19]});
        
                DefaultTableModel mode3 = (DefaultTableModel) gruopC.getModel();
        mode3.addRow(new Object[]{"FRANCE",C[0],C[1],C[2],C[3],C[4]});
        mode3.addRow(new Object[]{"DENMARK",C[5],C[6],C[7],C[8],C[9]});
        mode3.addRow(new Object[]{"PERU",C[10],C[11],C[12],C[13],C[14]});
        mode3.addRow(new Object[]{"AUSTRALIA",C[15],C[16],C[17],C[18],C[19]});
        
        DefaultTableModel mode4 = (DefaultTableModel) gruopD.getModel();
        mode4.addRow(new Object[]{"CROATIA",D[0],D[1],D[2],D[3],D[4]});
        mode4.addRow(new Object[]{"ARGENTINA",D[5],D[6],D[7],D[8],D[9]});
        mode4.addRow(new Object[]{"NIGERIA",D[10],D[11],D[12],D[13],D[14]});
        mode4.addRow(new Object[]{"ICELAND",D[15],D[16],D[17],D[18],D[19]});
        
        DefaultTableModel mode5 = (DefaultTableModel) gruopE.getModel();
        mode5.addRow(new Object[]{"BRAZIL",E[0],E[1],E[2],E[3],E[4]});
        mode5.addRow(new Object[]{"SWIZERLAND",E[5],E[6],E[7],E[8],E[9]});
        mode5.addRow(new Object[]{"SERBIA",E[10],E[11],E[12],E[13],E[14]});
        mode5.addRow(new Object[]{"COSTARICA",E[15],E[16],E[17],E[18],E[19]});
        
        DefaultTableModel mode6 = (DefaultTableModel) gruopF.getModel();
        mode6.addRow(new Object[]{"SWEDEN",F[0],F[1],F[2],F[3],F[4]});
        mode6.addRow(new Object[]{"MEXICO",F[5],F[6],F[7],F[8],F[9]});
        mode6.addRow(new Object[]{"KORIA",F[10],F[11],F[12],F[13],F[14]});
        mode6.addRow(new Object[]{"GERMANY",F[15],F[16],F[17],F[18],F[19]});
        
        DefaultTableModel mode7 = (DefaultTableModel) gruopG.getModel();
        mode7.addRow(new Object[]{"BELGIUM",G[0],G[1],G[2],G[3],G[4]});
        mode7.addRow(new Object[]{"ENGLAND",G[5],G[6],G[7],G[8],G[9]});
        mode7.addRow(new Object[]{"TUNISHIA",G[10],G[11],G[12],G[13],G[14]});
        mode7.addRow(new Object[]{"PANAMA",G[15],G[16],G[17],G[18],G[19]});
        
        DefaultTableModel mode8 = (DefaultTableModel) gruopH.getModel();
        mode8.addRow(new Object[]{"COLOMBIA",H[0],H[1],H[2],H[3],H[4]});
        mode8.addRow(new Object[]{"JAPAN",H[5],H[6],H[7],H[8],H[9]});
        mode8.addRow(new Object[]{"SENEGAL",H[10],H[11],H[12],H[13],H[14]});
        mode8.addRow(new Object[]{"POLAND",H[15],H[16],H[17],H[18],H[19]});
        }
        
        
        if(date.after(date5) && date.before(date11))
        {
        DefaultTableModel mode1 = (DefaultTableModel) gruopA.getModel();
        mode1.addRow(new Object[]{"URUGUAY",A[20],A[21],A[22],A[23],A[24]});
        mode1.addRow(new Object[]{"RUSSIA",A[25],A[26],A[27],A[28],A[29]});
        mode1.addRow(new Object[]{"SAUDI ARABIA",A[30],A[31],A[32],A[33],A[34]});
        mode1.addRow(new Object[]{"EGYPT",A[35],A[36],A[37],A[38],A[39]}); 
        
        DefaultTableModel mode2 = (DefaultTableModel) gruopB.getModel();
        mode2.addRow(new Object[]{"ESPAIN",B[20],B[21],B[22],B[23],B[24]});
        mode2.addRow(new Object[]{"PORTUGAL",B[25],B[26],B[27],B[28],B[29]});
        mode2.addRow(new Object[]{"IRAN",B[30],B[31],B[32],B[33],B[34]});
        mode2.addRow(new Object[]{"MOROCCO",B[35],B[36],B[37],B[38],B[39]});
        
                DefaultTableModel mode3 = (DefaultTableModel) gruopC.getModel();
        mode3.addRow(new Object[]{"FRANCE",C[20],C[21],C[22],C[23],C[24]});
        mode3.addRow(new Object[]{"DENMARK",C[25],C[26],C[27],C[28],C[29]});
        mode3.addRow(new Object[]{"PERU",C[30],C[31],C[32],C[33],C[34]});
        mode3.addRow(new Object[]{"AUSTRALIA",C[35],C[36],C[37],C[38],C[39]});
        
        DefaultTableModel mode4 = (DefaultTableModel) gruopD.getModel();
        mode4.addRow(new Object[]{"CROATIA",D[20],D[21],D[22],D[23],D[24]});
        mode4.addRow(new Object[]{"ARGENTINA",D[25],D[26],D[27],D[28],D[29]});
        mode4.addRow(new Object[]{"NIGERIA",D[30],D[31],D[32],D[33],D[34]});
        mode4.addRow(new Object[]{"ICELAND",D[35],D[36],D[37],D[38],D[39]});
        
        DefaultTableModel mode5 = (DefaultTableModel) gruopE.getModel();
        mode5.addRow(new Object[]{"BRAZIL",E[20],E[21],E[22],E[23],E[24]});
        mode5.addRow(new Object[]{"SWIZERLAND",E[25],E[26],E[27],E[28],E[29]});
        mode5.addRow(new Object[]{"SERBIA",E[30],E[31],E[32],E[33],E[34]});
        mode5.addRow(new Object[]{"COSTARICA",E[35],E[36],E[37],E[38],E[39]});
        
        DefaultTableModel mode6 = (DefaultTableModel) gruopF.getModel();
        mode6.addRow(new Object[]{"SWEDEN",F[20],F[21],F[22],F[23],F[24]});
        mode6.addRow(new Object[]{"MEXICO",F[25],F[26],F[27],F[28],F[29]});
        mode6.addRow(new Object[]{"KORIA",F[30],F[31],F[32],F[33],F[34]});
        mode6.addRow(new Object[]{"GERMANY",F[35],F[36],F[37],F[38],F[39]});
        
        DefaultTableModel mode7 = (DefaultTableModel) gruopG.getModel();
        mode7.addRow(new Object[]{"BELGIUM",G[20],G[21],G[22],G[23],G[24]});
        mode7.addRow(new Object[]{"ENGLAND",G[25],G[26],G[27],G[28],G[29]});
        mode7.addRow(new Object[]{"TUNISHIA",G[30],G[31],G[32],G[33],G[34]});
        mode7.addRow(new Object[]{"PANAMA",G[35],G[36],G[37],G[38],G[39]});
        
        DefaultTableModel mode8 = (DefaultTableModel) gruopH.getModel();
        mode8.addRow(new Object[]{"COLOMBIA",H[20],H[21],H[22],H[23],H[24]});
        mode8.addRow(new Object[]{"JAPAN",H[25],H[26],H[27],H[28],H[29]});
        mode8.addRow(new Object[]{"SENEGAL",H[30],H[31],H[32],H[33],H[34]});
        mode8.addRow(new Object[]{"POLAND",H[35],H[36],H[37],H[38],H[39]});
        }
        
        
        if(date.after(date10))
        {
        DefaultTableModel mode1 = (DefaultTableModel) gruopA.getModel();
        mode1.addRow(new Object[]{"URUGUAY",A[40],A[41],A[42],A[43],A[44]});
        mode1.addRow(new Object[]{"RUSSIA",A[45],A[46],A[47],A[48],A[49]});
        mode1.addRow(new Object[]{"SAUDI ARABIA",A[50],A[51],A[52],A[53],A[54]});
        mode1.addRow(new Object[]{"EGYPT",A[55],A[56],A[58],A[57],A[59]});   
        
        DefaultTableModel mode2 = (DefaultTableModel) gruopB.getModel();
        mode2.addRow(new Object[]{"ESPAIN",B[40],B[41],B[42],B[43],B[44]});
        mode2.addRow(new Object[]{"PORTUGAL",B[45],B[46],B[47],B[48],B[49]});
        mode2.addRow(new Object[]{"IRAN",B[50],B[51],B[52],B[53],B[54]});
        mode2.addRow(new Object[]{"MOROCCO",B[55],B[56],B[57],B[58],B[59]});
        
                DefaultTableModel mode3 = (DefaultTableModel) gruopC.getModel();
        mode3.addRow(new Object[]{"FRANCE",C[40],C[41],C[42],C[43],C[44]});
        mode3.addRow(new Object[]{"DENMARK",C[45],C[46],C[47],C[48],C[49]});
        mode3.addRow(new Object[]{"PERU",C[50],C[51],C[52],C[53],C[54]});
        mode3.addRow(new Object[]{"AUSTRALIA",C[55],C[56],C[57],C[58],C[59]});
        
        DefaultTableModel mode4 = (DefaultTableModel) gruopD.getModel();
        mode4.addRow(new Object[]{"CROATIA",D[40],D[41],D[42],D[43],D[44]});
        mode4.addRow(new Object[]{"ARGENTINA",D[45],D[46],D[47],D[48],D[49]});
        mode4.addRow(new Object[]{"NIGERIA",D[50],D[51],D[52],D[53],D[54]});
        mode4.addRow(new Object[]{"ICELAND",D[55],D[56],D[57],D[58],D[59]});
        
        DefaultTableModel mode5 = (DefaultTableModel) gruopE.getModel();
        mode5.addRow(new Object[]{"BRAZIL",E[40],E[41],E[42],E[43],E[44]});
        mode5.addRow(new Object[]{"SWIZERLAND",E[45],E[46],E[47],E[48],E[49]});
        mode5.addRow(new Object[]{"SERBIA",E[50],E[51],E[52],E[53],E[4]});
        mode5.addRow(new Object[]{"COSTARICA",E[55],E[56],E[57],E[58],E[59]});
        
        DefaultTableModel mode6 = (DefaultTableModel) gruopF.getModel();
        mode6.addRow(new Object[]{"SWEDEN",F[40],F[41],F[42],F[43],F[44]});
        mode6.addRow(new Object[]{"MEXICO",F[45],F[46],F[47],F[48],F[49]});
        mode6.addRow(new Object[]{"KORIA",F[50],F[51],F[52],F[53],F[54]});
        mode6.addRow(new Object[]{"GERMANY",F[55],F[56],F[57],F[58],F[59]});
        
        DefaultTableModel mode7 = (DefaultTableModel) gruopG.getModel();
        mode7.addRow(new Object[]{"BELGIUM",G[40],G[41],G[42],G[43],G[44]});
        mode7.addRow(new Object[]{"ENGLAND",G[45],G[46],G[47],G[48],G[49]});
        mode7.addRow(new Object[]{"TUNISHIA",G[50],G[51],G[52],G[53],G[54]});
        mode7.addRow(new Object[]{"PANAMA",G[55],G[56],G[57],G[58],G[59]});
        
        DefaultTableModel mode8 = (DefaultTableModel) gruopH.getModel();
        mode8.addRow(new Object[]{"COLOMBIA",H[40],H[41],H[42],H[3],H[44]});
        mode8.addRow(new Object[]{"JAPAN",H[45],H[46],H[47],H[48],H[49]});
        mode8.addRow(new Object[]{"SENEGAL",H[50],H[51],H[52],H[53],H[54]});
        mode8.addRow(new Object[]{"POLAND",H[55],H[56],H[57],H[58],H[59]});
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
        jScrollPane3 = new javax.swing.JScrollPane();
        gruopA = new javax.swing.JTable();
        jScrollPane10 = new javax.swing.JScrollPane();
        gruopC = new javax.swing.JTable();
        jScrollPane11 = new javax.swing.JScrollPane();
        gruopB = new javax.swing.JTable();
        jScrollPane12 = new javax.swing.JScrollPane();
        gruopE = new javax.swing.JTable();
        jScrollPane13 = new javax.swing.JScrollPane();
        gruopD = new javax.swing.JTable();
        jScrollPane14 = new javax.swing.JScrollPane();
        gruopG = new javax.swing.JTable();
        jScrollPane15 = new javax.swing.JScrollPane();
        gruopF = new javax.swing.JTable();
        jScrollPane16 = new javax.swing.JScrollPane();
        gruopH = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(860, 700));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(820, 600));

        jPanel1.setBackground(new java.awt.Color(255, 255, 240));
        jPanel1.setPreferredSize(new java.awt.Dimension(820, 1100));
        jPanel1.setRequestFocusEnabled(false);

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        gruopA.setBackground(new java.awt.Color(200, 140, 140));
        gruopA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TEAM", "MP", "W", "L", "D", "PTS"
            }
        ));
        jScrollPane3.setViewportView(gruopA);

        jScrollPane10.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane10.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        gruopC.setBackground(new java.awt.Color(200, 140, 140));
        gruopC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TEAM", "MP", "W", "L", "D", "PTS"
            }
        ));
        jScrollPane10.setViewportView(gruopC);

        jScrollPane11.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        gruopB.setBackground(new java.awt.Color(200, 140, 140));
        gruopB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TEAM", "MP", "W", "L", "D", "PTS"
            }
        ));
        jScrollPane11.setViewportView(gruopB);

        jScrollPane12.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        gruopE.setBackground(new java.awt.Color(200, 140, 140));
        gruopE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TEAM", "MP", "W", "L", "D", "PTS"
            }
        ));
        jScrollPane12.setViewportView(gruopE);

        jScrollPane13.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        gruopD.setBackground(new java.awt.Color(200, 140, 140));
        gruopD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TEAM", "MP", "W", "L", "D", "PTS"
            }
        ));
        jScrollPane13.setViewportView(gruopD);

        jScrollPane14.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        gruopG.setBackground(new java.awt.Color(200, 140, 140));
        gruopG.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TEAM", "MP", "W", "L", "D", "PTS"
            }
        ));
        jScrollPane14.setViewportView(gruopG);

        jScrollPane15.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        gruopF.setBackground(new java.awt.Color(200, 140, 140));
        gruopF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TEAM", "MP", "W", "L", "D", "PTS"
            }
        ));
        jScrollPane15.setViewportView(gruopF);

        jScrollPane16.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        gruopH.setBackground(new java.awt.Color(200, 140, 140));
        gruopH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TEAM", "MP", "W", "L", "D", "PTS"
            }
        ));
        jScrollPane16.setViewportView(gruopH);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("GROUP A");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("GROUP B");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("GROUP C");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("GROUP D");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("GROUP E");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("GROUP F");

        jLabel7.setText("GROUP G");

        jLabel8.setText("GROUP H");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(Points.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Points.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Points.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Points.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Points().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable gruopA;
    private javax.swing.JTable gruopB;
    private javax.swing.JTable gruopC;
    private javax.swing.JTable gruopD;
    private javax.swing.JTable gruopE;
    private javax.swing.JTable gruopF;
    private javax.swing.JTable gruopG;
    private javax.swing.JTable gruopH;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
