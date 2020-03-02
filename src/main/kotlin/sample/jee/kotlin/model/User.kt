package sample.jee.kotlin.model

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name="user")
data class User(
    @Id
    var id: Long? = null,
    var nome: String? = null
)