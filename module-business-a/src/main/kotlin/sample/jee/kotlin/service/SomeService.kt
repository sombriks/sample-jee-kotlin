package sample.jee.kotlin.service

import sample.jee.kotlin.model.User
import javax.ejb.Stateless
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

@Stateless
class SomeService {

    fun hello() = "Hello!"
}