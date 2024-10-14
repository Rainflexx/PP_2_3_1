package web.service;

import web.repository.CarRepository;
import web.models.Car;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServicelmpl implements CarService {

    private final CarRepository carRepository;

    public CarServicelmpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public List<Car> carsList(int count) {
        return carRepository.getCarData(count);
    }
}
