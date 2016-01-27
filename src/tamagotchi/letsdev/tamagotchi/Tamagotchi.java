/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tamagotchi.letsdev.tamagotchi;

import java.io.Serializable;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Hashtable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import tamagotchi.letsdev.objets.Item;
import tamagotchi.letsdev.database.Requeteur;
import tamagotchi.letsdev.etat.Etats;

/**
 *
 * @author Nicolas
 */
public class Tamagotchi implements Serializable {
    private Race race;
    private String nom;
    private Date dateNaissance;
    private Date dateMort;
    
    private Etats etat;
    
    private Hashtable<Item, Integer> inventaire;
    
    public void chargerInventaire()
    {
            try
            {
                    //On récupère la liste d'items
                    Requeteur requeteur = new Requeteur();
                    List<Item> listeItems=new ArrayList<Item>();
                    listeItems=requeteur.getItems();
                    
                    //Et on remplit l'inventaire objet par objet
                    for(int i=0;i<listeItems.size();i++)
                    {
                            inventaire.put(listeItems.get(i),0);
                    }
            }
            catch (ClassNotFoundException | SQLException ex)
            {
                    Logger.getLogger(Tamagotchi.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    public void utiliserItem(Item item)
    {
            int nombreActuelPossede=inventaire.get(item);
            if(nombreActuelPossede>0)
            {
                inventaire.replace(item, nombreActuelPossede-1);
                    System.out.println("Coucoucoucoucoucuo");
            }
            else
            {
                    System.out.println("Vous ne pouvez pas utiliser d'objets que vous n'avez pas !");
            }
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
    
    
}
