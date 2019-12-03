package com.epam.unit;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.*;

    @RunWith(Parameterized.class)
    public class ParameterizeTest {
        private double degreesFahrenheit;
        private double expected;

        public ParameterizeTest(double degreesFahrenheit, double expected) {
            this.degreesFahrenheit = degreesFahrenheit;
            this.expected = expected;
        }
        @Parameterized.Parameters
        public static Collection data() {
            return Arrays.asList(new Object[][]{
                    {0, -17.7778}, // ожидаемое, параметр
                    {32.0, 0},
                    {100, 37.7778}
            });
        }
        @Test
        public void checkConvertFtoC() {
           assertEquals(expected, new TemperatureConverter().convertFtoC(degreesFahrenheit), 0.0001);
        }
        @Test
       public void checkConvertCtoK(){
            final double result = 273.2;
            assertEquals(result, new TemperatureConverter().convertCtoK(0), 0.0001);
        }

        @Test
        public void checkConvertKtoC(){
         final double result = -273.2;
         assertEquals(result, new TemperatureConverter().convertKtoC(0), 0.0001);
        }
        @Test
        public void checkConvertFtoK(){
            final double result = 255.38888888;
            assertEquals(result, new TemperatureConverter().convertFtoK(0), 0.0001);
        }
        @Test
        public void checkConvertKtoF(){
            final double result = -459.7;
            assertEquals(result, new TemperatureConverter().convertKtoF(0), 0.0001);
        }
    }
