package emplyoees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloServiceTest {


    @Test
    void sayHello() {

        HelloService helloService = new HelloService();
        String message = helloService.sayHello();

        assert(message).startsWith("Hello");
    }
}