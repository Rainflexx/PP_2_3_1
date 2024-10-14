package web.repository;

import web.models.Car;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CarRepository {
    List<Car> carData = List.of(
            new Car("BMW", 98, "530 f10"), new Car("Mercedes-Benz", 777, "E-class"), new Car("Lada", 95, "Kalina"), new Car("Toyota", 78, "Land-Cruiser"), new Car("Honda", 51, "Civic"));

    public List<Car> getCarData(int count) {
        return carData.subList(0, count);
    }
}