
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
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

    private StringCalculator sut;

    //tu aurais pu utiliser l'annotation "before". Ca t'évite d'appeler le constructeur à chaque test.
    @Before
    public void setup() {
        sut = new StringCalculator();
    }
    
    @Test
        public void emptyStringShouldReturnZero() {
        assertEquals(0, sut.Add(""));
    }
        
    @Test
    public void oneNumberShouldReturnItseft() {
        assertEquals(3, sut.Add("3"));
    }
    
    @Test
    public void twoNumbersShouldBeAdded() {
        assertEquals(7, sut.Add("2,5"));
    }
    
    @Test
    public void supportNewLineAsSeparator() {
        assertEquals(6, sut.Add("1\n2,3"));
    }
    
    @Test
    public void supportForCustomDelimiter() {
        assertEquals(10, sut.Add(";\n1;2;3;4"));
    }
    
    @Test
    public void negativeNotSupported() {
        try {
            sut.Add("-1,4");
            fail("exception should have been thrown");
        }
        catch (IllegalArgumentException e) {
            assertEquals("negatives not allowed -1", e.getMessage());
        }
    }
    
    @Test
    public void NumbersGreaterThan1000NotIncludedInSum() {
        assertEquals(1009, sut.Add("3,1000,1001,6,1234"));
    }
    
}
