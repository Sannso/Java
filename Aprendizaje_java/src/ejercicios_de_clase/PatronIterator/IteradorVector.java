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
public class IteradorVector {
    
    private String[] _vector;
    private int _posicion;
 	
    public IteradorVector(DataBase vector) {
        _vector = vector._datos;
        _posicion = 0;
    }
 	 	
    public boolean hasNext(){
        if (_posicion < _vector.length) 
		 return true;
	 else
		 return false;
    }

    public Object next(){
	 String valor = _vector[_posicion];
	 _posicion++;
	 return valor;
    }
}
