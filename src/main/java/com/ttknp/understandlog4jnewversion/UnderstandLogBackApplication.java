package com.ttknp.understandlog4jnewversion;

import lombok.extern.log4j.Log4j2;
// import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Spring boot’s default logging uses Logback which is included as a transitive dependency.
// Spring Boot supports Log4j2 for logging configuration if it is on the classpath and Logback is excluded.

// @Slf4j // same @Log4j2,@CommonsLog ** these look to logback.xml
@Log4j2 // look to log4j2.xml
// @CommonsLog
@SpringBootApplication
public class UnderstandLogBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(UnderstandLogBackApplication.class, args);
        // new UnderstandLogBackApplication().displayLog4j();
    }


    private void displayLog4j() {
        log.info("Hello World");
        log.debug("Hello World");
        log.warn("Hello World");
    }

    /**
     private static final Logger LOGGER = LogManager.getLogger(UnderstandLogBackApplication.class);
     private void displayLog4jWithoutLombok() {
     LOGGER.info("Info level log message");
     LOGGER.debug("Debug level log message");
     LOGGER.warn("Warn level log message");
     LOGGER.error("Error level log message");
     // 19:09:45.123 [main] INFO  c.t.u.UnderstandLog4jNewVersionApplication 34 : Hello World
     // 19:09:45.129 [main] DEBUG c.t.u.UnderstandLog4jNewVersionApplication 35 : Hello World
     // 19:09:45.129 [main] WARN  c.t.u.UnderstandLog4jNewVersionApplication 36 : Hello World
     }
     */

}
