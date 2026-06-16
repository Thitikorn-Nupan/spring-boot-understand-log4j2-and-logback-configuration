package com.ttknp.understandlog4jnewversion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/// Spring boot’s default logging uses Logback which is included as a transitive dependency.
/// Spring Boot supports Log4j2 for logging configuration if it is on the classpath and Logback is excluded.
/// @Slf4j // look to logback.xml
@SpringBootApplication
public class UnderstandLogBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(UnderstandLogBackApplication.class, args);
        // new UnderstandLogBackApplication().displayLogBackWithLombok();
    }

    /**
     private static final Logger log = LoggerFactory.getLogger(UnderstandLogBackApplication.class);
         private void displayLogBackWithLombok() {
         log.info("Hello World");
         log.debug("Hello World");
         log.warn("Hello World");
     }
    private void displayLogBack() {
        log.info("Hello World");
        log.debug("Hello World");
        log.warn("Hello World");
        // 19:09:45.123 [main] INFO  c.t.u.UnderstandLog4jNewVersionApplication 34 : Hello World
        // 19:09:45.129 [main] DEBUG c.t.u.UnderstandLog4jNewVersionApplication 35 : Hello World
        // 19:09:45.129 [main] WARN  c.t.u.UnderstandLog4jNewVersionApplication 36 : Hello World
    }
     private void displayCommonsLog() {
        log.info("Hello World");
        log.debug("Hello World");
        log.warn("Hello World");
        // 19:09:45.123 [main] INFO  c.t.u.UnderstandLog4jNewVersionApplication 34 : Hello World
        // 19:09:45.129 [main] DEBUG c.t.u.UnderstandLog4jNewVersionApplication 35 : Hello World
        // 19:09:45.129 [main] WARN  c.t.u.UnderstandLog4jNewVersionApplication 36 : Hello World
     }
     */
}
