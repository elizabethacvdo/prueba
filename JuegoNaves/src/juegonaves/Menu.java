/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegonaves;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Mery Acevedo
 */
public class Menu  extends JFrame{
    private JButton bInicio;
    private JButton bpuntaje;
    
    public Menu(){
        super("menu");
        inicio();
    }
    
    public JFrame getVentana(){
        return this;
    }
    
    public void inicio(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(700,700);  
        bInicio = new JButton("iniciar");
        bpuntaje=new JButton("puntajes");
        bInicio.setBounds(200, 100,100, 50);
        bpuntaje.setBounds(200,200,100, 50);
        Container container=getContentPane();
        
       bInicio.addActionListener((ActionEvent ae) -> {
           new Vista().setVisible(true);
           getVentana().dispose();
           
        });
        
        
        
        
        
        container.add(bInicio);
        container.add(bpuntaje);
        
    }
    
    
    
    
    
    
    public static void main (String [] args){
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Menu().setVisible(true);
                
                
            }
        });
        
    
    } 
    
}
