package ObserverPattern.DisplayElement.CurrentConditionsDisplay;


import ObserverPattern.DisplayElement.DisplayElement;
import ObserverPattern.WeatherData.WeatherData;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by yhj0429 on 2016-07-27.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;
    private float heatIndex;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();;
        }
    }

    public void display() {
        System.out.println("Current Conditions: " + temperature + "F degrees and "+ humidity + "% humidity");
    }


}