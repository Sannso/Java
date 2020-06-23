/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memoramapd;

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
public class Juego extends JFrame{
    
    // Entero que designa el nivel
    private final int numV;
    
    //Puntos de cada jugador
    private JLabel puntosJugador1;
    private JLabel puntosJugador2;
    
    //Numero de cartas en el juego
    private int numeroDeCartas;
    
    //Turno para jugar (Jugador1 = 0 / Jugador2 = 1)
    private int turno = 0;
    
    public Menu menuStop;
    
    private JPanel panel_Ventana;
    
    
    public Juego(int numV,Menu menu){
        this.setSize(1010, 610);
        this.setTitle("Nivel " + numV);
        this.setLocationRelativeTo(null);
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
        
        
        Color cool= new Color(21,67,96);
        
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
            
            Carta Articuno1 = new Carta("Articuno", ImageA);
            Carta Articuno2 = (Carta) Articuno1.clonar();
           
            
            System.out.println(Articuno1.equals(Articuno2));
            
           
            Carta Mega1 = new Carta("Mega", ImageM);
            Carta Mega2 = (Carta) Mega1.clonar();
            
            Carta Zapdos1 = new Carta("Zapdos", ImageZ);
            Carta Zapdos2 = (Carta) Zapdos1.clonar();
            
            Carta Mewtwo1 = new Carta("MewTwo", ImageMe);
            Carta Mewtwo2 = (Carta) Mewtwo1.clonar();
            
            Carta Charmander1 = new Carta("Charmander", ImageC);
            Carta Charmander2 = (Carta) Charmander1.clonar();
            
            Carta Squi1 = new Carta("Squi", ImageS);
            Carta Squi2 = (Carta) Squi1.clonar();
            
            Carta Bulba1 = new Carta("Bulba", ImageB);
            Carta Bulba2 = (Carta) Bulba1.clonar();
            
            Carta Eve1 = new Carta("Eve", ImageE);
            Carta Eve2 = (Carta) Eve1.clonar();
            
            Carta magic1 = new Carta("Magic", ImageMAGIC);
            Carta magic2 = (Carta) magic1.clonar();
            
            Carta Pidgeot1 = new Carta("Pidgeot", ImagePIDGEOT);
            Carta Pidgeot2 = (Carta) Pidgeot1.clonar();
            
            Carta Arbok1 = new Carta("Arbok", ImageARBOK);
            Carta Arbok2 = (Carta) Arbok1.clonar();
            
            Carta Snorlax1 = new Carta("Snorlax", ImageSNORLAX);
            Carta Snorlax2 = (Carta) Snorlax1.clonar();
            
            Carta Rosadita1 = new Carta("Rosadita", ImageROSA);
            Carta Rosadita2 = (Carta) Rosadita1.clonar();
            
            Carta Riachu1 = new Carta("Riachu", ImageRIACHU);
            Carta Riachu2 = (Carta) Riachu1.clonar();
            
            Carta Mew1 = new Carta("Mew", ImageMEW);
            Carta Mew2 = (Carta) Mew1.clonar();
            
            Carta Kakuna1 = new Carta("Kakuna", ImageKAKUNA);
            Carta Kakuna2 = (Carta) Kakuna1.clonar();
            
           
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
                    crearContenidoBoton(Articuno1);
                    crearContenidoBoton(Articuno2);
                    crearContenidoBoton(Mega1);
                    crearContenidoBoton(Mega2);
                    crearContenidoBoton(Zapdos1);
                    crearContenidoBoton(Zapdos2);
                    crearContenidoBoton(Mewtwo1);
                    crearContenidoBoton(Mewtwo2);
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
                    
                    crearContenidoBoton(Articuno1);
                    crearContenidoBoton(Articuno2);
                    crearContenidoBoton(Mega1);
                    crearContenidoBoton(Mega2);
                    crearContenidoBoton(Zapdos1);
                    crearContenidoBoton(Zapdos2);
                    crearContenidoBoton(Mewtwo1);
                    crearContenidoBoton(Mewtwo2);
                    crearContenidoBoton(Charmander1);
                    crearContenidoBoton(Charmander2);
                    crearContenidoBoton(Squi1);
                    crearContenidoBoton(Squi2);
                    crearContenidoBoton(Bulba1);
                    crearContenidoBoton(Bulba2);
                    crearContenidoBoton(Eve1);
                    crearContenidoBoton(Eve2);
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
                    
                    crearContenidoBoton(Articuno1);
                    crearContenidoBoton(Articuno2);
                    crearContenidoBoton(Mega1);
                    crearContenidoBoton(Mega2);
                    crearContenidoBoton(Zapdos1);
                    crearContenidoBoton(Zapdos2);
                    crearContenidoBoton(Mewtwo1);
                    crearContenidoBoton(Mewtwo2);
                    crearContenidoBoton(Charmander1);
                    crearContenidoBoton(Charmander2);
                    crearContenidoBoton(Squi1);
                    crearContenidoBoton(Squi2);
                    crearContenidoBoton(Bulba1);
                    crearContenidoBoton(Bulba2);
                    crearContenidoBoton(Eve1);
                    crearContenidoBoton(Eve2);
                    crearContenidoBoton(Arbok1);
                    crearContenidoBoton(Arbok2);
                    crearContenidoBoton(magic1);
                    crearContenidoBoton(magic2);
                    crearContenidoBoton(Pidgeot1);
                    crearContenidoBoton(Pidgeot2);
                    crearContenidoBoton(Snorlax1);
                    crearContenidoBoton(Snorlax2);
                    crearContenidoBoton(Rosadita1);
                    crearContenidoBoton(Rosadita2);
                    crearContenidoBoton(Riachu1);
                    crearContenidoBoton(Riachu2);
                    crearContenidoBoton(Mew1);
                    crearContenidoBoton(Mew2);
                    crearContenidoBoton(Kakuna1);
                    crearContenidoBoton(Kakuna2);
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
        private void crearContenidoBoton(Carta boton){
            
            Random rand= new Random();
            int x = rand.nextInt(posiciones.size());
           
            /*
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
            
            //addListeners(boton, newImagen);
            */
            addListeners(boton);
            
            System.out.println("Tamaño array: " + arrayButtons.length);
            System.out.println("Posicion: " + posiciones.get(x));
            
            arrayButtons[posiciones.get(x)] = boton;
            
            posiciones.remove(x);
            
        }
        
        // -------------------------- Funcion listeners -------------------------------------
        private void addListeners(Carta boton){
                boton.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent me) {
                    // Codigo
                }

                @Override
                public void mousePressed(MouseEvent me) {
                    
                    boton.setImageFront();
                    if(sum == 1 && boton != Lbotones.get(0) && boton.isEnabled()){
                        sum=sum+1;
                        Lbotones.add(boton);
                    }
                    else if(sum == 0 && boton.isEnabled()){
                        sum=sum+1;
                        Lbotones.add(boton);
                    }
                    
                }

                @Override
                public void mouseReleased(MouseEvent me) {
                    if(sum==2){
                         String cad1=   Lbotones.get(0).getName();
                         String cad2=   Lbotones.get(1).getName();
                         
                         if(cad1.equals(cad2)){
                                
                            Lbotones.get(0).setEnabled(false);
                            Lbotones.get(1).setEnabled(false);
                            
                            operacionJugador(0);
                            sum=0;
                            Lbotones.removeAll(Lbotones);
                            
                        }else{
                            sum=0;
                            
                            Lbotones.get(0).setIcon(ImageFondo);
                            Lbotones.get(1).setIcon(ImageFondo);
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
            setLayout(new GridLayout(2, 5)); // Es una "Matriz" para poner 
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
