public class FahrenheitToCelsius2 {
    public static void main(String[] args) {
        double fahrenheitDegrees;
        double celsiusDegrees;

        fahrenheitDegrees = 99.0;

        // convert F to C
        celsiusDegrees = (fahrenheitDegrees - 32) * 5 / 9;

        System.out.print(
            fahrenheitDegrees + " degrees in Fahrenheit is " 
            + celsiusDegrees + " degrees in Celsius");

    }
}
