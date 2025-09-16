class TemperatureConverter {
    double toFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    double toCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
}

public class TempMain {
    public static void main(String[] args) {
        TemperatureConverter t = new TemperatureConverter();
        System.out.println("30°C = " + t.toFahrenheit(30) + "°F");
        System.out.println("86°F = " + t.toCelsius(86) + "°C");
    }
}
