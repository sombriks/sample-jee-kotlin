package sample.jee.kotlin.resource

import sample.jee.kotlin.service.Users
import javax.ejb.EJB
import javax.ejb.Stateless
import javax.ws.rs.GET
import javax.ws.rs.Path

@Stateless
@Path("/user")
class UserController {

    @EJB
    lateinit var users: Users

    @GET
    fun list() = users.listUsers()
}