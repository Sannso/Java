/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciones_graficas_swing;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Santiago
 */
public class Frame_dibujos {
    public static void main(String[] args){
        
        VentanaD ventana;
        ventana = new VentanaD();
        
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    } 
}

class VentanaD extends JFrame{
    
    public VentanaD(){
        this.setSize(980, 720);
        this.setLocation(100, 100);
        
        this.setTitle("Mi ventana de dibujos");
        
        Image myimage;
        myimage = 
                Toolkit.getDefaultToolkit().getImage
                                   ("src/aplicaciones_graficas_swing/gato.gif");
        
        this.setIconImage(myimage);
        
        CapaDibujos capaD;
        capaD = new CapaDibujos();
        
        add(capaD);
    }
}


class CapaDibujos extends JPanel{
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        /*Dibujos simples con Graphics
        g.drawRect(100, 100, 300, 300);
        g.drawLine(100, 100, 400, 400);
        */
    
        // Ahora se utilizara la libreria Graphics2D
        // que tiene mas cosas y mas libertad de manejo que Graphics 
        
        // Primero refundimos el objeto de la libreria graphics "g"

        Graphics2D g2 = (Graphics2D) g; // esto sera lo que nos permita dibujar
        
        //Antialiasing (Ni idea de como funciona, otra persona lo compartio)
        g2.addRenderingHints(new RenderingHints(RenderingHints.KEY_ANTIALIASING,
                             RenderingHints.VALUE_ANTIALIAS_ON));

        
        // Rectangle2D es una clase que nos permite
        // crear un objeto de tipo rectangulo y esto nos da mas posibilidades de
        // modificarlo de diferentes formas
        
        // Esta clase es Abstracta por lo que no se puede instanciar y por eso
        // se usa Rectangle2D.Double que hereda de Rectangle2D,
        // pero no es abstracta y ademas nos da mas presicion
        // al momento de crear figuras
        
        Rectangle2D rectangulo;
        rectangulo = new Rectangle2D.Double(200, 200, 300, 300);
        
        g2.draw(rectangulo); // Draw nos pide un objeto de tipo Shape, pero
                             // como la clase Rectangle2D tiene implementado esa
                             // libreria Shape, podemos usar los objetos de tipo
                             // Rectangle2D draw para dibujar
                        
                             
                             
        Ellipse2D elipse;
        elipse = new Ellipse2D.Double(); // de esta forma creamos una
                                         // elipse sin dimensiones, la cual
                                         // podemos modificar posteriormente
        
        // De esta forma modificamos la elipse para darle la posicion
        // y dimension del rectangulo, es decir, encerrandola dentro
        // del rectangulo(el cual seria imaginario si no lo pintaramos)                               
        elipse.setFrame(rectangulo);
        g2.draw(elipse);
        
        
        Line2D linea;
        linea = new Line2D.Double(200, 200, 500, 500);
        g2.draw(linea);
        
        
        
        double centroReX = rectangulo.getCenterX();
        double centroReY = rectangulo.getCenterY();
        double rad = 212.13;
        
        Ellipse2D circulo;
        circulo = new Ellipse2D.Double();
        
        circulo.setFrameFromCenter(centroReX, centroReY, centroReX+rad, centroReY+rad);
        g2.draw(circulo);
        
        
    }
}
