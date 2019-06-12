import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class GreeterTest {

    @Test
    public void testGreeterSaysHelloWorld() {
        System.out.println("testing greeter ");
        Greeter greeter = new Greeter();
        String s = greeter.sayHello();
        assertThat(s, equalTo("Hello World"));

    }
}
