package sample.jee.kotlin.resource

import javax.ws.rs.GET
import javax.ws.rs.Path

@Path("/hello")
class Hello {

    @GET
    fun hello() = "hello!"
}