/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author sebastian-andreas.si
 */
public class ContexteAvatar {

    private Personne personne;

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }

    public ContexteAvatar(Personne p) {
        this.personne = p;
    }

    private StringProperty eye_color;
    private StringProperty hair_color;
    private IntegerProperty hair_lenght;
    private StringProperty detail;

    public StringProperty getHair_color() {
        return hair_color;
    }

    public IntegerProperty getHair_lenght() {
        return hair_lenght;
    }

    public StringProperty getDetail() {
        return detail;
    }

    public StringProperty getEye_color() {
        return eye_color;
    }

}
