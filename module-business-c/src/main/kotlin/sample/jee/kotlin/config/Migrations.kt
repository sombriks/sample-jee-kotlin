package sample.jee.kotlin.config

import org.flywaydb.core.Flyway
import javax.annotation.PostConstruct
import javax.annotation.Resource
import javax.ejb.Startup
import javax.sql.DataSource

import java.util.logging.Logger
import javax.ejb.Singleton
import javax.ejb.TransactionManagement
import javax.ejb.TransactionManagementType


@Startup
@Singleton
@TransactionManagement(value = TransactionManagementType.BEAN)
class Migrations {

    @Resource(name = "jdbc/sample-ds") lateinit var  ds: DataSource

    val LOG = Logger.getLogger("Migrations")

    @PostConstruct
    fun up() {
        LOG.info("starting migrations subsystem...")
        val flyway = Flyway.configure().dataSource(ds).load()
        flyway.baseline()
        flyway.migrate()
        LOG.info("migrations done!")
    }
}