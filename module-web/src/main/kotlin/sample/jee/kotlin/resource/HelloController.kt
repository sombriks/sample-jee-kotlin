package sample.jee.kotlin.resource

import sample.jee.kotlin.service.SomeService

import javax.ejb.EJB
import javax.ejb.Stateless
import javax.ws.rs.GET
import javax.ws.rs.Path

@Stateless
@Path("/hello")
class HelloController {

    @EJB
    lateinit var someService: SomeService
    
    @GET
    fun hello() = someService.hello()
}