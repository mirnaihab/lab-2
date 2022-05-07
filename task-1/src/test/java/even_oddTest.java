import org.junit.Test;

import static org.junit.Assert.*;

public class even_oddTest {

    @Test
    public void case_1() {
        even_odd e1 =new even_odd();
        assertEquals("even", e1.EvenOrOdd(8));
    }
    @Test
    public void case_2() {
        even_odd e2 =new even_odd();
        assertEquals("odd", e2.EvenOrOdd(9));
    }
    @Test
    public void case_3() {
        even_odd e3 =new even_odd();
        assertEquals("even", e3.EvenOrOdd(-14));
    }
    @Test
    public void case_4() {
        even_odd e1 =new even_odd();
        assertEquals("odd", e1.EvenOrOdd(-17));
    }
    @Test
    public void case_5() {
        even_odd e1 =new even_odd();
        assertEquals("even", e1.EvenOrOdd(0));
    }
}