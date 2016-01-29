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
    private double 
            faim, 
            soif, 
            ennui, 
            fatigue;
    private Date date;
    
    private Date dateFinOccupation;
    private String occupation;

    public Etats(double faim, double soif, double ennui, double fatigue, Date date) {
        this.faim = faim;
        this.soif = soif;
        this.ennui = ennui;
        this.fatigue = fatigue;
        this.date = date;
    }

    

    public double getFaim()
    {
        return faim;
    }

    public void setFaim(double faim)
    {
        this.faim = faim;
    }

    public double getSoif()
    {
        return soif;
    }

    public void setSoif(double soif)
    {
        this.soif = soif;
    }

    public double getEnnui()
    {
        return ennui;
    }

    public void setEnnui(double ennui)
    {
        this.ennui = ennui;
    }

    public double getFatigue()
    {
        return fatigue;
    }

    public void setFatigue(double fatigue)
    {
        this.fatigue = fatigue;
    }

    public Date getDate()
    {
        return date;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }

    public Date getDateFinOccupation()
    {
        return dateFinOccupation;
    }

    public void setDateFinOccupation(Date dateFinOccupation)
    {
        this.dateFinOccupation = dateFinOccupation;
    }

    public String getOccupation()
    {
        return occupation;
    }

    public void setOccupation(String occupation)
    {
        this.occupation = occupation;
    }
    
    
}
