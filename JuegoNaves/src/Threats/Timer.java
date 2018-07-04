/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threats;

import N1.f1;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Mery Acevedo
 */
public class Timer extends Thread {
   private JFrame padre;
    private JLabel time;
    private int contador=0;

public Timer(){
    
}


public Timer(JLabel lbltime, JFrame padre){
    this.padre=padre;
    this.time=lbltime;
}

    @Override
    public void run() {
        while(contador<=5){
            try {
                time.setText(String.valueOf(contador++));
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Timer.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
        }
        f1 nivel=new f1();
        nivel.setVisible(true);
        padre.dispose();
     
        
        yield();
        
    }





}
