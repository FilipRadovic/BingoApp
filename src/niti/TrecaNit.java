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
public class TrecaNit extends Thread{
    private JLabel lbl_TreciBroj;
    public Boolean radi;

    public TrecaNit(JLabel lbl_TreciBroj, Boolean radi) {
        this.lbl_TreciBroj = lbl_TreciBroj;
        this.radi = radi;
    }

    @Override
    public void run() {
        while (radi) {            
            try {
                long treciBroj = Math.round(Math.random() * 5);
                lbl_TreciBroj.setText(String.valueOf(treciBroj));
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(TrecaNit.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    
}
