/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciones_graficas_swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Santiago
 */
public class Frame_caracteristicas_objetos {
    public static void main(String[] args){
        
        System.out.println(There_isFont.verificarFuente("Consolas"));
        
        
        Miventana vent;
        vent = new Miventana();
        
        vent.setVisible(true);
        vent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class Miventana extends JFrame{

    public Miventana(){
        this.setSize(720, 480);
        this.setLocation(100, 250);
        this.setTitle("Mi ventana con objetos de prueba");
        
        Image myimage; 
        myimage =
                Toolkit.getDefaultToolkit().getImage
                                   ("src/aplicaciones_graficas_swing/gato.gif");
        
        this.setIconImage(myimage);
        
        Capadibujos capita;
        capita = new Capadibujos();
        
        capita.setBackground(new Color(186, 239, 228));
        add(capita);
        
    }
    
}


class Capadibujos extends JPanel{
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        Graphics2D g2 = (Graphics2D) g;
        
        //--------------- Antialiasing ----------------------
        
        RenderingHints miantiA =
                new RenderingHints(RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON);
        
        g2.setRenderingHints(miantiA);
        
        //---------------------------------------------------
        
        
        Rectangle2D rectang;
        rectang = new Rectangle2D.Double(250, 150, 300, 200);
        
        g2.setPaint(Color.RED); // Colores constantes
        g2.fill(rectang);
        
        // ----------------------------------------
        
        Ellipse2D mielip;
        mielip = new Ellipse2D.Double();
        
        mielip.setFrame(rectang);
        g2.setPaint(new Color(9, 64, 53)); // Color RGB
        g2.fill(mielip);
        
        // ----------- Palabras y Fuentes ---------------
        
        Font fuente1;
        fuente1 = new Font("Consolas", Font.ITALIC, 23);
        g2.setFont(fuente1);
        g2.setPaint(Color.BLUE);
        g2.drawString("Figuras geometricas", 250, 140);
        
    }
}
