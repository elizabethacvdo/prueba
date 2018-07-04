/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegonaves;

import N1.Sprite;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

/**
 *
 * @author Mery Acevedo
 */
public class Nave extends Sprite{
    
    private int dx;
    private int dy;
    private ArrayList missiles;
    
    
    public Nave(int x, int y) {
        super(x, y);

        initCraft();
    }
    
     private void initCraft() {
        
        missiles = new ArrayList();
        loadImage("");
        getImageDimensions();
    }
    
    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_SPACE) {
            fire();
        }

        if (key == KeyEvent.VK_LEFT) {
            dx = -1;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 1;
        }

        if (key == KeyEvent.VK_UP) {
            dy = -1;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 1;
        }
    }
    
    public void fire() {
        missiles.add(new misil(x + width, y + height / 2));
    }
    
    
    public void keyReleased(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_UP) {
            dy = 0;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 0;
        }
    }
    public ArrayList getMissiles() {
        return missiles;
    }
    
    public void move() {

        x += dx;
        y += dy;

        if (x < 1) {
            x = 1;
        }

        if (y < 1) {
            y = 1;
        }
    }
}
