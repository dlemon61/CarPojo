package com.example.pojoclass.practice.controller;


import com.example.pojoclass.practice.model.Car;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;
@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class CarController {
    @RequestMapping(value = "/Car", method = RequestMethod.GET)
    public List<Car> getCar(Model model) {
        // Requesting all cars
        List <Car> carList = new ArrayList<Car>();
        carList.add(new Car(2018, "BMW", "X3", "Royal Blue"));
        carList.add(new Car(2015, "BMW", "328xi", "Black"));
        return carList;
    }
}