package Weather;

public class MainClass {
	public static void main(String[] args) {
        WeatherForecaster weatherForecaster = new WeatherForecaster();

        System.out.println("Current Weather:");
        System.out.println(weatherForecaster.getCurrentWeather());

        System.out.println("\n7-Day Forecast:");
        String[] forecast = weatherForecaster.getSevenDayForecast();
        for (int i = 0; i < forecast.length; i++) {
            System.out.println("Day " + (i + 1) + ": " + forecast[i]);
        }
    }
}
