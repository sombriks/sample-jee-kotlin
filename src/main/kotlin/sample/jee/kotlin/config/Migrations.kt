package sample.jee.kotlin.config

import org.apache.ibatis.migration.DataSourceConnectionProvider
import org.apache.ibatis.migration.JavaMigrationLoader
import org.apache.ibatis.migration.operations.UpOperation
import javax.annotation.PostConstruct
import javax.annotation.Resource
import javax.ejb.Startup
import javax.sql.DataSource

import java.util.logging.Logger
import javax.ejb.Singleton


@Startup
@Singleton
class Migrations {

    @Resource(name = "jdbc/sample-ds") lateinit var  ds: DataSource

    val LOG = Logger.getLogger("Migrations")

    @PostConstruct
    fun up() {
        LOG.info("starting migrations subsystem...")
        UpOperation().operate(
            DataSourceConnectionProvider(ds),
            JavaMigrationLoader("sample.jee.kotlin.config.migrations"), null, System.out
        )
        LOG.info("migrations done!")

    }
}