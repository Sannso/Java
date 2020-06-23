
package Memorama;

import java.awt.Color;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;


    
public class Ventana extends JFrame
{
    public JPanel panel;
    public JButton Articuno1;
    public JButton Articuno2;
    public JButton Mega1;
    public JButton Mega2;
    public JButton Mewtwo1;
    public JButton Mewtwo2;
    public JButton Zapdos1;
    public JButton Zapdos2;
    Color cool= new Color(102,0,0);
    int sum=0;
    ArrayList<JButton> Lbotones=new ArrayList<>();
   ImageIcon ImageA=new ImageIcon("articuno.png");
   ImageIcon ImageM=new ImageIcon("mega.jpg");
   ImageIcon ImageZ=new ImageIcon("zapdos.jpg");
   ImageIcon ImageMe=new ImageIcon("mewtwo.jpg");
   ImageIcon ImageFondo=new ImageIcon("fondo.jpg");

   
    ArrayList<ArrayList> posiciones= new ArrayList<ArrayList>();
    
    
    public Ventana(){
        this.setResizable(false);
        this.setSize(1010,610); //Tamaño de la vetnana

          //  posiciones = new ArrayList<List<int>>();
        ArrayList<String> x1= new ArrayList<String>();
        posiciones.add(x1);


        posiciones.get(0).add("40");
        posiciones.get(0).add("40");

         ArrayList<String> x2= new ArrayList<String>();
        posiciones.add(x2);

         posiciones.get(1).add("280");
        posiciones.get(1).add("40");

         ArrayList<String> x3= new ArrayList<String>();
        posiciones.add(x3);

         posiciones.get(2).add("520");
        posiciones.get(2).add("40");

         ArrayList<String> x4= new ArrayList<String>();
        posiciones.add(x4);

         posiciones.get(3).add("760");
        posiciones.get(3).add("40");

         ArrayList<String> x5= new ArrayList<String>();
        posiciones.add(x5);

         posiciones.get(4).add("40");
        posiciones.get(4).add("310");

         ArrayList<String> x6= new ArrayList<String>();
        posiciones.add(x6);

         posiciones.get(5).add("280");
        posiciones.get(5).add("310");

         ArrayList<String> x7= new ArrayList<String>();
        posiciones.add(x7);

         posiciones.get(6).add("520");
        posiciones.get(6).add("310");

         ArrayList<String> x8= new ArrayList<String>();
        posiciones.add(x8);

         posiciones.get(7).add("760");
        posiciones.get(7).add("310");



        System.out.println(posiciones.get(7).get(1));
        System.out.println(posiciones.get(0).get(1));


        crear_panel();
        crear_botones();

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//cierre de ventanas
        this.setTitle("MEMORAMA");//titulo de la ventana
    }
    
    public void crear_panel(){
        panel=new JPanel();

        panel.setLayout(null);

        panel.setBackground(cool);

        this.getContentPane().add(panel);
    }
    
    public void crear_botones(){
        
        // Funcion para ahorrar codigo
            // Primero se instancian los botones
        Articuno1=new JButton();    
        Articuno2=new JButton();
        Mega1=new JButton();   
        Mega2=new JButton();
        Zapdos1=new JButton();
        Zapdos2=new JButton();
        Mewtwo1=new JButton();
        Mewtwo2=new JButton();
        
        crearContenidoBoton(Articuno1, "Articuno", ImageA);
        crearContenidoBoton(Articuno2, "Articuno", ImageA);
        crearContenidoBoton(Mega1, "Mega", ImageM);
        crearContenidoBoton(Mega2, "Mega", ImageM);
        crearContenidoBoton(Zapdos1, "Zapdos", ImageZ);
        crearContenidoBoton(Zapdos2, "Zapdos", ImageZ);
        crearContenidoBoton(Mewtwo1, "Mewtwo", ImageMe);
        crearContenidoBoton(Mewtwo2, "Mewtwo", ImageMe);
        
        
    }

    private void crearContenidoBoton(JButton boton, String nombre, ImageIcon imagen){
        Random rand= new Random();
        int x = rand.nextInt(posiciones.size());
            
        //boton = new JButton();
        ImageIcon imagenFondo=new ImageIcon("fondo.jpg");
        boton.setIcon(imagenFondo);
        boton.setName(nombre);
        boton.setBounds(Integer.parseInt((String) posiciones.get(x).get(0)),
                        Integer.parseInt((String) posiciones.get(x).get(1)),180,240);

        
        //Cambie el evento de boton a un mouse listener
        boton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                // Codigo
            }

            @Override
            public void mousePressed(MouseEvent me) {
                boton.setIcon(imagen);
                sum=sum+1;
                Lbotones.add(boton);
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                if(sum==2){

                     System.out.println("12");
                     System.out.println(Lbotones.get(0).getName());
                     System.out.println(Lbotones.get(1).getName());


                     String cad1=new String(Lbotones.get(0).getName());
                     String cad2= new String (Lbotones.get(1).getName());
                     if(cad1.equals(cad2)&&(Lbotones.get(0)!=Lbotones.get(1))){
                               System.out.println("son iguales");
                            if(cad1.equals("Articuno")){   
                                Articuno1.setEnabled(false);
                                Articuno2.setEnabled(false);
                                 System.out.println("son ");
                            }if(cad1.equals("Mega")){   
                                Mega1.setEnabled(false);
                                Mega2.setEnabled(false);
                                 System.out.println("son ");
                            }if(cad1.equals("Mewtwo")){   
                                Mewtwo1.setEnabled(false);
                                Mewtwo2.setEnabled(false);
                                 System.out.println("son ");
                            }if(cad1.equals("Zapdos")){   
                                Zapdos1.setEnabled(false);
                                Zapdos2.setEnabled(false);
                                 //System.out.println("son ");
                            }
                            sum=0;
                            Lbotones.removeAll(Lbotones);

                    }else{

                        sum=0;


                         System.out.println("antes");
                        //Articuno1.getIcon();
                         System.out.println("despues ");
                        Articuno1.setIcon(ImageFondo);
                        //panel.add(Articuno1);

                        Articuno2.setIcon(ImageFondo);
                        //panel.add(Articuno2);
                        //Thread.sleep(1*1000);
                        Mega1.setIcon(ImageFondo);
                        //Thread.sleep(1*1000);
                        //panel.add(Mega1);
                        Mega2.setIcon(ImageFondo);
                        //Thread.sleep(1*1000);
                        //panel.add(Mega2);
                        Zapdos1.setIcon(ImageFondo);
                        //Thread.sleep(1*1000);
                        //panel.add(Zapdos1);
                        Zapdos2.setIcon(ImageFondo);
                       //Thread.sleep(1*1000);
                        //panel.add(Zapdos2);
                        Mewtwo1.setIcon(ImageFondo);
                       //Thread.sleep(1*1000);
                        //panel.add(Mewtwo1);
                        Mewtwo2.setIcon(ImageFondo);
                       // panel.add(Mewtwo2);

                        Lbotones.removeAll(Lbotones);
                    }



                }
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                // Codigo
            }

            @Override
            public void mouseExited(MouseEvent me) {
                // Codigo
            }
        });
        //boton.addFocusListener(new EventoDeFoco());
        
        panel.add(boton);
        posiciones.remove(x);
    }

}



