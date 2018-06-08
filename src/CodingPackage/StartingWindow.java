package CodingPackage;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Showrov
 */
public class StartingWindow extends javax.swing.JFrame {

    public static Connection connect = null;
    public static String LoggedInId = null;
    
    public StartingWindow() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Textile Industry Management System");
       
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BasePanel = new javax.swing.JPanel();
        CardPanel = new javax.swing.JPanel();
        AdPanel = new javax.swing.JPanel();
        SemiAdPanel = new javax.swing.JPanel();
        TxfH1 = new javax.swing.JTextField();
        TxfH2 = new javax.swing.JTextField();
        TxfH3 = new javax.swing.JTextField();
        TxfH4 = new javax.swing.JTextField();
        PnlTitlePanelStart = new javax.swing.JPanel();
        LblTitleLabelStart = new javax.swing.JLabel();
        SystemAdminPanel = new javax.swing.JPanel();
        PnlTitlePanel = new javax.swing.JPanel();
        LblTitle = new javax.swing.JLabel();
        PnlBasePanel = new javax.swing.JPanel();
        LblInstance = new javax.swing.JLabel();
        LblPinNumber = new javax.swing.JLabel();
        SeparatorInstance = new javax.swing.JSeparator();
        SeparatorPinNumber = new javax.swing.JSeparator();
        TxfInstanceName = new javax.swing.JTextField();
        TxfPinNumber = new javax.swing.JPasswordField();
        PnlAccess = new javax.swing.JPanel();
        LblAccess = new javax.swing.JLabel();
        ManagerPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        BaseLogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        TxfUserName = new javax.swing.JTextField();
        TxfPassword = new javax.swing.JPasswordField();
        PnlSignIn = new javax.swing.JPanel();
        LblSignIn = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        AppDrawer = new javax.swing.JPanel();
        AdminIcon = new javax.swing.JLabel();
        ManagerIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BasePanel.setBackground(new java.awt.Color(204, 204, 204));

        CardPanel.setBackground(new java.awt.Color(255, 255, 255));
        CardPanel.setLayout(new java.awt.CardLayout());

        AdPanel.setBackground(new java.awt.Color(255, 255, 255));

        SemiAdPanel.setBackground(new java.awt.Color(255, 255, 255));

        TxfH1.setEditable(false);
        TxfH1.setBackground(new java.awt.Color(255, 255, 255));
        TxfH1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 24)); // NOI18N
        TxfH1.setText("Do You Know?");
        TxfH1.setBorder(null);

        TxfH2.setEditable(false);
        TxfH2.setBackground(new java.awt.Color(255, 255, 255));
        TxfH2.setFont(new java.awt.Font("Segoe UI Light", 2, 24)); // NOI18N
        TxfH2.setText("\" Around 50,000,00 People Work In Textile Industries");
        TxfH2.setBorder(null);

        TxfH3.setEditable(false);
        TxfH3.setBackground(new java.awt.Color(255, 255, 255));
        TxfH3.setFont(new java.awt.Font("Segoe UI Light", 2, 24)); // NOI18N
        TxfH3.setText("In Bangladesh And ");
        TxfH3.setBorder(null);

        TxfH4.setEditable(false);
        TxfH4.setBackground(new java.awt.Color(255, 255, 255));
        TxfH4.setFont(new java.awt.Font("Segoe UI Light", 2, 24)); // NOI18N
        TxfH4.setText("Most Of Them (94%) Are Women \"");
        TxfH4.setBorder(null);

        javax.swing.GroupLayout SemiAdPanelLayout = new javax.swing.GroupLayout(SemiAdPanel);
        SemiAdPanel.setLayout(SemiAdPanelLayout);
        SemiAdPanelLayout.setHorizontalGroup(
            SemiAdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SemiAdPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(SemiAdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxfH4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(SemiAdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(TxfH1)
                        .addComponent(TxfH2, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
                        .addComponent(TxfH3)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        SemiAdPanelLayout.setVerticalGroup(
            SemiAdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SemiAdPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(TxfH1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(TxfH2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(TxfH3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(TxfH4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        PnlTitlePanelStart.setBackground(new java.awt.Color(22, 160, 133));

        LblTitleLabelStart.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        LblTitleLabelStart.setForeground(new java.awt.Color(255, 255, 255));
        LblTitleLabelStart.setText("Electronic System Of Textile Industry");

        javax.swing.GroupLayout PnlTitlePanelStartLayout = new javax.swing.GroupLayout(PnlTitlePanelStart);
        PnlTitlePanelStart.setLayout(PnlTitlePanelStartLayout);
        PnlTitlePanelStartLayout.setHorizontalGroup(
            PnlTitlePanelStartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlTitlePanelStartLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LblTitleLabelStart)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PnlTitlePanelStartLayout.setVerticalGroup(
            PnlTitlePanelStartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlTitlePanelStartLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(LblTitleLabelStart)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout AdPanelLayout = new javax.swing.GroupLayout(AdPanel);
        AdPanel.setLayout(AdPanelLayout);
        AdPanelLayout.setHorizontalGroup(
            AdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdPanelLayout.createSequentialGroup()
                .addContainerGap(124, Short.MAX_VALUE)
                .addComponent(SemiAdPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
            .addComponent(PnlTitlePanelStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        AdPanelLayout.setVerticalGroup(
            AdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdPanelLayout.createSequentialGroup()
                .addComponent(PnlTitlePanelStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(SemiAdPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        CardPanel.add(AdPanel, "card2");

        SystemAdminPanel.setBackground(new java.awt.Color(255, 255, 255));

        PnlTitlePanel.setBackground(new java.awt.Color(22, 160, 133));

        LblTitle.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        LblTitle.setForeground(new java.awt.Color(255, 255, 255));
        LblTitle.setText("System Admin Server Access");

        javax.swing.GroupLayout PnlTitlePanelLayout = new javax.swing.GroupLayout(PnlTitlePanel);
        PnlTitlePanel.setLayout(PnlTitlePanelLayout);
        PnlTitlePanelLayout.setHorizontalGroup(
            PnlTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlTitlePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LblTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PnlTitlePanelLayout.setVerticalGroup(
            PnlTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlTitlePanelLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(LblTitle)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        PnlBasePanel.setBackground(new java.awt.Color(255, 255, 255));

        LblInstance.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        LblInstance.setText("Instance      :");

        LblPinNumber.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        LblPinNumber.setText("Pin Number :");

        TxfInstanceName.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        TxfInstanceName.setBorder(null);
        TxfInstanceName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxfInstanceNameKeyPressed(evt);
            }
        });

        TxfPinNumber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TxfPinNumber.setBorder(null);
        TxfPinNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxfPinNumberKeyPressed(evt);
            }
        });

        PnlAccess.setBackground(new java.awt.Color(255, 255, 255));
        PnlAccess.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        PnlAccess.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PnlAccess.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PnlAccessMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PnlAccessMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PnlAccessMouseExited(evt);
            }
        });

        LblAccess.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        LblAccess.setText("Access");

        javax.swing.GroupLayout PnlAccessLayout = new javax.swing.GroupLayout(PnlAccess);
        PnlAccess.setLayout(PnlAccessLayout);
        PnlAccessLayout.setHorizontalGroup(
            PnlAccessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlAccessLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(LblAccess)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        PnlAccessLayout.setVerticalGroup(
            PnlAccessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlAccessLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LblAccess)
                .addContainerGap())
        );

        javax.swing.GroupLayout PnlBasePanelLayout = new javax.swing.GroupLayout(PnlBasePanel);
        PnlBasePanel.setLayout(PnlBasePanelLayout);
        PnlBasePanelLayout.setHorizontalGroup(
            PnlBasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlBasePanelLayout.createSequentialGroup()
                .addGroup(PnlBasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlBasePanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(PnlBasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblPinNumber)
                            .addComponent(LblInstance))
                        .addGroup(PnlBasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PnlBasePanelLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(PnlBasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(SeparatorPinNumber)
                                    .addComponent(SeparatorInstance)
                                    .addComponent(TxfInstanceName, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)))
                            .addGroup(PnlBasePanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(TxfPinNumber))))
                    .addGroup(PnlBasePanelLayout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(PnlAccess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        PnlBasePanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {LblInstance, LblPinNumber});

        PnlBasePanelLayout.setVerticalGroup(
            PnlBasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlBasePanelLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(PnlBasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblInstance)
                    .addComponent(TxfInstanceName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SeparatorInstance, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addGroup(PnlBasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblPinNumber)
                    .addComponent(TxfPinNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SeparatorPinNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(PnlAccess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout SystemAdminPanelLayout = new javax.swing.GroupLayout(SystemAdminPanel);
        SystemAdminPanel.setLayout(SystemAdminPanelLayout);
        SystemAdminPanelLayout.setHorizontalGroup(
            SystemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnlTitlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(SystemAdminPanelLayout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addComponent(PnlBasePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );
        SystemAdminPanelLayout.setVerticalGroup(
            SystemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SystemAdminPanelLayout.createSequentialGroup()
                .addComponent(PnlTitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PnlBasePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        CardPanel.add(SystemAdminPanel, "card3");

        ManagerPanel.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(22, 160, 133));

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Manager Login");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        BaseLogin.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel1.setText("User name");

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel2.setText("Password");

        TxfUserName.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        TxfUserName.setBorder(null);
        TxfUserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxfUserNameKeyPressed(evt);
            }
        });

        TxfPassword.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        TxfPassword.setBorder(null);
        TxfPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxfPasswordKeyPressed(evt);
            }
        });

        PnlSignIn.setBackground(new java.awt.Color(243, 243, 243));
        PnlSignIn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        PnlSignIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PnlSignIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PnlSignInMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PnlSignInMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PnlSignInMouseExited(evt);
            }
        });

        LblSignIn.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        LblSignIn.setText("Sign In");

        javax.swing.GroupLayout PnlSignInLayout = new javax.swing.GroupLayout(PnlSignIn);
        PnlSignIn.setLayout(PnlSignInLayout);
        PnlSignInLayout.setHorizontalGroup(
            PnlSignInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlSignInLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(LblSignIn)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        PnlSignInLayout.setVerticalGroup(
            PnlSignInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlSignInLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblSignIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout BaseLoginLayout = new javax.swing.GroupLayout(BaseLogin);
        BaseLogin.setLayout(BaseLoginLayout);
        BaseLoginLayout.setHorizontalGroup(
            BaseLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BaseLoginLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(BaseLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jSeparator2)
                    .addComponent(TxfUserName)
                    .addComponent(TxfPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BaseLoginLayout.createSequentialGroup()
                .addContainerGap(257, Short.MAX_VALUE)
                .addComponent(PnlSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(251, 251, 251))
        );

        BaseLoginLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2});

        BaseLoginLayout.setVerticalGroup(
            BaseLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BaseLoginLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxfUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(TxfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(PnlSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ManagerPanelLayout = new javax.swing.GroupLayout(ManagerPanel);
        ManagerPanel.setLayout(ManagerPanelLayout);
        ManagerPanelLayout.setHorizontalGroup(
            ManagerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ManagerPanelLayout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addComponent(BaseLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
        );
        ManagerPanelLayout.setVerticalGroup(
            ManagerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManagerPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(BaseLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        CardPanel.add(ManagerPanel, "card4");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 871, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 526, Short.MAX_VALUE)
        );

        CardPanel.add(jPanel2, "card5");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 871, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 526, Short.MAX_VALUE)
        );

        CardPanel.add(jPanel3, "card6");

        AppDrawer.setBackground(new java.awt.Color(22, 160, 133));

        AdminIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconicPackage/AdminIcon.png"))); // NOI18N
        AdminIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AdminIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AdminIconMouseClicked(evt);
            }
        });

        ManagerIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconicPackage/ManagerIcon.png"))); // NOI18N
        ManagerIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ManagerIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManagerIconMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ManagerIconMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout AppDrawerLayout = new javax.swing.GroupLayout(AppDrawer);
        AppDrawer.setLayout(AppDrawerLayout);
        AppDrawerLayout.setHorizontalGroup(
            AppDrawerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AppDrawerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AdminIcon)
                .addGap(57, 57, 57)
                .addComponent(ManagerIcon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AppDrawerLayout.setVerticalGroup(
            AppDrawerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AppDrawerLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(AppDrawerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ManagerIcon)
                    .addComponent(AdminIcon))
                .addContainerGap())
        );

        javax.swing.GroupLayout BasePanelLayout = new javax.swing.GroupLayout(BasePanel);
        BasePanel.setLayout(BasePanelLayout);
        BasePanelLayout.setHorizontalGroup(
            BasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(AppDrawer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BasePanelLayout.setVerticalGroup(
            BasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BasePanelLayout.createSequentialGroup()
                .addComponent(CardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AppDrawer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BasePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BasePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdminIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdminIconMouseClicked
        // TODO add your handling code here:
        CardPanel.removeAll();
        CardPanel.add(SystemAdminPanel);
        CardPanel.repaint();
        CardPanel.revalidate();
        setTitle("Admin Login");
        TxfInstanceName.requestFocus();
    }//GEN-LAST:event_AdminIconMouseClicked

    private void ManagerIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManagerIconMouseClicked
        // TODO add your handling code here:
        CardPanel.removeAll();
        CardPanel.add(ManagerPanel);
        CardPanel.repaint();
        CardPanel.revalidate();
        setTitle("Manager Login");
        TxfUserName.requestFocus();
    }//GEN-LAST:event_ManagerIconMouseClicked

    //Accesing To Server Code
    private void PnlAccessMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PnlAccessMouseClicked
        // TODO add your handling code here:
          GetConnectionClass connectionObject = new GetConnectionClass();
        
          connect = connectionObject.databaseConnection(TxfInstanceName.getText(), TxfPinNumber.getText());

          if (connect==null)
          {
              JOptionPane.showMessageDialog(null, "SOMETHING WENT WRONG !");
              TxfInstanceName.setText("");
              TxfPinNumber.setText("");
          }
          else 
          {
              AdminWindow adminObject = new AdminWindow();
              super.dispose();
              adminObject.setVisible(true);
          }
    }//GEN-LAST:event_PnlAccessMouseClicked

    private void TxfInstanceNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxfInstanceNameKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            TxfPinNumber.requestFocus();
        }
    }//GEN-LAST:event_TxfInstanceNameKeyPressed

    private void TxfPinNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxfPinNumberKeyPressed
        // TODO add your handling code here:
          if(evt.getKeyCode()==KeyEvent.VK_ENTER)
          {
          GetConnectionClass connectionObject = new GetConnectionClass();
        
          connect = connectionObject.databaseConnection(TxfInstanceName.getText(), TxfPinNumber.getText());

          if (connect==null)
          {
              JOptionPane.showMessageDialog(null, "SOMETHING WENT WRONG !");
              TxfInstanceName.setText("");
              TxfPinNumber.setText("");
          }
          else 
          {
              AdminWindow adminObject = new AdminWindow();
              adminObject.setVisible(true);
              setVisible(false);
          }
          }
    }//GEN-LAST:event_TxfPinNumberKeyPressed

    private void PnlAccessMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PnlAccessMouseEntered
        // TODO add your handling code here:
        PnlAccess.setBackground(new Color(22,160,133));
        LblAccess.setForeground(Color.WHITE);
    }//GEN-LAST:event_PnlAccessMouseEntered

    private void PnlAccessMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PnlAccessMouseExited
        // TODO add your handling code here:
        PnlAccess.setBackground(new Color(255,255,255));
        LblAccess.setForeground(Color.BLACK);
    }//GEN-LAST:event_PnlAccessMouseExited

    private void PnlSignInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PnlSignInMouseEntered
        // TODO add your handling code here:
        PnlSignIn.setBackground(new Color(22,160,133));
        LblSignIn.setForeground(Color.WHITE);
    }//GEN-LAST:event_PnlSignInMouseEntered

    private void PnlSignInMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PnlSignInMouseExited
        // TODO add your handling code here:
        PnlSignIn.setBackground(new Color(243,243,243));
        LblSignIn.setForeground(Color.BLACK);
    }//GEN-LAST:event_PnlSignInMouseExited

    private void PnlSignInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PnlSignInMouseClicked
        // TODO add your handling code here:
       GetConnectionClass connectObject = new GetConnectionClass();
       
       connect = connectObject.databaseConnection("sa", "123");
       
       String loginSqlQuery = "SELECT *from Manager WHERE MUserName=? AND MPassword=?";
        try 
        {
            PreparedStatement pst = connect.prepareStatement(loginSqlQuery);
            pst.setString(1, TxfUserName.getText());
            pst.setString(2, TxfPassword.getText());
            ResultSet rst = pst.executeQuery();
            
            if(rst.next())
            {
                LoggedInId = String.valueOf(rst.getInt("MId"));
                //JOptionPane.showMessageDialog(null, "Logged In Successfully ");
                ManagerWinodow obj = new ManagerWinodow();
                obj.setVisible(true);
                super.dispose();
            }
            
            else
                {
                    JOptionPane.showMessageDialog(null, "Wrong Username Or, Password");
                    TxfUserName.setText("");
                    TxfPassword.setText("");
                }
        } 
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_PnlSignInMouseClicked

    private void TxfUserNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxfUserNameKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            TxfPassword.requestFocus();
        }
    }//GEN-LAST:event_TxfUserNameKeyPressed

    private void TxfPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxfPasswordKeyPressed
        // TODO add your handling code here:
      if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            GetConnectionClass connectObject = new GetConnectionClass();
       
       connect = connectObject.databaseConnection("sa", "123");
       
       String loginSqlQuery = "SELECT *from Manager WHERE MUserName=? AND MPassword=?";
        try 
        {
            PreparedStatement pst = connect.prepareStatement(loginSqlQuery);
            pst.setString(1, TxfUserName.getText());
            pst.setString(2, TxfPassword.getText());
            ResultSet rst = pst.executeQuery();
            
            if(rst.next())
            {
                LoggedInId = String.valueOf(rst.getInt("MId"));
                //JOptionPane.showMessageDialog(null, "Logged In Successfully ");
                ManagerWinodow obj = new ManagerWinodow();
                obj.setVisible(true);
                super.dispose();
            }
            
            else
                {
                    JOptionPane.showMessageDialog(null, "Wrong Username Or, Password");
                    TxfUserName.setText("");
                    TxfPassword.setText("");
                }
        } 
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        }
    }//GEN-LAST:event_TxfPasswordKeyPressed

    private void ManagerIconMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManagerIconMouseReleased
        // TODO add your handling code here:
        TxfUserName.requestFocus();
    }//GEN-LAST:event_ManagerIconMouseReleased

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
            java.util.logging.Logger.getLogger(StartingWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartingWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartingWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartingWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartingWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AdPanel;
    private javax.swing.JLabel AdminIcon;
    private javax.swing.JPanel AppDrawer;
    private javax.swing.JPanel BaseLogin;
    private javax.swing.JPanel BasePanel;
    private javax.swing.JPanel CardPanel;
    private javax.swing.JLabel LblAccess;
    private javax.swing.JLabel LblInstance;
    private javax.swing.JLabel LblPinNumber;
    private javax.swing.JLabel LblSignIn;
    private javax.swing.JLabel LblTitle;
    private javax.swing.JLabel LblTitleLabelStart;
    private javax.swing.JLabel ManagerIcon;
    private javax.swing.JPanel ManagerPanel;
    private javax.swing.JPanel PnlAccess;
    private javax.swing.JPanel PnlBasePanel;
    private javax.swing.JPanel PnlSignIn;
    private javax.swing.JPanel PnlTitlePanel;
    private javax.swing.JPanel PnlTitlePanelStart;
    private javax.swing.JPanel SemiAdPanel;
    private javax.swing.JSeparator SeparatorInstance;
    private javax.swing.JSeparator SeparatorPinNumber;
    private javax.swing.JPanel SystemAdminPanel;
    private javax.swing.JTextField TxfH1;
    private javax.swing.JTextField TxfH2;
    private javax.swing.JTextField TxfH3;
    private javax.swing.JTextField TxfH4;
    private javax.swing.JTextField TxfInstanceName;
    private javax.swing.JPasswordField TxfPassword;
    private javax.swing.JPasswordField TxfPinNumber;
    private javax.swing.JTextField TxfUserName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
