package com.codeaches.carinventoryservice;

import java.util.HashSet;
import java.util.Set;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarInventoryController implements CarInventoryControllerInterface {

  @PostMapping("addCar")
  public String addCar(@RequestBody String car) {
    cars.add(car);
    return car;
  }

  @GetMapping("viewCars")
  public Set<String> viewCars() {
    return cars;
  }

  static Set<String> cars = new HashSet<>();
  static {
    cars.add("Toyota");
    cars.add("Benz");
  }
}
