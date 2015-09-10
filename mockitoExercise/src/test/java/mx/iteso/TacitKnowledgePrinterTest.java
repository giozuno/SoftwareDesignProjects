package mx.iteso;

import org.junit.Before;
import org.junit.Test;
import org.mockito.mock.*;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class TacitKnowledgePrinterTest {

    //Test printNumbers with a limit of 10
        //Verify print() being called 10 times
        //Verify expected result

    //Test printNumbers with a limit of 0
        //Verify Exception

    //What else can we test?
        //What should we verify?

    private Printer printer;
    private TacitKnowledgePrinter tacitPrinter;

    @Before
    public void setUp() {
        printer = mock(Printer.class);
        tacitPrinter = new TacitKnowledgePrinter(printer);
    }
    @Test
    public void testPrintNumbersTimes10() {
        tacitPrinter.printNumbers(10);
        verify(printer, times(10)).print(anyString());
    }
    @Test
    public void testExpectedResult() {
        String result = "";
        for(int i=1; i<=10; i++) {
            result += tacitPrinter.calculate(i);
        }
        assertEquals(result, "12Tacit4KnowledgeTacit78TacitKnowledge");
    }
    @Test
    public void testTacitKnowledge() {
        assertEquals(tacitPrinter.calculate(15), "TacitKnowledge");
    }
    @Test (expected = Exception.class)
    public void testPrintNumbersLimitZero() {
        tacitPrinter.printNumbers(0);
    }

}
