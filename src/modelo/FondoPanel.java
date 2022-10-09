/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author diego
 */
public class FondoPanel extends JPanel {

    private String ruta;

    public FondoPanel(String ruta) {
        this.ruta = ruta;
    }

    @Override
    public void paint(Graphics g) {
        Image image = new ImageIcon(getClass().getResource(ruta)).getImage();
        g.drawImage(image, 0, 0, getWidth(), getHeight(), this);

        setOpaque(false);

        super.paint(g); //To change body of generated methods, choose Tools | Templates.
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    
}
