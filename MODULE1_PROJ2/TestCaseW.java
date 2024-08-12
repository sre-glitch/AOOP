package Weather;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCaseW {

    @Test
    public void testGetCurrentWeather() {
        WeatherForecaster weatherForecaster = new WeatherForecaster();
        String currentWeather = weatherForecaster.getCurrentWeather();
        assertEquals("Sunny, 75°F", currentWeather);
    }

    @Test
    public void testGetSevenDayForecast() {
        WeatherForecaster weatherForecaster = new WeatherForecaster();
        String[] forecast = weatherForecaster.getSevenDayForecast();

        assertEquals(7, forecast.length);
        assertEquals("Sunny, 76°F", forecast[0]);
        assertEquals("Partly Cloudy, 74°F", forecast[1]);
        assertEquals("Rainy, 68°F", forecast[2]);
        assertEquals("Sunny, 77°F", forecast[3]);
        assertEquals("Cloudy, 73°F", forecast[4]);
        assertEquals("Thunderstorms, 70°F", forecast[5]);
        assertEquals("Clear, 78°F", forecast[6]);
    }
}