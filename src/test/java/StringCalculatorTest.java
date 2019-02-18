
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baptiste.andres
 */
public class StringCalculatorTest {
    
    @Test
        public void emptyStringShouldReturnZero() {
        StringCalculator sut = new StringCalculator();
        assertEquals(0, sut.Add(""));
    }
        
    @Test
    public void oneNumberShouldReturnItseft() {
        StringCalculator sut = new StringCalculator();
        assertEquals(3, sut.Add("3"));
    }
    
    @Test
    public void twoNumbersShouldBeAdded() {
        StringCalculator sut = new StringCalculator();
        assertEquals(7, sut.Add("2,5"));
    }
    
}
