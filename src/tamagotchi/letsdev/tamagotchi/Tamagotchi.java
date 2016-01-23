/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tamagotchi.letsdev.tamagotchi;

import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author Nicolas
 */
public class Tamagotchi implements Serializable {
    private Race race;
    private String nom;
    private Date dateNaissance;
    private Date dateMort;
}
