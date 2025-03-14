package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    private final List<Car> cars;

    public CarService() {
        // Инициализация списка из 5 машин
        cars = new ArrayList<>();
        cars.add(new Car(1L, "toyota", "camry"));
        cars.add(new Car(2L, "opel", "astra"));
        cars.add(new Car(3L, "bmw", "X5"));
        cars.add(new Car(4L, "mercedes", "e"));
        cars.add(new Car(5L, "jetour", "x90"));
    }

    public List<Car> getCars(int count) {
        if (count >= cars.size()) {
            return new ArrayList<>(cars); // Возвращаем весь список, если count >= 5
        }
        return new ArrayList<>(cars.subList(0, count)); // Возвращаем первые count машин
    }
}