
package Memorama;

import java.awt.Color;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;


    
public class Ventana extends Menu implements ActionListener
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
    public JButton Charmander1;
    public JButton Charmander2; 
    public JButton    Squi1;  
    public JButton    Squi2;  
    public JButton    Bulba1;  
    public JButton    Bulba2;  
    public JButton    Eve1;  
    public JButton    Eve2;  
    public JButton    magic1;  
    public JButton    magic2;  
    public JButton    Pidgeot1;  
    public JButton    Pidgeot2;  
    public JButton    Arbok1;  
    public JButton    Arbok2;  
    public JButton    Snorlax1;  
    public JButton    Snorlax2;  
    public JButton    Rosadita1;  
    public JButton    Rosadita2;  
    public JButton    Riachu1;  
    public JButton    Riachu2;  
    public JButton    Mew1;  
    public JButton    Mew2;  
    public JButton    Kakuna1;  
    public JButton    Kakuna2;  
    public int nivel;
    Color cool= new Color(102,0,0);
    int sum=0;
     ArrayList<JButton> Lbotones=new ArrayList<>();
   ImageIcon ImageA=new ImageIcon("articuno.png");
   ImageIcon ImageM=new ImageIcon("mega.jpg");
   ImageIcon ImageZ=new ImageIcon("zapdos.jpg");
   ImageIcon ImageMe=new ImageIcon("mewtwo.jpg");
   ImageIcon ImageFondo=new ImageIcon("fondo.jpg");
   ImageIcon ImageC=new ImageIcon("charmander.jpg");
   ImageIcon ImageB=new ImageIcon("bulba.jpg");
   ImageIcon ImageE=new ImageIcon("eve.png");
   ImageIcon ImageS=new ImageIcon("squi.png");
   ImageIcon ImageARBOK=new ImageIcon("arbok.png");
   ImageIcon ImageMAGIC=new ImageIcon("magic.png");
   ImageIcon ImagePIDGEOT=new ImageIcon("Pidgeot.png");
   ImageIcon ImageSNORLAX=new ImageIcon("snorlax.png");
   ImageIcon ImageROSA=new ImageIcon("rosadita.png");
   ImageIcon ImageMEW=new ImageIcon("mew.png");
   ImageIcon ImageRIACHU=new ImageIcon("riachu.png");
   ImageIcon ImageKAKUNA=new ImageIcon("kaku.png");
   
   
   

   
    ArrayList<ArrayList> posiciones= new ArrayList<ArrayList>();
    ArrayList<ArrayList> posiciones2= new ArrayList<ArrayList>();
    ArrayList<ArrayList> posiciones3= new ArrayList<ArrayList>();
    
    public Ventana(int a){
        this.nivel=a;
        this.setResizable(false);
        this.setSize(1046,610); //Tamaño de la vetnana

          //  posiciones = new ArrayList<List<int>>();
        ArrayList<String> y1= new ArrayList<String>();
        posiciones.add(y1);
        posiciones.get(0).add("40");
        posiciones.get(0).add("40");
         ArrayList<String> y2= new ArrayList<String>();
        posiciones.add(y2);
         posiciones.get(1).add("280");
        posiciones.get(1).add("40");
         ArrayList<String> y3= new ArrayList<String>();
        posiciones.add(y3);
         posiciones.get(2).add("520");
        posiciones.get(2).add("40");
         ArrayList<String> y4= new ArrayList<String>();
        posiciones.add(y4);
         posiciones.get(3).add("760");
        posiciones.get(3).add("40");
         ArrayList<String> y5= new ArrayList<String>();
        posiciones.add(y5);
         posiciones.get(4).add("40");
        posiciones.get(4).add("310");
         ArrayList<String> y6= new ArrayList<String>();
        posiciones.add(y6);
         posiciones.get(5).add("280");
        posiciones.get(5).add("310");
         ArrayList<String> y7= new ArrayList<String>();
        posiciones.add(y7);
         posiciones.get(6).add("520");
        posiciones.get(6).add("310");
         ArrayList<String> y8= new ArrayList<String>();
        posiciones.add(y8);
         posiciones.get(7).add("760");
        posiciones.get(7).add("310");
        ////////////////////////////////////////////////////////
         ArrayList<String> x1= new ArrayList<String>();
        posiciones2.add(x1);
        posiciones2.get(0).add("28");
        posiciones2.get(0).add("28");
         ArrayList<String> x2= new ArrayList<String>();
        posiciones2.add(x2);
         posiciones2.get(1).add("153");
        posiciones2.get(1).add("28");
         ArrayList<String> x3= new ArrayList<String>();
        posiciones2.add(x3);
         posiciones2.get(2).add("278");
        posiciones2.get(2).add("28");
         ArrayList<String> x4= new ArrayList<String>();
        posiciones2.add(x4);
         posiciones2.get(3).add("403");
        posiciones2.get(3).add("28");
         ArrayList<String> x5= new ArrayList<String>();
        posiciones2.add(x5);
         posiciones2.get(4).add("528");
        posiciones2.get(4).add("28");
         ArrayList<String> x6= new ArrayList<String>();
        posiciones2.add(x6);
         posiciones2.get(5).add("653");
        posiciones2.get(5).add("28");
         ArrayList<String> x7= new ArrayList<String>();
        posiciones2.add(x7);
         posiciones2.get(6).add("778");
        posiciones2.get(6).add("28");
         ArrayList<String> x8= new ArrayList<String>();
        posiciones2.add(x8);
         posiciones2.get(7).add("903");
        posiciones2.get(7).add("28");
        System.out.println(posiciones.get(7).get(1));
        System.out.println(posiciones.get(0).get(1));
         
         ArrayList<String> y9= new ArrayList<String>();
        posiciones2.add(y9);
         posiciones2.get(8).add("28");
        posiciones2.get(8).add("228");
         ArrayList<String> y10= new ArrayList<String>();
        posiciones2.add(y10);
         posiciones2.get(9).add("153");
        posiciones2.get(9).add("228");
         ArrayList<String> y11= new ArrayList<String>();
        posiciones2.add(y11);
         posiciones2.get(10).add("278");
        posiciones2.get(10).add("228");
         ArrayList<String> y12= new ArrayList<String>();
        posiciones2.add(y12);
         posiciones2.get(11).add("403");
        posiciones2.get(11).add("228");
         ArrayList<String> y13= new ArrayList<String>();
        posiciones2.add(y13);
         posiciones2.get(12).add("528");
        posiciones2.get(12).add("228");
         ArrayList<String> y14= new ArrayList<String>();
        posiciones2.add(y14);
         posiciones2.get(13).add("653");
        posiciones2.get(13).add("228");
         ArrayList<String> y15= new ArrayList<String>();
        posiciones2.add(y15);
         posiciones2.get(14).add("778");
        posiciones2.get(14).add("228");
         ArrayList<String> y16= new ArrayList<String>();
        posiciones2.add(y16);
         posiciones2.get(15).add("903");
        posiciones2.get(15).add("228");
        
        
        ////////////////////////////////////////////////
        ArrayList<String> a1= new ArrayList<String>();
        posiciones3.add(a1);
        posiciones3.get(0).add("28");
        posiciones3.get(0).add("28");
         ArrayList<String> a2= new ArrayList<String>();
        posiciones3.add(a2);
         posiciones3.get(1).add("153");
        posiciones3.get(1).add("28");
         ArrayList<String> a3= new ArrayList<String>();
        posiciones3.add(a3);
         posiciones3.get(2).add("278");
        posiciones3.get(2).add("28");
         ArrayList<String> a4= new ArrayList<String>();
        posiciones3.add(a4);
         posiciones3.get(3).add("403");
        posiciones3.get(3).add("28");
         ArrayList<String> a5= new ArrayList<String>();
        posiciones3.add(a5);
         posiciones3.get(4).add("528");
        posiciones3.get(4).add("28");
         ArrayList<String> a6= new ArrayList<String>();
        posiciones3.add(a6);
         posiciones3.get(5).add("653");
        posiciones3.get(5).add("28");
         ArrayList<String> a7= new ArrayList<String>();
        posiciones3.add(a7);
         posiciones3.get(6).add("778");
        posiciones3.get(6).add("28");
         ArrayList<String> a8= new ArrayList<String>();
        posiciones3.add(a8);
         posiciones3.get(7).add("903");
        posiciones3.get(7).add("28");
        System.out.println(posiciones.get(7).get(1));
        System.out.println(posiciones.get(0).get(1));
         
         ArrayList<String> a9= new ArrayList<String>();
        posiciones3.add(a9);
         posiciones3.get(8).add("28");
        posiciones3.get(8).add("138");
         ArrayList<String> a10= new ArrayList<String>();
        posiciones3.add(a10);
         posiciones3.get(9).add("153");
        posiciones3.get(9).add("138");
         ArrayList<String> a11= new ArrayList<String>();
        posiciones3.add(a11);
         posiciones3.get(10).add("278");
        posiciones3.get(10).add("138");
         ArrayList<String> a12= new ArrayList<String>();
        posiciones3.add(a12);
         posiciones3.get(11).add("403");
        posiciones3.get(11).add("138");
         ArrayList<String> a13= new ArrayList<String>();
        posiciones3.add(a13);
         posiciones3.get(12).add("528");
        posiciones3.get(12).add("138");
         ArrayList<String> a14= new ArrayList<String>();
        posiciones3.add(a14);
         posiciones3.get(13).add("653");
        posiciones3.get(13).add("138");
         ArrayList<String> a15= new ArrayList<String>();
        posiciones3.add(a15);
         posiciones3.get(14).add("778");
        posiciones3.get(14).add("138");
         ArrayList<String> a16= new ArrayList<String>();
        posiciones3.add(a16);
         posiciones3.get(15).add("903");
        posiciones3.get(15).add("138");
        ArrayList<String> a17= new ArrayList<String>();
        posiciones3.add(a17);
        posiciones3.get(16).add("28");
        posiciones3.get(16).add("248");
         ArrayList<String> a18= new ArrayList<String>();
        posiciones3.add(a18);
         posiciones3.get(17).add("153");
        posiciones3.get(17).add("248");
         ArrayList<String> a19= new ArrayList<String>();
        posiciones3.add(a19);
         posiciones3.get(18).add("278");
        posiciones3.get(18).add("248");
         ArrayList<String> a20= new ArrayList<String>();
        posiciones3.add(a20);
         posiciones3.get(19).add("403");
        posiciones3.get(19).add("248");
         ArrayList<String> a21= new ArrayList<String>();
        posiciones3.add(a21);
         posiciones3.get(20).add("528");
        posiciones3.get(20).add("248");
         ArrayList<String> a22= new ArrayList<String>();
        posiciones3.add(a22);
         posiciones3.get(21).add("653");
        posiciones3.get(21).add("248");
         ArrayList<String> a23= new ArrayList<String>();
        posiciones3.add(a23);
         posiciones3.get(22).add("778");
        posiciones3.get(22).add("248");
         ArrayList<String> a24= new ArrayList<String>();
        posiciones3.add(a24);
         posiciones3.get(23).add("903");
        posiciones3.get(23).add("248");
        System.out.println(posiciones.get(7).get(1));
        System.out.println(posiciones.get(0).get(1));
         
         ArrayList<String> a25= new ArrayList<String>();
        posiciones3.add(a25);
         posiciones3.get(24).add("28");
        posiciones3.get(24).add("358");
         ArrayList<String> a26= new ArrayList<String>();
        posiciones3.add(a26);
         posiciones3.get(25).add("153");
        posiciones3.get(25).add("358");
         ArrayList<String> a27= new ArrayList<String>();
        posiciones3.add(a27);
         posiciones3.get(26).add("278");
        posiciones3.get(26).add("358");
         ArrayList<String> a28= new ArrayList<String>();
        posiciones3.add(a28);
         posiciones3.get(27).add("403");
        posiciones3.get(27).add("358");
         ArrayList<String> a29= new ArrayList<String>();
        posiciones3.add(a29);
         posiciones3.get(28).add("528");
        posiciones3.get(28).add("358");
         ArrayList<String> a30= new ArrayList<String>();
        posiciones3.add(a30);
         posiciones3.get(29).add("653");
        posiciones3.get(29).add("358");
         ArrayList<String> a31= new ArrayList<String>();
        posiciones3.add(a31);
         posiciones3.get(30).add("778");
        posiciones3.get(30).add("358");
         ArrayList<String> a32= new ArrayList<String>();
        posiciones3.add(a32);
         posiciones3.get(31).add("903");
        posiciones3.get(31).add("358");
        
        
        
        
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
        Charmander1=new JButton();  
        Charmander2=new JButton();  
        Squi1=new JButton();  
        Squi2=new JButton();  
        Bulba1=new JButton();  
        Bulba2=new JButton();  
        Eve1=new JButton();  
        Eve2=new JButton();  
        magic1=new JButton();  
        magic2=new JButton();  
        Pidgeot1=new JButton();  
        Pidgeot2=new JButton();  
        Arbok1=new JButton();  
        Arbok2=new JButton();  
        Snorlax1=new JButton();  
        Snorlax2=new JButton();  
        Rosadita1=new JButton();  
        Rosadita2=new JButton();  
        Riachu1=new JButton();  
        Riachu2=new JButton();  
        Mew1=new JButton();  
        Mew2=new JButton();  
        Kakuna1=new JButton();  
        Kakuna2=new JButton();  
        
        if(this.nivel==1){
        crearContenidoBoton(Articuno1, "Articuno", ImageA);
        crearContenidoBoton(Articuno2, "Articuno", ImageA);
        crearContenidoBoton(Mega1, "Mega", ImageM);
        crearContenidoBoton(Mega2, "Mega", ImageM);
        crearContenidoBoton(Zapdos1, "Zapdos", ImageZ);
        crearContenidoBoton(Zapdos2, "Zapdos", ImageZ);
        crearContenidoBoton(Mewtwo1, "Mewtwo", ImageMe);
        crearContenidoBoton(Mewtwo2, "Mewtwo", ImageMe);
        }
        if(this.nivel==2)
        {
            crearContenidoBoton2(Articuno1, "Articuno", ImageA);
            crearContenidoBoton2(Articuno2, "Articuno", ImageA);
            crearContenidoBoton2(Mega1, "Mega", ImageM);
            crearContenidoBoton2(Mega2, "Mega", ImageM);
            crearContenidoBoton2(Zapdos1, "Zapdos", ImageZ);
            crearContenidoBoton2(Zapdos2, "Zapdos", ImageZ);
            crearContenidoBoton2(Mewtwo1, "Mewtwo", ImageMe);
            crearContenidoBoton2(Mewtwo2, "Mewtwo", ImageMe);
            crearContenidoBoton2(Charmander1, "Charmander", ImageC);
            crearContenidoBoton2(Charmander2, "Charmander", ImageC);
            crearContenidoBoton2(Squi1, "Squi", ImageS);
            crearContenidoBoton2(Squi2, "Squi", ImageS);
            crearContenidoBoton2(Bulba1, "Bulba", ImageB);
            crearContenidoBoton2(Bulba2, "Bulba", ImageB);
            crearContenidoBoton2(Eve1, "Eve", ImageE);
            crearContenidoBoton2(Eve2, "Eve", ImageE);
               
        }if(this.nivel==3){
            crearContenidoBoton3(Articuno1, "Articuno", ImageA);
            crearContenidoBoton3(Articuno2, "Articuno", ImageA);
            crearContenidoBoton3(Mega1, "Mega", ImageM);
            crearContenidoBoton3(Mega2, "Mega", ImageM);
            crearContenidoBoton3(Zapdos1, "Zapdos", ImageZ);
            crearContenidoBoton3(Zapdos2, "Zapdos", ImageZ);
            crearContenidoBoton3(Mewtwo1, "Mewtwo", ImageMe);
            crearContenidoBoton3(Mewtwo2, "Mewtwo", ImageMe);
            crearContenidoBoton3(Charmander1, "Charmander", ImageC);
            crearContenidoBoton3(Charmander2, "Charmander", ImageC);
            crearContenidoBoton3(Squi1, "Squi", ImageS);
            crearContenidoBoton3(Squi2, "Squi", ImageS);
            crearContenidoBoton3(Bulba1, "Bulba", ImageB);
            crearContenidoBoton3(Bulba2, "Bulba", ImageB);
            crearContenidoBoton3(Eve1, "Eve", ImageE);
            crearContenidoBoton3(Eve2, "Eve", ImageE);
            crearContenidoBoton3(Arbok1,"Arbok",ImageARBOK);
            crearContenidoBoton3(Arbok2,"Arbok",ImageARBOK);
            crearContenidoBoton3(magic1,"Magic",ImageMAGIC);
            crearContenidoBoton3(magic2,"Magic",ImageMAGIC);
            crearContenidoBoton3(Pidgeot1,"Pidgeot",ImagePIDGEOT);
            crearContenidoBoton3(Pidgeot2,"Pidgeot",ImagePIDGEOT);
            crearContenidoBoton3(Snorlax1,"Snorlax",ImageSNORLAX);
            crearContenidoBoton3(Snorlax2,"Snorlax",ImageSNORLAX);
            crearContenidoBoton3(Rosadita1,"Rosadita",ImageROSA);
            crearContenidoBoton3(Rosadita2,"Rosadita",ImageROSA);
            crearContenidoBoton3(Riachu1,"Riachu",ImageRIACHU);
            crearContenidoBoton3(Riachu2,"Riachu",ImageRIACHU);
            crearContenidoBoton3(Mew1,"Mew",ImageMEW);
            crearContenidoBoton3(Mew2,"Mew",ImageMEW);
            crearContenidoBoton3(Kakuna1,"Kakuna",ImageKAKUNA);     
            crearContenidoBoton3(Kakuna2,"Kakuna",ImageKAKUNA);     
        }
    }

     private void crearContenidoBoton3(JButton boton, String nombre, ImageIcon imagen){
        Random rand= new Random();
        int x = rand.nextInt(posiciones3.size());
        ImageIcon imagenFondo=new ImageIcon("fondo.jpg");
        boton.setIcon(imagenFondo);
        boton.setName(nombre);
        boton.setBounds(Integer.parseInt((String) posiciones3.get(x).get(0)),
                        Integer.parseInt((String) posiciones3.get(x).get(1)),70,100);
        boton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
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
                            }if(cad1.equals("Bulba")){   
                                Bulba1.setEnabled(false);
                                Bulba2.setEnabled(false);
                            }
                            if(cad1.equals("Charmander")){   
                                Charmander1.setEnabled(false);
                                Charmander2.setEnabled(false);
                            }if(cad1.equals("Squi")){   
                                Squi1.setEnabled(false);
                                Squi2.setEnabled(false);
                            }if(cad1.equals("Eve")){   
                                Eve1.setEnabled(false);
                                Eve2.setEnabled(false);
                            }if(cad1.equals("Arbok")){   
                                Arbok1.setEnabled(false);
                                Arbok2.setEnabled(false);
                            }if(cad1.equals("Magic")){   
                                magic1.setEnabled(false);
                                magic2.setEnabled(false);
                            }if(cad1.equals("Pidgeot")){   
                                Pidgeot1.setEnabled(false);
                                Pidgeot2.setEnabled(false);
                            }if(cad1.equals("Snorlax")){   
                                Snorlax1.setEnabled(false);
                                Snorlax2.setEnabled(false);
                            }if(cad1.equals("Rosadita")){   
                                Rosadita1.setEnabled(false);
                                Rosadita2.setEnabled(false);
                            }if(cad1.equals("Riachu")){   
                                Riachu1.setEnabled(false);
                               Riachu2.setEnabled(false);
                            }if(cad1.equals("Mew")){   
                                Mew1.setEnabled(false);
                                Mew2.setEnabled(false);
                            }if(cad1.equals("Kakuna")){   
                                Kakuna1.setEnabled(false);
                                Kakuna2.setEnabled(false);
                            }
                            sum=0;
                            Lbotones.removeAll(Lbotones);
                    }else{
                        sum=0;
                         System.out.println("antes");
                         System.out.println("despues ");
                        Articuno1.setIcon(ImageFondo);
                        Articuno2.setIcon(ImageFondo);
                        Mega1.setIcon(ImageFondo);
                        Mega2.setIcon(ImageFondo);
                        Zapdos1.setIcon(ImageFondo);
                        Zapdos2.setIcon(ImageFondo);
                        Mewtwo1.setIcon(ImageFondo);
                        Mewtwo2.setIcon(ImageFondo);
                        Bulba1.setIcon(ImageFondo);
                        Bulba2.setIcon(ImageFondo);
                        Charmander1.setIcon(ImageFondo);
                        Charmander2.setIcon(ImageFondo);
                        Squi1.setIcon(ImageFondo);
                        Squi2.setIcon(ImageFondo);
                        Eve1.setIcon(ImageFondo);
                        Eve2.setIcon(ImageFondo);
                        Arbok1.setIcon(ImageFondo);
                        Arbok2.setIcon(ImageFondo);
                        magic1.setIcon(ImageFondo);
                        magic2.setIcon(ImageFondo);
                        Rosadita1.setIcon(ImageFondo);
                        Rosadita2.setIcon(ImageFondo);
                        Pidgeot1.setIcon(ImageFondo);
                        Pidgeot2.setIcon(ImageFondo);
                         Snorlax1.setIcon(ImageFondo);
                        Snorlax2.setIcon(ImageFondo);
                        Mew1.setIcon(ImageFondo);
                        Mew2.setIcon(ImageFondo);
                        Riachu1.setIcon(ImageFondo);
                        Riachu2.setIcon(ImageFondo);
                        Kakuna1.setIcon(ImageFondo);
                        Kakuna2.setIcon(ImageFondo);
                        
                        
                        Lbotones.removeAll(Lbotones);
                    }
                }
            }
           
            @Override
            public void mouseEntered(MouseEvent me) {
            }

            @Override
            public void mouseExited(MouseEvent me) {
            }
        });
        panel.add(boton);
        posiciones3.remove(x);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private void crearContenidoBoton2(JButton boton, String nombre, ImageIcon imagen){
        Random rand= new Random();
        int x = rand.nextInt(posiciones2.size());
        ImageIcon imagenFondo=new ImageIcon("fondo.jpg");
        boton.setIcon(imagenFondo);
        boton.setName(nombre);
        boton.setBounds(Integer.parseInt((String) posiciones2.get(x).get(0)),
                        Integer.parseInt((String) posiciones2.get(x).get(1)),100,180);
        boton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
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
                            }if(cad1.equals("Bulba")){   
                                Bulba1.setEnabled(false);
                                Bulba2.setEnabled(false);
                            }
                            if(cad1.equals("Charmander")){   
                                Charmander1.setEnabled(false);
                                Charmander2.setEnabled(false);
                            }if(cad1.equals("Squi")){   
                                Squi1.setEnabled(false);
                                Squi2.setEnabled(false);
                            }if(cad1.equals("Eve")){   
                                Eve1.setEnabled(false);
                                Eve2.setEnabled(false);
                            }
                            sum=0;
                            Lbotones.removeAll(Lbotones);
                    }else{
                        sum=0;
                         System.out.println("antes");
                         System.out.println("despues ");
                        Articuno1.setIcon(ImageFondo);
                        Articuno2.setIcon(ImageFondo);
                        Mega1.setIcon(ImageFondo);
                        Mega2.setIcon(ImageFondo);
                        Zapdos1.setIcon(ImageFondo);
                        Zapdos2.setIcon(ImageFondo);
                        Mewtwo1.setIcon(ImageFondo);
                        Mewtwo2.setIcon(ImageFondo);
                        Bulba1.setIcon(ImageFondo);
                        Bulba2.setIcon(ImageFondo);
                        Charmander1.setIcon(ImageFondo);
                        Charmander2.setIcon(ImageFondo);
                        Squi1.setIcon(ImageFondo);
                        Squi2.setIcon(ImageFondo);
                        Eve1.setIcon(ImageFondo);
                        Eve2.setIcon(ImageFondo);
                        Lbotones.removeAll(Lbotones);
                    }
                }
            }
           
            @Override
            public void mouseEntered(MouseEvent me) {
            }

            @Override
            public void mouseExited(MouseEvent me) {
            }
        });
        panel.add(boton);
        posiciones2.remove(x);
    }
                


    
    private void crearContenidoBoton(JButton boton, String nombre, ImageIcon imagen){
        Random rand= new Random();
        int x = rand.nextInt(posiciones.size());
        ImageIcon imagenFondo=new ImageIcon("fondo.jpg");
        boton.setIcon(imagenFondo);
        boton.setName(nombre);
        boton.setBounds(Integer.parseInt((String) posiciones.get(x).get(0)),
                        Integer.parseInt((String) posiciones.get(x).get(1)),180,240);
        boton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
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
                            }
                            sum=0;
                            Lbotones.removeAll(Lbotones);
                    }else{
                        sum=0;
                         System.out.println("antes");
                         System.out.println("despues ");
                        Articuno1.setIcon(ImageFondo);
                        Articuno2.setIcon(ImageFondo);
                        Mega1.setIcon(ImageFondo);
                        Mega2.setIcon(ImageFondo);
                        Zapdos1.setIcon(ImageFondo);
                        Zapdos2.setIcon(ImageFondo);
                        Mewtwo1.setIcon(ImageFondo);
                        Mewtwo2.setIcon(ImageFondo);
                        Lbotones.removeAll(Lbotones);
                    }
                }
            }

            @Override
            public void mouseEntered(MouseEvent me) {
            }

            @Override
            public void mouseExited(MouseEvent me) {
            }
        });
        panel.add(boton);
        posiciones.remove(x);
    }

}







