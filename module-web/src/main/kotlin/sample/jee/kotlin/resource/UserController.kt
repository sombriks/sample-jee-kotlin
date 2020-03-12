package sample.jee.kotlin.resource

import sample.jee.kotlin.service.Users
import javax.ejb.EJB
import javax.ejb.Stateless
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces

@Stateless
@Path("/user")
@Produces("application/json")
class UserController {

    @EJB
    lateinit var users: Users

    @GET
    fun list() = users.listUsers()
}