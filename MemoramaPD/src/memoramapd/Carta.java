/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memoramapd;

import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Santiago
 */
public class Carta extends JButton implements ICarta{
    
    private final ImageIcon imagenFondo;
    private final ImageIcon imagenCarta;
    
    public Carta(String nombre, ImageIcon imagenCarta){
        imagenFondo = new ImageIcon("fondo.jpg");
        this.imagenCarta = imageScale(imagenCarta);
        this.setBorder(null);
       
    }
    
    public void setImageBG(){
        this.setIcon(imagenFondo);
    }
    
    public void setImageFront(){
        this.setIcon(imagenCarta);
    }
    
    
    @Override
    public ICarta clonar() {
        Carta carta = null;
        
        try{
            carta = (Carta) clone();
            return carta;
        }catch(CloneNotSupportedException e){
            //e.printStackTrace();
        }
        
        return null;
    }
    
    
    private ImageIcon imageScale(ImageIcon imagen){
        int widthBoton = -1; // Esto sirve para proporcionar la imagen
            
            ImageIcon newImagen = new ImageIcon(imagen.getImage().getScaledInstance(widthBoton,
                                                                                    340,
                                                                                    java.awt.Image.SCALE_DEFAULT));
            return newImagen;
    }
    
}
