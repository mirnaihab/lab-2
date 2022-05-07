import org.junit.Test;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;
//import static org.junit.Assert.assertEquals;

public class min_maxTest {

    @Test
    public void case_1() {
        min_max m1=new min_max();
        int[]arr={4,5, 1, 8, 6, 3};
        assertEquals(8, m1.max(arr));
        assertEquals(1, m1.min(arr));
    }

    @Test
    public void case_2() {

        min_max m2=new min_max();
        int[]array={4,9, 1, 8, 0, 3, 2};
        assertEquals(0, m2.min(array));
        assertEquals(9, m2.max(array));
    }

    @Test
    public void case_3() {
        min_max m3=new min_max();
        int[]arr={4,10, 1, 99, 6, 3};
        assertEquals(99, m3.max(arr));
        assertEquals(1, m3.min(arr));
    }
    @Test
    public void case_4() {
        min_max m4=new min_max();
        int[]arr={4,10, 1, 99, 6, 3,-18,-80,666};
        assertEquals(666, m4.max(arr));
        assertEquals(-80, m4.min(arr));
    }


}

