/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tamagotchi.letsdev.tamagotchi;

/**
 *
 * @author Nicolas
 */
public class Race {
    private String nom;
    private String image;
    private int
            tauxFaim,
            tauxSoif,
            tauxEnnui,
            tauxFatigue;

    public Race(String nom, String image, int tauxFaim, int tauxSoif, int tauxEnnui, int tauxFatigue) {
        this.nom = nom;
        this.image = image;
        this.tauxFaim = tauxFaim;
        this.tauxSoif = tauxSoif;
        this.tauxEnnui = tauxEnnui;
        this.tauxFatigue = tauxFatigue;
    }

    public String getNom() {
        return nom;
    }

    public String getImage() {
        return image;
    }

    public int getTauxFaim() {
        return tauxFaim;
    }

    public int getTauxSoif() {
        return tauxSoif;
    }

    public int getTauxEnnui() {
        return tauxEnnui;
    }

    public int getTauxFatigue() {
        return tauxFatigue;
    }
}
