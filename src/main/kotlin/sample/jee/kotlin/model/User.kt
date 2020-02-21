package sample.jee.kotlin.model

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class User(
    @Id
    var id: Long? = null,
    var nome: String? = null
)