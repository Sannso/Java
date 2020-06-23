/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_de_clase.PatronFacade;

/**
 *
 * @author Santiago
 */
public class Credito {
    private boolean goodCreditHistory;
    
    public Credito(){
        goodCreditHistory = true;
    }
    
    public boolean getGoodCreditHist(){
        return goodCreditHistory;
    }
    
    public void setGoodCreditHist(boolean hc){
        this.goodCreditHistory = hc;
    }
}
