package it.digicamere

import com.wordnik.swagger.annotations.Api
import com.wordnik.swagger.annotations.ApiImplicitParam
import com.wordnik.swagger.annotations.ApiImplicitParams
import com.wordnik.swagger.annotations.ApiOperation
import com.wordnik.swagger.annotations.ApiParam
import com.wordnik.swagger.annotations.ApiResponse
import com.wordnik.swagger.annotations.ApiResponses
import grails.rest.RestfulController
import grails.transaction.Transactional

@Transactional(readOnly = true)
@Api(
        value = '',
        description = 'Demo API',
        position = 0,
        produces = 'application/json,application/xml,text/html',
        consumes = 'application/json,application/xml,application/x-www-form-urlencoded'
)
class DemoController extends RestfulController {

    static responseFormats = ['json', 'xml']

    static allowedMethods = [save: "POST", update: "PUT", patch: "PATCH", delete: "DELETE",saveLista: "POST"]


    DemoController() {
        super(Utente)
    }

    @Override
    @ApiOperation(value = 'List demos', response = Utente, responseContainer = 'list')
    @ApiImplicitParams([
    @ApiImplicitParam(name = 'offset', value = 'Records to skip', defaultValue = '0', paramType = 'query', dataType = 'int'),
    @ApiImplicitParam(name = 'max', value = 'Max records to return', defaultValue = '10', paramType = 'query', dataType = 'int'),
    @ApiImplicitParam(name = 'sort', value = 'Field to sort by', defaultValue = 'id', paramType = 'query', dataType = 'string'),
    @ApiImplicitParam(name = 'order', value = 'Order to sort by', defaultValue = 'asc', paramType = 'query', dataType = 'string'),
    @ApiImplicitParam(name = 'q', value = 'Query', paramType = 'query', dataType = 'string'),
    ])
    def index() {
        super.index()
    }

    @Override
    @ApiOperation(value = "Show Demo", response = Utente)
    @ApiResponses([
    @ApiResponse(code = 400, message = 'Bad Id provided'),
    @ApiResponse(code = 404, message = 'Could not find Demo with that Id'),
    ])
    @ApiImplicitParams([
    @ApiImplicitParam(name = 'id', value = 'Id to fetch', paramType = 'path', dataType = 'int', required = true),
    ])
    def show() {
        super.show()
    }

    @ApiOperation(value = "Save Demo", response = Utente)
    @ApiResponses([
    @ApiResponse(code = 422, message = 'Bad Entity Received'),
    ])
    @ApiImplicitParams([
    @ApiImplicitParam(name = 'body', paramType = 'body', required = true, dataType = 'Demo'),
    ])
    @Override
    def save() {
        super.save()
    }

    @Override
    @ApiOperation(value = "Update Demo", response = Utente)
    @ApiResponses([
    @ApiResponse(code = 400, message = 'Bad Id provided'),
    @ApiResponse(code = 404, message = 'Could not find Demo with that Id'),
    @ApiResponse(code = 422, message = 'Bad Entity Received'),
    ])
    @ApiImplicitParams([
    @ApiImplicitParam(name = 'id', value = 'Id to update', paramType = 'path', dataType = 'int', required = true),
    @ApiImplicitParam(name = 'body', paramType = 'body', required = true, dataType = 'Demo')
    ])
    def update() {
        super.update()
    }

    @Override
    @ApiOperation(value = "Delete Demo")
    @ApiResponses([
    @ApiResponse(code = 400, message = 'Bad Id provided'),
    @ApiResponse(code = 404, message = 'Could not find Demo with that Id'),
    ])
    @ApiImplicitParams([
    @ApiImplicitParam(name = 'id', value = 'Id to delete', paramType = 'path', dataType = 'int', required = true),
    ])
    def delete() {
        super.delete()
    }

    @Override
    @ApiOperation(value = "Patch Demo", response = Utente)
    @ApiResponses([
    @ApiResponse(code = 400, message = 'Bad Id provided'),
    @ApiResponse(code = 404, message = 'Could not find Demo with that Id'),
    @ApiResponse(code = 422, message = 'Bad Entity Received'),
    ])
    @ApiImplicitParams([
    @ApiImplicitParam(name = 'id', value = 'Id to patch', paramType = 'path', dataType = 'int', required = true),
    @ApiImplicitParam(name = 'body', paramType = 'body', required = true, dataType = 'Demo')
    ])
    Object patch() {
        return super.patch()
    }


    @ApiOperation(value = "Save Demo", response = Utente)
    @ApiResponses([
    @ApiResponse(code = 422, message = 'Bad Entity Received'),
    ])
    @ApiImplicitParams([
    @ApiImplicitParam(name = 'body', paramType = 'body', required = true, dataType = 'Utente'),
    ])
    def save2() {
        println "params: "+params
        println "json: "+request.getJSON()
        render 'ok'
    }


    @ApiOperation(value = "Save Demo", response = Utente)
    @ApiResponses([
    @ApiResponse(code = 422, message = 'Bad Entity Received'),
    ])
    @ApiImplicitParams([
    @ApiImplicitParam(name = 'body', paramType = 'body', required = true, dataType = 'Utente'),
    ])
    def save3() {
        def jsonObject = request.JSON
        Utente instance = new Utente(jsonObject)
        println "Utente: "+instance
        println "params: "+params
        println "json: "+request.getJSON()
        render 'ok'
    }

    @ApiOperation(value = "Save Demo", response = Autore)
    @ApiResponses([
    @ApiResponse(code = 422, message = 'Bad Entity Received'),
    ])
    @ApiImplicitParams([
    @ApiImplicitParam(name = 'body', paramType = 'body', required = true, dataType = 'Autore'),
    ])
    def saveAutore() {
        def jsonObject = request.JSON
        Autore instance = new Autore(jsonObject)
        instance.validate()
        println "Errori: "+instance.errors
        println "Autore: "+instance
        if(instance.hasErrors()) {
            withFormat {
                json {
                    respond instance.errors
                }
            }
        }
        withFormat {
            json {
                respond instance,  [excludes: ['errors']]
            }
        }
    }

    @ApiOperation(value = "Show Demo", response = Autore)
    @ApiResponses([
        @ApiResponse(code = 400, message = 'Bad Id provided'),
        @ApiResponse(code = 404, message = 'Autore non trovato'),
    ])
    @ApiImplicitParams([
    @ApiImplicitParam(name = 'id', value = 'Id autore', paramType = 'path', dataType = 'int', required = true),
    ])
    def detail() {
        println "Params: "+params
        Autore autore
        super.notFound()
    }

    @ApiOperation(value = "Save Demo", response = Autore)
    @ApiResponses([
    @ApiResponse(code = 422, message = 'Bad Entity Received'),
    ])
    @ApiImplicitParams([
    @ApiImplicitParam(name = 'body', paramType = 'body', required = true, dataType = 'Autore'),
    ])
    def saveLista() {
        def jsonObject = request.JSON
        Autore instance = new Autore(jsonObject)
        instance.validate()
        println "Errori: "+instance.errors
        println "Autore: "+instance
        if(instance.hasErrors()) {
            withFormat {
                json {
                    respond instance.errors
                }
            }
        }
        withFormat {
            json {
                respond instance,  [excludes: ['errors']]
            }
        }
    }


    @ApiOperation(value = "Save lista multiple", response = List)
    @ApiResponses([
    @ApiResponse(code = 422, message = 'Bad Entity Received'),
    ])
    @ApiImplicitParams([
        @ApiImplicitParam(name = 'lista', value = 'Id to patch', paramType = 'form', dataType = 'string', required = true, allowMultiple = true),
    ])

    def saveLista2(ArrayList<String> lista) {
        println 'lista: '+lista
        println 'params: '
        render 'ok'

    }

    @ApiOperation(value = "Save Demo", response = Autore.class)
    @ApiResponses([
    @ApiResponse(code = 422, message = 'Bad Entity Received'),
    @ApiResponse(code = 200, message = 'ok', response = StrutturaResult),
    ])
    @ApiImplicitParams([
    @ApiImplicitParam(name = 'body', paramType = 'body', required = true, dataType = 'Libro'),
    ])
    def saveStruttura() {
        def jsonObject = request.JSON
        SearchStruttura instance = new SearchStruttura(jsonObject)
        instance.validate()
        println "Errori: "+instance.errors
        println "SearchStruttura: "+instance
        if(instance.hasErrors()) {
            withFormat {
                json {
                    respond instance.errors
                }
            }
        }
        withFormat {
            json {
                respond instance,  [excludes: ['errors']]
            }
        }
    }

}
