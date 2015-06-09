package it.digicamere

import com.wordnik.swagger.annotations.ApiModel
import com.wordnik.swagger.annotations.ApiModelProperty;
import grails.validation.Validateable;

@Validateable
@ApiModel(value="Autore", description="Sample model for the documentation")
public class Autore {

    @ApiModelProperty(value = "Nome")
    String nome
    @ApiModelProperty(value = "Cognome")
    String cognome
    @ApiModelProperty(value = "Lista bla bla bla bla bla 2")
    List<String> ordine = []

    static constraints = {
        nome nullable: false, blank: false
        cognome nullable: false, blank: false
        ordine nullable: true
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Autore{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", cognome='").append(cognome).append('\'');
        sb.append(", ordine=").append(ordine);
        sb.append('}');
        return sb.toString();
    }
}