package org.andestech.learning.rfb18;

/**
 * Created by Евгений on 20.08.2018.
 */
public class User {

    private String fio;

    User(String fio){
        this.setFio(fio);
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }
}
