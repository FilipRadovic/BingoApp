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
public class CetvrtaNit extends Thread{
    private JLabel lbl_CetvrtiBroj;
    public Boolean radi;

    public CetvrtaNit(JLabel lbl_CetvrtiBroj, Boolean radi) {
        this.lbl_CetvrtiBroj = lbl_CetvrtiBroj;
        this.radi = radi;
    }

    @Override
    public void run() {
        while (radi) {            
            try {
                long cetvrtiBroj = Math.round(Math.random() * 5);
                lbl_CetvrtiBroj.setText(String.valueOf(cetvrtiBroj));
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(CetvrtaNit.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
}
