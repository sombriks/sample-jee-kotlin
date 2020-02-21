package sample.jee.kotlin.resource

import javax.ejb.Stateless
import javax.ws.rs.GET
import javax.ws.rs.Path

@Stateless
@Path("/hello")
class HelloController {
    @GET
    fun hello() = "hello!!!"
}