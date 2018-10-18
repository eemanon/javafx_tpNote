/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import java.util.List;
import javafx.collections.FXCollections;

/**
 *
 * @author sebastian-andreas.si
 */
class Personnes {
    private final List<Personne> list;
    
    public Personnes(List<Personne> list){
        this.list = list;
    }
    public Personnes(){
        this.list = FXCollections.observableArrayList();
        this.list.add(new Personne("naruto", "konoa", "Naruto UZUMAKI", "Chez naruto", "", "123456789", "987654321"));
        this.list.add(new Personne("luffy", "niku", "Monkey D. Luffy", "Sunny Go", "", "147258369", "963852741"));
        this.list.add(new Personne("admin", "admin", "Jonathan FERNANDO-JOHNSON", "Chez moi", "", "1593574862", "9517532684"));

    }
    
    public Personne identification(String login, String pw){
        for (Personne p:list){
            if (p.getLogin().equals(login) && p.getPassword().equals(pw))
                return p;
        }
        return null;
    }
    
    public List<Personne> getListe(){
        return list;
    }
}
