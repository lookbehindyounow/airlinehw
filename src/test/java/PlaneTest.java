import org.example.Plane;
import org.example.PlaneType;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PlaneTest {
    private Plane plane;
    @Before
    public void before(){
        plane=new Plane(PlaneType.BOEING);
    }
    @Test
    public void hasAttributes(){
        assertEquals(PlaneType.BOEING,plane.getType());
        assertEquals(7,plane.getType().getCapacity());
        assertEquals(3,plane.getType().getWeight(),0);
    }
}
