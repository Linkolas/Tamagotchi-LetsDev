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
import tamagotchi.letsdev.global.VariablesGlobales;
import tamagotchi.letsdev.ui.Fenetre;

/**
 *
 * @author Nicolas
 */
public class GestionEtats extends Thread {
    private Etats etat;
    private Fenetre fenetre;

    public GestionEtats(Etats etat, Fenetre fenetre) {
        this.etat = etat;
        this.fenetre = fenetre;
    }
    
    private Date dateActuelle;
    private long dateMilliActuelle;
    private long dateMilliFinOccupation;
    
    private double nivActuelFaim;
    private double nivActuelSoif;
    private double nivActuelEnnui;
    private double nivActuelFatigue;
    
    
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
                int delay = 0; // pas de retard avant le début du compteur
                int period = 1000; // repeat every sec.
                Timer timer = new Timer();
                timer.scheduleAtFixedRate(new TimerTask()
                {
                    int count = 0;
                    @Override
                    public void run()
                    {
                        //Prendre la constante qui définit la perte de points par minute et la diviser par 60
                        //Prendre le nb de points actuel et lui retirer les points chaque seconde
                        nivActuelFaim = etat.getFaim() - ((fenetre.getTamagotchi().getRace().getTauxFaim())/100)*(VariablesGlobales.getPerteFaim()/60);
                        nivActuelSoif = etat.getSoif() - ((fenetre.getTamagotchi().getRace().getTauxSoif())/100)*(VariablesGlobales.getPerteSoif()/60);
                        nivActuelEnnui = etat.getEnnui() - ((fenetre.getTamagotchi().getRace().getTauxEnnui())/100)*(VariablesGlobales.getPerteEnnui()/60);
                        nivActuelFatigue = etat.getFatigue() - ((fenetre.getTamagotchi().getRace().getTauxFatigue())/100)*(VariablesGlobales.getPerteFatigue()/60);
                        
                        //faire le set de la faim/soif...
                        etat.setFaim(nivActuelFaim);
                        etat.setSoif(nivActuelSoif);
                        etat.setEnnui(nivActuelEnnui);
                        etat.setFatigue(nivActuelFatigue);
                        
                        //Mettre à jour les barres d'état
                        fenetre.getjProgressBarFaim().setValue((int)etat.getFaim());
                        fenetre.getjProgressBarSoif().setValue((int)etat.getSoif());
                        fenetre.getjProgressBarEnnui().setValue((int)etat.getEnnui());
                        fenetre.getjProgressBarFatigue().setValue((int)etat.getFatigue());
                    }

                }, delay, period);
                
                
            }
            else
            {
                //Alors le tamagotchi est encore occupé
                //Donc on ne touche pas aux états
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
