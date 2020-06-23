/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memoramamvc;

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
 * @author Santiago,Camila,Luba,Edison y Esteban
 */
public class View {
    
    protected Menu viewMenu; 
    protected Juego viewJuego;
    
    public View(){
        viewMenu = new Menu();
    }
    
    public void instanciaJuego(int i, Menu mn){
        viewJuego = new Juego(i, mn);
    }
    
    public class Menu extends JFrame{
        public JPanel menu;
        public JButton buttonNivel1;
        public JButton buttonNivel2;
        public JButton buttonNivel3;
    
        Color cmenu= new Color(0,255,255);
        
        public Menu(){
            this.setResizable(false);
            this.setSize(1010,610);
            creacionPanel();    
            crear_niveles();
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);//cierre de ventanas
            this.setTitle("MEMORAMA");//titulo de la ventana
            
            this.setVisible(true);
        }
        
        public void creacionPanel(){
            menu=new JPanel();
            menu.setLayout(null);
            menu.setBackground(cmenu);
            this.getContentPane().add(menu);
        }
        
        public void crear_niveles(){
            ImageIcon Imageboton1=new ImageIcon("level1.png");
            buttonNivel1=new JButton(Imageboton1);
            buttonNivel1.setName("nivel1");
            buttonNivel1.setBounds(305,100,400,100);
            menu.add(buttonNivel1);

            ImageIcon Imageboton2=new ImageIcon("level2.png");
            buttonNivel2=new JButton(Imageboton2);
            buttonNivel2.setName("nivel2");
            buttonNivel2.setBounds(305,250,400,100);
            menu.add(buttonNivel2);

            ImageIcon Imageboton3=new ImageIcon("level3.png");
            buttonNivel3=new JButton(Imageboton3);
            buttonNivel3.setName("nivel3");
            buttonNivel3.setBounds(305,410,400,100);
            menu.add(buttonNivel3);
        }
        
    }
    
    
    public class Juego extends JFrame{

        // Entero que designa el nivel
        private final int numV;

        //Puntos de cada jugador
        protected JLabel puntosJugador1;
        protected JLabel puntosJugador2;

        //Numero de cartas en el juego
        private int numeroDeCartas;

        //Turno para jugar (Jugador1 = 0 / Jugador2 = 1)
        protected int turno = 0;

        public Menu menuStop;

        protected JPanel panel_Ventana;
        
        // -------------------------------------------------------------------
        // Variables que estaban en el panel pero se tuvieron que pasar por
        // el controlador
        protected JButton[] arrayButtons;
        protected ImageIcon[] arrayImagenes;
        protected ImageIcon newImagen;
        protected int sum=0;
        protected ArrayList<JButton> Lbotones=new ArrayList<>();
        
        
        
        protected JButton Articuno1;
        protected JButton Articuno2;
        protected JButton Mega1;
        protected JButton Mega2;
        protected JButton Mewtwo1;
        protected JButton Mewtwo2;
        protected JButton Zapdos1;
        protected JButton Zapdos2;
        protected JButton Charmander1;
        protected JButton Charmander2; 
        protected JButton Squi1;  
        protected JButton Squi2;  
        protected JButton Bulba1;  
        protected JButton Bulba2;  
        protected JButton Eve1;  
        protected JButton Eve2;  
        protected JButton magic1;  
        protected JButton magic2;  
        protected JButton Pidgeot1;  
        protected JButton Pidgeot2;  
        protected JButton Arbok1;  
        protected JButton Arbok2;  
        protected JButton Snorlax1;  
        protected JButton Snorlax2;  
        protected JButton Rosadita1;  
        protected JButton Rosadita2;  
        protected JButton Riachu1;  
        protected JButton Riachu2;  
        protected JButton Mew1;  
        protected JButton Mew2;  
        protected JButton Kakuna1;  
        protected JButton Kakuna2; 
        protected JButton reanudar;
        protected JButton pausa;
        protected JButton inicio;
        protected JButton reiniciar;
        protected JButton jugador1;
        protected JButton jugador2;
        
        
        
        protected ImageIcon ImageFondo=new ImageIcon("fondo.jpg");
        // -------------------------------------------------------------------

        public Juego(int numV, Menu menu){
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
            
            this.setVisible(true);
        }

        public class Panel_ventana extends JPanel{

            Color cool= new Color(102,0,0);

            
            ArrayList<Integer> posiciones= new ArrayList<>();
            ImageIcon ImageA=new ImageIcon("articuno.png");
            ImageIcon ImageM=new ImageIcon("mega.jpg");
            ImageIcon ImageZ=new ImageIcon("zapdos.jpg");
            ImageIcon ImageMe=new ImageIcon("mewtwo.jpg");
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

                        this.setLayout(new GridLayout(filas, cols, 10, 10)); // Filas, Columnas, Padx, Pady
                        this.setBackground(cool);

                        arrayButtons = new JButton[numeroDeCartas]; // Almaceno aqui los botones aleatoriamente
                        arrayImagenes = new ImageIcon[numeroDeCartas];
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
                        arrayImagenes = new ImageIcon[numeroDeCartas];
                        this.setLayout(new GridLayout(filas, cols, 10, 10));
                        this.setBackground(cool);

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
                        this.setLayout(new GridLayout(filas, cols, 10, 10));
                        this.setBackground(cool);
                        arrayButtons = new JButton[numeroDeCartas];
                        arrayImagenes = new ImageIcon[numeroDeCartas];
                        
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
                 
                newImagen = new ImageIcon(imagen.getImage().getScaledInstance(widthBoton,
                                                                                        340,
                                                                                       java.awt.Image.SCALE_DEFAULT));
                // ---------------------------------------------------------
                
                //addListeners(boton);

                System.out.println("Tamaño array: " + arrayButtons.length);
                System.out.println("Posicion: " + posiciones.get(x));

                arrayButtons[posiciones.get(x)] = boton;
                arrayImagenes[posiciones.get(x)] =newImagen;
                
                posiciones.remove(x);

            }
            
        }
        
            
        protected void verificadorDePartida(){
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
            public Juego menu;
            public Menu cerrarMenu;


            public Menu_Pausa(Juego menu, Menu cerrarMenu2){


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
    
}
