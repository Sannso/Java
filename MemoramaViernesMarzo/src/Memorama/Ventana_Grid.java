/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memorama;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Santiago
 */
public class Ventana_Grid extends JFrame{
    
    // Entero que designa el nivel
    private final int numV;
    
    //Puntos de cada jugador
    private JLabel puntosJugador1;
    private JLabel puntosJugador2;
    
    //Numero de cartas en el juego
    private int numeroDeCartas;
    
    //Turno para jugar (Jugador1 = 0 / Jugador2 = 1)
    private int turno = 0;
    
    public MenuGrid menuStop;
    
    private JPanel panel_Ventana;
    
    
    public Ventana_Grid(int numV,MenuGrid menu){
        this.setSize(1010, 610);
        this.setTitle("Nivel " + numV);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        this.numV = numV;
        
        this.menuStop=menu;
        
        //Panel_Jugador1 = new Panel_Jugadores(1);
        //Panel_Jugador2 = new Panel_Jugadores(2);
        
        panel_Ventana = new Panel_ventana(); 
        
        this.setLayout(new BorderLayout(10, 10));
        this.add(panel_Ventana, BorderLayout.CENTER);
        //this.add(new Panel_Jugadores(1), BorderLayout.WEST);
        this.add(new Panel_Jugadores(2), BorderLayout.EAST);
        this.add(new Menu_Pausa(this, menuStop), BorderLayout.SOUTH);
        
    }
    
    class Panel_ventana extends JPanel{
        
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
        public JButton Squi1;  
        public JButton Squi2;  
        public JButton Bulba1;  
        public JButton Bulba2;  
        public JButton Eve1;  
        public JButton Eve2;  
        public JButton magic1;  
        public JButton magic2;  
        public JButton Pidgeot1;  
        public JButton Pidgeot2;  
        public JButton Arbok1;  
        public JButton Arbok2;  
        public JButton Snorlax1;  
        public JButton Snorlax2;  
        public JButton Rosadita1;  
        public JButton Rosadita2;  
        public JButton Riachu1;  
        public JButton Riachu2;  
        public JButton Mew1;  
        public JButton Mew2;  
        public JButton Kakuna1;  
        public JButton Kakuna2; 
        public JButton reanudar;
        public JButton pausa;
        public JButton inicio;
        public JButton reiniciar;
        public JButton jugador1;
        public JButton jugador2;
        
        
        Color cool= new Color(102,0,0);
        
        private int sum=0;
        
        JButton[] arrayButtons;
        ArrayList<Integer> posiciones= new ArrayList<>();
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

        
       
        
        
        public Panel_ventana(){
            
            
            // -- Esto es lo que minimamente se va a cargar en cualquier nivel --
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

            
            // -----------------------------------------------------------------
            
            switch (numV) {
                case 1:
                    int filas = 2;
                    int cols = 4;
                    numeroDeCartas = filas * cols;
                    llenarPosiciones(numeroDeCartas);
                    arrayButtons = new JButton[numeroDeCartas];
                    
                    this.setLayout(new GridLayout(filas, cols, 10, 10)); // Filas, Columnas, Padx, Pady
                    this.setBackground(cool);
                    
                    arrayButtons = new JButton[numeroDeCartas]; // Almaceno aqui los botones aleatoriamente
                    crearContenidoBoton(Articuno1, "Articuno", ImageA);
                    crearContenidoBoton(Articuno2, "Articuno", ImageA);
                    crearContenidoBoton(Mega1, "Mega", ImageM);
                    crearContenidoBoton(Mega2, "Mega", ImageM);
                    crearContenidoBoton(Zapdos1, "Zapdos", ImageZ);
                    crearContenidoBoton(Zapdos2, "Zapdos", ImageZ);
                    crearContenidoBoton(Mewtwo1, "Mewtwo", ImageMe);
                    crearContenidoBoton(Mewtwo2, "Mewtwo", ImageMe);
                    ponerBotones(numeroDeCartas);
                    
                    break;
                case 2:
                    filas = 4;
                    cols = 4;
                    numeroDeCartas = filas * cols;
                    llenarPosiciones(numeroDeCartas);
                    arrayButtons = new JButton[numeroDeCartas];
                    this.setLayout(new GridLayout(filas, cols, 10, 10));
                    this.setBackground(cool);
                    arrayButtons = new JButton[numeroDeCartas];
                    
                    crearContenidoBoton(Articuno1, "Articuno", ImageA);
                    crearContenidoBoton(Articuno2, "Articuno", ImageA);
                    crearContenidoBoton(Mega1, "Mega", ImageM);
                    crearContenidoBoton(Mega2, "Mega", ImageM);
                    crearContenidoBoton(Zapdos1, "Zapdos", ImageZ);
                    crearContenidoBoton(Zapdos2, "Zapdos", ImageZ);
                    crearContenidoBoton(Mewtwo1, "Mewtwo", ImageMe);
                    crearContenidoBoton(Mewtwo2, "Mewtwo", ImageMe);
                    crearContenidoBoton(Charmander1, "Charmander", ImageC);
                    crearContenidoBoton(Charmander2, "Charmander", ImageC);
                    crearContenidoBoton(Squi1, "Squi", ImageS);
                    crearContenidoBoton(Squi2, "Squi", ImageS);
                    crearContenidoBoton(Bulba1, "Bulba", ImageB);
                    crearContenidoBoton(Bulba2, "Bulba", ImageB);
                    crearContenidoBoton(Eve1, "Eve", ImageE);
                    crearContenidoBoton(Eve2, "Eve", ImageE);
                    ponerBotones(numeroDeCartas);
                    break;
                case 3:
                    filas = 1 + numV;
                    cols = filas *2;
                    numeroDeCartas = filas * cols;
                    llenarPosiciones(numeroDeCartas);
                    arrayButtons = new JButton[numeroDeCartas];
                    this.setLayout(new GridLayout(filas, cols, 10, 10));
                    this.setBackground(cool);
                    arrayButtons = new JButton[numeroDeCartas];
                    
                    crearContenidoBoton(Articuno1, "Articuno", ImageA);
                    crearContenidoBoton(Articuno2, "Articuno", ImageA);
                    crearContenidoBoton(Mega1, "Mega", ImageM);
                    crearContenidoBoton(Mega2, "Mega", ImageM);
                    crearContenidoBoton(Zapdos1, "Zapdos", ImageZ);
                    crearContenidoBoton(Zapdos2, "Zapdos", ImageZ);
                    crearContenidoBoton(Mewtwo1, "Mewtwo", ImageMe);
                    crearContenidoBoton(Mewtwo2, "Mewtwo", ImageMe);
                    crearContenidoBoton(Charmander1, "Charmander", ImageC);
                    crearContenidoBoton(Charmander2, "Charmander", ImageC);
                    crearContenidoBoton(Squi1, "Squi", ImageS);
                    crearContenidoBoton(Squi2, "Squi", ImageS);
                    crearContenidoBoton(Bulba1, "Bulba", ImageB);
                    crearContenidoBoton(Bulba2, "Bulba", ImageB);
                    crearContenidoBoton(Eve1, "Eve", ImageE);
                    crearContenidoBoton(Eve2, "Eve", ImageE);
                    crearContenidoBoton(Arbok1,"Arbok",ImageARBOK);
                    crearContenidoBoton(Arbok2,"Arbok",ImageARBOK);
                    crearContenidoBoton(magic1,"Magic",ImageMAGIC);
                    crearContenidoBoton(magic2,"Magic",ImageMAGIC);
                    crearContenidoBoton(Pidgeot1,"Pidgeot",ImagePIDGEOT);
                    crearContenidoBoton(Pidgeot2,"Pidgeot",ImagePIDGEOT);
                    crearContenidoBoton(Snorlax1,"Snorlax",ImageSNORLAX);
                    crearContenidoBoton(Snorlax2,"Snorlax",ImageSNORLAX);
                    crearContenidoBoton(Rosadita1,"Rosadita",ImageROSA);
                    crearContenidoBoton(Rosadita2,"Rosadita",ImageROSA);
                    crearContenidoBoton(Riachu1,"Riachu",ImageRIACHU);
                    crearContenidoBoton(Riachu2,"Riachu",ImageRIACHU);
                    crearContenidoBoton(Mew1,"Mew",ImageMEW);
                    crearContenidoBoton(Mew2,"Mew",ImageMEW);
                    crearContenidoBoton(Kakuna1,"Kakuna",ImageKAKUNA);
                    crearContenidoBoton(Kakuna2,"Kakuna",ImageKAKUNA);
                    ponerBotones(numeroDeCartas);
                    break;
                default:
                    break;
            }
            
            
        }
       
        
        // ---------------- Poner los botones en el Grid ---------------------
        private void ponerBotones(int n){
            for(int i=0; i<n; i++){
                add(arrayButtons[i]);
            }
            
        }
        
        
        
        // ---------- Array con el numero de posiciones segun # Cartas ---------
        private void llenarPosiciones(int n){
            for(int i=0; i<n; i++){
                posiciones.add(i);
                System.out.println(i);
            }
            System.out.println("\n");
        }
        
        
        // ---------------- Fucion crear botones -------------------------------
        private void crearContenidoBoton(JButton boton, String nombre, ImageIcon imagen){
            
            Random rand= new Random();
            int x = rand.nextInt(posiciones.size());
           
            ImageIcon imagenFondo=new ImageIcon("fondo.jpg");
            boton.setIcon(imagenFondo);
            boton.setName(nombre);
            
            
            // ------- Ajustamiento del tamaño de la imagen -----------
            int heightBoton = (int)boton.getBounds().getSize().width; // No funciona
            int widthBoton = -1; // Esto sirve para proporcionar la imagen
            
            ImageIcon newImagen = new ImageIcon(imagen.getImage().getScaledInstance(widthBoton,
                                                                                    340,
                                                                                    java.awt.Image.SCALE_DEFAULT));
            // ---------------------------------------------------------
            
            addListeners(boton, newImagen);
            
            System.out.println("Tamaño array: " + arrayButtons.length);
            System.out.println("Posicion: " + posiciones.get(x));
            
            arrayButtons[posiciones.get(x)] = boton;
            
            posiciones.remove(x);
            
        }
        
        // -------------------------- Funcion listeners -------------------------------------
        private void addListeners(JButton boton, ImageIcon imagen){
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


                         String cad1=   Lbotones.get(0).getName();
                         String cad2=   Lbotones.get(1).getName();
                         
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
                            
                            operacionJugador(0);
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
                            
                            operacionJugador(1);
                        }
                        verificadorDePartida();
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
                
        }
        
        
        public void operacionJugador(int e){
            if(e == 0){
                if(turno == 0){
                   int puntosAntes = Integer.parseInt( puntosJugador1.getText());
                   puntosJugador1.setText(String.valueOf(puntosAntes+1));
                   turno++;
                   System.out.println("Si llega " + puntosJugador1.getText());

               }
               else if(turno == 1){
                   int puntosAntes = Integer.parseInt( puntosJugador2.getText());
                   puntosJugador2.setText(String.valueOf(puntosAntes+1));
                   turno--;
                   System.out.println("Si llega2 " + puntosJugador2.getText());
               }
            }
            else{
                if(turno == 0){
                   turno++;
                   System.out.println("Si llega " + puntosJugador1.getText());

               }
               else if(turno == 1){
                   turno--;
                   System.out.println("Si llega2 " + puntosJugador2.getText());
               }
            }
            this.repaint();
        }
        
        public void verificadorDePartida(){
            int puntos1 = Integer.parseInt( puntosJugador1.getText());
            int puntos2 = Integer.parseInt( puntosJugador2.getText());
            if((puntos1 + puntos2) == (numeroDeCartas/2) ){

                if(puntos1 > puntos2){ // Gano el jugador 1
                    JOptionPane.showMessageDialog(this, "Gano el jugador 1");
                }
                else if(puntos1 < puntos2){ // Gano el jugador 2
                    JOptionPane.showMessageDialog(this, "Gano el jugador 2");
                }
                else if(puntos1 == puntos2){
                    JOptionPane.showMessageDialog(this, "Los jugadores quedaron en empate");
                }
                
//                menu.setVisible(false);
  //              cerrarMenu2.setVisible(true);
            }
        }
    }
    
    
    
    
    
    class Panel_Jugadores extends JPanel{
        
        
        public Panel_Jugadores(int jugador){
            setLayout(new GridLayout(2, 3)); // Es una "Matriz" para poner 
                                            // Componentes, es de 2x2 pero la puede cambiar
        
            puntosJugador1 = new JLabel(String.valueOf(0), JLabel.LEFT); 
            puntosJugador2 = new JLabel(String.valueOf(0), JLabel.LEFT);                         
            
            
            if(jugador == 1){
                // Aqui pone las cosas para el jugador 1
                add(new JLabel("Jugador 1", JLabel.LEFT));
                add(new JLabel());
                add(new JLabel("Puntos: ", JLabel.RIGHT));
                add(puntosJugador1);
            }
            else if(jugador == 2){
                // Aqui poner las cosas para el jugador 2
                add(new JLabel("Jugador 1", JLabel.LEFT));
                add(new JLabel("Puntos: ", JLabel.RIGHT));
                add(puntosJugador1);
                
                add(new JLabel("Jugador 2", JLabel.LEFT));
                add(new JLabel("Puntos: ", JLabel.RIGHT));
                add(puntosJugador2);
            }
        }
    }
    
    class Menu_Pausa extends JPanel{
        public JButton iniciar;
        public Ventana_Grid menu;
        public MenuGrid cerrarMenu;
    
        
        public Menu_Pausa(Ventana_Grid menu, MenuGrid cerrarMenu2){
            
            
            setLayout(new FlowLayout()); // Componentes, es de 2x2 pero la puede cambiar
            iniciar=new JButton("Salir");
       
            this.menu=menu;
            
            this.cerrarMenu = cerrarMenu2;
            
            this.add(iniciar);
            
            iniciar.addMouseListener(new MouseListener(){
                @Override
                public void mouseClicked(MouseEvent me) {
                }

                @Override
                public void mousePressed(MouseEvent me) {
                    menu.setVisible(false);
                    cerrarMenu.setVisible(true);
                }

                @Override
                public void mouseReleased(MouseEvent me) {
                }

                @Override
                public void mouseEntered(MouseEvent me) {
                }

                @Override
                public void mouseExited(MouseEvent me) {
                }
            });
 
        }

  
    }
}
