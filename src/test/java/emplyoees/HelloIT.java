package emplyoees;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class HelloIT {

    @Autowired
    HelloController helloController;

    @Test
    void sayHello() {
        String message = helloController.sayHello();

        assertThat(message).startsWith("Hello Spring Boot");
    }
}