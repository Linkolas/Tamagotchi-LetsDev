/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tamagotchi.letsdev.etat;

import java.sql.Date;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Nicolas
 */
public class GestionEtats extends Thread {
    private Etats etat;

    public GestionEtats(Etats etat) {
        this.etat = etat;
    }
    
    private Date dateActuelle;
    private long dateMilliActuelle;
    private long dateMilliFinOccupation;
    
    
    /*
    On peut modifier l'état toutes les minutes 
    ou mettre en place un gestionnaire pour ajouter 1 par 1
    http://stackoverflow.com/questions/16748438/java-how-to-increment-an-int-1-every-second-until-it-gets-to-15
    
    Le gestionnaire donnerait un rendu visuel meilleur...
    */
    @Override
    public void run() {
        
        while(true)
        {
            //On recupere la date actuelle en ms puis celle de fin d'occupation
            dateActuelle = new java.sql.Date(Calendar.getInstance().getTime().getTime());
            dateMilliActuelle = dateActuelle.getTime();
            dateMilliFinOccupation = new java.sql.Date(etat.getDateFinOccupation().getTime()).getTime();
            
            //On teste la fin d'occupation
            if(dateMilliActuelle > dateMilliFinOccupation)
            {
                //Alors on a fini la dernière occupation
                int delay = 10000; // delay for 5 sec.
                int period = 1000; // repeat every sec.
                Timer timer = new Timer();
                timer.scheduleAtFixedRate(new TimerTask()
                {
                    int count = 0;
                    @Override
                    public void run()
                    {
                       // Your code
                        count++;
                        System.out.println(count);



                    }

                }, delay, period);
                
                
            }
            else
            {
                //Alors on est encore occupé
                
                
                
            }
            
        }
        
        
    }
    
    public static void main(String[] args)
    {
        /*long dateMilli1;
        long dateMilli2;
        Date dateActuelle;
        dateActuelle = new java.sql.Date(Calendar.getInstance().getTime().getTime());
        dateMilli1=dateActuelle.getTime();
        for(int i=0;i<999999999;i++)
        {
            for(int j=0;j<999999999;j++)
            {
               
            }
        }
        Date date2;
        date2=new java.sql.Date(Calendar.getInstance().getTime().getTime());
        dateMilli2=date2.getTime();
        System.out.println(dateActuelle.toString());
        System.out.println(dateMilli1-dateMilli2);*/
        
        //----------------------------------------------------------
        
        /*int delay = 10000; // delay for 5 sec.
        int period = 1000; // repeat every sec.
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask()
        {
            int count = 0;
            @Override
            public void run()
            {
               // Your code
                count++;
                System.out.println(count);
                


            }
            
        }, delay, period);*/
    }
}
