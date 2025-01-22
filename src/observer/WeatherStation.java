package observer;

import observer.Impl.CurrentConditionsDisplay;
import observer.Impl.WeatherData;

/**
 * 테스트용
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        // 옵저버 등록
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);

        weatherData.measurementsChanged(); //갱신됨을 알림

        System.out.println(weatherData.getObservers()); //등록 옵저버 확인
    }
}
