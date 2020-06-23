/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_de_clase.PatronIterator;

/**
 *
 * @author Santiago
 */
public class DataBase {
    public String[] _datos;

    public DataBase(int valores){ 
        _datos = new String[valores];
        for (int i = 0; i < _datos.length; i++){
            _datos[i] = String.valueOf(i); 
        }
    }

    public DataBase(String[] valores){ 
        _datos = valores;
    }
    
    public String getValor(int pos){ 
        return _datos[pos]; 
    }

    public void setValor(int pos, String valor){ 
        _datos[pos] = valor; 
    }

    public int dimension(){ 
        return _datos.length; 
    }
    
    public IteradorVector iterador(){
        return new IteradorVector(this); 
    }
}
