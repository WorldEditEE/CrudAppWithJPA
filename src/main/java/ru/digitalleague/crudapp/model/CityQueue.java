package ru.digitalleague.crudapp.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "city_queue", schema = "public")
public class CityQueue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "city_id")
    private long id;

    @Column(name = "name_city")
    private String name_city;

    @Column(name = "queue")
    private String queue;

    public CityQueue() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCityName() {
        return name_city;
    }

    public void setCityName(String cityName) {
        this.name_city = cityName;
    }

    public String getQueue() {
        return queue;
    }

    public void setQueue(String queue) {
        this.queue = queue;
    }
}
