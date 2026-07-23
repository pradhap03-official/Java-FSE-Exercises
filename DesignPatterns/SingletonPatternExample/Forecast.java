public class Forecast {

    public static int predict(int value, int years) {
        if (years == 0)
            return value;

        return predict((int) (value * 1.10), years - 1);
    }
}