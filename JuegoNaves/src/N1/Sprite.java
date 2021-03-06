/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package N1;



import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

public class Sprite {

    protected int x;
    protected int y;
    protected int width;
    protected int height;
    protected boolean vista;
    protected Image image;

    public Sprite(int x, int y) {

        this.x = x;
        this.y = y;
        vista = true;
    }

    protected void getImageDimensions() {

        width = image.getWidth(null);
        height = image.getHeight(null);
    }

    protected void loadImage(String imageName) {
    Image ii = new ImageIcon(getClass().getResource(imageName)).getImage();
    ImageIcon ij = new ImageIcon(imageName);
        Image i;
        image = ii;
    }

    public Image getImage() {
        return image;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isVisible() {
        return vista;
    }

    public void setVisible(Boolean visible) {
        vista = visible;
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, width, height);
    }
}



