import org.junit.Test;

public class MainClassTest extends MainClass
{
    @Test
    public void testGetLocalNumber()
    {
        int a = getLocalNumber();
        if (a ==  14)
        {
            System.out.println("SuccessTest");
        } else {
            System.out.println("ErrorTest");
        }

    }
}



