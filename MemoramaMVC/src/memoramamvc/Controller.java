/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memoramamvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Santiago,Camila,Luba,Edison y Esteban
 */
public class Controller implements ActionListener{
    
    private View view;
    private Model model;
    private Object boton;
    
    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
        actionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()== view.viewMenu.buttonNivel1){
            view.viewMenu.setVisible(false);
            view.instanciaJuego(1, view.viewMenu);
            addListenersJuego();
            
        }if(ae.getSource()== view.viewMenu.buttonNivel2){
            view.viewMenu.setVisible(false);
            view.instanciaJuego(2, view.viewMenu);
            addListenersJuego();
        
        }if(ae.getSource()== view.viewMenu.buttonNivel3){
            view.viewMenu.setVisible(false);
            view.instanciaJuego(3, view.viewMenu);
            addListenersJuego();
        }
    }
    
    public void actionListener(ActionListener listener){
        view.viewMenu.buttonNivel1.addActionListener(listener);
        view.viewMenu.buttonNivel2.addActionListener(listener);
        view.viewMenu.buttonNivel3.addActionListener(listener);
    }
    
     public void addListenersJuego(){
       for(JButton boton : view.viewJuego.arrayButtons){
            ImageIcon ImageFondo = view.viewJuego.ImageFondo;
            
            boton.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent me) {
                        // Codigo
                    }

                    @Override // EN EL IF ESTA LA ASIGNACION DE LA IMAGEN HAY QUE ARREGLARLOO
                    public void mousePressed(MouseEvent me) {
                      int cont=0;
                      for (JButton b : view.viewJuego.arrayButtons){
                       
                        if(me.getComponent().getName().equals(b.getName())){
                            boton.setIcon(view.viewJuego.arrayImagenes[cont]);
                        }
                        cont++;
                      }
                      cont=0;
                        //if(view.viewJuego.arrayImagenes.length > w){
                          //  boton.setIcon(view.viewJuego.arrayImagenes[w]);
                        //
                        //w+//+;
                        view.viewJuego.sum = 1 + view.viewJuego.sum;
                        view.viewJuego.Lbotones.add(boton);
                    }

                    @Override
                    public void mouseReleased(MouseEvent me) {
                        if(view.viewJuego.sum==2){

                             String cad1= view.viewJuego.Lbotones.get(0).getName();
                             String cad2= view.viewJuego.Lbotones.get(1).getName();

                             if(cad1.equals(cad2)&&(view.viewJuego.Lbotones.get(0)!=view.viewJuego.Lbotones.get(1))){
                                     System.out.println("son iguales");
                                if(cad1.equals("Articuno")){
                                    view.viewJuego.Articuno1.setEnabled(false);
                                    view.viewJuego.Articuno2.setEnabled(false);
                                     System.out.println("son ");
                                }if(cad1.equals("Mega")){   
                                    view.viewJuego.Mega1.setEnabled(false);
                                    view.viewJuego.Mega2.setEnabled(false);
                                     System.out.println("son ");
                                }if(cad1.equals("Mewtwo")){   
                                    view.viewJuego.Mewtwo1.setEnabled(false);
                                    view.viewJuego.Mewtwo2.setEnabled(false);
                                     System.out.println("son ");
                                }if(cad1.equals("Zapdos")){   
                                    view.viewJuego.Zapdos1.setEnabled(false);
                                    view.viewJuego.Zapdos2.setEnabled(false);
                                }if(cad1.equals("Bulba")){   
                                    view.viewJuego.Bulba1.setEnabled(false);
                                    view.viewJuego.Bulba2.setEnabled(false);
                                }
                                if(cad1.equals("Charmander")){   
                                    view.viewJuego.Charmander1.setEnabled(false);
                                    view.viewJuego.Charmander2.setEnabled(false);
                                }if(cad1.equals("Squi")){   
                                    view.viewJuego.Squi1.setEnabled(false);
                                    view.viewJuego.Squi2.setEnabled(false);
                                }if(cad1.equals("Eve")){   
                                    view.viewJuego.Eve1.setEnabled(false);
                                    view.viewJuego.Eve2.setEnabled(false);
                                }if(cad1.equals("Arbok")){   
                                    view.viewJuego.Arbok1.setEnabled(false);
                                    view.viewJuego.Arbok2.setEnabled(false);
                                }if(cad1.equals("Magic")){   
                                    view.viewJuego.magic1.setEnabled(false);
                                    view.viewJuego.magic2.setEnabled(false);
                                }if(cad1.equals("Pidgeot")){   
                                    view.viewJuego.Pidgeot1.setEnabled(false);
                                    view.viewJuego.Pidgeot2.setEnabled(false);
                                }if(cad1.equals("Snorlax")){   
                                    view.viewJuego.Snorlax1.setEnabled(false);
                                    view.viewJuego.Snorlax2.setEnabled(false);
                                }if(cad1.equals("Rosadita")){   
                                    view.viewJuego.Rosadita1.setEnabled(false);
                                    view.viewJuego.Rosadita2.setEnabled(false);
                                }if(cad1.equals("Riachu")){   
                                    view.viewJuego.Riachu1.setEnabled(false);
                                    view.viewJuego.Riachu2.setEnabled(false);
                                }if(cad1.equals("Mew")){   
                                    view.viewJuego.Mew1.setEnabled(false);
                                    view.viewJuego.Mew2.setEnabled(false);
                                }if(cad1.equals("Kakuna")){   
                                    view.viewJuego.Kakuna1.setEnabled(false);
                                    view.viewJuego.Kakuna2.setEnabled(false);
                                }
                                
                                        
                                model.operacionJugador(0, view.viewJuego.puntosJugador1, view.viewJuego.puntosJugador2);
                                view.viewJuego.panel_Ventana.repaint();
                                
                                
                                view.viewJuego.sum=0;
                                view.viewJuego.Lbotones.removeAll(view.viewJuego.Lbotones);


                            }else{
                                view.viewJuego.sum=0;
                                System.out.println("antes");
                                System.out.println("despues ");
                                view.viewJuego.Articuno1.setIcon(ImageFondo);
                                view.viewJuego.Articuno2.setIcon(ImageFondo);
                                view.viewJuego.Mega1.setIcon(ImageFondo);
                                view.viewJuego.Mega2.setIcon(ImageFondo);
                                view.viewJuego.Zapdos1.setIcon(ImageFondo);
                                view.viewJuego.Zapdos2.setIcon(ImageFondo);
                                view.viewJuego.Mewtwo1.setIcon(ImageFondo);
                                view.viewJuego.Mewtwo2.setIcon(ImageFondo);
                                view.viewJuego.Bulba1.setIcon(ImageFondo);
                                view.viewJuego.Bulba2.setIcon(ImageFondo);
                                view.viewJuego.Charmander1.setIcon(ImageFondo);
                                view.viewJuego.Charmander2.setIcon(ImageFondo);
                                view.viewJuego.Squi1.setIcon(ImageFondo);
                                view.viewJuego.Squi2.setIcon(ImageFondo);
                                view.viewJuego.Eve1.setIcon(ImageFondo);
                                view.viewJuego.Eve2.setIcon(ImageFondo);
                                view.viewJuego.Arbok1.setIcon(ImageFondo);
                                view.viewJuego.Arbok2.setIcon(ImageFondo);
                                view.viewJuego.magic1.setIcon(ImageFondo);
                                view.viewJuego.magic2.setIcon(ImageFondo);
                                view.viewJuego.Rosadita1.setIcon(ImageFondo);
                                view.viewJuego.Rosadita2.setIcon(ImageFondo);
                                view.viewJuego.Pidgeot1.setIcon(ImageFondo);
                                view.viewJuego.Pidgeot2.setIcon(ImageFondo);
                                view.viewJuego.Snorlax1.setIcon(ImageFondo);
                                view.viewJuego.Snorlax2.setIcon(ImageFondo);
                                view.viewJuego.Mew1.setIcon(ImageFondo);
                                view.viewJuego.Mew2.setIcon(ImageFondo);
                                view.viewJuego.Riachu1.setIcon(ImageFondo);
                                view.viewJuego.Riachu2.setIcon(ImageFondo);
                                view.viewJuego.Kakuna1.setIcon(ImageFondo);
                                view.viewJuego.Kakuna2.setIcon(ImageFondo);


                                view.viewJuego.Lbotones.removeAll(view.viewJuego.Lbotones);

                                model.operacionJugador(1, view.viewJuego.puntosJugador1, view.viewJuego.puntosJugador2);
                                view.viewJuego.panel_Ventana.repaint();
                            }
                             view.viewJuego.verificadorDePartida();
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
     }
    
    
    
}
