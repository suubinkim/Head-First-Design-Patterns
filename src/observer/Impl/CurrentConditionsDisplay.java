package observer.Impl;

import observer.DisplayElement;
import observer.Observer;
import observer.Subject;

/**
 * 현재 조건을 표시하는 디스플레이 클래스
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;

    // 생성자에 주제객체가 전달되면 그 객체를 써서 디스플레이를 옵저버로 등록
    public CurrentConditionsDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("current condition : " + temperature + "F degrees and " + humidity + "% humidity.");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
