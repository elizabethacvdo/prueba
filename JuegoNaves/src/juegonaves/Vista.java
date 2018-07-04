/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegonaves;

import N1.f1;
import Threats.Timer;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Mery Acevedo
 */
public class Vista extends JFrame{
    
    private JLabel lbltime,time;
    //private JButton bstop;
    
    public Vista(){
        super("nivel 1");
        inicio();
       
    }
    
    public JFrame getVentana(){
        return this;
    }
    
    public void inicio() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        lbltime=new JLabel();
        time=new JLabel("tiempo");
       //bstop=new JButton("stop");
        lbltime.setBounds(100,20,50,50);
        time.setBounds(80, 20,100,100);
        Container container=getContentPane();
        Timer tiempo=new Timer(lbltime,getVentana());
        tiempo.start();
        container.add(lbltime);
       container.add(time);
         setSize(700,700);  
        
        
        
        
        
        
        
      
    }
    
    
    
    
   
   
   
    
    
    
}
