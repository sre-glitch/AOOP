package Weather;

public class WeatherForecaster {
	private String currentWeather;
    private String[] forecast;

    // Constructor to initialize weather data
    public WeatherForecaster() {
        this.currentWeather = "Sunny, 75°F";
        // Simulated 7-day forecast
        this.forecast = new String[] {
            "Sunny, 76°F",   // Day 1
            "Partly Cloudy, 74°F", // Day 2
            "Rainy, 68°F",   // Day 3
            "Sunny, 77°F",   // Day 4
            "Cloudy, 73°F",  // Day 5
            "Thunderstorms, 70°F", // Day 6
            "Clear, 78°F"    // Day 7
        };
    }

    // Method to get the current weather
    public String getCurrentWeather() {
        return currentWeather;
    }

    // Method to get the 7-day forecast
    public String[] getSevenDayForecast() {
        return forecast.clone(); 
    }

    // Main method to debug and test the class
    public static void main(String[] args) {
        WeatherForecaster wf = new WeatherForecaster();
        
        System.out.println("Current Weather: " + wf.getCurrentWeather());
        
        System.out.println("7-Day Forecast:");
        String[] forecast = wf.getSevenDayForecast();
        for (int i = 0; i < forecast.length; i++) {
            System.out.println("Day " + (i + 1) + ": " + forecast[i]);
        }
    }
}
