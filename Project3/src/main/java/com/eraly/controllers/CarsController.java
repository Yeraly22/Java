package com.eraly.controllers;

import com.eraly.dao.CarDao;
import com.eraly.entity.Car;
import net.bytebuddy.implementation.bind.annotation.Default;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/cars")
public class CarsController {

    private final CarDao carDao;

    public CarsController(CarDao carDao) {
        this.carDao = carDao;
    }

    @GetMapping()
    public String index(Model model){
       model.addAttribute("cars",carDao.getAllCars());
       return "cars/views";
    }

    @GetMapping("/{id}")
    public String showCar(@PathVariable("id") int id, Model model){
        model.addAttribute("car" , carDao.show(id));
        return "cars/show";

    }

    @GetMapping("/new-car")
    public String newCar(@ModelAttribute("car") Car car){
        return "cars/new";
    }

    @PostMapping
    public String createCar(@ModelAttribute("car") Car car){
        carDao.saveCar(car);
        return "redirect:/cars";
    }

    @GetMapping("/{id}/edit")
    public String editCar(@PathVariable("id") int id, Model model){
        model.addAttribute("car",carDao.show(id));
        return "cars/edit";
    }

    @PatchMapping("/{id}")
    public String updateCar(@ModelAttribute("car") Car car, @PathVariable("id") int id){
        carDao.updateCar(id,car);
        return "redirect:/cars";
    }

    @DeleteMapping("/{id}")
    public String deleteCar(@PathVariable("id") int id){
        carDao.delete(id);
        return "redirect:/cars";
    }

}
