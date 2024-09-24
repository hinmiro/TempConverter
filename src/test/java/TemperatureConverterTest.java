import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TemperatureConverterTest {

    @Test
    public void testFahrenheitToCelsius() {
        assertEquals(0, TemperatureConverter.fahrenheitToCelsius(32), 0.01);
        assertEquals(100, TemperatureConverter.fahrenheitToCelsius(212), 0.01);
        assertEquals(-40, TemperatureConverter.fahrenheitToCelsius(-40), 0.01);
    }

    @Test
    public void testCelsiusToFahrenheit() {
        assertEquals(32, TemperatureConverter.celsiusToFahrenheit(0), 0.01);
        assertEquals(212, TemperatureConverter.celsiusToFahrenheit(100), 0.01);
        assertEquals(-40, TemperatureConverter.celsiusToFahrenheit(-40), 0.01);
    }

    @Test
    public void testIsExtremeTemperature() {
        assertTrue(TemperatureConverter.isExtremeTemperature(-50));
        assertFalse(TemperatureConverter.isExtremeTemperature(20));
        assertTrue(TemperatureConverter.isExtremeTemperature(60));
    }

    @Test
    public void testKelvinToCel() {
        assertEquals(0.0, TemperatureConverter.kelvinToCel(273.15F), 0.001);
    }

    @Test
    public void testKelvinToFah() {
        assertEquals(59.0, TemperatureConverter.kelvinToFah(300.1), 0.1);
    }

}




