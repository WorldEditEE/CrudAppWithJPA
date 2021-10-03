package ru.digitalleague.crudapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.digitalleague.crudapp.model.CityQueue;

public interface CityQueueRepository extends JpaRepository<CityQueue, Long> {
}
