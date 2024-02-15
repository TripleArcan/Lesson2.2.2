package Servise;

import model.Car;
import org.springframework.stereotype.Component;

import java.util.List;


public interface CarServise {
    public List<Car> returnCars(int count);
}
