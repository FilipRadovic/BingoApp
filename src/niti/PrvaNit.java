/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package niti;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author frado
 */
public class PrvaNit extends Thread{
    
    private JLabel lbl_PrviBroj;
    public Boolean radi;

    public PrvaNit(JLabel lbl_PrviBroj, Boolean radi) {
        this.lbl_PrviBroj = lbl_PrviBroj;
        this.radi = radi;
    }

    @Override
    public void run() {
        while (radi) {            
            try {
                long prviBroj = Math.round(Math.random() * 5);
                
                lbl_PrviBroj.setText(String.valueOf(prviBroj));
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(PrvaNit.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    
}
