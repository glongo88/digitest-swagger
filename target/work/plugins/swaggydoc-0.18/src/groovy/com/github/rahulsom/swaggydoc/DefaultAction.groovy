package com.github.rahulsom.swaggydoc

import groovy.transform.Canonical
import groovy.transform.CompileStatic
import groovy.transform.ToString
import groovy.transform.TupleConstructor

/**
 * Represents a default action from grails conventions
 *
 * @author Rahul
 */
@ToString(includePackage = false)
@CompileStatic
class DefaultAction {
    Class swaggyAnnotation
    String responseType
    ArrayList<Parameter> parameters
    ArrayList<ResponseMessage> responseMessages
    boolean isList = false

    DefaultAction(Class swaggyAnnotation, String responseType, ArrayList<Parameter> parameters,
                  ArrayList<ResponseMessage> responseMessages, boolean isList) {
        this.swaggyAnnotation = swaggyAnnotation
        this.responseType = responseType
        this.parameters = parameters
        this.responseMessages = responseMessages
        this.isList = isList
    }

    DefaultAction(Class swaggyAnnotation, String responseType, ArrayList<Parameter> parameters,
                  ArrayList<ResponseMessage> responseMessages) {
        this(swaggyAnnotation, responseType, parameters, responseMessages, false)
    }

    DefaultAction() {
        this(null, null, null, null)
    }

}
