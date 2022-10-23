package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService{
    private List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car("1", 2001, 700));
        cars.add(new Car("2", 2002, 750));
        cars.add(new Car("3", 2003, 800));
        cars.add(new Car("4", 2004, 850));
        cars.add(new Car("5", 2005, 900));
    }

    @Override
    public List<Car> listCars (Integer count) {
        if (count >=1 && count <= 5) {
            return cars.subList(0, count);
        } else {
            return cars;
        }
    }
}
