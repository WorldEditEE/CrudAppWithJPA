package ru.digitalleague.crudapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.digitalleague.crudapp.model.Car;

public interface CarRepository extends JpaRepository<Car,Long> {
}
