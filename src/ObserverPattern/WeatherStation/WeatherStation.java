package ObserverPattern.WeatherStation;

import ObserverPattern.DisplayElement.CurrentConditionsDisplay.CurrentConditionsDisplay;
import ObserverPattern.WeatherData.WeatherData;

/**
 * Created by yhj0429 on 2016-07-27.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay =  new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80, 62, 30.4f);
    }

}
