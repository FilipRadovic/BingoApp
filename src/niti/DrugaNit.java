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
public class DrugaNit extends Thread{
    
    private JLabel lbl_DrugiBroj;
    public Boolean radi;

    public DrugaNit(JLabel lbl_DrugiBroj, Boolean radi) {
        this.lbl_DrugiBroj = lbl_DrugiBroj;
        this.radi = radi;
    }

    @Override
    public void run() {
        while (radi) {            
            try {
                long drugiBroj = Math.round(Math.random() * 5);
                lbl_DrugiBroj.setText(String.valueOf(drugiBroj));
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(DrugaNit.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    
    
}
