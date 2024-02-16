package web.Servise;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiseImpl implements CarServise{
    List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car(10, 1500, "blue"));
        cars.add(new Car(9, 1324, "red"));
        cars.add(new Car(6, 1453, "purple"));
        cars.add(new Car(5, 1257, "gray"));
        cars.add(new Car(3, 1054, "black"));
    }
    @Override
    public List<Car> returnCars(int count) {
        if (count > 5) {
            count = 5;
        }
        return cars.stream().limit(count).toList();
    }
}
