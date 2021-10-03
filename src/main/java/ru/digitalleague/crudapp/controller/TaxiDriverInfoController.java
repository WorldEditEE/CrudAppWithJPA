package ru.digitalleague.crudapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.digitalleague.crudapp.model.CityQueue;
import ru.digitalleague.crudapp.model.TaxiDriverInfo;
import ru.digitalleague.crudapp.service.TaxiDriverService;

import java.util.List;

@RestController
public class TaxiDriverInfoController {

    private final TaxiDriverService taxiDriverService;

    @Autowired
    public TaxiDriverInfoController(TaxiDriverService taxiDriverService) {
        this.taxiDriverService = taxiDriverService;
    }

    @GetMapping("/allDrivers")
    public List<TaxiDriverInfo> findAll(){

        return taxiDriverService.getAllDrivers();
    }

    @PostMapping("/addDriver")
    public TaxiDriverInfo addQueue(@RequestBody TaxiDriverInfo taxiDriverInfo){

        return taxiDriverService.addDriver(taxiDriverInfo);

    }

    @DeleteMapping("/deleteDriver")
    public void deleteDriver(@RequestBody TaxiDriverInfo taxiDriverInfo){

        taxiDriverService.deleteDriver(taxiDriverInfo);
    }

    @PutMapping("/updateDriver")
    public Long updateQueue(@RequestBody TaxiDriverInfo taxiDriverInfo){

        TaxiDriverInfo taxiDriverInfoUpdate = taxiDriverService.updateDriver(taxiDriverInfo);
        return taxiDriverInfoUpdate.getId();
    }
}
