package Servise;

import model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiseImpl implements CarServise {
    List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car(10, 1500, "blue"));
        cars.add(new Car(9, 1324, "red"));
        cars.add(new Car(6, 1453, "purple"));
        cars.add(new Car(5, 1257, "gray"));
        cars.add(new Car(3, 1054, "black"));
    }

    public List<Car> returnCars(int count) {
        return cars.stream().limit(count).toList();
    }
}
