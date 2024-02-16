package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Servise.CarServise;
import web.Servise.CarServiseImpl;


@Controller
public class CarController {
    private CarServise carServise;

    public CarController(CarServiseImpl carServise) {
        this.carServise = carServise;
    }


    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", defaultValue = "5") int numberOfCars, ModelMap model) {
        model.addAttribute("cars", carServise.returnCars(numberOfCars));
        return "cars";
    }

}
