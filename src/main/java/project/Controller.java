package project;

import java.io.IOException;
import java.util.HashMap;

public class Controller {

    private WeatherModel weatherModel = new AccuweatherModel();
    private HashMap<Integer, Period> variants = new HashMap<>();

    public Controller(){
        variants.put(1, Period.ONE_DAY);
        variants.put(5, Period.FIVE_DAYS);
    }

    public void getWeather(String command, String city) throws IOException {
        Integer userIntegerInput = Integer.parseInt(command);

        switch (variants.get(userIntegerInput)){
            case ONE_DAY:
                weatherModel.getWeather(city,Period.ONE_DAY);
                break;
            case FIVE_DAYS:
                weatherModel.getWeather(city, Period.FIVE_DAYS);
                break;
        }
    }
}
