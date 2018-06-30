/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plutonium;

import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 *
 * @author Maneesha
 */
public class Plutonium {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            //UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch(Exception ex) {
            //java.util.logging.Logger.getLogger(Crypto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        
      MainFrame mf  =new MainFrame();
      mf.setResizable(false);
      mf.setVisible(true);
    }
    
}
