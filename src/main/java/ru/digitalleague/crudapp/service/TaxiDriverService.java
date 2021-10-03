package ru.digitalleague.crudapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.digitalleague.crudapp.model.CityQueue;
import ru.digitalleague.crudapp.model.TaxiDriverInfo;
import ru.digitalleague.crudapp.repository.TaxiDriverInfoRepository;

import java.util.List;

@Service
public class TaxiDriverService {

    private final TaxiDriverInfoRepository taxiDriverInfoRepository;

    @Autowired
    public TaxiDriverService(TaxiDriverInfoRepository taxiDriverInfoRepository) {
        this.taxiDriverInfoRepository = taxiDriverInfoRepository;
    }


    public List<TaxiDriverInfo> getAllDrivers() {

        return taxiDriverInfoRepository.findAll();
    }

    public TaxiDriverInfo addDriver(TaxiDriverInfo taxiDriverInfo) {

        return taxiDriverInfoRepository.save(taxiDriverInfo);
    }

    public void deleteDriver(TaxiDriverInfo taxiDriverInfo) {

         taxiDriverInfoRepository.delete(taxiDriverInfo);
    }

    public TaxiDriverInfo updateDriver(TaxiDriverInfo taxiDriverInfo) {

        return taxiDriverInfoRepository.save(taxiDriverInfo);
    }
}
