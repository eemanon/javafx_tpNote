/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import java.util.List;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author sebastian-andreas.si
 */
public class Personne {

    private final StringProperty login = new SimpleStringProperty();
    private final StringProperty password = new SimpleStringProperty();
    private final StringProperty name = new SimpleStringProperty();
    private final StringProperty address1 = new SimpleStringProperty();
    private final StringProperty address2 = new SimpleStringProperty();
    private final StringProperty citypc = new SimpleStringProperty();
    private final StringProperty tel1 = new SimpleStringProperty();
    private final StringProperty tel2 = new SimpleStringProperty();
    private StringProperty eye_color = new SimpleStringProperty("marron");
    private StringProperty hair_color = new SimpleStringProperty("noir");
    private IntegerProperty hair_lenght = new SimpleIntegerProperty(50);
    private ListProperty detail = new SimpleListProperty();

    public Personne(String login, String pw, String name, String address1, String address2, String tel1, String tel2) {
        this.login.set(login);
        this.password.set(pw);
        this.name.set(name);
        this.address1.set(address1);
        this.address2.set(address2);
        this.tel1.set(tel1);
        this.tel2.set(tel2);
    }

    public String getLogin() {
        return login.get();
    }

    public void setLogin(String value) {
        login.set(value);
    }

    public StringProperty loginProperty() {
        return login;
    }

    public String getPassword() {
        return password.get();
    }

    public void setPassword(String value) {
        password.set(value);
    }

    public StringProperty passwordProperty() {
        return password;
    }

    public String getName() {
        return name.get();
    }

    public void setName(String value) {
        name.set(value);
    }

    public StringProperty nameProperty() {
        return name;
    }

    public String getAddress1() {
        return address1.get();
    }

    public void setAddress1(String value) {
        address1.set(value);
    }

    public StringProperty address1Property() {
        return address1;
    }

    public String getAddress2() {
        return address2.get();
    }

    public void setAddress2(String value) {
        address2.set(value);
    }

    private StringProperty address2Property() {
        return address2;
    }

    public String getCitypc() {
        return citypc.get();
    }

    public void setCitypc(String value) {
        citypc.set(value);
    }

    public StringProperty citypcProperty() {
        return citypc;
    }

    public String getTel1() {
        return tel1.get();
    }

    public void setTel1(String value) {
        tel1.set(value);
    }

    public StringProperty tel1Property() {
        return tel1;
    }

    public String getTel2() {
        return tel2.get();
    }

    public void setTel2(String value) {
        tel2.set(value);
    }

    public StringProperty tel2Property() {
        return tel2;
    }


    public StringProperty eyeColorProperty() {
        return eye_color;
    }

    public StringProperty hairColorProperty() {
        return hair_color;
    }

    public IntegerProperty hairLenghtProperty() {
        return hair_lenght;
    }

    public ListProperty detailProperty() {
        return detail;
    }

    public String getEye_color() {
        return eye_color.getValue();
    }

    public String getHair_color() {
        return hair_color.getValue();
    }

    public Integer getHair_lenght() {
        return hair_lenght.getValue();
    }

    public List getDetail() {
        return detail.getValue();
    }

    public void setEye_color(StringProperty eye_color) {
        this.eye_color = eye_color;
    }

    public void setHair_color(StringProperty hair_color) {
        this.hair_color = hair_color;
    }

    public void setHair_lenght(IntegerProperty hair_lenght) {
        this.hair_lenght = hair_lenght;
    }

    public void setDetail(ListProperty detail) {
        this.detail = detail;
    }
}
