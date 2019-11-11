/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciones_graficas_swing;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author Santiago
 */
public class JMenu_I {
    public static void main(String[] args){
        JMenuFrame mi;
        mi = new JMenuFrame();
        mi.setVisible(true);
        mi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class JMenuFrame extends JFrame{
    public JMenuFrame(){
        this.setSize(300, 200);
        this.setLocation(200, 200);
        this.setTitle("Menu");
        
        add(new JMenuPanel());
    }
}

class JMenuPanel extends JPanel{
    public JMenuPanel(){
        JMenuBar barMenu = new JMenuBar();
        add(barMenu);
        
        JMenu archivo = new JMenu("Archivo");
        JMenu edicion = new JMenu("Edicion");
        JMenu herramientas = new JMenu("Herrramientas");
        barMenu.add(archivo);
        barMenu.add(edicion);
        barMenu.add(herramientas);
        
        
        JMenuItem guardar = new JMenuItem("Guardar");
        JMenuItem guardar_como = new JMenuItem("Guardar como");
        archivo.add(guardar);
        archivo.add(guardar_como);
        
        JMenuItem cortar = new JMenuItem("Cortar");
        JMenuItem copiar = new JMenuItem("Copiar");
        JMenuItem pegar = new JMenuItem("Pegar");
        JMenu opciones = new JMenu("Opciones");
        edicion.add(cortar);
        edicion.add(copiar);
        edicion.add(pegar);
        edicion.addSeparator();
        edicion.add(opciones);
        
        JMenuItem opcion1 = new JMenuItem("Opcion 1");
        JMenuItem opcion2 = new JMenuItem("Opcion 2");
        opciones.add(opcion1);
        opciones.add(opcion2);
        
        JMenuItem generales = new JMenuItem("Generales");
        herramientas.add(generales);
    }
}