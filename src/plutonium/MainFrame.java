/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plutonium;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import me.vighnesh.api.virustotal.VirusTotalAPI;
import me.vighnesh.api.virustotal.dao.FileScan;
import me.vighnesh.api.virustotal.dao.FileScanMetaData;
import me.vighnesh.api.virustotal.dao.FileScanReport;

/**
 *
 * @author Maneesha
 */
public class MainFrame extends javax.swing.JFrame {

    private VirusTotalAPI virusTotal = VirusTotalAPI.configure("22d6d1276f41a1ceacea3aec207ae5957d6e0f400d31a7fa64494eea09de05a0");
    private static Thread scanThread;

    private static final JFileChooser fc = new JFileChooser();
    private static final JFileChooser fc2 = new JFileChooser();

    private static String filepath = "";
    private static String filepath_vt = "";
    private static String malware = "";
    private static String scan_ID = "";
    private static Set<String> malwareHashes;

    public MainFrame() {
        initComponents();
        setLocationRelativeTo(null);
        noLabel.setVisible(false);
        //get Operating System
        osLabel.setText("Operating System : " + System.getProperty("os.name"));
        versionLabel.setText("Version : " + System.getProperty("os.version"));
        architectureLabel.setText("Architecture : " + System.getProperty("os.arch"));
        
        virusScanResults.setVisible(Boolean.FALSE);
        virus_total_scan_panel.setVisible(Boolean.FALSE);
        scan_pane.setVisible(false);
        report_pane.setVisible(false);
        
        //select folders
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fc2.setFileSelectionMode(JFileChooser.FILES_ONLY);
        
        malwareHashes = new HashSet<String>();

        try {

            File f = new File("VirusShare_00001.md5.txt");
            BufferedReader reader = new BufferedReader(new FileReader(f));
            //StringBuffer stringBuffer = new StringBuffer();

            String line;
            while ((line = reader.readLine()) != null) {
                //line = line.replace("\n", "").replace("\r", "");
                malwareHashes.add(line);
            }
            reader.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
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

        minimize = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        title_logo2 = new javax.swing.JLabel();
        title_background = new javax.swing.JLabel();
        virus_total_panel = new javax.swing.JPanel();
        virus_total_logo = new javax.swing.JLabel();
        virus_scan_panel = new javax.swing.JPanel();
        virusScan = new javax.swing.JLabel();
        horizontal_lbl = new javax.swing.JLabel();
        virus_total_scan_panel = new javax.swing.JPanel();
        subtitle_VT = new javax.swing.JLabel();
        vt_path = new javax.swing.JLabel();
        upload_file = new javax.swing.JLabel();
        select_file_vt = new javax.swing.JLabel();
        report_file = new javax.swing.JLabel();
        report_pane = new javax.swing.JScrollPane();
        report_table = new javax.swing.JTable();
        scan_pane = new javax.swing.JScrollPane();
        scan_table = new javax.swing.JTable();
        virusScanResults = new javax.swing.JPanel();
        subTitle1 = new javax.swing.JLabel();
        select_file = new javax.swing.JLabel();
        path = new javax.swing.JLabel();
        scan_file = new javax.swing.JLabel();
        noLabel = new javax.swing.JLabel();
        scan_res_scroll_pane = new javax.swing.JScrollPane();
        scan_result_table = new javax.swing.JTable();
        home_panel = new javax.swing.JPanel();
        home_main_logo = new javax.swing.JLabel();
        architectureLabel = new javax.swing.JLabel();
        osLabel = new javax.swing.JLabel();
        versionLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 475));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 475));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plutonium/images/window.png"))); // NOI18N
        minimize.setToolTipText("Minimize");
        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizeMouseExited(evt);
            }
        });
        getContentPane().add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, 20, 30));

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plutonium/images/window.png"))); // NOI18N
        exit.setToolTipText("Close");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, -1, 30));

        title_logo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plutonium/images/main-logo128.png"))); // NOI18N
        title_logo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                title_logo2MouseClicked(evt);
            }
        });
        getContentPane().add(title_logo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 130, 170));

        title_background.setFont(new java.awt.Font("Raleway SemiBold", 0, 36)); // NOI18N
        title_background.setForeground(new java.awt.Color(0, 204, 204));
        title_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plutonium/images/title_background.png"))); // NOI18N
        getContentPane().add(title_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 70));

        virus_total_panel.setBackground(new java.awt.Color(137, 137, 137));
        virus_total_panel.setToolTipText("View File Analytics");
        virus_total_panel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        virus_total_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                virus_total_panelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                virus_total_panelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                virus_total_panelMouseExited(evt);
            }
        });
        virus_total_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        virus_total_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plutonium/images/fileReport.png"))); // NOI18N
        virus_total_logo.setToolTipText("View File Analytics");
        virus_total_logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                virus_total_logoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                virus_total_logoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                virus_total_logoMouseExited(evt);
            }
        });
        virus_total_panel.add(virus_total_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 70, 70));

        getContentPane().add(virus_total_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 150, 80));

        virus_scan_panel.setBackground(new java.awt.Color(137, 137, 137));
        virus_scan_panel.setToolTipText("Scan");
        virus_scan_panel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        virus_scan_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                virus_scan_panelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                virus_scan_panelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                virus_scan_panelMouseExited(evt);
            }
        });
        virus_scan_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        virusScan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plutonium/images/scan_64.png"))); // NOI18N
        virusScan.setToolTipText("Scan");
        virusScan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                virusScanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                virusScanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                virusScanMouseExited(evt);
            }
        });
        virus_scan_panel.add(virusScan, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 70, 70));

        getContentPane().add(virus_scan_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 150, 80));

        horizontal_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plutonium/images/horizontal-pane.png"))); // NOI18N
        getContentPane().add(horizontal_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 150, 490));

        virus_total_scan_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        subtitle_VT.setFont(new java.awt.Font("Raleway SemiBold", 0, 16)); // NOI18N
        subtitle_VT.setForeground(new java.awt.Color(132, 194, 0));
        subtitle_VT.setText("Select a File to Scan");
        virus_total_scan_panel.add(subtitle_VT, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        vt_path.setFont(new java.awt.Font("Raleway SemiBold", 0, 13)); // NOI18N
        vt_path.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(224, 153, 94), 2, true));
        vt_path.setEnabled(false);
        virus_total_scan_panel.add(vt_path, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 340, 30));

        upload_file.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        upload_file.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plutonium/images/upload32.png"))); // NOI18N
        upload_file.setToolTipText("Upload File");
        upload_file.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        upload_file.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                upload_fileMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                upload_fileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                upload_fileMouseExited(evt);
            }
        });
        virus_total_scan_panel.add(upload_file, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, -1, -1));

        select_file_vt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        select_file_vt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plutonium/images/fileOpen.png"))); // NOI18N
        select_file_vt.setToolTipText("Select File");
        select_file_vt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        select_file_vt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                select_file_vtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                select_file_vtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                select_file_vtMouseExited(evt);
            }
        });
        virus_total_scan_panel.add(select_file_vt, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, -1, -1));

        report_file.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        report_file.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plutonium/images/report32.png"))); // NOI18N
        report_file.setToolTipText("Get Report");
        report_file.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        report_file.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                report_fileMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                report_fileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                report_fileMouseExited(evt);
            }
        });
        virus_total_scan_panel.add(report_file, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, -1, -1));

        report_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Scanner", "Report"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        report_pane.setViewportView(report_table);

        virus_total_scan_panel.add(report_pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 550, 250));

        scan_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "key", "value"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scan_pane.setViewportView(scan_table);

        virus_total_scan_panel.add(scan_pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 550, 170));

        getContentPane().add(virus_total_scan_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 660, 450));

        virusScanResults.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        subTitle1.setFont(new java.awt.Font("Raleway SemiBold", 0, 16)); // NOI18N
        subTitle1.setForeground(new java.awt.Color(132, 194, 0));
        subTitle1.setText("Select Folder To Scan");
        virusScanResults.add(subTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        select_file.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        select_file.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plutonium/images/fileOpen.png"))); // NOI18N
        select_file.setToolTipText("Select Folder");
        select_file.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        select_file.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                select_fileMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                select_fileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                select_fileMouseExited(evt);
            }
        });
        virusScanResults.add(select_file, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 40, 40));

        path.setFont(new java.awt.Font("Raleway SemiBold", 0, 13)); // NOI18N
        path.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(224, 153, 94), 2, true));
        path.setEnabled(false);
        virusScanResults.add(path, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 340, 30));

        scan_file.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scan_file.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plutonium/images/scan_32.png"))); // NOI18N
        scan_file.setToolTipText("Scan");
        scan_file.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        scan_file.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                scan_fileMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                scan_fileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                scan_fileMouseExited(evt);
            }
        });
        virusScanResults.add(scan_file, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 40, 40));

        noLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        noLabel.setForeground(new java.awt.Color(132, 194, 0));
        noLabel.setText("No Infected Files Found !");
        virusScanResults.add(noLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, -1, -1));

        scan_result_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "File No", "Malware file name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scan_res_scroll_pane.setViewportView(scan_result_table);

        virusScanResults.add(scan_res_scroll_pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 620, 210));

        getContentPane().add(virusScanResults, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 670, 450));

        home_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        home_main_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plutonium/images/main-logo128.png"))); // NOI18N
        home_panel.add(home_main_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 140, 140));

        architectureLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        architectureLabel.setForeground(new java.awt.Color(132, 194, 0));
        architectureLabel.setText("Architecture");
        home_panel.add(architectureLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, -1, -1));

        osLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        osLabel.setForeground(new java.awt.Color(132, 194, 0));
        osLabel.setText("OS");
        home_panel.add(osLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, -1, -1));

        versionLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        versionLabel.setForeground(new java.awt.Color(132, 194, 0));
        versionLabel.setText("Version");
        home_panel.add(versionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, -1, -1));

        getContentPane().add(home_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 660, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void virus_scan_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_virus_scan_panelMouseClicked
        virusScanResults.setVisible(true);
        home_panel.setVisible(false);
        virus_total_scan_panel.setVisible(false);
    }//GEN-LAST:event_virus_scan_panelMouseClicked

    private void select_fileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_select_fileMouseClicked
        // TODO add your handling code here:
        int returnValue = fc.showOpenDialog(this);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            filepath = file.getAbsolutePath();
            System.out.println(filepath);
            path.setText(filepath);
        }
    }//GEN-LAST:event_select_fileMouseClicked

    private void scan_fileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scan_fileMouseClicked
        scan_res_scroll_pane.setVisible(false);
        malware = "";
        noLabel.setVisible(false);
        DefaultTableModel model = (DefaultTableModel) scan_result_table.getModel();
        model.setRowCount(0);
        
        scanThread = new Thread() {
            DefaultTableModel model = (DefaultTableModel) scan_result_table.getModel();
            private int count = 0;

            void RecursivePrint(File[] arr, int index, int level) {
                // terminate condition
                if (index == arr.length) {
                    return;
                }
                // tabs for internal levels
                for (int i = 0; i < level; i++) {
                    System.out.print("\t");
                }
                // for files
                if (arr[index].isFile()) {
                   // System.out.println(arr[index].getName());
                    String path = arr[index].getAbsolutePath();
                    //lbl_path.setText(path);
                    String hash = MD5CheckSum.getMD5HashOfFile(path);
                    System.out.println("Hash "+arr[index].getName()+" : "+hash);
                    if (malwareHashes.contains(hash)) {
                        count++;
                        malware += arr[index].getName() + "\n";
                        //System.out.println(hash);
                        model.addRow(new Object[]{count, arr[index].getName()});
                    }
                } // for sub-directories
                else if (arr[index].isDirectory()) {
                    System.out.println("[" + arr[index].getName() + "]");
                    // recursion for sub-directories
                    RecursivePrint(arr[index].listFiles(), 0, level + 1);
                }
                // recursion for main directory
                RecursivePrint(arr, ++index, level);
            }

            public void run() {
                File maindir = new File(filepath);
                if (maindir.exists() && maindir.isDirectory()) {
                    // array for files and sub-directories 
                    // of directory pointed by maindir
                    File arr[] = maindir.listFiles();

                    System.out.println("**********************************************");
                    System.out.println("Files from main directory : " + maindir);
                    System.out.println("**********************************************");
                    // Calling recursive method
                    RecursivePrint(arr, 0, 0);
                }
                if (model.getRowCount() > 0) {
                    scan_res_scroll_pane.setVisible(true);
                }
            }
        };
        scanThread.start();
        
    }//GEN-LAST:event_scan_fileMouseClicked

    private void virus_total_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_virus_total_panelMouseClicked
        virus_total_scan_panel.setVisible(true);
        virusScanResults.setVisible(false);
        home_panel.setVisible(false);
    }//GEN-LAST:event_virus_total_panelMouseClicked

    private void upload_fileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upload_fileMouseClicked
       new Thread(){
            public void run() {
                try {
                    scan_pane.setVisible(false);
                    report_pane.setVisible(false);
                    DefaultTableModel model = (DefaultTableModel)scan_table.getModel();
                    
                    File file = new File(filepath_vt);
                    FileScanMetaData scanFile = virusTotal.scanFile(file);
                    
                    System.out.println("---SCAN META DATA---");
   
                    System.out.println("MD5 : " + scanFile.getMD5());
                    model.addRow(new Object[]{"MD5", scanFile.getMD5()});
                    model.addRow(new Object[]{"SH-1", scanFile.getSHA1()});
                    model.addRow(new Object[]{"SHA-256", scanFile.getSHA256()});
                    model.addRow(new Object[]{"Permalink", scanFile.getPermalink()});
                    model.addRow(new Object[]{"Resource", scanFile.getResource()});
                    model.addRow(new Object[]{"Scan Id", scanFile.getScanId()});
                    model.addRow(new Object[]{"Response Code", scanFile.getResponseCode()});
                    model.addRow(new Object[]{"Verbose Message", scanFile.getVerboseMessage()});
                    
                    scan_ID = scanFile.getScanId();
                    
                    scan_pane.setVisible(true);
                    
                    //model.addRow(new Object[]{count, false, path});
                } catch (IOException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        }.start();
    }//GEN-LAST:event_upload_fileMouseClicked

    private void select_file_vtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_select_file_vtMouseClicked
        int returnValue = fc2.showOpenDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File file = fc2.getSelectedFile();
            filepath_vt = file.getAbsolutePath();
            System.out.println(filepath_vt);
            vt_path.setText(filepath_vt);
        }
    }//GEN-LAST:event_select_file_vtMouseClicked

    private void report_fileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_report_fileMouseClicked
        new Thread(){
            public void run(){
                scan_pane.setVisible(false);
                report_pane.setVisible(false);
                
                DefaultTableModel model = (DefaultTableModel)report_table.getModel();
                
                String fileId = "1947b44cc6f64e565d8a4215bc655315";//scan_ID;
                
                FileScanReport fileReport = virusTotal.getFileReport(fileId);
                Map scans = fileReport.getScans();
                int count = 0;
                scans.keySet().stream().forEach((scan) -> {
                    
                    FileScan report = (FileScan) scans.get(scan);
                    String str_report = "";
                    
                    if (report.isDetected()) {
                       str_report += report.getMalware();
                    } else {
                        str_report += "No Virus Detected";
                    }
                    model.addRow(new Object[]{scan, str_report});
                });

                report_pane.setVisible(true);

            }
        }.start();
    }//GEN-LAST:event_report_fileMouseClicked

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plutonium/images/close.png")));
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plutonium/images/window.png")));
    }//GEN-LAST:event_exitMouseExited

    private void minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseEntered
        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plutonium/images/minimize.png")));
    }//GEN-LAST:event_minimizeMouseEntered

    private void minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseExited
        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plutonium/images/window.png")));
    }//GEN-LAST:event_minimizeMouseExited

    private void virus_scan_panelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_virus_scan_panelMouseEntered
        virusScan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plutonium/images/scan_64_hover.png")));
    }//GEN-LAST:event_virus_scan_panelMouseEntered

    private void virus_scan_panelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_virus_scan_panelMouseExited
        virusScan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plutonium/images/scan_64.png")));
    }//GEN-LAST:event_virus_scan_panelMouseExited

    private void virus_total_panelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_virus_total_panelMouseEntered
        virus_total_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plutonium/images/fileReport_hover.png")));
    }//GEN-LAST:event_virus_total_panelMouseEntered

    private void virus_total_panelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_virus_total_panelMouseExited
        virus_total_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plutonium/images/fileReport.png")));
    }//GEN-LAST:event_virus_total_panelMouseExited

    private void virusScanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_virusScanMouseEntered
        virusScan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plutonium/images/scan_64_hover.png")));
    }//GEN-LAST:event_virusScanMouseEntered

    private void virusScanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_virusScanMouseExited
        virusScan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plutonium/images/scan_64.png")));
    }//GEN-LAST:event_virusScanMouseExited

    private void virus_total_logoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_virus_total_logoMouseEntered
        virus_total_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plutonium/images/fileReport_hover.png")));
    }//GEN-LAST:event_virus_total_logoMouseEntered

    private void virus_total_logoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_virus_total_logoMouseExited
         virus_total_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plutonium/images/fileReport.png")));
    }//GEN-LAST:event_virus_total_logoMouseExited

    private void virusScanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_virusScanMouseClicked
        virusScanResults.setVisible(true);
        home_panel.setVisible(false);
        virus_total_scan_panel.setVisible(false);
    }//GEN-LAST:event_virusScanMouseClicked

    private void virus_total_logoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_virus_total_logoMouseClicked
        virus_total_scan_panel.setVisible(true);
        virusScanResults.setVisible(false);
        home_panel.setVisible(false);
    }//GEN-LAST:event_virus_total_logoMouseClicked

    private void select_fileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_select_fileMouseEntered
        select_file.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plutonium/images/fileOpen_hover.png")));
    }//GEN-LAST:event_select_fileMouseEntered

    private void select_fileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_select_fileMouseExited
        select_file.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plutonium/images/fileOpen.png")));
    }//GEN-LAST:event_select_fileMouseExited

    private void scan_fileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scan_fileMouseEntered
        scan_file.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plutonium/images/scan_32_hover.png")));
    }//GEN-LAST:event_scan_fileMouseEntered

    private void scan_fileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scan_fileMouseExited
        scan_file.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plutonium/images/scan_32.png")));
    }//GEN-LAST:event_scan_fileMouseExited

    private void select_file_vtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_select_file_vtMouseEntered
        select_file_vt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plutonium/images/fileOpen_hover.png")));
    }//GEN-LAST:event_select_file_vtMouseEntered

    private void select_file_vtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_select_file_vtMouseExited
        select_file_vt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plutonium/images/fileOpen.png")));
    }//GEN-LAST:event_select_file_vtMouseExited

    private void upload_fileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upload_fileMouseEntered
        upload_file.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plutonium/images/upload32_hover.png")));
    }//GEN-LAST:event_upload_fileMouseEntered

    private void upload_fileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upload_fileMouseExited
        upload_file.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plutonium/images/upload32.png")));
    }//GEN-LAST:event_upload_fileMouseExited

    private void report_fileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_report_fileMouseEntered
        report_file.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plutonium/images/report32_hover.png")));
    }//GEN-LAST:event_report_fileMouseEntered

    private void report_fileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_report_fileMouseExited
        report_file.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plutonium/images/report32.png")));
    }//GEN-LAST:event_report_fileMouseExited

    private void title_logo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_title_logo2MouseClicked
        home_panel.setVisible(true);
        virusScanResults.setVisible(false);
        virus_total_scan_panel.setVisible(false);
    }//GEN-LAST:event_title_logo2MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel architectureLabel;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel home_main_logo;
    private javax.swing.JPanel home_panel;
    private javax.swing.JLabel horizontal_lbl;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel noLabel;
    private javax.swing.JLabel osLabel;
    private javax.swing.JLabel path;
    private javax.swing.JLabel report_file;
    private javax.swing.JScrollPane report_pane;
    private javax.swing.JTable report_table;
    private javax.swing.JLabel scan_file;
    private javax.swing.JScrollPane scan_pane;
    private javax.swing.JScrollPane scan_res_scroll_pane;
    private javax.swing.JTable scan_result_table;
    private javax.swing.JTable scan_table;
    private javax.swing.JLabel select_file;
    private javax.swing.JLabel select_file_vt;
    private javax.swing.JLabel subTitle1;
    private javax.swing.JLabel subtitle_VT;
    private javax.swing.JLabel title_background;
    private javax.swing.JLabel title_logo2;
    private javax.swing.JLabel upload_file;
    private javax.swing.JLabel versionLabel;
    private javax.swing.JLabel virusScan;
    private javax.swing.JPanel virusScanResults;
    private javax.swing.JPanel virus_scan_panel;
    private javax.swing.JLabel virus_total_logo;
    private javax.swing.JPanel virus_total_panel;
    private javax.swing.JPanel virus_total_scan_panel;
    private javax.swing.JLabel vt_path;
    // End of variables declaration//GEN-END:variables
}
