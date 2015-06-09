package it.digicamere;

import grails.validation.Validateable;

/**
 * Created by giuseppe.longo on 05/06/15.
 */
@Validateable
public class Utente {

    private String nome;

    private String cognome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Utente{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", cognome='").append(cognome).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
