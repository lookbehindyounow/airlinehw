import org.example.Passenger;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PassengerTest {
    private Passenger passenger;
    @Before
    public void before(){
        passenger=new Passenger("Kev",2);
    }
    @Test
    public void hasAttributes(){
        assertEquals("Kev",passenger.getName());
        assertEquals(2,passenger.getBags());
    }
}
