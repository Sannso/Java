/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memoramamvc;

import javax.swing.JLabel;


/**
 *
 * @author Santiago,Camila,Luba,Edison y Esteban
 */
public class Model{
    
    //private View view;
    private int turno = 0;
    
    //public Model(View view){
     //   this.view=view;
    //}
    public void operacionJugador(int e, JLabel j1, JLabel j2){
                if(e == 0){
                    if(turno == 0){
                       int puntosAntes = Integer.parseInt(j1.getText());
                       j1.setText(String.valueOf(puntosAntes+1));
                       turno++;
                      
                   }
                   else if(turno == 1){
                       int puntosAntes = Integer.parseInt( j2.getText());
                       j2.setText(String.valueOf(puntosAntes+1));
                       turno--;
                       
                   }
                }
                else{
                    if(turno == 0){
                       turno++;
                   }
                    
                   else if(turno == 1){
                       turno--;
                   }
                }
            }
    
    
    
}
