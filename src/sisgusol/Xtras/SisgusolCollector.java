package sisgusol.Xtras;

import javax.swing.UIManager;
import sisgusol.jframes.*;

public class SisgusolCollector {
    
	public static void main(String args[]) {
        
        //Seta o tema padrão da janela
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Principal();
            }
        });
    }
}