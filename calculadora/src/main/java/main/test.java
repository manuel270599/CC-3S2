package main;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.Assert.*;

public class test {
    @Test
    public void whenCalculatorInitializedThenReturnTrue() {
        Calculadora calculadora = new Calculadora();

        assertTrue(calculadora.getStatus());
    }
    @Test
    public void whenAdditionTwoNumberThenReturnCorrectAnswer() {
        Calculadora calculadora = new Calculadora();

        assertEquals( 5, calculadora.addition(2,3));
    }
    private static Calculadora calculadora;

    @BeforeAll
    public static void init(){
        calculadora = new Calculadora();
    }
    @Test
    public void whenDivisionThenReturnCorrectAnswer() {
        assertEquals(2, Calculadora.division(8, 4));
    }
    @Test
    public void whenDivisionByZeroThenThrowException() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            calculadora.division(5, 0);
        });
        assertEquals("No se puede divisor por  cero", exception.getMessage());
    }
    @Test
    public void whenMultiplicationThenReturnCorrectAnswer() {
        assertEquals(32, Calculadora.multiplication(8, 4));
    }
}
