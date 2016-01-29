/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tamagotchi.letsdev.ui;

import java.util.*;
import tamagotchi.letsdev.objets.*;

/**
 *
 * @author Nicolas
 */
public class ActionsBoutons {
    
    private Fenetre fen;

    public ActionsBoutons(Fenetre fen) {
        this.fen = fen;
    }
    
    public boolean nourrir() {
        FenInventaire feninv = new FenInventaire(fen.getTamagotchi());
        feninv.setVisible(true);
        List<Item> inventaire = fen.getTamagotchi().getInventaire();
        
        List<Item> miammiam = new ArrayList<>();
        List<Item> boisson = new ArrayList<>();
        for(int i=0;i<inventaire.size();i++)
        {
                if(inventaire.get(i) instanceof MiamMiam && inventaire.get(i).getNbPossede()!=0)
                {
                        miammiam.add(inventaire.get(i));
                }
                if(inventaire.get(i) instanceof Boisson && inventaire.get(i).getNbPossede()!=0)
                {
                        boisson.add(inventaire.get(i));
                }
        }
        /*
        for(Item i: inventaire.keySet()) {
            
            if(i instanceof MiamMiam && inventaire.get(i) != 0) {
                miammiam.add(i);
            } else
            if(i instanceof Boisson && inventaire.get(i) != 0) {
                boisson.add(i);
            }
            
        }*/
        
        feninv.addPanel("MiamMiam", miammiam);
        feninv.addPanel("Boisson", boisson);
        
        
        feninv.setVisible(true);
        return true;
    }
    
}
