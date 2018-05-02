@Grab('com.h2database:h2:1.4.197')
@Grab('com.github.igor-suhorukov:postgresql-runner:2.5')
@Grab('org.slf4j:slf4j-simple:1.6.6')
import com.github.igorsuhorukov.postgresql.PostgresqlService;

def postgresqlService = new PostgresqlService()
postgresqlService.start()
addShutdownHook {
    println 'shutdown postgresql server'
    postgresqlService.close()
}

String[] h2Args = ['-url', postgresqlService.getJdbcConnectionUrl(), '-driver', 'org.postgresql.Driver']
org.h2.tools.Console.main(h2Args)