/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tamagotchi.letsdev.database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import tamagotchi.letsdev.objets.Boisson;
import tamagotchi.letsdev.objets.Item;
import tamagotchi.letsdev.objets.Jouet;
import tamagotchi.letsdev.objets.MiamMiam;
import tamagotchi.letsdev.tamagotchi.Race;

/**
 *
 * @author Nicolas
 */
public class Requeteur {
    
    private Connection conn;
    
    public Requeteur() throws ClassNotFoundException, SQLException {
        connect();
    }
    
    public final void connect() throws ClassNotFoundException, SQLException {
        String driverClass = "org.apache.derby.jdbc.ClientDriver";
        String urlDatabase = "jdbc:derby://localhost:1527/tamagotchi";
        String user = "root";
        String pwd = "root";
        Class.forName(driverClass);
        conn = DriverManager.getConnection(urlDatabase, user, pwd);
    }
    
    public List<Race> getRaces() throws SQLException {
        // Etablissement de la requête
        String requete =    "SELECT * FROM races";
        PreparedStatement pstmt = conn.prepareStatement(requete);
        ResultSet res = pstmt.executeQuery();
        
        // Traitement du résultat
        List<Race> li = new ArrayList<>();
        while(res.next()) {
            int id = res.getInt("id");
            String nom = res.getString("nom");
            String image = res.getString("image");
            int tauxFaim = res.getInt("tauxFaim");
            int tauxSoif = res.getInt("tauxSoif");
            int tauxEnnui = res.getInt("tauxEnnui");
            int tauxFatigue = res.getInt("tauxFatigue");
            
            li.add(new Race(id, nom, image, tauxFaim, tauxSoif, tauxEnnui, tauxFatigue));
        }
        
        // Fermeture de la requête
        res.close();
        pstmt.close();
        
        return li;
    }
    
    public List<Item> getItems() throws SQLException {
        // Etablissement de la requête
        String requete =    "SELECT * FROM items";
        PreparedStatement pstmt = conn.prepareStatement(requete);
        ResultSet res = pstmt.executeQuery();
        
        // Traitement du résultat
        List<Item> li = new ArrayList<>();
        while(res.next()) {
            int id = res.getInt("id");
            String nom = res.getString("nom");
            String image = res.getString("image");
            int type = res.getInt("type");
            
            boolean trouvable = res.getBoolean("trouvable");
            int rarete = res.getInt("rarete");
            Time tempsConso = res.getTime("tempsConso");
            
            int gainFaim = res.getInt("gainFaim");
            int gainSoif = res.getInt("gainSoif");
            int gainEnnui = res.getInt("gainEnnui");
            int gainFatigue = res.getInt("gainFatigue");
            
            Item item;
            switch(type) {
                case 1:
                    item = new MiamMiam(trouvable, rarete, id, tempsConso, nom, image, 0, gainFaim, gainSoif, gainEnnui, gainFatigue);
                    break;
                case 2:
                    item = new Boisson(trouvable, rarete, id, tempsConso, nom, image, 0, gainFaim, gainSoif, gainEnnui, gainFatigue);
                    break;
                case 3:
                default:
                    item = new Jouet(trouvable, rarete, id, tempsConso, nom, image, 0, gainFaim, gainSoif, gainEnnui, gainFatigue);
                    break;
            }
            
            // TODO : COMPLETER L'OBJET
            // setTempsConso() ....
            // ...
            // ...
            
            li.add(item);
        }
        
        // Fermeture de la requête
        res.close();
        pstmt.close();
        
        return li;
    }
}
