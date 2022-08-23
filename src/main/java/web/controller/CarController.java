package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarServiceImp;

import java.util.Optional;

@Controller
public class CarController {

    private final CarServiceImp carService;

    public CarController(CarServiceImp carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String showCars(@RequestParam(value = "count") Optional<Integer> count, Model model) {
        model.addAttribute("cars", carService.getCars(count.orElse(0)));
        return "cars";
    }

}
