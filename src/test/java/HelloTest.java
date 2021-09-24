import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HelloTest {

    @Test
    void shouldBeAbleToSayHelloWorld() {

        Hello hello=new Hello();

        assertTrue(hello.sayHello());
    }
}
