package sisgusol.jframes;

import com.digi.xbee.api.XBeeDevice;
import com.digi.xbee.api.exceptions.XBeeException;
import gnu.io.CommPortIdentifier;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import javax.swing.Timer;
import sisgusol.Xtras.Preferencias;


public class Principal extends javax.swing.JFrame {

    public XBeeDevice dispositivoXbee;
    public Preferencias preferencias;

    public Principal() {
        
        preferencias = new Preferencias();
        class RelogioListener implements ActionListener {
                @Override
		public void actionPerformed(ActionEvent e) {
			Date dateTime = new Date();
                        SimpleDateFormat dateTimeFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
			relogioLabel.setText(dateTimeFormat.format(dateTime));
		}
	}
        Timer timer = new Timer(1000, new RelogioListener());
	timer.start();
        initComponents();
        serialPortSelectionDialog.setVisible(true);



    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        avisosDialog = new javax.swing.JDialog();
        avisosOkButton = new javax.swing.JButton();
        avisosTextLabel = new javax.swing.JLabel();
        serialPortSelectionDialog = new javax.swing.JDialog();
        portListScroolPanel = new javax.swing.JScrollPane();
        portList = new javax.swing.JList<>();
        portListLabel = new javax.swing.JLabel();
        baudRateComboBoxLabel = new javax.swing.JLabel();
        atualizarButton = new javax.swing.JButton();
        conectarButton = new javax.swing.JButton();
        cancelarButton = new javax.swing.JButton();
        baudRateComboBox = new javax.swing.JComboBox<>();
        BDLabel = new javax.swing.JLabel();
        ipBDTextField = new javax.swing.JTextField();
        nomeDoBDTextField = new javax.swing.JTextField();
        usuarioTextField = new javax.swing.JTextField();
        senhaPasswordField = new javax.swing.JPasswordField();
        redeLabel = new javax.swing.JLabel();
        relogioLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        avisosDialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        avisosDialog.setMinimumSize(new java.awt.Dimension(297, 125));

        avisosOkButton.setText("OK");
        avisosOkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avisosOkButtonActionPerformed(evt);
            }
        });

        avisosTextLabel.setText("Warning");

        javax.swing.GroupLayout avisosDialogLayout = new javax.swing.GroupLayout(avisosDialog.getContentPane());
        avisosDialog.getContentPane().setLayout(avisosDialogLayout);
        avisosDialogLayout.setHorizontalGroup(
            avisosDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(avisosDialogLayout.createSequentialGroup()
                .addGroup(avisosDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(avisosDialogLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(avisosOkButton))
                    .addGroup(avisosDialogLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(avisosTextLabel)))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        avisosDialogLayout.setVerticalGroup(
            avisosDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, avisosDialogLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(avisosTextLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(avisosOkButton)
                .addContainerGap())
        );

        serialPortSelectionDialog.setLocation(new java.awt.Point(400, 300));
        serialPortSelectionDialog.setMinimumSize(new java.awt.Dimension(308, 350));

        portListScroolPanel.setViewportView(portList);

        portListLabel.setText("Porta XBee:");

        baudRateComboBoxLabel.setText("Baud Rate:");

        atualizarButton.setText("Atualizar");
        atualizarButton.setToolTipText("Atualizar a lista de portas");
        atualizarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarButtonActionPerformed(evt);
            }
        });

        conectarButton.setText("Conectar");
        conectarButton.setToolTipText("Conectar a rede XBee");
        conectarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conectarButtonActionPerformed(evt);
            }
        });

        cancelarButton.setText("Cancelar");
        cancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButtonActionPerformed(evt);
            }
        });

        baudRateComboBox.setMaximumRowCount(10);
        baudRateComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new Integer[] { 110, 300, 600, 1200, 2400, 4800, 9600, 14400, 19200, 38400, 56000, 57600, 115200, 128000, 230400, 256000, 460800, 921600 }));
        baudRateComboBox.setSelectedIndex(6);

        BDLabel.setText("Banco de Dados:");

        ipBDTextField.setText("Ip do BD");
        ipBDTextField.setToolTipText("Ip do Banco de Dados");

        nomeDoBDTextField.setText("Nome do BD");
        nomeDoBDTextField.setToolTipText("Nome do banco de dados");

        usuarioTextField.setText("Usuário do BD");
        usuarioTextField.setToolTipText("Usuário do banco de dados");

        senhaPasswordField.setText("Senha do BD");
        senhaPasswordField.setToolTipText("Senha do Banco de Dados");

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
                                    .addGroup(serialPortSelectionDialogLayout.createSequentialGroup()
                                        .addComponent(BDLabel)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(ipBDTextField)
                                    .addComponent(nomeDoBDTextField)
                                    .addComponent(usuarioTextField)
                                    .addComponent(senhaPasswordField))
                                .addContainerGap())))
                    .addGroup(serialPortSelectionDialogLayout.createSequentialGroup()
                        .addGroup(serialPortSelectionDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(serialPortSelectionDialogLayout.createSequentialGroup()
                                .addGap(0, 13, Short.MAX_VALUE)
                                .addComponent(atualizarButton)
                                .addGap(18, 18, 18)
                                .addComponent(conectarButton)
                                .addGap(18, 18, 18)
                                .addComponent(cancelarButton))
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
                            .addComponent(atualizarButton)
                            .addComponent(conectarButton)
                            .addComponent(cancelarButton)))
                    .addGroup(serialPortSelectionDialogLayout.createSequentialGroup()
                        .addComponent(baudRateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BDLabel)
                        .addGap(18, 18, 18)
                        .addComponent(ipBDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nomeDoBDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(usuarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(senhaPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ipBDTextField.getAccessibleContext().setAccessibleName("Ip");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        redeLabel.setText("Dispositivos XBee na Rede:");

        relogioLabel.setText("Relógio");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1)
                        .addComponent(redeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(relogioLabel))
                .addContainerGap(309, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(redeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(relogioLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void avisosOkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avisosOkButtonActionPerformed
        avisosDialog.setVisible(false);
    }//GEN-LAST:event_avisosOkButtonActionPerformed

    private void atualizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarButtonActionPerformed
        portList.setListData(descobrirPortas());

    }//GEN-LAST:event_atualizarButtonActionPerformed

    private void conectarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conectarButtonActionPerformed
        String portName = portList.getSelectedValue();
        Integer baudRate = (Integer) baudRateComboBox.getSelectedItem();

        try {
            dispositivoXbee = new XBeeDevice(portName, baudRate);
        } catch (NullPointerException e) {
            avisosTextLabel.setText("ERRO: "+e.getMessage());
            avisosDialog.setVisible(true);
        }
        
        try {
            dispositivoXbee.open();
            avisosTextLabel.setText("Conexão estabelecida com sucesso.");
            avisosDialog.setVisible(true);
        } catch (XBeeException e) {
            avisosTextLabel.setText("ERRO: "+e.getMessage());
            avisosDialog.setVisible(true);
            dispositivoXbee.close();
        }
    }//GEN-LAST:event_conectarButtonActionPerformed

    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonActionPerformed
        // LEMBRAR DE ALTERAR ESTA LINHA PARA O FECHAMENTO DO MENU
        //avisosDialog.;
        avisosDialog.dispose();
        serialPortSelectionDialog.dispose();
        this.dispose();
    }//GEN-LAST:event_cancelarButtonActionPerformed

    private String[] descobrirPortas() {        
        
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BDLabel;
    private javax.swing.JButton atualizarButton;
    private javax.swing.JDialog avisosDialog;
    private javax.swing.JButton avisosOkButton;
    public javax.swing.JLabel avisosTextLabel;
    private javax.swing.JComboBox<Integer> baudRateComboBox;
    private javax.swing.JLabel baudRateComboBoxLabel;
    private javax.swing.JButton cancelarButton;
    private javax.swing.JButton conectarButton;
    private javax.swing.JTextField ipBDTextField;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomeDoBDTextField;
    private javax.swing.JList<String> portList;
    private javax.swing.JLabel portListLabel;
    private javax.swing.JScrollPane portListScroolPanel;
    private javax.swing.JLabel redeLabel;
    private javax.swing.JLabel relogioLabel;
    private javax.swing.JPasswordField senhaPasswordField;
    private javax.swing.JDialog serialPortSelectionDialog;
    private javax.swing.JTextField usuarioTextField;
    // End of variables declaration//GEN-END:variables
}
