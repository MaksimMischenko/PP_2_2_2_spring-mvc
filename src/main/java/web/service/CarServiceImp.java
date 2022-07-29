package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImp implements CarService {

    List<Car> cars = new ArrayList<>(Arrays.asList(
            new Car("BMW", 2020, "red"),
            new Car("LADA", 2019, "blue"),
            new Car("Audi", 2011, "black"),
            new Car("mazda", 2021, "white"),
            new Car("GMC", 2012, "black")));

    @Override
    public List<Car> getCountCars(Integer count) {
        if (count == null || count >= 5) {
            return cars;
        } else {
            return cars.subList(0, count);
        }
    }

}


