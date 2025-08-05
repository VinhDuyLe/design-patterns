package BehaviouralPatterns.ObservePattern;

public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        Observer screen1 = new DisplayDevice("Screen A");
        Observer screen2 = new DisplayDevice("Screen B");

        station.addObserver(screen1);
        station.addObserver(screen2);

        station.setMeasurements(27.5f, 65.0f); // Both observers receive updates

        station.removeObserver(screen2);

        station.setMeasurements(30.0f, 70.0f); // Only Screen A receives this update
    }
}
