package web.controller;
import Servise.CarServise;
import Servise.CarServiseImpl;
import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.Callable;


@Controller
//@RequestMapping("/cars")
public class CarController {
    private CarServise carServise = new CarServiseImpl();


    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", defaultValue = "5") int numberOfCars, ModelMap model) {
        model.addAttribute("cars", carServise.returnCars(numberOfCars));
        return "cars";
    }

}
