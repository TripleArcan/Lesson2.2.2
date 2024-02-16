package web.Servise;

import web.model.Car;

import java.util.List;

public interface CarServise {
    List<Car> returnCars(int count);
}
