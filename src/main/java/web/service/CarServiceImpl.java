package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final List<Car> listOfCars = new ArrayList<>(List.of(
            new Car("Mazda","White",120),
            new Car("Renault","Red",82),
            new Car("BMW","Black",250),
            new Car("Audi","Silver",280),
            new Car("Horse","Brown",1)

    ));

    @Override
    public List<Car> getCarList(Integer count) {
        count = (count == null || count > 5) ? 5 : count < 0 ? 0 : count;
        return listOfCars.stream().limit(count).toList();
    }
}