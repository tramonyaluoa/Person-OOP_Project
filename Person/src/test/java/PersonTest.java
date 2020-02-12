import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void Test(){

        Person person = new Person("Ryan",  25, "Male",
                new String[] {"being a hard arse", "Agile", "SSD Hard Drives."});

         String a = person.hello();
        Assert.assertEquals(a, "Hello, My name is Ryan\n" +
                "I am Male and I am 25 years old.\n" +
                "My interests are being a hard arse, Agile &  SSD Hard Drives.");
    }

}