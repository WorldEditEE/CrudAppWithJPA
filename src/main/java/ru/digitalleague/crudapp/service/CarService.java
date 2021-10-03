package ru.digitalleague.crudapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.digitalleague.crudapp.model.Car;
import ru.digitalleague.crudapp.repository.CarRepository;

import java.util.List;

@Service
public class CarService {

    private final CarRepository carRepository;

    @Autowired
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> getAllCar(){

        return carRepository.findAll();
    }


    public Car addCar(Car car) {

        return carRepository.save(car);

    }

    public void deleteCar(Car car) {

        carRepository.delete(car);
    }

    public Car updateCar(Car car) {

        return carRepository.save(car);
    }
}
