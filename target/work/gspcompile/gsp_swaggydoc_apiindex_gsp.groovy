import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

@GrailsPlugin(name='swaggydoc', version='0.18')
class gsp_swaggydoc_apiindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/plugins/swaggydoc-0.18/grails-app/views/api/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',5,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',5,[:],2)
printHtmlPart(3)
expressionOut.print(g.resource(dir: 'css', file: 'reset.css'))
printHtmlPart(4)
expressionOut.print(g.resource(dir: 'css', file: 'screen.css'))
printHtmlPart(5)
expressionOut.print(g.resource(dir: 'js/swagger-lib', file: 'shred.bundle.js'))
printHtmlPart(6)
expressionOut.print(g.resource(dir: 'js/swagger-lib', file: 'jquery-1.8.0.min.js'))
printHtmlPart(6)
expressionOut.print(g.resource(dir: 'js/swagger-lib', file: 'jquery.slideto.min.js'))
printHtmlPart(6)
expressionOut.print(g.resource(dir: 'js/swagger-lib', file: 'jquery.wiggle.min.js'))
printHtmlPart(6)
expressionOut.print(g.resource(dir: 'js/swagger-lib', file: 'jquery.ba-bbq.min.js'))
printHtmlPart(6)
expressionOut.print(g.resource(dir: 'js/swagger-lib', file: 'handlebars-1.0.0.js'))
printHtmlPart(6)
expressionOut.print(g.resource(dir: 'js/swagger-lib', file: 'underscore-min.js'))
printHtmlPart(6)
expressionOut.print(g.resource(dir: 'js/swagger-lib', file: 'backbone-min.js'))
printHtmlPart(6)
expressionOut.print(g.resource(dir: 'js/swagger-lib', file: 'swagger.js'))
printHtmlPart(6)
expressionOut.print(g.resource(dir: 'js/', file: 'swagger-ui.js'))
printHtmlPart(6)
expressionOut.print(g.resource(dir: 'js/swagger-lib', file: 'highlight.7.3.pack.js'))
printHtmlPart(7)
expressionOut.print(g.resource(dir: 'js/swagger-lib', file: 'swagger-oauth.js'))
printHtmlPart(8)
expressionOut.print(g.createLink(controller: 'api', action: 'resources'))
printHtmlPart(9)
})
invokeTag('captureHead','sitemesh',65,[:],1)
printHtmlPart(10)
createTagBody(1, {->
printHtmlPart(11)
expressionOut.print(g.createLink(controller: 'api'))
printHtmlPart(12)
})
invokeTag('captureBody','sitemesh',90,['class':("swagger-section")],1)
printHtmlPart(13)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1430490272000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
