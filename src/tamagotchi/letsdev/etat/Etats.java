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

    public int getFaim()
    {
        return faim;
    }

    public void setFaim(int faim)
    {
        this.faim = faim;
    }

    public int getSoif()
    {
        return soif;
    }

    public void setSoif(int soif)
    {
        this.soif = soif;
    }

    public int getEnnui()
    {
        return ennui;
    }

    public void setEnnui(int ennui)
    {
        this.ennui = ennui;
    }

    public int getFatigue()
    {
        return fatigue;
    }

    public void setFatigue(int fatigue)
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
