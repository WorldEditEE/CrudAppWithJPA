package ru.digitalleague.crudapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.digitalleague.crudapp.model.TaxiDriverInfo;

public interface TaxiDriverInfoRepository extends JpaRepository<TaxiDriverInfo, Long> {
}
