@Grab('com.h2database:h2:1.4.197')
import org.h2.tools.Console

String[] h2Args = ['-url', 'jdbc:h2:file:./database', '-driver', 'org.h2.Driver']
org.h2.tools.Console.main(h2Args)