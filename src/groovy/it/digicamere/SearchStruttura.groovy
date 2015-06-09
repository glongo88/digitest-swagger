package it.digicamere

import com.wordnik.swagger.annotations.ApiModel
import grails.validation.Validateable

/**
 * Created by giuseppe.longo on 08/06/15.
 */
@Validateable
//@ApiModel(value="SearchStruttura", description="Strutture uffici cciaa")
class SearchStruttura {

    Integer offset = 0

    Integer limit

    Integer max = 10

    String codiceAzienda

    List<Integer> ordine = []

    String sort

    String sortOrder

    String getSort(){
        return sort ?:"descrizione"
    }

    String getSortOrder(){
        return sortOrder ?: "asc"
    }

    Integer getLimit(){
        limit  = Math.min(limit ?: 10, 100)
        return limit
    }

    static constraints = {
        codiceAzienda nullable : false
    }

}
