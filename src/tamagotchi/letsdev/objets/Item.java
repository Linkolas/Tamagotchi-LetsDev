/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tamagotchi.letsdev.objets;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import java.util.Hashtable;
import tamagotchi.letsdev.objets.Item;

/**
 *
 * @author Nicolas
 */
public abstract class Item implements Serializable {
    private boolean trouvable;
    private int rarete;
    private int id;
    private Time tempsConso;
    private String nom;
    private String image;
    private int nbPossede;
    
    private int gainFaim;
    private int gainSoif;
    private int gainEnnui;
    private int gainFatigue;

        public Item(boolean trouvable, int rarete, int id, Time tempsConso, String nom, String image, int nbPossede, int gainFaim, int gainSoif, int gainEnnui, int gainFatigue)
        {
                this.trouvable = trouvable;
                this.rarete = rarete;
                this.id = id;
                this.tempsConso = tempsConso;
                this.nom = nom;
                this.image = image;
                this.nbPossede = nbPossede;
                this.gainFaim = gainFaim;
                this.gainSoif = gainSoif;
                this.gainEnnui = gainEnnui;
                this.gainFatigue = gainFatigue;
        }
    
  
    
}
