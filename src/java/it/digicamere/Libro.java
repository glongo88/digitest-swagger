package it.digicamere;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

/**
 * Created by giuseppe.longo on 08/06/15.
 */
@ApiModel("Libro")
public class Libro {

    @ApiModelProperty(value = "titolo", required = true)
    private String titolo;
    @ApiModelProperty(value = "trama", required = true)
    private String trama;

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getTrama() {
        return trama;
    }

    public void setTrama(String trama) {
        this.trama = trama;
    }
}
