/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tamagotchi.letsdev.objets;

import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author Nicolas
 */
public abstract class Item implements Serializable {
    private boolean trouvable;
    private int rarete;
    private int id;
    private Date tempsConso;
    private String nom;
    private String image;
    private int nbPossede;
    
    private int 
            gainFaim, 
            gainSoif,
            gainEnnui,
            gainFatigue;

    public Item(int id, String nom, String image) {
        this.id = id;
        this.nom = nom;
        this.image = image;
    }
    
    
}
