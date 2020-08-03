import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {
    @Test
    public void sayHi_should_return_Hello_World(){
        HelloWorld h = new HelloWorld();
        String result = h.sayHi();
        assertEquals("Hello World",result);
    }
    @Test
    public void sayHi_with_phison_should_return_Hello_Phison(){
        HelloWorld h = new HelloWorld();
        String result = h.sayHi("phison");
        assertEquals("Hello Phison",result);
    }
    @Test
    public void sayHi_with_pui_should_return_Hello_Pui(){
        HelloWorld h = new HelloWorld();
        String result = h.sayHi("pui");
        assertEquals("Hello Pui",result);
    }

}