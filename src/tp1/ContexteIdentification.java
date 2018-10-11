/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author sebastian-andreas.si
 */
public class ContexteIdentification {
    private Personnes personnes;
    private StringProperty loginUtilisateurCOnnecte;
    private StringProperty passwordUtilisateurConnecte;

    public ContexteIdentification(Personnes personnes) {
        this.personnes = personnes;
        loginUtilisateurCOnnecte = new SimpleStringProperty();
        passwordUtilisateurConnecte = new SimpleStringProperty();
    }

    public String getLoginUtilisateurCOnnecte() {
        return loginUtilisateurCOnnecte.getValue();
    }
    public StringProperty loginUtilisateurCOnnecteProperty(){
        return loginUtilisateurCOnnecte;
    }
    public String getPasswordUtilisateurConnecte() {
        return passwordUtilisateurConnecte.getValue();
    }
    public StringProperty passwordUtilisateurConnecteProperty(){
        return passwordUtilisateurConnecte;
    }
    public Personne identification(){
        return personnes.identification(loginUtilisateurCOnnecte.getValue(), passwordUtilisateurConnecte.getValue());
    }
}
