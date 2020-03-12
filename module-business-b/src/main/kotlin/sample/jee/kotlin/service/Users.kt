package sample.jee.kotlin.service

import sample.jee.kotlin.model.User
import javax.ejb.Stateless
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

@Stateless
class Users {

    @PersistenceContext(unitName = "sample-jee-kotlin-pu")
    private lateinit var em: EntityManager

    fun listUsers(): List<User> = em.createQuery(
        "select u from User u",
        User::class.java
    ).resultList
}