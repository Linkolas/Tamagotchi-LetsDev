/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tamagotchi.letsdev.etat;

/**
 *
 * @author Nicolas
 */
public class GestionEtats extends Thread {
    private Etats etat;

    public GestionEtats(Etats etat) {
        this.etat = etat;
    }
    
    
    /*
    On peut modifier l'état toutes les minutes 
    ou mettre en place un gestionnaire pour ajouter 1 par 1
    http://stackoverflow.com/questions/16748438/java-how-to-increment-an-int-1-every-second-until-it-gets-to-15
    
    Le gestionnaire donnerait un rendu visuel meilleur...
    */
    @Override
    public void run() {
        
        
        
    }
}
