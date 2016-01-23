/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tamagotchi.letsdev.etat;

import java.io.Serializable;
import java.sql.Date;

/**
 * Stocke la valeur des états.
 * @author Nicolas
 */
public class Etats implements Serializable {
    private int 
            faim, 
            soif, 
            ennui, 
            fatigue;
    private Date date;
    
    private Date dateFinOccupation;
    private String occupation;

    public Etats(int faim, int soif, int ennui, int fatigue, Date date) {
        this.faim = faim;
        this.soif = soif;
        this.ennui = ennui;
        this.fatigue = fatigue;
        this.date = date;
    }
}
