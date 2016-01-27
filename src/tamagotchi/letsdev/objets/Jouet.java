/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tamagotchi.letsdev.objets;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author Nicolas
 */
public class Jouet extends Item {

        public Jouet(boolean trouvable, int rarete, int id, Time tempsConso, String nom, String image, int nbPossede, int gainFaim, int gainSoif, int gainEnnui, int gainFatigue)
        {
                super(trouvable, rarete, id, tempsConso, nom, image, nbPossede, gainFaim, gainSoif, gainEnnui, gainFatigue);
        }

    
}
