package sisgusol.jframes;

import com.digi.xbee.api.RemoteXBeeDevice;
import com.digi.xbee.api.XBeeDevice;
import com.digi.xbee.api.exceptions.XBeeException;
import com.digi.xbee.api.XBeeNetwork;
import gnu.io.CommPortIdentifier;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import javax.swing.SwingWorker;
import javax.swing.Timer;
import sisgusol.Xtras.DBInterface;
import sisgusol.Xtras.Preferences;


public class Principal extends javax.swing.JFrame {

    public XBeeDevice device;
    public XBeeNetwork network;
    public DBInterface database;
    public Preferences preferences;

    public Principal() {
        
        class ClockListener implements ActionListener {
                @Override
		public void actionPerformed(ActionEvent e) {
                    Date dateTime = new Date();
                    SimpleDateFormat dateTimeFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                    clockLabel.setText(dateTimeFormat.format(dateTime));
		}
	}
        Timer timer = new Timer(1000, new ClockListener());
	timer.start();
        initComponents();
        this.setLocationRelativeTo(null);
        serialPortSelectionDialog.setLocationRelativeTo(null);
        warningDialog.setLocationRelativeTo(null);
        loadXBeeNetworkDialog.setLocationRelativeTo(null);
        serialPortSelectionDialog.setVisible(true);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        warningDialog = new javax.swing.JDialog();
        warningOkButton = new javax.swing.JButton();
        warningTextLabel = new javax.swing.JLabel();
        serialPortSelectionDialog = new javax.swing.JDialog();
        portListScroolPanel = new javax.swing.JScrollPane();
        portList = new javax.swing.JList<>();
        portListLabel = new javax.swing.JLabel();
        baudRateComboBoxLabel = new javax.swing.JLabel();
        updatePortsListButton = new javax.swing.JButton();
        connectButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        baudRateComboBox = new javax.swing.JComboBox<>();
        DBLabel = new javax.swing.JLabel();
        DBIpTextField = new javax.swing.JTextField();
        DBNameTextField = new javax.swing.JTextField();
        DBUserTextField = new javax.swing.JTextField();
        DBPasswordTextField = new javax.swing.JTextField();
        loadXBeeNetworkDialog = new javax.swing.JDialog();
        loadingTextLabel = new javax.swing.JLabel();
        loadingProgressBar = new javax.swing.JProgressBar();
        networkLabel = new javax.swing.JLabel();
        clockLabel = new javax.swing.JLabel();
        xbeeNetworkListScrollPane = new javax.swing.JScrollPane();
        xbeeNetworkList = new javax.swing.JList<>();
        detectNetworkButton = new javax.swing.JButton();

        warningDialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        warningDialog.setMinimumSize(new java.awt.Dimension(297, 125));

        warningOkButton.setText("OK");
        warningOkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                warningOkButtonActionPerformed(evt);
            }
        });

        warningTextLabel.setText("Warning");

        javax.swing.GroupLayout warningDialogLayout = new javax.swing.GroupLayout(warningDialog.getContentPane());
        warningDialog.getContentPane().setLayout(warningDialogLayout);
        warningDialogLayout.setHorizontalGroup(
            warningDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(warningDialogLayout.createSequentialGroup()
                .addGroup(warningDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(warningDialogLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(warningOkButton))
                    .addGroup(warningDialogLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(warningTextLabel)))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        warningDialogLayout.setVerticalGroup(
            warningDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, warningDialogLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(warningTextLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(warningOkButton)
                .addContainerGap())
        );

        serialPortSelectionDialog.setLocation(new java.awt.Point(300, 400));
        serialPortSelectionDialog.setMinimumSize(new java.awt.Dimension(308, 350));

        portListScroolPanel.setViewportView(portList);

        portListLabel.setText("Select the Serial/USB port:");

        baudRateComboBoxLabel.setText("Baud Rate:");

        updatePortsListButton.setText("Update");
        updatePortsListButton.setToolTipText("Update port list");
        updatePortsListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePortsListButtonActionPerformed(evt);
            }
        });

        connectButton.setText("Connect");
        connectButton.setToolTipText("Connect to the XBee Network");
        connectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        baudRateComboBox.setMaximumRowCount(10);
        baudRateComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new Integer[] { 110, 300, 600, 1200, 2400, 4800, 9600, 14400, 19200, 38400, 56000, 57600, 115200, 128000, 230400, 256000, 460800, 921600 }));
        baudRateComboBox.setSelectedIndex(6);

        DBLabel.setText("Database:");

        DBIpTextField.setText("127.0.0.1");
        DBIpTextField.setToolTipText("Database IP");

        DBNameTextField.setText("test");
        DBNameTextField.setToolTipText("Database Name");

        DBUserTextField.setText("root");
        DBUserTextField.setToolTipText("Database User");

        DBPasswordTextField.setToolTipText("Database User Password");

        javax.swing.GroupLayout serialPortSelectionDialogLayout = new javax.swing.GroupLayout(serialPortSelectionDialog.getContentPane());
        serialPortSelectionDialog.getContentPane().setLayout(serialPortSelectionDialogLayout);
        serialPortSelectionDialogLayout.setHorizontalGroup(
            serialPortSelectionDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(serialPortSelectionDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(serialPortSelectionDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(serialPortSelectionDialogLayout.createSequentialGroup()
                        .addComponent(portListScroolPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(serialPortSelectionDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(serialPortSelectionDialogLayout.createSequentialGroup()
                                .addComponent(baudRateComboBoxLabel)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(serialPortSelectionDialogLayout.createSequentialGroup()
                                .addGroup(serialPortSelectionDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(baudRateComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(DBIpTextField)
                                    .addComponent(DBNameTextField)
                                    .addComponent(DBUserTextField)
                                    .addGroup(serialPortSelectionDialogLayout.createSequentialGroup()
                                        .addComponent(DBLabel)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(DBPasswordTextField))
                                .addContainerGap())))
                    .addGroup(serialPortSelectionDialogLayout.createSequentialGroup()
                        .addGroup(serialPortSelectionDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(serialPortSelectionDialogLayout.createSequentialGroup()
                                .addGap(0, 31, Short.MAX_VALUE)
                                .addComponent(updatePortsListButton)
                                .addGap(18, 18, 18)
                                .addComponent(connectButton)
                                .addGap(18, 18, 18)
                                .addComponent(cancelButton))
                            .addGroup(serialPortSelectionDialogLayout.createSequentialGroup()
                                .addComponent(portListLabel)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        serialPortSelectionDialogLayout.setVerticalGroup(
            serialPortSelectionDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(serialPortSelectionDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(serialPortSelectionDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(portListLabel)
                    .addComponent(baudRateComboBoxLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(serialPortSelectionDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(serialPortSelectionDialogLayout.createSequentialGroup()
                        .addComponent(portListScroolPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(serialPortSelectionDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updatePortsListButton)
                            .addComponent(connectButton)
                            .addComponent(cancelButton)))
                    .addGroup(serialPortSelectionDialogLayout.createSequentialGroup()
                        .addComponent(baudRateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DBLabel)
                        .addGap(18, 18, 18)
                        .addComponent(DBIpTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DBNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DBUserTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DBPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        DBIpTextField.getAccessibleContext().setAccessibleName("Ip");

        loadXBeeNetworkDialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        loadXBeeNetworkDialog.setMinimumSize(new java.awt.Dimension(297, 125));

        loadingTextLabel.setText("Loading XBee data parameters...");

        javax.swing.GroupLayout loadXBeeNetworkDialogLayout = new javax.swing.GroupLayout(loadXBeeNetworkDialog.getContentPane());
        loadXBeeNetworkDialog.getContentPane().setLayout(loadXBeeNetworkDialogLayout);
        loadXBeeNetworkDialogLayout.setHorizontalGroup(
            loadXBeeNetworkDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loadXBeeNetworkDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loadXBeeNetworkDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loadXBeeNetworkDialogLayout.createSequentialGroup()
                        .addComponent(loadingTextLabel)
                        .addGap(0, 118, Short.MAX_VALUE))
                    .addComponent(loadingProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        loadXBeeNetworkDialogLayout.setVerticalGroup(
            loadXBeeNetworkDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loadXBeeNetworkDialogLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(loadingTextLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loadingProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        networkLabel.setText("Dispositivos XBee na Rede:");

        clockLabel.setText("clock");

        xbeeNetworkListScrollPane.setViewportView(xbeeNetworkList);

        detectNetworkButton.setText("Detect Network");
        detectNetworkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detectNetworkButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(networkLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                        .addComponent(clockLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(detectNetworkButton)
                            .addComponent(xbeeNetworkListScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(networkLabel)
                    .addComponent(clockLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xbeeNetworkListScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(detectNetworkButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void warningOkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_warningOkButtonActionPerformed
        warningDialog.setVisible(false);
    }//GEN-LAST:event_warningOkButtonActionPerformed

    private void updatePortsListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePortsListButtonActionPerformed
        portList.setListData(discoverPorts());
    }//GEN-LAST:event_updatePortsListButtonActionPerformed

    private void connectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectButtonActionPerformed
        String portName = portList.getSelectedValue();
        Integer baudRate = (Integer) baudRateComboBox.getSelectedItem();
        String DBname = DBNameTextField.getText();
        String DBip = DBIpTextField.getText();
        String DBuser = DBUserTextField.getText();
        String DBpassword = DBPasswordTextField.getText();

        try {
            device = new XBeeDevice(portName, baudRate);
            try {
                database = new DBInterface(DBip, DBname, DBuser, DBpassword);
                try {
                    device.open();
                    preferences = new Preferences(portName, baudRate, DBip, DBip, DBuser, DBip);
                    loadXBeeNetworkDialog.setVisible(true);
                    deviceNetworkInfoUpdate();
                } catch (XBeeException eXB) {
                    showWarningDialog("ERROR: "+eXB.getMessage());
                    device.close();
                }
            } catch (ClassNotFoundException eCNF) {
                showWarningDialog("ERROR: "+eCNF.getMessage());
            } catch (SQLException eSQL) {
                showWarningDialog("ERROR: Database unreachable");
            }
        } catch (NullPointerException eNPE) {
            showWarningDialog("ERROR: "+eNPE.getMessage());
        }
    }//GEN-LAST:event_connectButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        warningDialog.dispose();
        serialPortSelectionDialog.dispose();
        loadXBeeNetworkDialog.dispose();
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void detectNetworkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detectNetworkButtonActionPerformed
        xbeeNetworkList.setListData(discoverXBeeNetwork());
    }//GEN-LAST:event_detectNetworkButtonActionPerformed

    private void showWarningDialog (String message) {
        warningTextLabel.setText(message);
        warningDialog.setVisible(true);  
    }
    
    private void showPrincipal () {
        this.setVisible(true);
    }
    
    private void deviceNetworkInfoUpdate () {
        
        loadingProgressBar.setMinimum(0);
        loadingProgressBar.setMaximum(100);
        loadingProgressBar.setValue(0);
        network = device.getNetwork();
       
        final SwingWorker w = new SwingWorker() {
            @Override
            protected Object doInBackground() throws Exception {
                for (int i = 0; i <= 100; i++) {
                    try {
                        loadingProgressBar.setValue(i);
                        Thread.sleep(50);
                    } catch (InterruptedException ex) {
                        showWarningDialog("ERROR: "+ex.getMessage());
                    }
                }
                return 0;
            }
            @Override
            protected void done () {
                serialPortSelectionDialog.setVisible(false);
                loadXBeeNetworkDialog.setVisible(false);
                showPrincipal();
            }
        };
        w.execute();
        
    }
    
    private String[] discoverPorts() {        
        
        List<String> list = new ArrayList<>();
        String[] listData = new String[10];
        Integer count = 0;
        
        Enumeration ports = CommPortIdentifier.getPortIdentifiers();
        
        while (ports.hasMoreElements()) {
            CommPortIdentifier port = (CommPortIdentifier) ports.nextElement();
            list.add(port.getName());
        }

        for (String deviceName : list) {
            listData[count] = deviceName;
            count++;
        }
        return listData;
    }
    
    private String[] discoverXBeeNetwork () {
        
        List<RemoteXBeeDevice> list;
        String[] dispositivos = new String[10];
        
        list = network.getDevices();
        
        for(int i = 0; i < list.size(); i++) {
            try {
                list.get(i).readDeviceInfo();
            } catch (XBeeException e) {
                warningTextLabel.setText("ERROR: "+e.getMessage());
            }
            dispositivos[i] = list.get(i).getNodeID();
        }
        return dispositivos;        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DBIpTextField;
    private javax.swing.JLabel DBLabel;
    private javax.swing.JTextField DBNameTextField;
    private javax.swing.JTextField DBPasswordTextField;
    private javax.swing.JTextField DBUserTextField;
    private javax.swing.JComboBox<Integer> baudRateComboBox;
    private javax.swing.JLabel baudRateComboBoxLabel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel clockLabel;
    private javax.swing.JButton connectButton;
    private javax.swing.JButton detectNetworkButton;
    private javax.swing.JDialog loadXBeeNetworkDialog;
    private javax.swing.JProgressBar loadingProgressBar;
    public javax.swing.JLabel loadingTextLabel;
    private javax.swing.JLabel networkLabel;
    private javax.swing.JList<String> portList;
    private javax.swing.JLabel portListLabel;
    private javax.swing.JScrollPane portListScroolPanel;
    private javax.swing.JDialog serialPortSelectionDialog;
    private javax.swing.JButton updatePortsListButton;
    private javax.swing.JDialog warningDialog;
    private javax.swing.JButton warningOkButton;
    public javax.swing.JLabel warningTextLabel;
    private javax.swing.JList<String> xbeeNetworkList;
    private javax.swing.JScrollPane xbeeNetworkListScrollPane;
    // End of variables declaration//GEN-END:variables
}
