import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainClassTest extends MainClass {
    @Before
    public void textStartTest() {
        System.out.println("Стартуем");
    }

    @After
    public void textEndTest()
    {
        System.out.println("Тест завершен");
    }

    @Test
    public void testGetLocalNumber() {
        int a = getLocalNumber();
        if (a == 14) {
            System.out.println("SuccessTest");
        } else {
            Assert.fail("ErrorTest");
        }
    }
}

