/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tamagotchi.letsdev.tamagotchi;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author Nicolas
 */
public class Tamagotchi implements Serializable {
    private Race race;
    private String nom;
    private Date dateNaissance;
    private Date dateMort;
    private int amitie;

    public Tamagotchi(List<Race> races) {
        
        dateNaissance = new Date(new java.util.Date().getTime());
        
        int size = races.size();
        int rand = (int) (Math.random() * size);
        race = races.get(rand);
        
        amitie = 0;
        
    }

    public Tamagotchi(Race race, String nom, Date dateNaissance) {
        this.race = race;
        this.nom = nom;
        this.dateNaissance = dateNaissance;
        
        amitie = 0;
    }
    
    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public Date getDateMort() {
        return dateMort;
    }

    public void setDateMort(Date dateMort) {
        this.dateMort = dateMort;
    }

    public int getAmitie() {
        return amitie;
    }

    public void setAmitie(int amitie) {
        this.amitie = amitie;
    }
}
