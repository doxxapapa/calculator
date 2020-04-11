package calc.train.service;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import calc.train.model.Calculator;

class CalculateSimpleTest {


    @Test
    void testAdd() {

        //Mocking
        Calculator cm = mock( Calculator.class);
        CalculateSimple cs = new CalculateSimple();

        cm.setOperandR(5.0);
        cm.setOperandL(5.25);

        when(cm.getOperandL()).thenReturn(3.25);
        when(cm.getOperandR()).thenReturn(2.0);

        assertEquals(cs.add(cm), cm.getOperandL() + cm.getOperandR());
    }

    @Test
    void testSubtract() {

        //Mocking
        Calculator cm = mock( Calculator.class);
        CalculateSimple cs = new CalculateSimple();

        cm.setOperandR(3.0);
        cm.setOperandL(4.0);

        when(cm.getOperandL()).thenReturn(4.0);
        when(cm.getOperandR()).thenReturn(3.0);

        assertEquals(cs.subtract(cm), cm.getOperandL()-cm.getOperandR());
    }

    @Test
    void testMultiply() {

        //Mocking
        Calculator cm = mock( Calculator.class);
        CalculateSimple cs = new CalculateSimple();

        //Integer-Integer
        cm.setOperandR(6.0);
        cm.setOperandL(6.0);

        when(cm.getOperandL()).thenReturn(6.0);
        when(cm.getOperandR()).thenReturn(6.0);

        assertEquals(cs.multiply(cm), 36.0);
    }

    @Test
    void testDivide() {

        //Mocking
        Calculator cm = mock( Calculator.class);
        CalculateSimple cs = new CalculateSimple();

        //Integer-Integer
        cm.setOperandR(18.0);
        cm.setOperandL(6.0);

        when(cm.getOperandL()).thenReturn(18.0);
        when(cm.getOperandR()).thenReturn(6.0);

        assertEquals(cs.divide(cm), 3.0);

        //Integer-Zero
        cm.setOperandR(18.0);
        cm.setOperandL(0.0);

        when(cm.getOperandL()).thenReturn(18.0);
        when(cm.getOperandR()).thenReturn(0.0);

        assertEquals(cs.divide(cm), 0.0);

        //Zero-Integer
        cm.setOperandR(0.0);
        cm.setOperandL(6.0);

        when(cm.getOperandL()).thenReturn(0.0);
        when(cm.getOperandR()).thenReturn(6.0);

        assertEquals(cs.divide(cm), 0.0);
    }

    @Test
    void testPower() {

        //Mocking
        Calculator cm = mock( Calculator.class);
        CalculateSimple cs = new CalculateSimple();

        //Positives
        cm.setOperandR(2.0);
        cm.setOperandL(2.0);

        when(cm.getOperandL()).thenReturn(2.0);
        when(cm.getOperandR()).thenReturn(2.0);

        assertEquals(cs.power(cm), 4.0);

        //Integer-Zero
        cm.setOperandR(2.0);
        cm.setOperandL(0.0);

        when(cm.getOperandL()).thenReturn(2.0);
        when(cm.getOperandR()).thenReturn(0.0);

        assertEquals(cs.power(cm), 1.0);

        //Zero-Integer
        cm.setOperandR(0.0);
        cm.setOperandL(2.0);

        when(cm.getOperandL()).thenReturn(0.0);
        when(cm.getOperandR()).thenReturn(2.0);

        assertEquals(cs.power(cm), 0.0);



    }

    @Test
    void testClearSimple() {

        //Mocking
        Calculator cm = mock( Calculator.class);
        CalculateSimple cs = new CalculateSimple();


    }

}