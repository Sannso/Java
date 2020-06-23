/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_de_clase.PatronSingleton;

import com.sun.org.apache.xpath.internal.axes.SelfIteratorNoPredicate;
import java.util.Calendar;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Santiago
 */
public class Reloj {
    private static Reloj reloj;
    private int seg, min, hora;
    private Calendar calendario;
    
    private Reloj(){
        seg = 0;
    }
    
    public static Reloj getInstance(){
        if(reloj == null){
            reloj = new Reloj();
        }
        return reloj;
    }
    
    private String getHora(){
        calendario = Calendar.getInstance();
        seg = calendario.get(Calendar.SECOND);
        min = calendario.get(Calendar.MINUTE);
        hora = calendario.get(Calendar.HOUR);
        return String.valueOf(hora)+ ":" + String.valueOf(min)+ ":"  + String.valueOf(seg);
    }
    
    
    public void getTime(){
        ScheduledExecutorService scheduler
                = Executors.newSingleThreadScheduledExecutor();
        
        Runnable task = () -> {
            System.out.println(getHora());
            if(seg == 50){
                scheduler.shutdown();
            }
        };
        
        int initialDelay = 1;
        int periodicDelay = 1;
        scheduler.scheduleAtFixedRate(task, initialDelay, periodicDelay,
                TimeUnit.SECONDS);
        
    }
    
}
